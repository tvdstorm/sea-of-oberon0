// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g 2011-01-11 14:41:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class oberon0Parser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STAR", "DIV", "MOD", "AMPERSAND", "PLUS", "MINUS", "OR", "EQUALS", "HASH", "SMALLERTHEN", "SMALLEREQUAL", "GREATERTHEN", "GREATEREQUAL", "DOT", "COMMA", "COLON", "RNDOPEN", "RNDCLOSE", "SQROPEN", "SQRCLOSE", "OF", "THEN", "DO", "TILDE", "ASSIGN", "SEMICOLON", "END", "ELSE", "ELSIF", "IF", "WHILE", "ARRAY", "RECORD", "CONST", "TYPEDECL", "VAR", "PROCEDURE", "BEGIN", "MODULE", "PARAMETERS", "REFVAR", "BODY", "CONDITION", "TYPE", "NAME", "PROCEDURECALL", "SELECTOR", "IDENT", "INTEGER", "WS", "OPTWS"
    };
    public static final int EOF=-1;
    public static final int STAR=4;
    public static final int DIV=5;
    public static final int MOD=6;
    public static final int AMPERSAND=7;
    public static final int PLUS=8;
    public static final int MINUS=9;
    public static final int OR=10;
    public static final int EQUALS=11;
    public static final int HASH=12;
    public static final int SMALLERTHEN=13;
    public static final int SMALLEREQUAL=14;
    public static final int GREATERTHEN=15;
    public static final int GREATEREQUAL=16;
    public static final int DOT=17;
    public static final int COMMA=18;
    public static final int COLON=19;
    public static final int RNDOPEN=20;
    public static final int RNDCLOSE=21;
    public static final int SQROPEN=22;
    public static final int SQRCLOSE=23;
    public static final int OF=24;
    public static final int THEN=25;
    public static final int DO=26;
    public static final int TILDE=27;
    public static final int ASSIGN=28;
    public static final int SEMICOLON=29;
    public static final int END=30;
    public static final int ELSE=31;
    public static final int ELSIF=32;
    public static final int IF=33;
    public static final int WHILE=34;
    public static final int ARRAY=35;
    public static final int RECORD=36;
    public static final int CONST=37;
    public static final int TYPEDECL=38;
    public static final int VAR=39;
    public static final int PROCEDURE=40;
    public static final int BEGIN=41;
    public static final int MODULE=42;
    public static final int PARAMETERS=43;
    public static final int REFVAR=44;
    public static final int BODY=45;
    public static final int CONDITION=46;
    public static final int TYPE=47;
    public static final int NAME=48;
    public static final int PROCEDURECALL=49;
    public static final int SELECTOR=50;
    public static final int IDENT=51;
    public static final int INTEGER=52;
    public static final int WS=53;
    public static final int OPTWS=54;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred29_oberon0", "whileStatement", "synpred3_oberon0", 
        "synpred39_oberon0", "synpred46_oberon0", "colon", "synpred14_oberon0", 
        "synpred45_oberon0", "synpred22_oberon0", "ifStatement", "synpred32_oberon0", 
        "synpred42_oberon0", "fieldList", "arrayType", "expression", "synpred35_oberon0", 
        "synpred18_oberon0", "recordType", "synpred16_oberon0", "synpred27_oberon0", 
        "synpred40_oberon0", "synpred7_oberon0", "statement", "synpred37_oberon0", 
        "synpred26_oberon0", "number", "synpred1_oberon0", "synpred34_oberon0", 
        "procedureCall", "selector", "identList", "semicolon", "synpred49_oberon0", 
        "synpred43_oberon0", "synpred17_oberon0", "nameident", "synpred33_oberon0", 
        "synpred30_oberon0", "fpSection", "synpred13_oberon0", "synpred24_oberon0", 
        "term", "constDeclaration", "type", "synpred9_oberon0", "synpred36_oberon0", 
        "typeDeclaration", "synpred47_oberon0", "synpred31_oberon0", "assignment", 
        "synpred21_oberon0", "synpred20_oberon0", "synpred25_oberon0", "rndExpression", 
        "synpred28_oberon0", "factor", "comma", "synpred19_oberon0", "synpred44_oberon0", 
        "synpred8_oberon0", "synpred11_oberon0", "synpred5_oberon0", "synpred12_oberon0", 
        "actualParameters", "identselector", "module", "synpred6_oberon0", 
        "sqrExpression", "synpred41_oberon0", "synpred23_oberon0", "synpred48_oberon0", 
        "formalParameters", "simpleExpression", "synpred15_oberon0", "synpred4_oberon0", 
        "declarations", "synpred2_oberon0", "synpred50_oberon0", "synpred10_oberon0", 
        "moduleBody", "procedureDeclaration", "synpred51_oberon0", "varDeclarations", 
        "statementSequence", "synpred38_oberon0", "procedureBody"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, true, true, false, 
            false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public oberon0Parser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public oberon0Parser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[86+1];
             
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public oberon0Parser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
        this.state.ruleMemo = new HashMap[86+1];
         
         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:67:1: module : MODULE nameident semicolon moduleBody IDENT DOT EOF -> ^( MODULE nameident moduleBody ) ;
    public final oberon0Parser.module_return module() throws RecognitionException {
        oberon0Parser.module_return retval = new oberon0Parser.module_return();
        retval.start = input.LT(1);
        int module_StartIndex = input.index();
        Object root_0 = null;

        Token MODULE1=null;
        Token IDENT5=null;
        Token DOT6=null;
        Token EOF7=null;
        oberon0Parser.nameident_return nameident2 = null;

        oberon0Parser.semicolon_return semicolon3 = null;

        oberon0Parser.moduleBody_return moduleBody4 = null;


        Object MODULE1_tree=null;
        Object IDENT5_tree=null;
        Object DOT6_tree=null;
        Object EOF7_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_nameident=new RewriteRuleSubtreeStream(adaptor,"rule nameident");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try { dbg.enterRule(getGrammarFileName(), "module");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:67:8: ( MODULE nameident semicolon moduleBody IDENT DOT EOF -> ^( MODULE nameident moduleBody ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:67:10: MODULE nameident semicolon moduleBody IDENT DOT EOF
            {
            dbg.location(67,10);
            MODULE1=(Token)match(input,MODULE,FOLLOW_MODULE_in_module415); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE1);

            dbg.location(67,17);
            pushFollow(FOLLOW_nameident_in_module417);
            nameident2=nameident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nameident.add(nameident2.getTree());
            dbg.location(67,27);
            pushFollow(FOLLOW_semicolon_in_module419);
            semicolon3=semicolon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semicolon.add(semicolon3.getTree());
            dbg.location(67,37);
            pushFollow(FOLLOW_moduleBody_in_module421);
            moduleBody4=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody4.getTree());
            dbg.location(67,48);
            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_module423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT5);

            dbg.location(67,54);
            DOT6=(Token)match(input,DOT,FOLLOW_DOT_in_module425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT6);

            dbg.location(67,58);
            EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_module427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF7);



            // AST REWRITE
            // elements: nameident, moduleBody, MODULE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:4: -> ^( MODULE nameident moduleBody )
            {
                dbg.location(68,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:68:7: ^( MODULE nameident moduleBody )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(68,9);
                root_1 = (Object)adaptor.becomeRoot(stream_MODULE.nextNode(), root_1);

                dbg.location(68,16);
                adaptor.addChild(root_1, stream_nameident.nextTree());
                dbg.location(68,26);
                adaptor.addChild(root_1, stream_moduleBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, module_StartIndex); }
        }
        dbg.location(68, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "module");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "module"

    public static class moduleBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moduleBody"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:70:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
    public final oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        oberon0Parser.moduleBody_return retval = new oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);
        int moduleBody_StartIndex = input.index();
        Object root_0 = null;

        Token BEGIN9=null;
        Token END11=null;
        oberon0Parser.declarations_return declarations8 = null;

        oberon0Parser.statementSequence_return statementSequence10 = null;


        Object BEGIN9_tree=null;
        Object END11_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try { dbg.enterRule(getGrammarFileName(), "moduleBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:71:2: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:71:4: declarations ( BEGIN statementSequence )? END
            {
            dbg.location(71,4);
            pushFollow(FOLLOW_declarations_in_moduleBody449);
            declarations8=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations8.getTree());
            dbg.location(71,17);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:71:17: ( BEGIN statementSequence )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==BEGIN) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:71:18: BEGIN statementSequence
                    {
                    dbg.location(71,18);
                    BEGIN9=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody452); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN9);

                    dbg.location(71,24);
                    pushFollow(FOLLOW_statementSequence_in_moduleBody454);
                    statementSequence10=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence10.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(71,44);
            END11=(Token)match(input,END,FOLLOW_END_in_moduleBody458); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END11);



            // AST REWRITE
            // elements: statementSequence, declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 72:4: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                dbg.location(72,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:72:7: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    dbg.location(72,7);
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                dbg.location(72,21);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:72:21: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    dbg.location(72,21);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:72:21: ^( BODY statementSequence )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(72,23);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                    dbg.location(72,28);
                    adaptor.addChild(root_1, stream_statementSequence.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_statementSequence.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, moduleBody_StartIndex); }
        }
        dbg.location(72, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "moduleBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "moduleBody"

    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:74:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
    public final oberon0Parser.declarations_return declarations() throws RecognitionException {
        oberon0Parser.declarations_return retval = new oberon0Parser.declarations_return();
        retval.start = input.LT(1);
        int declarations_StartIndex = input.index();
        Object root_0 = null;

        oberon0Parser.constDeclaration_return constDeclaration12 = null;

        oberon0Parser.typeDeclaration_return typeDeclaration13 = null;

        oberon0Parser.varDeclarations_return varDeclarations14 = null;

        oberon0Parser.procedureDeclaration_return procedureDeclaration15 = null;

        oberon0Parser.semicolon_return semicolon16 = null;


        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try { dbg.enterRule(getGrammarFileName(), "declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:2: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:5: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )*
            {
            dbg.location(75,5);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:5: ( constDeclaration )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONST) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:0:0: constDeclaration
                    {
                    dbg.location(75,5);
                    pushFollow(FOLLOW_constDeclaration_in_declarations483);
                    constDeclaration12=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration12.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(75,23);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:23: ( typeDeclaration )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPEDECL) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:0:0: typeDeclaration
                    {
                    dbg.location(75,23);
                    pushFollow(FOLLOW_typeDeclaration_in_declarations486);
                    typeDeclaration13=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration13.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(75,40);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:40: ( varDeclarations )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:0:0: varDeclarations
                    {
                    dbg.location(75,40);
                    pushFollow(FOLLOW_varDeclarations_in_declarations489);
                    varDeclarations14=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations14.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(76,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:76:4: ( procedureDeclaration semicolon )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==PROCEDURE) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:76:5: procedureDeclaration semicolon
            	    {
            	    dbg.location(76,5);
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations497);
            	    procedureDeclaration15=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration15.getTree());
            	    dbg.location(76,26);
            	    pushFollow(FOLLOW_semicolon_in_declarations499);
            	    semicolon16=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon16.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}



            // AST REWRITE
            // elements: procedureDeclaration, typeDeclaration, constDeclaration, varDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                dbg.location(77,8);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:77:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    dbg.location(77,8);
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                dbg.location(77,26);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:77:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    dbg.location(77,26);
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                dbg.location(77,43);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:77:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    dbg.location(77,43);
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                dbg.location(78,5);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:78:5: ( procedureDeclaration )*
                while ( stream_procedureDeclaration.hasNext() ) {
                    dbg.location(78,6);
                    adaptor.addChild(root_0, stream_procedureDeclaration.nextTree());

                }
                stream_procedureDeclaration.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, declarations_StartIndex); }
        }
        dbg.location(78, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarations"

    public static class constDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:80:1: constDeclaration : ( CONST ( nameident EQUALS expression semicolon )* ) -> ^( CONST ( nameident expression )* ) ;
    public final oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        oberon0Parser.constDeclaration_return retval = new oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);
        int constDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token CONST17=null;
        Token EQUALS19=null;
        oberon0Parser.nameident_return nameident18 = null;

        oberon0Parser.expression_return expression20 = null;

        oberon0Parser.semicolon_return semicolon21 = null;


        Object CONST17_tree=null;
        Object EQUALS19_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_nameident=new RewriteRuleSubtreeStream(adaptor,"rule nameident");
        try { dbg.enterRule(getGrammarFileName(), "constDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:81:2: ( ( CONST ( nameident EQUALS expression semicolon )* ) -> ^( CONST ( nameident expression )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:81:4: ( CONST ( nameident EQUALS expression semicolon )* )
            {
            dbg.location(81,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:81:4: ( CONST ( nameident EQUALS expression semicolon )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:81:5: CONST ( nameident EQUALS expression semicolon )*
            {
            dbg.location(81,5);
            CONST17=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration540); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST17);

            dbg.location(81,11);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:81:11: ( nameident EQUALS expression semicolon )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==EQUALS) ) {
                        alt6=1;
                    }


                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:81:12: nameident EQUALS expression semicolon
            	    {
            	    dbg.location(81,12);
            	    pushFollow(FOLLOW_nameident_in_constDeclaration543);
            	    nameident18=nameident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_nameident.add(nameident18.getTree());
            	    dbg.location(81,22);
            	    EQUALS19=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration545); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS19);

            	    dbg.location(81,29);
            	    pushFollow(FOLLOW_expression_in_constDeclaration547);
            	    expression20=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression20.getTree());
            	    dbg.location(81,40);
            	    pushFollow(FOLLOW_semicolon_in_constDeclaration549);
            	    semicolon21=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon21.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }



            // AST REWRITE
            // elements: nameident, CONST, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:4: -> ^( CONST ( nameident expression )* )
            {
                dbg.location(82,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:82:7: ^( CONST ( nameident expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(82,9);
                root_1 = (Object)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                dbg.location(82,15);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:82:15: ( nameident expression )*
                while ( stream_nameident.hasNext()||stream_expression.hasNext() ) {
                    dbg.location(82,16);
                    adaptor.addChild(root_1, stream_nameident.nextTree());
                    dbg.location(82,26);
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_nameident.reset();
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, constDeclaration_StartIndex); }
        }
        dbg.location(82, 39);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constDeclaration"

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:84:1: typeDeclaration : ( TYPEDECL ( IDENT EQUALS type semicolon )* ) -> ^( TYPEDECL ( IDENT type )* ) ;
    public final oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        oberon0Parser.typeDeclaration_return retval = new oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDECL22=null;
        Token IDENT23=null;
        Token EQUALS24=null;
        oberon0Parser.type_return type25 = null;

        oberon0Parser.semicolon_return semicolon26 = null;


        Object TYPEDECL22_tree=null;
        Object IDENT23_tree=null;
        Object EQUALS24_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_TYPEDECL=new RewriteRuleTokenStream(adaptor,"token TYPEDECL");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "typeDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:85:2: ( ( TYPEDECL ( IDENT EQUALS type semicolon )* ) -> ^( TYPEDECL ( IDENT type )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:85:4: ( TYPEDECL ( IDENT EQUALS type semicolon )* )
            {
            dbg.location(85,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:85:4: ( TYPEDECL ( IDENT EQUALS type semicolon )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:85:5: TYPEDECL ( IDENT EQUALS type semicolon )*
            {
            dbg.location(85,5);
            TYPEDECL22=(Token)match(input,TYPEDECL,FOLLOW_TYPEDECL_in_typeDeclaration582); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPEDECL.add(TYPEDECL22);

            dbg.location(85,14);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:85:14: ( IDENT EQUALS type semicolon )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENT) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==EQUALS) ) {
                        alt7=1;
                    }


                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:85:15: IDENT EQUALS type semicolon
            	    {
            	    dbg.location(85,15);
            	    IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration585); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT23);

            	    dbg.location(85,21);
            	    EQUALS24=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration587); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS24);

            	    dbg.location(85,28);
            	    pushFollow(FOLLOW_type_in_typeDeclaration589);
            	    type25=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type25.getTree());
            	    dbg.location(85,33);
            	    pushFollow(FOLLOW_semicolon_in_typeDeclaration591);
            	    semicolon26=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon26.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }



            // AST REWRITE
            // elements: type, TYPEDECL, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:4: -> ^( TYPEDECL ( IDENT type )* )
            {
                dbg.location(86,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:86:7: ^( TYPEDECL ( IDENT type )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(86,9);
                root_1 = (Object)adaptor.becomeRoot(stream_TYPEDECL.nextNode(), root_1);

                dbg.location(86,18);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:86:18: ( IDENT type )*
                while ( stream_type.hasNext()||stream_IDENT.hasNext() ) {
                    dbg.location(86,19);
                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    dbg.location(86,25);
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                stream_IDENT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, typeDeclaration_StartIndex); }
        }
        dbg.location(86, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeDeclaration"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:88:1: varDeclarations : ( VAR ( identList COLON type semicolon )* ) -> ( ^( VAR identList type ) )* ;
    public final oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        oberon0Parser.varDeclarations_return retval = new oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);
        int varDeclarations_StartIndex = input.index();
        Object root_0 = null;

        Token VAR27=null;
        Token COLON29=null;
        oberon0Parser.identList_return identList28 = null;

        oberon0Parser.type_return type30 = null;

        oberon0Parser.semicolon_return semicolon31 = null;


        Object VAR27_tree=null;
        Object COLON29_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "varDeclarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:89:2: ( ( VAR ( identList COLON type semicolon )* ) -> ( ^( VAR identList type ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:89:4: ( VAR ( identList COLON type semicolon )* )
            {
            dbg.location(89,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:89:4: ( VAR ( identList COLON type semicolon )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:89:5: VAR ( identList COLON type semicolon )*
            {
            dbg.location(89,5);
            VAR27=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR27);

            dbg.location(89,9);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:89:9: ( identList COLON type semicolon )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENT) ) {
                    int LA8_2 = input.LA(2);

                    if ( ((LA8_2>=COMMA && LA8_2<=COLON)) ) {
                        alt8=1;
                    }


                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:89:10: identList COLON type semicolon
            	    {
            	    dbg.location(89,10);
            	    pushFollow(FOLLOW_identList_in_varDeclarations627);
            	    identList28=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList28.getTree());
            	    dbg.location(89,20);
            	    COLON29=(Token)match(input,COLON,FOLLOW_COLON_in_varDeclarations629); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON29);

            	    dbg.location(89,26);
            	    pushFollow(FOLLOW_type_in_varDeclarations631);
            	    type30=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type30.getTree());
            	    dbg.location(89,31);
            	    pushFollow(FOLLOW_semicolon_in_varDeclarations633);
            	    semicolon31=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon31.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }



            // AST REWRITE
            // elements: type, VAR, identList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:4: -> ( ^( VAR identList type ) )*
            {
                dbg.location(90,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:90:7: ( ^( VAR identList type ) )*
                while ( stream_type.hasNext()||stream_VAR.hasNext()||stream_identList.hasNext() ) {
                    dbg.location(90,7);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:90:7: ^( VAR identList type )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(90,9);
                    root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    dbg.location(90,13);
                    adaptor.addChild(root_1, stream_identList.nextTree());
                    dbg.location(90,23);
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_VAR.reset();
                stream_identList.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, varDeclarations_StartIndex); }
        }
        dbg.location(90, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varDeclarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "varDeclarations"

    public static class procedureDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:92:1: procedureDeclaration : PROCEDURE nameident ( formalParameters )? SEMICOLON declarations ( procedureBody )? IDENT -> ^( PROCEDURE nameident ( formalParameters )? declarations ( procedureBody )? ) ;
    public final oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        oberon0Parser.procedureDeclaration_return retval = new oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);
        int procedureDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token PROCEDURE32=null;
        Token SEMICOLON35=null;
        Token IDENT38=null;
        oberon0Parser.nameident_return nameident33 = null;

        oberon0Parser.formalParameters_return formalParameters34 = null;

        oberon0Parser.declarations_return declarations36 = null;

        oberon0Parser.procedureBody_return procedureBody37 = null;


        Object PROCEDURE32_tree=null;
        Object SEMICOLON35_tree=null;
        Object IDENT38_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_nameident=new RewriteRuleSubtreeStream(adaptor,"rule nameident");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try { dbg.enterRule(getGrammarFileName(), "procedureDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:93:2: ( PROCEDURE nameident ( formalParameters )? SEMICOLON declarations ( procedureBody )? IDENT -> ^( PROCEDURE nameident ( formalParameters )? declarations ( procedureBody )? ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:93:4: PROCEDURE nameident ( formalParameters )? SEMICOLON declarations ( procedureBody )? IDENT
            {
            dbg.location(93,4);
            PROCEDURE32=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration659); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE32);

            dbg.location(93,14);
            pushFollow(FOLLOW_nameident_in_procedureDeclaration661);
            nameident33=nameident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nameident.add(nameident33.getTree());
            dbg.location(93,24);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:93:24: ( formalParameters )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==RNDOPEN) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:93:25: formalParameters
                    {
                    dbg.location(93,25);
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration664);
                    formalParameters34=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters34.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(93,44);
            SEMICOLON35=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_procedureDeclaration668); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON35);

            dbg.location(93,54);
            pushFollow(FOLLOW_declarations_in_procedureDeclaration670);
            declarations36=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations36.getTree());
            dbg.location(93,67);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:93:67: ( procedureBody )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==BEGIN) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:93:68: procedureBody
                    {
                    dbg.location(93,68);
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration673);
                    procedureBody37=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody37.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(93,84);
            IDENT38=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT38);



            // AST REWRITE
            // elements: nameident, procedureBody, formalParameters, PROCEDURE, declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:4: -> ^( PROCEDURE nameident ( formalParameters )? declarations ( procedureBody )? )
            {
                dbg.location(94,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:94:7: ^( PROCEDURE nameident ( formalParameters )? declarations ( procedureBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(94,9);
                root_1 = (Object)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                dbg.location(94,19);
                adaptor.addChild(root_1, stream_nameident.nextTree());
                dbg.location(94,29);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:94:29: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    dbg.location(94,30);
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                dbg.location(94,49);
                adaptor.addChild(root_1, stream_declarations.nextTree());
                dbg.location(94,62);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:94:62: ( procedureBody )?
                if ( stream_procedureBody.hasNext() ) {
                    dbg.location(94,63);
                    adaptor.addChild(root_1, stream_procedureBody.nextTree());

                }
                stream_procedureBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, procedureDeclaration_StartIndex); }
        }
        dbg.location(94, 79);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedureDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedureDeclaration"

    public static class procedureBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:96:1: procedureBody : BEGIN statementSequence END -> ^( BODY statementSequence ) ;
    public final oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        oberon0Parser.procedureBody_return retval = new oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);
        int procedureBody_StartIndex = input.index();
        Object root_0 = null;

        Token BEGIN39=null;
        Token END41=null;
        oberon0Parser.statementSequence_return statementSequence40 = null;


        Object BEGIN39_tree=null;
        Object END41_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try { dbg.enterRule(getGrammarFileName(), "procedureBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(96, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:97:2: ( BEGIN statementSequence END -> ^( BODY statementSequence ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:97:4: BEGIN statementSequence END
            {
            dbg.location(97,4);
            BEGIN39=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody714); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN39);

            dbg.location(97,10);
            pushFollow(FOLLOW_statementSequence_in_procedureBody716);
            statementSequence40=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence40.getTree());
            dbg.location(97,28);
            END41=(Token)match(input,END,FOLLOW_END_in_procedureBody718); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END41);



            // AST REWRITE
            // elements: statementSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:4: -> ^( BODY statementSequence )
            {
                dbg.location(98,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:98:7: ^( BODY statementSequence )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(98,9);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                dbg.location(98,14);
                adaptor.addChild(root_1, stream_statementSequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, procedureBody_StartIndex); }
        }
        dbg.location(98, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedureBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedureBody"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:100:1: assignment : identselector ASSIGN expression ;
    public final oberon0Parser.assignment_return assignment() throws RecognitionException {
        oberon0Parser.assignment_return retval = new oberon0Parser.assignment_return();
        retval.start = input.LT(1);
        int assignment_StartIndex = input.index();
        Object root_0 = null;

        Token ASSIGN43=null;
        oberon0Parser.identselector_return identselector42 = null;

        oberon0Parser.expression_return expression44 = null;


        Object ASSIGN43_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:101:2: ( identselector ASSIGN expression )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:101:4: identselector ASSIGN expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(101,4);
            pushFollow(FOLLOW_identselector_in_assignment738);
            identselector42=identselector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identselector42.getTree());
            dbg.location(101,24);
            ASSIGN43=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment740); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN43_tree = (Object)adaptor.create(ASSIGN43);
            root_0 = (Object)adaptor.becomeRoot(ASSIGN43_tree, root_0);
            }
            dbg.location(101,26);
            pushFollow(FOLLOW_expression_in_assignment743);
            expression44=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression44.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, assignment_StartIndex); }
        }
        dbg.location(101, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignment"

    public static class actualParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:103:1: actualParameters : RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE -> ^( PARAMETERS ( expression )+ ) ;
    public final oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        oberon0Parser.actualParameters_return retval = new oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);
        int actualParameters_StartIndex = input.index();
        Object root_0 = null;

        Token RNDOPEN45=null;
        Token COMMA47=null;
        Token RNDCLOSE49=null;
        oberon0Parser.expression_return expression46 = null;

        oberon0Parser.expression_return expression48 = null;


        Object RNDOPEN45_tree=null;
        Object COMMA47_tree=null;
        Object RNDCLOSE49_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "actualParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:104:2: ( RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE -> ^( PARAMETERS ( expression )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:104:4: RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE
            {
            dbg.location(104,4);
            RNDOPEN45=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_actualParameters752); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN45);

            dbg.location(104,12);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:104:12: ( expression ( COMMA expression )* )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=PLUS && LA12_0<=MINUS)||LA12_0==RNDOPEN||LA12_0==TILDE||(LA12_0>=IDENT && LA12_0<=INTEGER)) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:104:13: expression ( COMMA expression )*
                    {
                    dbg.location(104,13);
                    pushFollow(FOLLOW_expression_in_actualParameters755);
                    expression46=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression46.getTree());
                    dbg.location(104,24);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:104:24: ( COMMA expression )*
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:104:25: COMMA expression
                    	    {
                    	    dbg.location(104,25);
                    	    COMMA47=(Token)match(input,COMMA,FOLLOW_COMMA_in_actualParameters758); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA47);

                    	    dbg.location(104,31);
                    	    pushFollow(FOLLOW_expression_in_actualParameters760);
                    	    expression48=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(11);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(104,46);
            RNDCLOSE49=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_actualParameters766); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDCLOSE.add(RNDCLOSE49);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 105:4: -> ^( PARAMETERS ( expression )+ )
            {
                dbg.location(105,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:105:7: ^( PARAMETERS ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(105,9);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                dbg.location(105,20);
                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    dbg.location(105,20);
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, actualParameters_StartIndex); }
        }
        dbg.location(105, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "actualParameters");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "actualParameters"

    public static class procedureCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:107:1: procedureCall : identselector ( actualParameters )? -> ^( PROCEDURECALL identselector ( actualParameters )? ) ;
    public final oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        oberon0Parser.procedureCall_return retval = new oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);
        int procedureCall_StartIndex = input.index();
        Object root_0 = null;

        oberon0Parser.identselector_return identselector50 = null;

        oberon0Parser.actualParameters_return actualParameters51 = null;


        RewriteRuleSubtreeStream stream_identselector=new RewriteRuleSubtreeStream(adaptor,"rule identselector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try { dbg.enterRule(getGrammarFileName(), "procedureCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:108:2: ( identselector ( actualParameters )? -> ^( PROCEDURECALL identselector ( actualParameters )? ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:108:4: identselector ( actualParameters )?
            {
            dbg.location(108,4);
            pushFollow(FOLLOW_identselector_in_procedureCall787);
            identselector50=identselector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identselector.add(identselector50.getTree());
            dbg.location(108,18);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:108:18: ( actualParameters )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==RNDOPEN) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:108:19: actualParameters
                    {
                    dbg.location(108,19);
                    pushFollow(FOLLOW_actualParameters_in_procedureCall790);
                    actualParameters51=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters51.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}



            // AST REWRITE
            // elements: identselector, actualParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:4: -> ^( PROCEDURECALL identselector ( actualParameters )? )
            {
                dbg.location(109,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:109:7: ^( PROCEDURECALL identselector ( actualParameters )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(109,9);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_1);

                dbg.location(109,23);
                adaptor.addChild(root_1, stream_identselector.nextTree());
                dbg.location(109,37);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:109:37: ( actualParameters )?
                if ( stream_actualParameters.hasNext() ) {
                    dbg.location(109,38);
                    adaptor.addChild(root_1, stream_actualParameters.nextTree());

                }
                stream_actualParameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, procedureCall_StartIndex); }
        }
        dbg.location(109, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedureCall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:112:1: ifStatement : ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ) );
    public final oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        oberon0Parser.ifStatement_return retval = new oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Object root_0 = null;

        Token IF52=null;
        Token THEN54=null;
        Token ELSIF56=null;
        Token THEN58=null;
        Token ELSE60=null;
        Token END62=null;
        Token IF63=null;
        Token THEN65=null;
        Token ELSIF67=null;
        Token THEN69=null;
        Token END71=null;
        Token IF72=null;
        Token THEN74=null;
        Token ELSE76=null;
        Token END78=null;
        Token IF79=null;
        Token THEN81=null;
        Token END83=null;
        oberon0Parser.expression_return expression53 = null;

        oberon0Parser.statementSequence_return statementSequence55 = null;

        oberon0Parser.expression_return expression57 = null;

        oberon0Parser.statementSequence_return statementSequence59 = null;

        oberon0Parser.statementSequence_return statementSequence61 = null;

        oberon0Parser.expression_return expression64 = null;

        oberon0Parser.statementSequence_return statementSequence66 = null;

        oberon0Parser.expression_return expression68 = null;

        oberon0Parser.statementSequence_return statementSequence70 = null;

        oberon0Parser.expression_return expression73 = null;

        oberon0Parser.statementSequence_return statementSequence75 = null;

        oberon0Parser.statementSequence_return statementSequence77 = null;

        oberon0Parser.expression_return expression80 = null;

        oberon0Parser.statementSequence_return statementSequence82 = null;


        Object IF52_tree=null;
        Object THEN54_tree=null;
        Object ELSIF56_tree=null;
        Object THEN58_tree=null;
        Object ELSE60_tree=null;
        Object END62_tree=null;
        Object IF63_tree=null;
        Object THEN65_tree=null;
        Object ELSIF67_tree=null;
        Object THEN69_tree=null;
        Object END71_tree=null;
        Object IF72_tree=null;
        Object THEN74_tree=null;
        Object ELSE76_tree=null;
        Object END78_tree=null;
        Object IF79_tree=null;
        Object THEN81_tree=null;
        Object END83_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try { dbg.enterRule(getGrammarFileName(), "ifStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:112:12: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ) )
            int alt16=4;
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==IF) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred15_oberon0()) ) {
                    alt16=1;
                }
                else if ( (synpred17_oberon0()) ) {
                    alt16=2;
                }
                else if ( (synpred18_oberon0()) ) {
                    alt16=3;
                }
                else if ( (true) ) {
                    alt16=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:112:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
                    {
                    dbg.location(112,15);
                    IF52=(Token)match(input,IF,FOLLOW_IF_in_ifStatement820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF52);

                    dbg.location(112,18);
                    pushFollow(FOLLOW_expression_in_ifStatement822);
                    expression53=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());
                    dbg.location(112,29);
                    THEN54=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement824); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN54);

                    dbg.location(112,34);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement826);
                    statementSequence55=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence55.getTree());
                    dbg.location(113,4);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:113:4: ( ELSIF expression THEN statementSequence )+
                    int cnt14=0;
                    try { dbg.enterSubRule(14);

                    loop14:
                    do {
                        int alt14=2;
                        try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==ELSIF) ) {
                            alt14=1;
                        }


                        } finally {dbg.exitDecision(14);}

                        switch (alt14) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:113:5: ELSIF expression THEN statementSequence
                    	    {
                    	    dbg.location(113,5);
                    	    ELSIF56=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement833); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF56);

                    	    dbg.location(113,11);
                    	    pushFollow(FOLLOW_expression_in_ifStatement835);
                    	    expression57=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());
                    	    dbg.location(113,22);
                    	    THEN58=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement837); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN58);

                    	    dbg.location(113,27);
                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement839);
                    	    statementSequence59=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence59.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt14++;
                    } while (true);
                    } finally {dbg.exitSubRule(14);}

                    dbg.location(114,4);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:114:4: ( ELSE statementSequence )
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:114:5: ELSE statementSequence
                    {
                    dbg.location(114,5);
                    ELSE60=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE60);

                    dbg.location(114,10);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement850);
                    statementSequence61=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence61.getTree());

                    }

                    dbg.location(114,29);
                    END62=(Token)match(input,END,FOLLOW_END_in_ifStatement853); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END62);



                    // AST REWRITE
                    // elements: statementSequence, statementSequence, ELSE, expression, expression, IF, statementSequence, ELSIF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:5: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        dbg.location(115,8);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:115:8: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(115,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(115,13);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:115:13: ^( CONDITION expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(115,15);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(115,25);
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(115,37);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:115:37: ^( BODY statementSequence )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(115,39);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        dbg.location(115,44);
                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(116,5);
                        if ( !(stream_statementSequence.hasNext()||stream_expression.hasNext()||stream_ELSIF.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_statementSequence.hasNext()||stream_expression.hasNext()||stream_ELSIF.hasNext() ) {
                            dbg.location(116,5);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:116:5: ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(116,7);
                            root_2 = (Object)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            dbg.location(116,13);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:116:13: ^( CONDITION expression )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            dbg.location(116,15);
                            root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_3);

                            dbg.location(116,25);
                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            dbg.location(116,37);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:116:37: ^( BODY statementSequence )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            dbg.location(116,39);
                            root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_3);

                            dbg.location(116,44);
                            adaptor.addChild(root_3, stream_statementSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_statementSequence.reset();
                        stream_expression.reset();
                        stream_ELSIF.reset();
                        dbg.location(117,5);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:117:5: ^( ELSE ^( BODY statementSequence ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(117,7);
                        root_2 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        dbg.location(117,12);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:117:12: ^( BODY statementSequence )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        dbg.location(117,14);
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_3);

                        dbg.location(117,19);
                        adaptor.addChild(root_3, stream_statementSequence.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:118:6: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
                    {
                    dbg.location(118,6);
                    IF63=(Token)match(input,IF,FOLLOW_IF_in_ifStatement920); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF63);

                    dbg.location(118,9);
                    pushFollow(FOLLOW_expression_in_ifStatement922);
                    expression64=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression64.getTree());
                    dbg.location(118,20);
                    THEN65=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN65);

                    dbg.location(118,25);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement926);
                    statementSequence66=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence66.getTree());
                    dbg.location(119,4);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:119:4: ( ELSIF expression THEN statementSequence )+
                    int cnt15=0;
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ELSIF) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:119:5: ELSIF expression THEN statementSequence
                    	    {
                    	    dbg.location(119,5);
                    	    ELSIF67=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement933); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF67);

                    	    dbg.location(119,11);
                    	    pushFollow(FOLLOW_expression_in_ifStatement935);
                    	    expression68=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression68.getTree());
                    	    dbg.location(119,22);
                    	    THEN69=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement937); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN69);

                    	    dbg.location(119,27);
                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement939);
                    	    statementSequence70=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence70.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt15++;
                    } while (true);
                    } finally {dbg.exitSubRule(15);}

                    dbg.location(119,47);
                    END71=(Token)match(input,END,FOLLOW_END_in_ifStatement943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END71);



                    // AST REWRITE
                    // elements: expression, expression, statementSequence, IF, ELSIF, statementSequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:5: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ )
                    {
                        dbg.location(120,8);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:120:8: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(120,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(120,13);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:120:13: ^( CONDITION expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(120,15);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(120,25);
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(120,37);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:120:37: ^( BODY statementSequence )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(120,39);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        dbg.location(120,44);
                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(121,5);
                        if ( !(stream_expression.hasNext()||stream_ELSIF.hasNext()||stream_statementSequence.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext()||stream_ELSIF.hasNext()||stream_statementSequence.hasNext() ) {
                            dbg.location(121,5);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:121:5: ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(121,7);
                            root_2 = (Object)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            dbg.location(121,13);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:121:13: ^( CONDITION expression )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            dbg.location(121,15);
                            root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_3);

                            dbg.location(121,25);
                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            dbg.location(121,37);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:121:37: ^( BODY statementSequence )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            dbg.location(121,39);
                            root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_3);

                            dbg.location(121,44);
                            adaptor.addChild(root_3, stream_statementSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        stream_ELSIF.reset();
                        stream_statementSequence.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:122:6: IF expression THEN statementSequence ( ELSE statementSequence ) END
                    {
                    dbg.location(122,6);
                    IF72=(Token)match(input,IF,FOLLOW_IF_in_ifStatement995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF72);

                    dbg.location(122,9);
                    pushFollow(FOLLOW_expression_in_ifStatement997);
                    expression73=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression73.getTree());
                    dbg.location(122,20);
                    THEN74=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN74);

                    dbg.location(122,25);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement1001);
                    statementSequence75=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence75.getTree());
                    dbg.location(123,4);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:123:4: ( ELSE statementSequence )
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:123:5: ELSE statementSequence
                    {
                    dbg.location(123,5);
                    ELSE76=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE76);

                    dbg.location(123,10);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement1010);
                    statementSequence77=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence77.getTree());

                    }

                    dbg.location(123,29);
                    END78=(Token)match(input,END,FOLLOW_END_in_ifStatement1013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END78);



                    // AST REWRITE
                    // elements: expression, ELSE, IF, statementSequence, statementSequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:5: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        dbg.location(124,8);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:124:8: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(124,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(124,13);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:124:13: ^( CONDITION expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(124,15);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(124,25);
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(124,36);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:124:36: ^( BODY statementSequence )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(124,38);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        dbg.location(124,43);
                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(125,5);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:125:5: ^( ELSE ^( BODY statementSequence ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(125,7);
                        root_2 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        dbg.location(125,12);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:125:12: ^( BODY statementSequence )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        dbg.location(125,14);
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_3);

                        dbg.location(125,19);
                        adaptor.addChild(root_3, stream_statementSequence.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:126:6: IF expression THEN statementSequence END
                    {
                    dbg.location(126,6);
                    IF79=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1058); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF79);

                    dbg.location(126,9);
                    pushFollow(FOLLOW_expression_in_ifStatement1060);
                    expression80=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression80.getTree());
                    dbg.location(126,20);
                    THEN81=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN81);

                    dbg.location(126,25);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement1064);
                    statementSequence82=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence82.getTree());
                    dbg.location(126,43);
                    END83=(Token)match(input,END,FOLLOW_END_in_ifStatement1066); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END83);



                    // AST REWRITE
                    // elements: IF, statementSequence, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:5: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) )
                    {
                        dbg.location(127,8);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:127:8: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(127,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(127,13);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:127:13: ^( CONDITION expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(127,15);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(127,25);
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(127,37);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:127:37: ^( BODY statementSequence )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(127,39);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        dbg.location(127,44);
                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, ifStatement_StartIndex); }
        }
        dbg.location(127, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:129:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) ) ;
    public final oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        oberon0Parser.whileStatement_return retval = new oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);
        int whileStatement_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE84=null;
        Token DO86=null;
        Token END88=null;
        oberon0Parser.expression_return expression85 = null;

        oberon0Parser.statementSequence_return statementSequence87 = null;


        Object WHILE84_tree=null;
        Object DO86_tree=null;
        Object END88_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try { dbg.enterRule(getGrammarFileName(), "whileStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:129:15: ( WHILE expression DO statementSequence END -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:129:18: WHILE expression DO statementSequence END
            {
            dbg.location(129,18);
            WHILE84=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1096); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE84);

            dbg.location(129,24);
            pushFollow(FOLLOW_expression_in_whileStatement1098);
            expression85=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression85.getTree());
            dbg.location(129,35);
            DO86=(Token)match(input,DO,FOLLOW_DO_in_whileStatement1100); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO86);

            dbg.location(129,38);
            pushFollow(FOLLOW_statementSequence_in_whileStatement1102);
            statementSequence87=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence87.getTree());
            dbg.location(129,56);
            END88=(Token)match(input,END,FOLLOW_END_in_whileStatement1104); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END88);



            // AST REWRITE
            // elements: expression, WHILE, statementSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:5: -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) )
            {
                dbg.location(130,8);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:130:8: ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(130,10);
                root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                dbg.location(130,16);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:130:16: ^( CONDITION expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(130,18);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                dbg.location(130,28);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(130,40);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:130:40: ^( BODY statementSequence )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(130,42);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                dbg.location(130,47);
                adaptor.addChild(root_2, stream_statementSequence.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, whileStatement_StartIndex); }
        }
        dbg.location(130, 66);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whileStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:132:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final oberon0Parser.statement_return statement() throws RecognitionException {
        oberon0Parser.statement_return retval = new oberon0Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        oberon0Parser.assignment_return assignment89 = null;

        oberon0Parser.procedureCall_return procedureCall90 = null;

        oberon0Parser.ifStatement_return ifStatement91 = null;

        oberon0Parser.whileStatement_return whileStatement92 = null;



        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:2: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(133,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt17=5;
            try { dbg.enterSubRule(17);
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            try {
                isCyclicDecision = true;
                alt17 = dfa17.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:5: assignment
                    {
                    dbg.location(133,5);
                    pushFollow(FOLLOW_assignment_in_statement1136);
                    assignment89=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment89.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:18: procedureCall
                    {
                    dbg.location(133,18);
                    pushFollow(FOLLOW_procedureCall_in_statement1140);
                    procedureCall90=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall90.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:34: ifStatement
                    {
                    dbg.location(133,34);
                    pushFollow(FOLLOW_ifStatement_in_statement1144);
                    ifStatement91=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement91.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:48: whileStatement
                    {
                    dbg.location(133,48);
                    pushFollow(FOLLOW_whileStatement_in_statement1148);
                    whileStatement92=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement92.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(17);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, statement_StartIndex); }
        }
        dbg.location(133, 64);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"

    public static class statementSequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:135:1: statementSequence : statement ( semicolon statement )* ;
    public final oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        oberon0Parser.statementSequence_return retval = new oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);
        int statementSequence_StartIndex = input.index();
        Object root_0 = null;

        oberon0Parser.statement_return statement93 = null;

        oberon0Parser.semicolon_return semicolon94 = null;

        oberon0Parser.statement_return statement95 = null;



        try { dbg.enterRule(getGrammarFileName(), "statementSequence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:136:2: ( statement ( semicolon statement )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:136:4: statement ( semicolon statement )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(136,4);
            pushFollow(FOLLOW_statement_in_statementSequence1160);
            statement93=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement93.getTree());
            dbg.location(136,14);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:136:14: ( semicolon statement )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==SEMICOLON) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:136:15: semicolon statement
            	    {
            	    dbg.location(136,15);
            	    pushFollow(FOLLOW_semicolon_in_statementSequence1163);
            	    semicolon94=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, semicolon94.getTree());
            	    dbg.location(136,25);
            	    pushFollow(FOLLOW_statement_in_statementSequence1165);
            	    statement95=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement95.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, statementSequence_StartIndex); }
        }
        dbg.location(136, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statementSequence");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statementSequence"

    public static class identList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:138:1: identList : IDENT ( comma IDENT )* -> ^( NAME ( IDENT )+ ) ;
    public final oberon0Parser.identList_return identList() throws RecognitionException {
        oberon0Parser.identList_return retval = new oberon0Parser.identList_return();
        retval.start = input.LT(1);
        int identList_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT96=null;
        Token IDENT98=null;
        oberon0Parser.comma_return comma97 = null;


        Object IDENT96_tree=null;
        Object IDENT98_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_comma=new RewriteRuleSubtreeStream(adaptor,"rule comma");
        try { dbg.enterRule(getGrammarFileName(), "identList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:139:2: ( IDENT ( comma IDENT )* -> ^( NAME ( IDENT )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:139:4: IDENT ( comma IDENT )*
            {
            dbg.location(139,4);
            IDENT96=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList1176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT96);

            dbg.location(139,10);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:139:10: ( comma IDENT )*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:139:11: comma IDENT
            	    {
            	    dbg.location(139,11);
            	    pushFollow(FOLLOW_comma_in_identList1179);
            	    comma97=comma();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_comma.add(comma97.getTree());
            	    dbg.location(139,17);
            	    IDENT98=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList1181); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT98);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);
            } finally {dbg.exitSubRule(19);}



            // AST REWRITE
            // elements: IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 139:25: -> ^( NAME ( IDENT )+ )
            {
                dbg.location(140,4);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:140:4: ^( NAME ( IDENT )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(140,6);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAME, "NAME"), root_1);

                dbg.location(140,11);
                if ( !(stream_IDENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENT.hasNext() ) {
                    dbg.location(140,11);
                    adaptor.addChild(root_1, stream_IDENT.nextNode());

                }
                stream_IDENT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, identList_StartIndex); }
        }
        dbg.location(140, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "identList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "identList"

    public static class arrayType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:142:1: arrayType : ARRAY expression OF type -> ^( ARRAY expression type ) ;
    public final oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        oberon0Parser.arrayType_return retval = new oberon0Parser.arrayType_return();
        retval.start = input.LT(1);
        int arrayType_StartIndex = input.index();
        Object root_0 = null;

        Token ARRAY99=null;
        Token OF101=null;
        oberon0Parser.expression_return expression100 = null;

        oberon0Parser.type_return type102 = null;


        Object ARRAY99_tree=null;
        Object OF101_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "arrayType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:2: ( ARRAY expression OF type -> ^( ARRAY expression type ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:4: ARRAY expression OF type
            {
            dbg.location(143,4);
            ARRAY99=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1205); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY99);

            dbg.location(143,10);
            pushFollow(FOLLOW_expression_in_arrayType1207);
            expression100=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression100.getTree());
            dbg.location(143,21);
            OF101=(Token)match(input,OF,FOLLOW_OF_in_arrayType1209); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF101);

            dbg.location(143,24);
            pushFollow(FOLLOW_type_in_arrayType1211);
            type102=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type102.getTree());


            // AST REWRITE
            // elements: ARRAY, type, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 144:4: -> ^( ARRAY expression type )
            {
                dbg.location(144,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:144:7: ^( ARRAY expression type )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(144,9);
                root_1 = (Object)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);

                dbg.location(144,15);
                adaptor.addChild(root_1, stream_expression.nextTree());
                dbg.location(144,26);
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, arrayType_StartIndex); }
        }
        dbg.location(144, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arrayType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arrayType"

    public static class fieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:146:1: fieldList : ( identList colon type )? ;
    public final oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        oberon0Parser.fieldList_return retval = new oberon0Parser.fieldList_return();
        retval.start = input.LT(1);
        int fieldList_StartIndex = input.index();
        Object root_0 = null;

        oberon0Parser.identList_return identList103 = null;

        oberon0Parser.colon_return colon104 = null;

        oberon0Parser.type_return type105 = null;



        try { dbg.enterRule(getGrammarFileName(), "fieldList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:147:2: ( ( identList colon type )? )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:147:4: ( identList colon type )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(147,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:147:4: ( identList colon type )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:147:5: identList colon type
                    {
                    dbg.location(147,5);
                    pushFollow(FOLLOW_identList_in_fieldList1237);
                    identList103=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identList103.getTree());
                    dbg.location(147,15);
                    pushFollow(FOLLOW_colon_in_fieldList1239);
                    colon104=colon();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon104.getTree());
                    dbg.location(147,21);
                    pushFollow(FOLLOW_type_in_fieldList1241);
                    type105=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type105.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, fieldList_StartIndex); }
        }
        dbg.location(147, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fieldList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fieldList"

    public static class recordType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:149:1: recordType : RECORD fieldList ( semicolon fieldList )* END -> ^( RECORD ( fieldList )+ ) ;
    public final oberon0Parser.recordType_return recordType() throws RecognitionException {
        oberon0Parser.recordType_return retval = new oberon0Parser.recordType_return();
        retval.start = input.LT(1);
        int recordType_StartIndex = input.index();
        Object root_0 = null;

        Token RECORD106=null;
        Token END110=null;
        oberon0Parser.fieldList_return fieldList107 = null;

        oberon0Parser.semicolon_return semicolon108 = null;

        oberon0Parser.fieldList_return fieldList109 = null;


        Object RECORD106_tree=null;
        Object END110_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        try { dbg.enterRule(getGrammarFileName(), "recordType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:150:2: ( RECORD fieldList ( semicolon fieldList )* END -> ^( RECORD ( fieldList )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:150:4: RECORD fieldList ( semicolon fieldList )* END
            {
            dbg.location(150,4);
            RECORD106=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1253); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD106);

            dbg.location(150,11);
            pushFollow(FOLLOW_fieldList_in_recordType1255);
            fieldList107=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList107.getTree());
            dbg.location(150,21);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:150:21: ( semicolon fieldList )*
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                int LA21_0 = input.LA(1);

                if ( (LA21_0==SEMICOLON) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:150:22: semicolon fieldList
            	    {
            	    dbg.location(150,22);
            	    pushFollow(FOLLOW_semicolon_in_recordType1258);
            	    semicolon108=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon108.getTree());
            	    dbg.location(150,32);
            	    pushFollow(FOLLOW_fieldList_in_recordType1260);
            	    fieldList109=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldList.add(fieldList109.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);
            } finally {dbg.exitSubRule(21);}

            dbg.location(150,44);
            END110=(Token)match(input,END,FOLLOW_END_in_recordType1264); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END110);



            // AST REWRITE
            // elements: RECORD, fieldList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 151:4: -> ^( RECORD ( fieldList )+ )
            {
                dbg.location(151,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:151:7: ^( RECORD ( fieldList )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(151,9);
                root_1 = (Object)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                dbg.location(151,16);
                if ( !(stream_fieldList.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fieldList.hasNext() ) {
                    dbg.location(151,16);
                    adaptor.addChild(root_1, stream_fieldList.nextTree());

                }
                stream_fieldList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, recordType_StartIndex); }
        }
        dbg.location(151, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "recordType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "recordType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:1: type : ( IDENT -> ^( TYPE IDENT ) | arrayType -> ^( TYPE arrayType ) | recordType -> ^( TYPE recordType ) ) ;
    public final oberon0Parser.type_return type() throws RecognitionException {
        oberon0Parser.type_return retval = new oberon0Parser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT111=null;
        oberon0Parser.arrayType_return arrayType112 = null;

        oberon0Parser.recordType_return recordType113 = null;


        Object IDENT111_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_arrayType=new RewriteRuleSubtreeStream(adaptor,"rule arrayType");
        RewriteRuleSubtreeStream stream_recordType=new RewriteRuleSubtreeStream(adaptor,"rule recordType");
        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:6: ( ( IDENT -> ^( TYPE IDENT ) | arrayType -> ^( TYPE arrayType ) | recordType -> ^( TYPE recordType ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:8: ( IDENT -> ^( TYPE IDENT ) | arrayType -> ^( TYPE arrayType ) | recordType -> ^( TYPE recordType ) )
            {
            dbg.location(153,8);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:8: ( IDENT -> ^( TYPE IDENT ) | arrayType -> ^( TYPE arrayType ) | recordType -> ^( TYPE recordType ) )
            int alt22=3;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt22=1;
                }
                break;
            case ARRAY:
                {
                alt22=2;
                }
                break;
            case RECORD:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:9: IDENT
                    {
                    dbg.location(153,9);
                    IDENT111=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1285); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT111);



                    // AST REWRITE
                    // elements: IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:15: -> ^( TYPE IDENT )
                    {
                        dbg.location(153,18);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:18: ^( TYPE IDENT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(153,21);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                        dbg.location(153,26);
                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:34: arrayType
                    {
                    dbg.location(153,34);
                    pushFollow(FOLLOW_arrayType_in_type1297);
                    arrayType112=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrayType.add(arrayType112.getTree());


                    // AST REWRITE
                    // elements: arrayType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:44: -> ^( TYPE arrayType )
                    {
                        dbg.location(153,47);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:47: ^( TYPE arrayType )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(153,49);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                        dbg.location(153,54);
                        adaptor.addChild(root_1, stream_arrayType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:66: recordType
                    {
                    dbg.location(153,66);
                    pushFollow(FOLLOW_recordType_in_type1308);
                    recordType113=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_recordType.add(recordType113.getTree());


                    // AST REWRITE
                    // elements: recordType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 153:77: -> ^( TYPE recordType )
                    {
                        dbg.location(153,80);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:80: ^( TYPE recordType )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(153,82);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);

                        dbg.location(153,87);
                        adaptor.addChild(root_1, stream_recordType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, type_StartIndex); }
        }
        dbg.location(153, 99);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    public static class fpSection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fpSection"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:155:1: fpSection : ( identList COLON type -> ^( REFVAR identList type ) | VAR identList COLON type -> ^( VAR identList type ) );
    public final oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        oberon0Parser.fpSection_return retval = new oberon0Parser.fpSection_return();
        retval.start = input.LT(1);
        int fpSection_StartIndex = input.index();
        Object root_0 = null;

        Token COLON115=null;
        Token VAR117=null;
        Token COLON119=null;
        oberon0Parser.identList_return identList114 = null;

        oberon0Parser.type_return type116 = null;

        oberon0Parser.identList_return identList118 = null;

        oberon0Parser.type_return type120 = null;


        Object COLON115_tree=null;
        Object VAR117_tree=null;
        Object COLON119_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "fpSection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:156:2: ( identList COLON type -> ^( REFVAR identList type ) | VAR identList COLON type -> ^( VAR identList type ) )
            int alt23=2;
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENT) ) {
                alt23=1;
            }
            else if ( (LA23_0==VAR) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:156:4: identList COLON type
                    {
                    dbg.location(156,4);
                    pushFollow(FOLLOW_identList_in_fpSection1327);
                    identList114=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList114.getTree());
                    dbg.location(156,14);
                    COLON115=(Token)match(input,COLON,FOLLOW_COLON_in_fpSection1329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON115);

                    dbg.location(156,20);
                    pushFollow(FOLLOW_type_in_fpSection1331);
                    type116=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type116.getTree());


                    // AST REWRITE
                    // elements: identList, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:4: -> ^( REFVAR identList type )
                    {
                        dbg.location(157,7);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:157:7: ^( REFVAR identList type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(157,9);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFVAR, "REFVAR"), root_1);

                        dbg.location(157,16);
                        adaptor.addChild(root_1, stream_identList.nextTree());
                        dbg.location(157,26);
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:158:4: VAR identList COLON type
                    {
                    dbg.location(158,4);
                    VAR117=(Token)match(input,VAR,FOLLOW_VAR_in_fpSection1349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR117);

                    dbg.location(158,8);
                    pushFollow(FOLLOW_identList_in_fpSection1351);
                    identList118=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList118.getTree());
                    dbg.location(158,18);
                    COLON119=(Token)match(input,COLON,FOLLOW_COLON_in_fpSection1353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON119);

                    dbg.location(158,24);
                    pushFollow(FOLLOW_type_in_fpSection1355);
                    type120=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type120.getTree());


                    // AST REWRITE
                    // elements: type, VAR, identList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:4: -> ^( VAR identList type )
                    {
                        dbg.location(159,7);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:159:7: ^( VAR identList type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(159,9);
                        root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                        dbg.location(159,13);
                        adaptor.addChild(root_1, stream_identList.nextTree());
                        dbg.location(159,23);
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, fpSection_StartIndex); }
        }
        dbg.location(159, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fpSection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fpSection"

    public static class formalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:161:1: formalParameters : RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE -> ^( PARAMETERS ( ( fpSection )+ )? ) ;
    public final oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        oberon0Parser.formalParameters_return retval = new oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);
        int formalParameters_StartIndex = input.index();
        Object root_0 = null;

        Token RNDOPEN121=null;
        Token SEMICOLON123=null;
        Token RNDCLOSE125=null;
        oberon0Parser.fpSection_return fpSection122 = null;

        oberon0Parser.fpSection_return fpSection124 = null;


        Object RNDOPEN121_tree=null;
        Object SEMICOLON123_tree=null;
        Object RNDCLOSE125_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
        try { dbg.enterRule(getGrammarFileName(), "formalParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:162:2: ( RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE -> ^( PARAMETERS ( ( fpSection )+ )? ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:162:4: RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE
            {
            dbg.location(162,4);
            RNDOPEN121=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_formalParameters1378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN121);

            dbg.location(162,12);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:162:12: ( fpSection ( SEMICOLON fpSection )* )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==VAR||LA25_0==IDENT) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:162:13: fpSection ( SEMICOLON fpSection )*
                    {
                    dbg.location(162,13);
                    pushFollow(FOLLOW_fpSection_in_formalParameters1381);
                    fpSection122=fpSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fpSection.add(fpSection122.getTree());
                    dbg.location(162,23);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:162:23: ( SEMICOLON fpSection )*
                    try { dbg.enterSubRule(24);

                    loop24:
                    do {
                        int alt24=2;
                        try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==SEMICOLON) ) {
                            alt24=1;
                        }


                        } finally {dbg.exitDecision(24);}

                        switch (alt24) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:162:24: SEMICOLON fpSection
                    	    {
                    	    dbg.location(162,24);
                    	    SEMICOLON123=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_formalParameters1384); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON123);

                    	    dbg.location(162,34);
                    	    pushFollow(FOLLOW_fpSection_in_formalParameters1386);
                    	    fpSection124=fpSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fpSection.add(fpSection124.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(24);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(162,48);
            RNDCLOSE125=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_formalParameters1392); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDCLOSE.add(RNDCLOSE125);



            // AST REWRITE
            // elements: fpSection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:4: -> ^( PARAMETERS ( ( fpSection )+ )? )
            {
                dbg.location(163,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:163:7: ^( PARAMETERS ( ( fpSection )+ )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(163,9);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                dbg.location(163,20);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:163:20: ( ( fpSection )+ )?
                if ( stream_fpSection.hasNext() ) {
                    dbg.location(163,21);
                    if ( !(stream_fpSection.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_fpSection.hasNext() ) {
                        dbg.location(163,21);
                        adaptor.addChild(root_1, stream_fpSection.nextTree());

                    }
                    stream_fpSection.reset();

                }
                stream_fpSection.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, formalParameters_StartIndex); }
        }
        dbg.location(163, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formalParameters");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:165:1: selector : ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )* ;
    public final oberon0Parser.selector_return selector() throws RecognitionException {
        oberon0Parser.selector_return retval = new oberon0Parser.selector_return();
        retval.start = input.LT(1);
        int selector_StartIndex = input.index();
        Object root_0 = null;

        Token DOT126=null;
        Token IDENT127=null;
        oberon0Parser.sqrExpression_return sqrExpression128 = null;


        Object DOT126_tree=null;
        Object IDENT127_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_sqrExpression=new RewriteRuleSubtreeStream(adaptor,"rule sqrExpression");
        try { dbg.enterRule(getGrammarFileName(), "selector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(165, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:165:9: ( ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:165:12: ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )*
            {
            dbg.location(165,12);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:165:12: ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=3;
                try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==DOT) ) {
                    alt26=1;
                }
                else if ( (LA26_0==SQROPEN) ) {
                    alt26=2;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:165:13: DOT IDENT
            	    {
            	    dbg.location(165,13);
            	    DOT126=(Token)match(input,DOT,FOLLOW_DOT_in_selector1420); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT126);

            	    dbg.location(165,17);
            	    IDENT127=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1422); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT127);



            	    // AST REWRITE
            	    // elements: IDENT
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 166:4: -> ^( SELECTOR IDENT )
            	    {
            	        dbg.location(166,7);
            	        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:166:7: ^( SELECTOR IDENT )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        dbg.location(166,9);
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECTOR, "SELECTOR"), root_1);

            	        dbg.location(166,18);
            	        adaptor.addChild(root_1, stream_IDENT.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:167:5: sqrExpression
            	    {
            	    dbg.location(167,5);
            	    pushFollow(FOLLOW_sqrExpression_in_selector1441);
            	    sqrExpression128=sqrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqrExpression.add(sqrExpression128.getTree());


            	    // AST REWRITE
            	    // elements: sqrExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 168:4: -> ^( SELECTOR sqrExpression )
            	    {
            	        dbg.location(168,7);
            	        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:168:7: ^( SELECTOR sqrExpression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        dbg.location(168,9);
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECTOR, "SELECTOR"), root_1);

            	        dbg.location(168,18);
            	        adaptor.addChild(root_1, stream_sqrExpression.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, selector_StartIndex); }
        }
        dbg.location(169, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "selector");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "selector"

    public static class identselector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identselector"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:171:1: identselector : IDENT selector ;
    public final oberon0Parser.identselector_return identselector() throws RecognitionException {
        oberon0Parser.identselector_return retval = new oberon0Parser.identselector_return();
        retval.start = input.LT(1);
        int identselector_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT129=null;
        oberon0Parser.selector_return selector130 = null;


        Object IDENT129_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "identselector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:172:2: ( IDENT selector )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:172:4: IDENT selector
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(172,9);
            IDENT129=(Token)match(input,IDENT,FOLLOW_IDENT_in_identselector1466); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT129_tree = (Object)adaptor.create(IDENT129);
            root_0 = (Object)adaptor.becomeRoot(IDENT129_tree, root_0);
            }
            dbg.location(172,11);
            pushFollow(FOLLOW_selector_in_identselector1469);
            selector130=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selector130.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, identselector_StartIndex); }
        }
        dbg.location(172, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "identselector");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "identselector"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:174:1: factor : ( identselector | number | rndExpression | TILDE factor ) ;
    public final oberon0Parser.factor_return factor() throws RecognitionException {
        oberon0Parser.factor_return retval = new oberon0Parser.factor_return();
        retval.start = input.LT(1);
        int factor_StartIndex = input.index();
        Object root_0 = null;

        Token TILDE134=null;
        oberon0Parser.identselector_return identselector131 = null;

        oberon0Parser.number_return number132 = null;

        oberon0Parser.rndExpression_return rndExpression133 = null;

        oberon0Parser.factor_return factor135 = null;


        Object TILDE134_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(174, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:174:9: ( ( identselector | number | rndExpression | TILDE factor ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:174:11: ( identselector | number | rndExpression | TILDE factor )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(174,11);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:174:11: ( identselector | number | rndExpression | TILDE factor )
            int alt27=4;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt27=1;
                }
                break;
            case INTEGER:
                {
                alt27=2;
                }
                break;
            case RNDOPEN:
                {
                alt27=3;
                }
                break;
            case TILDE:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:174:12: identselector
                    {
                    dbg.location(174,12);
                    pushFollow(FOLLOW_identselector_in_factor1479);
                    identselector131=identselector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identselector131.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:174:28: number
                    {
                    dbg.location(174,28);
                    pushFollow(FOLLOW_number_in_factor1483);
                    number132=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number132.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:174:37: rndExpression
                    {
                    dbg.location(174,37);
                    pushFollow(FOLLOW_rndExpression_in_factor1487);
                    rndExpression133=rndExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rndExpression133.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:174:53: TILDE factor
                    {
                    dbg.location(174,53);
                    TILDE134=(Token)match(input,TILDE,FOLLOW_TILDE_in_factor1491); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TILDE134_tree = (Object)adaptor.create(TILDE134);
                    adaptor.addChild(root_0, TILDE134_tree);
                    }
                    dbg.location(174,59);
                    pushFollow(FOLLOW_factor_in_factor1493);
                    factor135=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor135.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, factor_StartIndex); }
        }
        dbg.location(174, 66);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "factor"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:176:1: term : factor ( ( STAR | DIV | MOD | AMPERSAND ) factor )* ;
    public final oberon0Parser.term_return term() throws RecognitionException {
        oberon0Parser.term_return retval = new oberon0Parser.term_return();
        retval.start = input.LT(1);
        int term_StartIndex = input.index();
        Object root_0 = null;

        Token set137=null;
        oberon0Parser.factor_return factor136 = null;

        oberon0Parser.factor_return factor138 = null;


        Object set137_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(176, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:176:7: ( factor ( ( STAR | DIV | MOD | AMPERSAND ) factor )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:176:9: factor ( ( STAR | DIV | MOD | AMPERSAND ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(176,9);
            pushFollow(FOLLOW_factor_in_term1503);
            factor136=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor136.getTree());
            dbg.location(176,16);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:176:16: ( ( STAR | DIV | MOD | AMPERSAND ) factor )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=STAR && LA28_0<=AMPERSAND)) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:176:17: ( STAR | DIV | MOD | AMPERSAND ) factor
            	    {
            	    dbg.location(176,17);
            	    set137=(Token)input.LT(1);
            	    set137=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=AMPERSAND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set137), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(176,49);
            	    pushFollow(FOLLOW_factor_in_term1523);
            	    factor138=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor138.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, term_StartIndex); }
        }
        dbg.location(176, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:178:1: simpleExpression : ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* ;
    public final oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        oberon0Parser.simpleExpression_return retval = new oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);
        int simpleExpression_StartIndex = input.index();
        Object root_0 = null;

        Token set139=null;
        Token set141=null;
        oberon0Parser.term_return term140 = null;

        oberon0Parser.term_return term142 = null;


        Object set139_tree=null;
        Object set141_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "simpleExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:179:2: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:179:4: ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(179,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:179:4: ( PLUS | MINUS )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=PLUS && LA29_0<=MINUS)) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:
                    {
                    dbg.location(179,4);
                    set139=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set139));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}

            dbg.location(179,20);
            pushFollow(FOLLOW_term_in_simpleExpression1544);
            term140=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term140.getTree());
            dbg.location(179,25);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:179:25: ( ( PLUS | MINUS | OR ) term )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30, decisionCanBacktrack[30]);

                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=PLUS && LA30_0<=OR)) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:179:26: ( PLUS | MINUS | OR ) term
            	    {
            	    dbg.location(179,26);
            	    set141=(Token)input.LT(1);
            	    set141=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=OR) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set141), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(179,43);
            	    pushFollow(FOLLOW_term_in_simpleExpression1556);
            	    term142=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term142.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, simpleExpression_StartIndex); }
        }
        dbg.location(179, 49);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "simpleExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:181:1: expression : simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )? ;
    public final oberon0Parser.expression_return expression() throws RecognitionException {
        oberon0Parser.expression_return retval = new oberon0Parser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Token set144=null;
        oberon0Parser.simpleExpression_return simpleExpression143 = null;

        oberon0Parser.simpleExpression_return simpleExpression145 = null;


        Object set144_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(181, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:182:2: ( simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )? )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:182:4: simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(182,4);
            pushFollow(FOLLOW_simpleExpression_in_expression1568);
            simpleExpression143=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression143.getTree());
            dbg.location(183,3);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:183:3: ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )?
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=EQUALS && LA31_0<=GREATEREQUAL)) ) {
                alt31=1;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:183:4: ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression
                    {
                    dbg.location(183,4);
                    set144=(Token)input.LT(1);
                    set144=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALS && input.LA(1)<=GREATEREQUAL) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set144), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(184,3);
                    pushFollow(FOLLOW_simpleExpression_in_expression1591);
                    simpleExpression145=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression145.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(31);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, expression_StartIndex); }
        }
        dbg.location(184, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    public static class sqrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqrExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:186:1: sqrExpression : SQROPEN expression SQRCLOSE -> expression ;
    public final oberon0Parser.sqrExpression_return sqrExpression() throws RecognitionException {
        oberon0Parser.sqrExpression_return retval = new oberon0Parser.sqrExpression_return();
        retval.start = input.LT(1);
        int sqrExpression_StartIndex = input.index();
        Object root_0 = null;

        Token SQROPEN146=null;
        Token SQRCLOSE148=null;
        oberon0Parser.expression_return expression147 = null;


        Object SQROPEN146_tree=null;
        Object SQRCLOSE148_tree=null;
        RewriteRuleTokenStream stream_SQROPEN=new RewriteRuleTokenStream(adaptor,"token SQROPEN");
        RewriteRuleTokenStream stream_SQRCLOSE=new RewriteRuleTokenStream(adaptor,"token SQRCLOSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "sqrExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:187:2: ( SQROPEN expression SQRCLOSE -> expression )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:187:4: SQROPEN expression SQRCLOSE
            {
            dbg.location(187,4);
            SQROPEN146=(Token)match(input,SQROPEN,FOLLOW_SQROPEN_in_sqrExpression1602); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SQROPEN.add(SQROPEN146);

            dbg.location(187,12);
            pushFollow(FOLLOW_expression_in_sqrExpression1604);
            expression147=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression147.getTree());
            dbg.location(187,23);
            SQRCLOSE148=(Token)match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_sqrExpression1606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SQRCLOSE.add(SQRCLOSE148);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:32: -> expression
            {
                dbg.location(187,35);
                adaptor.addChild(root_0, stream_expression.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, sqrExpression_StartIndex); }
        }
        dbg.location(187, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sqrExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "sqrExpression"

    public static class rndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rndExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:188:1: rndExpression : RNDOPEN expression RNDCLOSE -> expression ;
    public final oberon0Parser.rndExpression_return rndExpression() throws RecognitionException {
        oberon0Parser.rndExpression_return retval = new oberon0Parser.rndExpression_return();
        retval.start = input.LT(1);
        int rndExpression_StartIndex = input.index();
        Object root_0 = null;

        Token RNDOPEN149=null;
        Token RNDCLOSE151=null;
        oberon0Parser.expression_return expression150 = null;


        Object RNDOPEN149_tree=null;
        Object RNDCLOSE151_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "rndExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(188, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:189:2: ( RNDOPEN expression RNDCLOSE -> expression )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:189:4: RNDOPEN expression RNDCLOSE
            {
            dbg.location(189,4);
            RNDOPEN149=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_rndExpression1618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN149);

            dbg.location(189,12);
            pushFollow(FOLLOW_expression_in_rndExpression1620);
            expression150=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression150.getTree());
            dbg.location(189,23);
            RNDCLOSE151=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_rndExpression1622); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDCLOSE.add(RNDCLOSE151);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 189:31: -> expression
            {
                dbg.location(189,34);
                adaptor.addChild(root_0, stream_expression.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, rndExpression_StartIndex); }
        }
        dbg.location(189, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rndExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rndExpression"

    public static class nameident_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameident"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:191:1: nameident : IDENT -> ^( NAME IDENT ) ;
    public final oberon0Parser.nameident_return nameident() throws RecognitionException {
        oberon0Parser.nameident_return retval = new oberon0Parser.nameident_return();
        retval.start = input.LT(1);
        int nameident_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT152=null;

        Object IDENT152_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");

        try { dbg.enterRule(getGrammarFileName(), "nameident");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:192:2: ( IDENT -> ^( NAME IDENT ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:192:4: IDENT
            {
            dbg.location(192,4);
            IDENT152=(Token)match(input,IDENT,FOLLOW_IDENT_in_nameident1634); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT152);



            // AST REWRITE
            // elements: IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 192:10: -> ^( NAME IDENT )
            {
                dbg.location(192,13);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:192:13: ^( NAME IDENT )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(192,15);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAME, "NAME"), root_1);

                dbg.location(192,20);
                adaptor.addChild(root_1, stream_IDENT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, nameident_StartIndex); }
        }
        dbg.location(192, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nameident");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "nameident"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:194:1: number : INTEGER ;
    public final oberon0Parser.number_return number() throws RecognitionException {
        oberon0Parser.number_return retval = new oberon0Parser.number_return();
        retval.start = input.LT(1);
        int number_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER153=null;

        Object INTEGER153_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:194:8: ( INTEGER )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:194:10: INTEGER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(194,10);
            INTEGER153=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1650); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER153_tree = (Object)adaptor.create(INTEGER153);
            adaptor.addChild(root_0, INTEGER153_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, number_StartIndex); }
        }
        dbg.location(194, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "number"

    public static class semicolon_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "semicolon"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:196:1: semicolon : SEMICOLON ;
    public final oberon0Parser.semicolon_return semicolon() throws RecognitionException {
        oberon0Parser.semicolon_return retval = new oberon0Parser.semicolon_return();
        retval.start = input.LT(1);
        int semicolon_StartIndex = input.index();
        Object root_0 = null;

        Token SEMICOLON154=null;

        Object SEMICOLON154_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "semicolon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(196, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:197:2: ( SEMICOLON )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:197:4: SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(197,13);
            SEMICOLON154=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_semicolon1660); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, semicolon_StartIndex); }
        }
        dbg.location(197, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "semicolon");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "semicolon"

    public static class comma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comma"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:199:1: comma : COMMA ;
    public final oberon0Parser.comma_return comma() throws RecognitionException {
        oberon0Parser.comma_return retval = new oberon0Parser.comma_return();
        retval.start = input.LT(1);
        int comma_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA155=null;

        Object COMMA155_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:199:7: ( COMMA )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:199:9: COMMA
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(199,14);
            COMMA155=(Token)match(input,COMMA,FOLLOW_COMMA_in_comma1670); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, comma_StartIndex); }
        }
        dbg.location(199, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comma");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comma"

    public static class colon_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "colon"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:201:1: colon : COLON ;
    public final oberon0Parser.colon_return colon() throws RecognitionException {
        oberon0Parser.colon_return retval = new oberon0Parser.colon_return();
        retval.start = input.LT(1);
        int colon_StartIndex = input.index();
        Object root_0 = null;

        Token COLON156=null;

        Object COLON156_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:201:7: ( COLON )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:201:9: COLON
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(201,14);
            COLON156=(Token)match(input,COLON,FOLLOW_COLON_in_colon1679); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, colon_StartIndex); }
        }
        dbg.location(201, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "colon");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "colon"

    // $ANTLR start synpred15_oberon0
    public final void synpred15_oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:112:15: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:112:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
        {
        dbg.location(112,15);
        match(input,IF,FOLLOW_IF_in_synpred15_oberon0820); if (state.failed) return ;
        dbg.location(112,18);
        pushFollow(FOLLOW_expression_in_synpred15_oberon0822);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(112,29);
        match(input,THEN,FOLLOW_THEN_in_synpred15_oberon0824); if (state.failed) return ;
        dbg.location(112,34);
        pushFollow(FOLLOW_statementSequence_in_synpred15_oberon0826);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(113,4);
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:113:4: ( ELSIF expression THEN statementSequence )+
        int cnt33=0;
        try { dbg.enterSubRule(33);

        loop33:
        do {
            int alt33=2;
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==ELSIF) ) {
                alt33=1;
            }


            } finally {dbg.exitDecision(33);}

            switch (alt33) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:113:5: ELSIF expression THEN statementSequence
        	    {
        	    dbg.location(113,5);
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred15_oberon0833); if (state.failed) return ;
        	    dbg.location(113,11);
        	    pushFollow(FOLLOW_expression_in_synpred15_oberon0835);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    dbg.location(113,22);
        	    match(input,THEN,FOLLOW_THEN_in_synpred15_oberon0837); if (state.failed) return ;
        	    dbg.location(113,27);
        	    pushFollow(FOLLOW_statementSequence_in_synpred15_oberon0839);
        	    statementSequence();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt33 >= 1 ) break loop33;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(33, input);
                    dbg.recognitionException(eee);

                    throw eee;
            }
            cnt33++;
        } while (true);
        } finally {dbg.exitSubRule(33);}

        dbg.location(114,4);
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:114:4: ( ELSE statementSequence )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:114:5: ELSE statementSequence
        {
        dbg.location(114,5);
        match(input,ELSE,FOLLOW_ELSE_in_synpred15_oberon0848); if (state.failed) return ;
        dbg.location(114,10);
        pushFollow(FOLLOW_statementSequence_in_synpred15_oberon0850);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        dbg.location(114,29);
        match(input,END,FOLLOW_END_in_synpred15_oberon0853); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_oberon0

    // $ANTLR start synpred17_oberon0
    public final void synpred17_oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:118:6: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:118:6: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
        {
        dbg.location(118,6);
        match(input,IF,FOLLOW_IF_in_synpred17_oberon0920); if (state.failed) return ;
        dbg.location(118,9);
        pushFollow(FOLLOW_expression_in_synpred17_oberon0922);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(118,20);
        match(input,THEN,FOLLOW_THEN_in_synpred17_oberon0924); if (state.failed) return ;
        dbg.location(118,25);
        pushFollow(FOLLOW_statementSequence_in_synpred17_oberon0926);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(119,4);
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:119:4: ( ELSIF expression THEN statementSequence )+
        int cnt34=0;
        try { dbg.enterSubRule(34);

        loop34:
        do {
            int alt34=2;
            try { dbg.enterDecision(34, decisionCanBacktrack[34]);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==ELSIF) ) {
                alt34=1;
            }


            } finally {dbg.exitDecision(34);}

            switch (alt34) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:119:5: ELSIF expression THEN statementSequence
        	    {
        	    dbg.location(119,5);
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred17_oberon0933); if (state.failed) return ;
        	    dbg.location(119,11);
        	    pushFollow(FOLLOW_expression_in_synpred17_oberon0935);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    dbg.location(119,22);
        	    match(input,THEN,FOLLOW_THEN_in_synpred17_oberon0937); if (state.failed) return ;
        	    dbg.location(119,27);
        	    pushFollow(FOLLOW_statementSequence_in_synpred17_oberon0939);
        	    statementSequence();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt34 >= 1 ) break loop34;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(34, input);
                    dbg.recognitionException(eee);

                    throw eee;
            }
            cnt34++;
        } while (true);
        } finally {dbg.exitSubRule(34);}

        dbg.location(119,47);
        match(input,END,FOLLOW_END_in_synpred17_oberon0943); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_oberon0

    // $ANTLR start synpred18_oberon0
    public final void synpred18_oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:122:6: ( IF expression THEN statementSequence ( ELSE statementSequence ) END )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:122:6: IF expression THEN statementSequence ( ELSE statementSequence ) END
        {
        dbg.location(122,6);
        match(input,IF,FOLLOW_IF_in_synpred18_oberon0995); if (state.failed) return ;
        dbg.location(122,9);
        pushFollow(FOLLOW_expression_in_synpred18_oberon0997);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(122,20);
        match(input,THEN,FOLLOW_THEN_in_synpred18_oberon0999); if (state.failed) return ;
        dbg.location(122,25);
        pushFollow(FOLLOW_statementSequence_in_synpred18_oberon01001);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(123,4);
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:123:4: ( ELSE statementSequence )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:123:5: ELSE statementSequence
        {
        dbg.location(123,5);
        match(input,ELSE,FOLLOW_ELSE_in_synpred18_oberon01008); if (state.failed) return ;
        dbg.location(123,10);
        pushFollow(FOLLOW_statementSequence_in_synpred18_oberon01010);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        dbg.location(123,29);
        match(input,END,FOLLOW_END_in_synpred18_oberon01013); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_oberon0

    // $ANTLR start synpred19_oberon0
    public final void synpred19_oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:5: ( assignment )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:5: assignment
        {
        dbg.location(133,5);
        pushFollow(FOLLOW_assignment_in_synpred19_oberon01136);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_oberon0

    // $ANTLR start synpred20_oberon0
    public final void synpred20_oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:18: ( procedureCall )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:18: procedureCall
        {
        dbg.location(133,18);
        pushFollow(FOLLOW_procedureCall_in_synpred20_oberon01140);
        procedureCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_oberon0

    // Delegated rules

    public final boolean synpred15_oberon0() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred15_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_oberon0() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred17_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_oberon0() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred20_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_oberon0() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred18_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_oberon0() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred19_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\13\uffff";
    static final String DFA17_eofS =
        "\1\4\12\uffff";
    static final String DFA17_minS =
        "\1\35\1\0\11\uffff";
    static final String DFA17_maxS =
        "\1\63\1\0\11\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA17_transitionS = {
            "\4\4\1\2\1\3\20\uffff\1\1",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "133:4: ( assignment | procedureCall | ifStatement | whileStatement )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_oberon0()) ) {s = 9;}

                        else if ( (synpred20_oberon0()) ) {s = 10;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_MODULE_in_module415 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_nameident_in_module417 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_module419 = new BitSet(new long[]{0x000003E040000000L});
    public static final BitSet FOLLOW_moduleBody_in_module421 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module423 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_module425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody449 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody452 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody454 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_moduleBody458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations483 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations486 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations489 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations497 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_declarations499 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration540 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_nameident_in_constDeclaration543 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration545 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_constDeclaration547 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_constDeclaration549 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_TYPEDECL_in_typeDeclaration582 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration585 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration587 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration589 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_typeDeclaration591 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations624 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations627 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_varDeclarations629 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_varDeclarations631 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_varDeclarations633 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration659 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_nameident_in_procedureDeclaration661 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration664 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_procedureDeclaration668 = new BitSet(new long[]{0x000803E000000000L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration670 = new BitSet(new long[]{0x0008020000000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration673 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody714 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody716 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_procedureBody718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_assignment738 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment740 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_assignment743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_actualParameters752 = new BitSet(new long[]{0x0018000008300300L});
    public static final BitSet FOLLOW_expression_in_actualParameters755 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_COMMA_in_actualParameters758 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_actualParameters760 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_actualParameters766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_procedureCall787 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement820 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement822 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement824 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement826 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement833 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement835 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement837 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement839 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement848 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement850 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement920 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement922 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement924 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement926 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement933 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement935 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement937 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement939 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_END_in_ifStatement943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement995 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement997 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement999 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1001 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1008 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1010 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1058 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1060 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1062 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1064 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1096 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_whileStatement1098 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1100 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1102 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_whileStatement1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1160 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_semicolon_in_statementSequence1163 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1165 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IDENT_in_identList1176 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_comma_in_identList1179 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList1181 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1205 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_arrayType1207 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OF_in_arrayType1209 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_arrayType1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1237 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_colon_in_fieldList1239 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_fieldList1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1253 = new BitSet(new long[]{0x0008000060000000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1255 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_semicolon_in_recordType1258 = new BitSet(new long[]{0x0008000060000000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1260 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_recordType1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fpSection1327 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_fpSection1329 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection1349 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_identList_in_fpSection1351 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_fpSection1353 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_formalParameters1378 = new BitSet(new long[]{0x0008008000200000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1381 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_SEMICOLON_in_formalParameters1384 = new BitSet(new long[]{0x0008008000000000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1386 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_formalParameters1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector1420 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector1422 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_sqrExpression_in_selector1441 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_IDENT_in_identselector1466 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_selector_in_identselector1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_factor1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rndExpression_in_factor1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor1491 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_factor_in_factor1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1503 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_term1506 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_factor_in_term1523 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_simpleExpression1535 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1544 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_set_in_simpleExpression1547 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1556 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1568 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_set_in_expression1573 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQROPEN_in_sqrExpression1602 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_sqrExpression1604 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SQRCLOSE_in_sqrExpression1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_rndExpression1618 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_rndExpression1620 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_rndExpression1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_nameident1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_semicolon1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_comma1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_colon1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred15_oberon0820 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred15_oberon0822 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred15_oberon0824 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred15_oberon0826 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred15_oberon0833 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred15_oberon0835 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred15_oberon0837 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred15_oberon0839 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred15_oberon0848 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred15_oberon0850 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_synpred15_oberon0853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred17_oberon0920 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred17_oberon0922 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred17_oberon0924 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred17_oberon0926 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred17_oberon0933 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred17_oberon0935 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred17_oberon0937 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred17_oberon0939 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_END_in_synpred17_oberon0943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred18_oberon0995 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred18_oberon0997 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred18_oberon0999 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred18_oberon01001 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred18_oberon01008 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred18_oberon01010 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_synpred18_oberon01013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred19_oberon01136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred20_oberon01140 = new BitSet(new long[]{0x0000000000000002L});

}