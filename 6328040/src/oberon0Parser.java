// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g 2011-01-10 22:45:11

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STAR", "DIV", "MOD", "AMPERSAND", "PLUS", "MINUS", "OR", "EQUALS", "HASH", "SMALLERTHEN", "SMALLEREQUAL", "GREATERTHEN", "GREATEREQUAL", "DOT", "COMMA", "COLON", "RNDOPEN", "RNDCLOSE", "SQROPEN", "SQRCLOSE", "OF", "THEN", "DO", "TILDE", "ASSIGN", "SEMICOLON", "END", "ELSE", "ELSIF", "IF", "WHILE", "ARRAY", "RECORD", "CONST", "NWTYPE", "VAR", "PROCEDURE", "BEGIN", "MODULE", "PARAMETERS", "BODY", "CONDITION", "TYPE", "NAME", "IDENT", "INTEGER", "WS", "OPTWS"
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
    public static final int NWTYPE=38;
    public static final int VAR=39;
    public static final int PROCEDURE=40;
    public static final int BEGIN=41;
    public static final int MODULE=42;
    public static final int PARAMETERS=43;
    public static final int BODY=44;
    public static final int CONDITION=45;
    public static final int TYPE=46;
    public static final int NAME=47;
    public static final int IDENT=48;
    public static final int INTEGER=49;
    public static final int WS=50;
    public static final int OPTWS=51;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred23_oberon0", "synpred48_oberon0", "semicolon", 
        "synpred6_oberon0", "synpred50_oberon0", "synpred42_oberon0", "colon", 
        "synpred16_oberon0", "synpred3_oberon0", "synpred19_oberon0", "comma", 
        "synpred26_oberon0", "synpred2_oberon0", "synpred14_oberon0", "identList", 
        "assignment", "synpred24_oberon0", "varDeclarations", "synpred27_oberon0", 
        "synpred20_oberon0", "synpred35_oberon0", "synpred12_oberon0", "synpred13_oberon0", 
        "synpred18_oberon0", "synpred21_oberon0", "synpred4_oberon0", "whileStatement", 
        "synpred10_oberon0", "declarations", "procedureCall", "selector", 
        "synpred51_oberon0", "synpred15_oberon0", "module", "type", "synpred11_oberon0", 
        "synpred49_oberon0", "synpred37_oberon0", "recordType", "synpred38_oberon0", 
        "synpred29_oberon0", "statementSequence", "rndExpression", "synpred1_oberon0", 
        "synpred9_oberon0", "term", "synpred8_oberon0", "synpred7_oberon0", 
        "synpred17_oberon0", "synpred41_oberon0", "moduleBody", "arrayType", 
        "formalParameters", "synpred45_oberon0", "statement", "actualParameters", 
        "procedureDeclaration", "synpred43_oberon0", "synpred25_oberon0", 
        "synpred22_oberon0", "synpred36_oberon0", "fieldList", "synpred39_oberon0", 
        "fpSection", "synpred31_oberon0", "simpleExpression", "synpred33_oberon0", 
        "synpred47_oberon0", "synpred40_oberon0", "synpred30_oberon0", "number", 
        "sqrExpression", "procedureBody", "synpred44_oberon0", "nameident", 
        "constDeclaration", "synpred28_oberon0", "identselector", "synpred34_oberon0", 
        "ifStatement", "typeDeclaration", "synpred46_oberon0", "factor", 
        "expression", "synpred5_oberon0", "synpred32_oberon0"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, false, false, false, 
            false, false, false, true, true, false, false, false, false, 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:64:1: module : MODULE nameident semicolon moduleBody IDENT DOT EOF -> ^( MODULE nameident moduleBody ) ;
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
        dbg.location(64, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:64:8: ( MODULE nameident semicolon moduleBody IDENT DOT EOF -> ^( MODULE nameident moduleBody ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:64:10: MODULE nameident semicolon moduleBody IDENT DOT EOF
            {
            dbg.location(64,10);
            MODULE1=(Token)match(input,MODULE,FOLLOW_MODULE_in_module404); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE1);

            dbg.location(64,17);
            pushFollow(FOLLOW_nameident_in_module406);
            nameident2=nameident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nameident.add(nameident2.getTree());
            dbg.location(64,27);
            pushFollow(FOLLOW_semicolon_in_module408);
            semicolon3=semicolon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semicolon.add(semicolon3.getTree());
            dbg.location(64,37);
            pushFollow(FOLLOW_moduleBody_in_module410);
            moduleBody4=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody4.getTree());
            dbg.location(64,48);
            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_module412); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT5);

            dbg.location(64,54);
            DOT6=(Token)match(input,DOT,FOLLOW_DOT_in_module414); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT6);

            dbg.location(64,58);
            EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_module416); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF7);



            // AST REWRITE
            // elements: MODULE, nameident, moduleBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:4: -> ^( MODULE nameident moduleBody )
            {
                dbg.location(65,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:65:7: ^( MODULE nameident moduleBody )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(65,9);
                root_1 = (Object)adaptor.becomeRoot(stream_MODULE.nextNode(), root_1);

                dbg.location(65,16);
                adaptor.addChild(root_1, stream_nameident.nextTree());
                dbg.location(65,26);
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
        dbg.location(65, 37);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:67:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
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
        dbg.location(67, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:68:2: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:68:4: declarations ( BEGIN statementSequence )? END
            {
            dbg.location(68,4);
            pushFollow(FOLLOW_declarations_in_moduleBody438);
            declarations8=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations8.getTree());
            dbg.location(68,17);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:68:17: ( BEGIN statementSequence )?
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

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:68:18: BEGIN statementSequence
                    {
                    dbg.location(68,18);
                    BEGIN9=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN9);

                    dbg.location(68,24);
                    pushFollow(FOLLOW_statementSequence_in_moduleBody443);
                    statementSequence10=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence10.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(68,44);
            END11=(Token)match(input,END,FOLLOW_END_in_moduleBody447); if (state.failed) return retval; 
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
            // 69:4: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                dbg.location(69,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:69:7: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    dbg.location(69,7);
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                dbg.location(69,21);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:69:21: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    dbg.location(69,21);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:69:21: ^( BODY statementSequence )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(69,23);
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                    dbg.location(69,28);
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
        dbg.location(69, 47);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:71:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
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
        dbg.location(71, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:72:2: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:72:5: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )*
            {
            dbg.location(72,5);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:72:5: ( constDeclaration )?
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
                    dbg.location(72,5);
                    pushFollow(FOLLOW_constDeclaration_in_declarations472);
                    constDeclaration12=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration12.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(72,23);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:72:23: ( typeDeclaration )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==NWTYPE) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:0:0: typeDeclaration
                    {
                    dbg.location(72,23);
                    pushFollow(FOLLOW_typeDeclaration_in_declarations475);
                    typeDeclaration13=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration13.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(72,40);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:72:40: ( varDeclarations )?
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
                    dbg.location(72,40);
                    pushFollow(FOLLOW_varDeclarations_in_declarations478);
                    varDeclarations14=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations14.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(73,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:73:4: ( procedureDeclaration semicolon )*
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

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:73:5: procedureDeclaration semicolon
            	    {
            	    dbg.location(73,5);
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations486);
            	    procedureDeclaration15=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration15.getTree());
            	    dbg.location(73,26);
            	    pushFollow(FOLLOW_semicolon_in_declarations488);
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
            // elements: varDeclarations, constDeclaration, procedureDeclaration, typeDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                dbg.location(74,8);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:74:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    dbg.location(74,8);
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                dbg.location(74,26);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:74:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    dbg.location(74,26);
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                dbg.location(74,43);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:74:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    dbg.location(74,43);
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                dbg.location(75,5);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:5: ( procedureDeclaration )*
                while ( stream_procedureDeclaration.hasNext() ) {
                    dbg.location(75,6);
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
        dbg.location(75, 28);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:77:1: constDeclaration : ( CONST ( nameident EQUALS expression semicolon )* ) -> ^( CONST ( nameident expression )* ) ;
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
        dbg.location(77, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:78:2: ( ( CONST ( nameident EQUALS expression semicolon )* ) -> ^( CONST ( nameident expression )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:78:4: ( CONST ( nameident EQUALS expression semicolon )* )
            {
            dbg.location(78,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:78:4: ( CONST ( nameident EQUALS expression semicolon )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:78:5: CONST ( nameident EQUALS expression semicolon )*
            {
            dbg.location(78,5);
            CONST17=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration529); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST17);

            dbg.location(78,11);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:78:11: ( nameident EQUALS expression semicolon )*
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

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:78:12: nameident EQUALS expression semicolon
            	    {
            	    dbg.location(78,12);
            	    pushFollow(FOLLOW_nameident_in_constDeclaration532);
            	    nameident18=nameident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_nameident.add(nameident18.getTree());
            	    dbg.location(78,22);
            	    EQUALS19=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration534); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS19);

            	    dbg.location(78,29);
            	    pushFollow(FOLLOW_expression_in_constDeclaration536);
            	    expression20=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression20.getTree());
            	    dbg.location(78,40);
            	    pushFollow(FOLLOW_semicolon_in_constDeclaration538);
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
            // elements: nameident, expression, CONST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:4: -> ^( CONST ( nameident expression )* )
            {
                dbg.location(79,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:79:7: ^( CONST ( nameident expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(79,9);
                root_1 = (Object)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                dbg.location(79,15);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:79:15: ( nameident expression )*
                while ( stream_nameident.hasNext()||stream_expression.hasNext() ) {
                    dbg.location(79,16);
                    adaptor.addChild(root_1, stream_nameident.nextTree());
                    dbg.location(79,26);
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
        dbg.location(79, 39);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:81:1: typeDeclaration : ( NWTYPE ( IDENT EQUALS type semicolon )* ) -> ^( NWTYPE ( IDENT type )* ) ;
    public final oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        oberon0Parser.typeDeclaration_return retval = new oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token NWTYPE22=null;
        Token IDENT23=null;
        Token EQUALS24=null;
        oberon0Parser.type_return type25 = null;

        oberon0Parser.semicolon_return semicolon26 = null;


        Object NWTYPE22_tree=null;
        Object IDENT23_tree=null;
        Object EQUALS24_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_NWTYPE=new RewriteRuleTokenStream(adaptor,"token NWTYPE");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "typeDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:82:2: ( ( NWTYPE ( IDENT EQUALS type semicolon )* ) -> ^( NWTYPE ( IDENT type )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:82:4: ( NWTYPE ( IDENT EQUALS type semicolon )* )
            {
            dbg.location(82,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:82:4: ( NWTYPE ( IDENT EQUALS type semicolon )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:82:5: NWTYPE ( IDENT EQUALS type semicolon )*
            {
            dbg.location(82,5);
            NWTYPE22=(Token)match(input,NWTYPE,FOLLOW_NWTYPE_in_typeDeclaration571); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NWTYPE.add(NWTYPE22);

            dbg.location(82,12);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:82:12: ( IDENT EQUALS type semicolon )*
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

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:82:13: IDENT EQUALS type semicolon
            	    {
            	    dbg.location(82,13);
            	    IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration574); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT23);

            	    dbg.location(82,19);
            	    EQUALS24=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration576); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS24);

            	    dbg.location(82,26);
            	    pushFollow(FOLLOW_type_in_typeDeclaration578);
            	    type25=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type25.getTree());
            	    dbg.location(82,31);
            	    pushFollow(FOLLOW_semicolon_in_typeDeclaration580);
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
            // elements: NWTYPE, type, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:4: -> ^( NWTYPE ( IDENT type )* )
            {
                dbg.location(83,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:83:7: ^( NWTYPE ( IDENT type )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(83,9);
                root_1 = (Object)adaptor.becomeRoot(stream_NWTYPE.nextNode(), root_1);

                dbg.location(83,16);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:83:16: ( IDENT type )*
                while ( stream_type.hasNext()||stream_IDENT.hasNext() ) {
                    dbg.location(83,17);
                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    dbg.location(83,23);
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
        dbg.location(83, 30);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:85:1: varDeclarations : ( VAR ( identList colon type semicolon )* ) -> ( ^( VAR type identList ) )* ;
    public final oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        oberon0Parser.varDeclarations_return retval = new oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);
        int varDeclarations_StartIndex = input.index();
        Object root_0 = null;

        Token VAR27=null;
        oberon0Parser.identList_return identList28 = null;

        oberon0Parser.colon_return colon29 = null;

        oberon0Parser.type_return type30 = null;

        oberon0Parser.semicolon_return semicolon31 = null;


        Object VAR27_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_colon=new RewriteRuleSubtreeStream(adaptor,"rule colon");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "varDeclarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:86:2: ( ( VAR ( identList colon type semicolon )* ) -> ( ^( VAR type identList ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:86:4: ( VAR ( identList colon type semicolon )* )
            {
            dbg.location(86,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:86:4: ( VAR ( identList colon type semicolon )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:86:5: VAR ( identList colon type semicolon )*
            {
            dbg.location(86,5);
            VAR27=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR27);

            dbg.location(86,9);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:86:9: ( identList colon type semicolon )*
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

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:86:10: identList colon type semicolon
            	    {
            	    dbg.location(86,10);
            	    pushFollow(FOLLOW_identList_in_varDeclarations616);
            	    identList28=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList28.getTree());
            	    dbg.location(86,20);
            	    pushFollow(FOLLOW_colon_in_varDeclarations618);
            	    colon29=colon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_colon.add(colon29.getTree());
            	    dbg.location(86,26);
            	    pushFollow(FOLLOW_type_in_varDeclarations620);
            	    type30=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type30.getTree());
            	    dbg.location(86,31);
            	    pushFollow(FOLLOW_semicolon_in_varDeclarations622);
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
            // 87:4: -> ( ^( VAR type identList ) )*
            {
                dbg.location(87,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:87:7: ( ^( VAR type identList ) )*
                while ( stream_type.hasNext()||stream_VAR.hasNext()||stream_identList.hasNext() ) {
                    dbg.location(87,7);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:87:7: ^( VAR type identList )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(87,9);
                    root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    dbg.location(87,13);
                    adaptor.addChild(root_1, stream_type.nextTree());
                    dbg.location(87,18);
                    adaptor.addChild(root_1, stream_identList.nextTree());

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
        dbg.location(87, 29);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:89:1: procedureDeclaration : PROCEDURE IDENT ( formalParameters )? semicolon declarations ( procedureBody )? IDENT -> ^( PROCEDURE IDENT ( formalParameters )? declarations ( procedureBody )? ) ;
    public final oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        oberon0Parser.procedureDeclaration_return retval = new oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);
        int procedureDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token PROCEDURE32=null;
        Token IDENT33=null;
        Token IDENT38=null;
        oberon0Parser.formalParameters_return formalParameters34 = null;

        oberon0Parser.semicolon_return semicolon35 = null;

        oberon0Parser.declarations_return declarations36 = null;

        oberon0Parser.procedureBody_return procedureBody37 = null;


        Object PROCEDURE32_tree=null;
        Object IDENT33_tree=null;
        Object IDENT38_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try { dbg.enterRule(getGrammarFileName(), "procedureDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:90:2: ( PROCEDURE IDENT ( formalParameters )? semicolon declarations ( procedureBody )? IDENT -> ^( PROCEDURE IDENT ( formalParameters )? declarations ( procedureBody )? ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:90:4: PROCEDURE IDENT ( formalParameters )? semicolon declarations ( procedureBody )? IDENT
            {
            dbg.location(90,4);
            PROCEDURE32=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration648); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE32);

            dbg.location(90,14);
            IDENT33=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration650); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT33);

            dbg.location(90,20);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:90:20: ( formalParameters )?
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

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:90:21: formalParameters
                    {
                    dbg.location(90,21);
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration653);
                    formalParameters34=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters34.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(90,40);
            pushFollow(FOLLOW_semicolon_in_procedureDeclaration657);
            semicolon35=semicolon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semicolon.add(semicolon35.getTree());
            dbg.location(90,50);
            pushFollow(FOLLOW_declarations_in_procedureDeclaration659);
            declarations36=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations36.getTree());
            dbg.location(90,63);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:90:63: ( procedureBody )?
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

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:90:64: procedureBody
                    {
                    dbg.location(90,64);
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration662);
                    procedureBody37=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody37.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(90,80);
            IDENT38=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT38);



            // AST REWRITE
            // elements: PROCEDURE, formalParameters, declarations, procedureBody, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:4: -> ^( PROCEDURE IDENT ( formalParameters )? declarations ( procedureBody )? )
            {
                dbg.location(91,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:91:7: ^( PROCEDURE IDENT ( formalParameters )? declarations ( procedureBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(91,9);
                root_1 = (Object)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                dbg.location(91,19);
                adaptor.addChild(root_1, stream_IDENT.nextNode());
                dbg.location(91,25);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:91:25: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    dbg.location(91,26);
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                dbg.location(91,45);
                adaptor.addChild(root_1, stream_declarations.nextTree());
                dbg.location(91,58);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:91:58: ( procedureBody )?
                if ( stream_procedureBody.hasNext() ) {
                    dbg.location(91,59);
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
        dbg.location(91, 75);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:93:1: procedureBody : BEGIN statementSequence END -> ^( BODY statementSequence ) ;
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
        dbg.location(93, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:94:2: ( BEGIN statementSequence END -> ^( BODY statementSequence ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:94:4: BEGIN statementSequence END
            {
            dbg.location(94,4);
            BEGIN39=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody703); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN39);

            dbg.location(94,10);
            pushFollow(FOLLOW_statementSequence_in_procedureBody705);
            statementSequence40=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence40.getTree());
            dbg.location(94,28);
            END41=(Token)match(input,END,FOLLOW_END_in_procedureBody707); if (state.failed) return retval; 
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
            // 95:4: -> ^( BODY statementSequence )
            {
                dbg.location(95,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:95:7: ^( BODY statementSequence )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(95,9);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                dbg.location(95,14);
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
        dbg.location(95, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedureBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedureBody"

    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:97:1: selector : ( DOT IDENT -> ^( IDENT ) | sqrExpression -> ^( sqrExpression ) )* ;
    public final oberon0Parser.selector_return selector() throws RecognitionException {
        oberon0Parser.selector_return retval = new oberon0Parser.selector_return();
        retval.start = input.LT(1);
        int selector_StartIndex = input.index();
        Object root_0 = null;

        Token DOT42=null;
        Token IDENT43=null;
        oberon0Parser.sqrExpression_return sqrExpression44 = null;


        Object DOT42_tree=null;
        Object IDENT43_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_sqrExpression=new RewriteRuleSubtreeStream(adaptor,"rule sqrExpression");
        try { dbg.enterRule(getGrammarFileName(), "selector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:97:9: ( ( DOT IDENT -> ^( IDENT ) | sqrExpression -> ^( sqrExpression ) )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:97:12: ( DOT IDENT -> ^( IDENT ) | sqrExpression -> ^( sqrExpression ) )*
            {
            dbg.location(97,12);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:97:12: ( DOT IDENT -> ^( IDENT ) | sqrExpression -> ^( sqrExpression ) )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=3;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==DOT) ) {
                    alt11=1;
                }
                else if ( (LA11_0==SQROPEN) ) {
                    alt11=2;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:97:13: DOT IDENT
            	    {
            	    dbg.location(97,13);
            	    DOT42=(Token)match(input,DOT,FOLLOW_DOT_in_selector727); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT42);

            	    dbg.location(97,17);
            	    IDENT43=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector729); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT43);



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
            	    // 97:23: -> ^( IDENT )
            	    {
            	        dbg.location(97,26);
            	        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:97:26: ^( IDENT )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        dbg.location(97,28);
            	        root_1 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_1);

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:97:37: sqrExpression
            	    {
            	    dbg.location(97,37);
            	    pushFollow(FOLLOW_sqrExpression_in_selector739);
            	    sqrExpression44=sqrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqrExpression.add(sqrExpression44.getTree());


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
            	    // 98:4: -> ^( sqrExpression )
            	    {
            	        dbg.location(98,7);
            	        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:98:7: ^( sqrExpression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        dbg.location(98,9);
            	        root_1 = (Object)adaptor.becomeRoot(stream_sqrExpression.nextNode(), root_1);

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


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
            if ( state.backtracking>0 ) { memoize(input, 9, selector_StartIndex); }
        }
        dbg.location(98, 25);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:100:1: identselector : IDENT selector ;
    public final oberon0Parser.identselector_return identselector() throws RecognitionException {
        oberon0Parser.identselector_return retval = new oberon0Parser.identselector_return();
        retval.start = input.LT(1);
        int identselector_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT45=null;
        oberon0Parser.selector_return selector46 = null;


        Object IDENT45_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "identselector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:101:2: ( IDENT selector )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:101:4: IDENT selector
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(101,4);
            IDENT45=(Token)match(input,IDENT,FOLLOW_IDENT_in_identselector760); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT45_tree = (Object)adaptor.create(IDENT45);
            adaptor.addChild(root_0, IDENT45_tree);
            }
            dbg.location(101,10);
            pushFollow(FOLLOW_selector_in_identselector762);
            selector46=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selector46.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, identselector_StartIndex); }
        }
        dbg.location(101, 18);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:103:1: factor : ( identselector | number | rndExpression | TILDE factor ) ;
    public final oberon0Parser.factor_return factor() throws RecognitionException {
        oberon0Parser.factor_return retval = new oberon0Parser.factor_return();
        retval.start = input.LT(1);
        int factor_StartIndex = input.index();
        Object root_0 = null;

        Token TILDE50=null;
        oberon0Parser.identselector_return identselector47 = null;

        oberon0Parser.number_return number48 = null;

        oberon0Parser.rndExpression_return rndExpression49 = null;

        oberon0Parser.factor_return factor51 = null;


        Object TILDE50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:103:9: ( ( identselector | number | rndExpression | TILDE factor ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:103:11: ( identselector | number | rndExpression | TILDE factor )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(103,11);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:103:11: ( identselector | number | rndExpression | TILDE factor )
            int alt12=4;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt12=1;
                }
                break;
            case INTEGER:
                {
                alt12=2;
                }
                break;
            case RNDOPEN:
                {
                alt12=3;
                }
                break;
            case TILDE:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:103:12: identselector
                    {
                    dbg.location(103,12);
                    pushFollow(FOLLOW_identselector_in_factor772);
                    identselector47=identselector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identselector47.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:103:28: number
                    {
                    dbg.location(103,28);
                    pushFollow(FOLLOW_number_in_factor776);
                    number48=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number48.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:103:37: rndExpression
                    {
                    dbg.location(103,37);
                    pushFollow(FOLLOW_rndExpression_in_factor780);
                    rndExpression49=rndExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rndExpression49.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:103:53: TILDE factor
                    {
                    dbg.location(103,53);
                    TILDE50=(Token)match(input,TILDE,FOLLOW_TILDE_in_factor784); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TILDE50_tree = (Object)adaptor.create(TILDE50);
                    adaptor.addChild(root_0, TILDE50_tree);
                    }
                    dbg.location(103,59);
                    pushFollow(FOLLOW_factor_in_factor786);
                    factor51=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor51.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}


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
            if ( state.backtracking>0 ) { memoize(input, 11, factor_StartIndex); }
        }
        dbg.location(103, 66);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:105:1: term : factor ( ( STAR | DIV | MOD | AMPERSAND ) factor )* ;
    public final oberon0Parser.term_return term() throws RecognitionException {
        oberon0Parser.term_return retval = new oberon0Parser.term_return();
        retval.start = input.LT(1);
        int term_StartIndex = input.index();
        Object root_0 = null;

        Token set53=null;
        oberon0Parser.factor_return factor52 = null;

        oberon0Parser.factor_return factor54 = null;


        Object set53_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:105:7: ( factor ( ( STAR | DIV | MOD | AMPERSAND ) factor )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:105:9: factor ( ( STAR | DIV | MOD | AMPERSAND ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(105,9);
            pushFollow(FOLLOW_factor_in_term796);
            factor52=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor52.getTree());
            dbg.location(105,16);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:105:16: ( ( STAR | DIV | MOD | AMPERSAND ) factor )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=STAR && LA13_0<=AMPERSAND)) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:105:17: ( STAR | DIV | MOD | AMPERSAND ) factor
            	    {
            	    dbg.location(105,17);
            	    set53=(Token)input.LT(1);
            	    set53=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=AMPERSAND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set53), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(105,49);
            	    pushFollow(FOLLOW_factor_in_term816);
            	    factor54=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor54.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


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
            if ( state.backtracking>0 ) { memoize(input, 12, term_StartIndex); }
        }
        dbg.location(105, 57);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:107:1: simpleExpression : ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* ;
    public final oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        oberon0Parser.simpleExpression_return retval = new oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);
        int simpleExpression_StartIndex = input.index();
        Object root_0 = null;

        Token set55=null;
        Token set57=null;
        oberon0Parser.term_return term56 = null;

        oberon0Parser.term_return term58 = null;


        Object set55_tree=null;
        Object set57_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "simpleExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:108:2: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:108:4: ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(108,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:108:4: ( PLUS | MINUS )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=PLUS && LA14_0<=MINUS)) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:
                    {
                    dbg.location(108,4);
                    set55=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set55));
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
            } finally {dbg.exitSubRule(14);}

            dbg.location(108,20);
            pushFollow(FOLLOW_term_in_simpleExpression837);
            term56=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term56.getTree());
            dbg.location(108,25);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:108:25: ( ( PLUS | MINUS | OR ) term )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=PLUS && LA15_0<=OR)) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:108:26: ( PLUS | MINUS | OR ) term
            	    {
            	    dbg.location(108,26);
            	    set57=(Token)input.LT(1);
            	    set57=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=OR) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set57), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(108,43);
            	    pushFollow(FOLLOW_term_in_simpleExpression849);
            	    term58=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term58.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


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
            if ( state.backtracking>0 ) { memoize(input, 13, simpleExpression_StartIndex); }
        }
        dbg.location(108, 49);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:110:1: expression : simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )? ;
    public final oberon0Parser.expression_return expression() throws RecognitionException {
        oberon0Parser.expression_return retval = new oberon0Parser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Token set60=null;
        oberon0Parser.simpleExpression_return simpleExpression59 = null;

        oberon0Parser.simpleExpression_return simpleExpression61 = null;


        Object set60_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:111:2: ( simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )? )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:111:4: simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(111,4);
            pushFollow(FOLLOW_simpleExpression_in_expression861);
            simpleExpression59=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression59.getTree());
            dbg.location(112,3);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:112:3: ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=EQUALS && LA16_0<=GREATEREQUAL)) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:112:4: ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression
                    {
                    dbg.location(112,4);
                    set60=(Token)input.LT(1);
                    set60=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALS && input.LA(1)<=GREATEREQUAL) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set60), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(113,3);
                    pushFollow(FOLLOW_simpleExpression_in_expression884);
                    simpleExpression61=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression61.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}


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
            if ( state.backtracking>0 ) { memoize(input, 14, expression_StartIndex); }
        }
        dbg.location(113, 21);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:115:1: sqrExpression : SQROPEN expression SQRCLOSE -> expression ;
    public final oberon0Parser.sqrExpression_return sqrExpression() throws RecognitionException {
        oberon0Parser.sqrExpression_return retval = new oberon0Parser.sqrExpression_return();
        retval.start = input.LT(1);
        int sqrExpression_StartIndex = input.index();
        Object root_0 = null;

        Token SQROPEN62=null;
        Token SQRCLOSE64=null;
        oberon0Parser.expression_return expression63 = null;


        Object SQROPEN62_tree=null;
        Object SQRCLOSE64_tree=null;
        RewriteRuleTokenStream stream_SQROPEN=new RewriteRuleTokenStream(adaptor,"token SQROPEN");
        RewriteRuleTokenStream stream_SQRCLOSE=new RewriteRuleTokenStream(adaptor,"token SQRCLOSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "sqrExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:116:2: ( SQROPEN expression SQRCLOSE -> expression )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:116:4: SQROPEN expression SQRCLOSE
            {
            dbg.location(116,4);
            SQROPEN62=(Token)match(input,SQROPEN,FOLLOW_SQROPEN_in_sqrExpression895); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SQROPEN.add(SQROPEN62);

            dbg.location(116,12);
            pushFollow(FOLLOW_expression_in_sqrExpression897);
            expression63=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression63.getTree());
            dbg.location(116,23);
            SQRCLOSE64=(Token)match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_sqrExpression899); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SQRCLOSE.add(SQRCLOSE64);



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
            // 116:32: -> expression
            {
                dbg.location(116,35);
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
            if ( state.backtracking>0 ) { memoize(input, 15, sqrExpression_StartIndex); }
        }
        dbg.location(116, 45);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:117:1: rndExpression : RNDOPEN expression RNDCLOSE -> expression ;
    public final oberon0Parser.rndExpression_return rndExpression() throws RecognitionException {
        oberon0Parser.rndExpression_return retval = new oberon0Parser.rndExpression_return();
        retval.start = input.LT(1);
        int rndExpression_StartIndex = input.index();
        Object root_0 = null;

        Token RNDOPEN65=null;
        Token RNDCLOSE67=null;
        oberon0Parser.expression_return expression66 = null;


        Object RNDOPEN65_tree=null;
        Object RNDCLOSE67_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try { dbg.enterRule(getGrammarFileName(), "rndExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:118:2: ( RNDOPEN expression RNDCLOSE -> expression )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:118:4: RNDOPEN expression RNDCLOSE
            {
            dbg.location(118,4);
            RNDOPEN65=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_rndExpression911); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN65);

            dbg.location(118,12);
            pushFollow(FOLLOW_expression_in_rndExpression913);
            expression66=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression66.getTree());
            dbg.location(118,23);
            RNDCLOSE67=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_rndExpression915); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDCLOSE.add(RNDCLOSE67);



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
            // 118:31: -> expression
            {
                dbg.location(118,34);
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
            if ( state.backtracking>0 ) { memoize(input, 16, rndExpression_StartIndex); }
        }
        dbg.location(118, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rndExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rndExpression"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:120:1: assignment : identselector ASSIGN expression ;
    public final oberon0Parser.assignment_return assignment() throws RecognitionException {
        oberon0Parser.assignment_return retval = new oberon0Parser.assignment_return();
        retval.start = input.LT(1);
        int assignment_StartIndex = input.index();
        Object root_0 = null;

        Token ASSIGN69=null;
        oberon0Parser.identselector_return identselector68 = null;

        oberon0Parser.expression_return expression70 = null;


        Object ASSIGN69_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:121:2: ( identselector ASSIGN expression )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:121:4: identselector ASSIGN expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(121,4);
            pushFollow(FOLLOW_identselector_in_assignment927);
            identselector68=identselector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identselector68.getTree());
            dbg.location(121,24);
            ASSIGN69=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment929); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN69_tree = (Object)adaptor.create(ASSIGN69);
            root_0 = (Object)adaptor.becomeRoot(ASSIGN69_tree, root_0);
            }
            dbg.location(121,26);
            pushFollow(FOLLOW_expression_in_assignment932);
            expression70=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression70.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 17, assignment_StartIndex); }
        }
        dbg.location(121, 36);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:123:1: actualParameters : RNDOPEN ( expression ( comma expression )* )? RNDCLOSE -> ^( PARAMETERS ( expression )+ ) ;
    public final oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        oberon0Parser.actualParameters_return retval = new oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);
        int actualParameters_StartIndex = input.index();
        Object root_0 = null;

        Token RNDOPEN71=null;
        Token RNDCLOSE75=null;
        oberon0Parser.expression_return expression72 = null;

        oberon0Parser.comma_return comma73 = null;

        oberon0Parser.expression_return expression74 = null;


        Object RNDOPEN71_tree=null;
        Object RNDCLOSE75_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_comma=new RewriteRuleSubtreeStream(adaptor,"rule comma");
        try { dbg.enterRule(getGrammarFileName(), "actualParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:124:2: ( RNDOPEN ( expression ( comma expression )* )? RNDCLOSE -> ^( PARAMETERS ( expression )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:124:4: RNDOPEN ( expression ( comma expression )* )? RNDCLOSE
            {
            dbg.location(124,4);
            RNDOPEN71=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_actualParameters941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN71);

            dbg.location(124,12);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:124:12: ( expression ( comma expression )* )?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=PLUS && LA18_0<=MINUS)||LA18_0==RNDOPEN||LA18_0==TILDE||(LA18_0>=IDENT && LA18_0<=INTEGER)) ) {
                alt18=1;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:124:13: expression ( comma expression )*
                    {
                    dbg.location(124,13);
                    pushFollow(FOLLOW_expression_in_actualParameters944);
                    expression72=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression72.getTree());
                    dbg.location(124,24);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:124:24: ( comma expression )*
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:124:25: comma expression
                    	    {
                    	    dbg.location(124,25);
                    	    pushFollow(FOLLOW_comma_in_actualParameters947);
                    	    comma73=comma();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_comma.add(comma73.getTree());
                    	    dbg.location(124,31);
                    	    pushFollow(FOLLOW_expression_in_actualParameters949);
                    	    expression74=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression74.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(17);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}

            dbg.location(124,46);
            RNDCLOSE75=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_actualParameters955); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDCLOSE.add(RNDCLOSE75);



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
            // 125:4: -> ^( PARAMETERS ( expression )+ )
            {
                dbg.location(125,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:125:7: ^( PARAMETERS ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(125,9);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                dbg.location(125,20);
                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    dbg.location(125,20);
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
            if ( state.backtracking>0 ) { memoize(input, 18, actualParameters_StartIndex); }
        }
        dbg.location(125, 32);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:127:1: procedureCall : identselector ( actualParameters )? ;
    public final oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        oberon0Parser.procedureCall_return retval = new oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);
        int procedureCall_StartIndex = input.index();
        Object root_0 = null;

        oberon0Parser.identselector_return identselector76 = null;

        oberon0Parser.actualParameters_return actualParameters77 = null;



        try { dbg.enterRule(getGrammarFileName(), "procedureCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:128:2: ( identselector ( actualParameters )? )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:128:4: identselector ( actualParameters )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(128,17);
            pushFollow(FOLLOW_identselector_in_procedureCall976);
            identselector76=identselector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(identselector76.getTree(), root_0);
            dbg.location(128,19);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:128:19: ( actualParameters )?
            int alt19=2;
            try { dbg.enterSubRule(19);
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==RNDOPEN) ) {
                alt19=1;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:128:20: actualParameters
                    {
                    dbg.location(128,20);
                    pushFollow(FOLLOW_actualParameters_in_procedureCall980);
                    actualParameters77=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, actualParameters77.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(19);}


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
            if ( state.backtracking>0 ) { memoize(input, 19, procedureCall_StartIndex); }
        }
        dbg.location(128, 39);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:1: ifStatement : ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ) );
    public final oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        oberon0Parser.ifStatement_return retval = new oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Object root_0 = null;

        Token IF78=null;
        Token THEN80=null;
        Token ELSIF82=null;
        Token THEN84=null;
        Token ELSE86=null;
        Token END88=null;
        Token IF89=null;
        Token THEN91=null;
        Token ELSIF93=null;
        Token THEN95=null;
        Token END97=null;
        Token IF98=null;
        Token THEN100=null;
        Token ELSE102=null;
        Token END104=null;
        Token IF105=null;
        Token THEN107=null;
        Token END109=null;
        oberon0Parser.expression_return expression79 = null;

        oberon0Parser.statementSequence_return statementSequence81 = null;

        oberon0Parser.expression_return expression83 = null;

        oberon0Parser.statementSequence_return statementSequence85 = null;

        oberon0Parser.statementSequence_return statementSequence87 = null;

        oberon0Parser.expression_return expression90 = null;

        oberon0Parser.statementSequence_return statementSequence92 = null;

        oberon0Parser.expression_return expression94 = null;

        oberon0Parser.statementSequence_return statementSequence96 = null;

        oberon0Parser.expression_return expression99 = null;

        oberon0Parser.statementSequence_return statementSequence101 = null;

        oberon0Parser.statementSequence_return statementSequence103 = null;

        oberon0Parser.expression_return expression106 = null;

        oberon0Parser.statementSequence_return statementSequence108 = null;


        Object IF78_tree=null;
        Object THEN80_tree=null;
        Object ELSIF82_tree=null;
        Object THEN84_tree=null;
        Object ELSE86_tree=null;
        Object END88_tree=null;
        Object IF89_tree=null;
        Object THEN91_tree=null;
        Object ELSIF93_tree=null;
        Object THEN95_tree=null;
        Object END97_tree=null;
        Object IF98_tree=null;
        Object THEN100_tree=null;
        Object ELSE102_tree=null;
        Object END104_tree=null;
        Object IF105_tree=null;
        Object THEN107_tree=null;
        Object END109_tree=null;
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
        dbg.location(131, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:12: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ) )
            int alt22=4;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==IF) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred35_oberon0()) ) {
                    alt22=1;
                }
                else if ( (synpred37_oberon0()) ) {
                    alt22=2;
                }
                else if ( (synpred38_oberon0()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
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

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
                    {
                    dbg.location(131,15);
                    IF78=(Token)match(input,IF,FOLLOW_IF_in_ifStatement992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF78);

                    dbg.location(131,18);
                    pushFollow(FOLLOW_expression_in_ifStatement994);
                    expression79=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression79.getTree());
                    dbg.location(131,29);
                    THEN80=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement996); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN80);

                    dbg.location(131,34);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement998);
                    statementSequence81=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence81.getTree());
                    dbg.location(131,52);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:52: ( ELSIF expression THEN statementSequence )+
                    int cnt20=0;
                    try { dbg.enterSubRule(20);

                    loop20:
                    do {
                        int alt20=2;
                        try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==ELSIF) ) {
                            alt20=1;
                        }


                        } finally {dbg.exitDecision(20);}

                        switch (alt20) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:53: ELSIF expression THEN statementSequence
                    	    {
                    	    dbg.location(131,53);
                    	    ELSIF82=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement1001); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF82);

                    	    dbg.location(131,59);
                    	    pushFollow(FOLLOW_expression_in_ifStatement1003);
                    	    expression83=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression83.getTree());
                    	    dbg.location(131,70);
                    	    THEN84=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1005); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN84);

                    	    dbg.location(131,75);
                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement1007);
                    	    statementSequence85=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence85.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt20++;
                    } while (true);
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(131,95);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:95: ( ELSE statementSequence )
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:96: ELSE statementSequence
                    {
                    dbg.location(131,96);
                    ELSE86=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement1012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE86);

                    dbg.location(131,101);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement1014);
                    statementSequence87=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence87.getTree());

                    }

                    dbg.location(131,120);
                    END88=(Token)match(input,END,FOLLOW_END_in_ifStatement1017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END88);



                    // AST REWRITE
                    // elements: statementSequence, ELSE, statementSequence, statementSequence, expression, IF, expression, ELSIF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:5: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        dbg.location(132,8);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:132:8: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(132,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(132,13);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:132:13: ^( CONDITION expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(132,15);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(132,25);
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(132,37);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:132:37: ^( BODY statementSequence )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(132,39);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        dbg.location(132,44);
                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(132,63);
                        if ( !(stream_statementSequence.hasNext()||stream_expression.hasNext()||stream_ELSIF.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_statementSequence.hasNext()||stream_expression.hasNext()||stream_ELSIF.hasNext() ) {
                            dbg.location(132,63);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:132:63: ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(132,65);
                            root_2 = (Object)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            dbg.location(132,71);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:132:71: ^( CONDITION expression )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            dbg.location(132,73);
                            root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_3);

                            dbg.location(132,83);
                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            dbg.location(132,95);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:132:95: ^( BODY statementSequence )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            dbg.location(132,97);
                            root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_3);

                            dbg.location(132,102);
                            adaptor.addChild(root_3, stream_statementSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_statementSequence.reset();
                        stream_expression.reset();
                        stream_ELSIF.reset();
                        dbg.location(132,123);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:132:123: ^( ELSE ^( BODY statementSequence ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(132,125);
                        root_2 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        dbg.location(132,130);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:132:130: ^( BODY statementSequence )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        dbg.location(132,132);
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_3);

                        dbg.location(132,137);
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

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
                    {
                    dbg.location(133,4);
                    IF89=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF89);

                    dbg.location(133,7);
                    pushFollow(FOLLOW_expression_in_ifStatement1075);
                    expression90=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression90.getTree());
                    dbg.location(133,18);
                    THEN91=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN91);

                    dbg.location(133,23);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement1079);
                    statementSequence92=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence92.getTree());
                    dbg.location(133,41);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:41: ( ELSIF expression THEN statementSequence )+
                    int cnt21=0;
                    try { dbg.enterSubRule(21);

                    loop21:
                    do {
                        int alt21=2;
                        try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==ELSIF) ) {
                            alt21=1;
                        }


                        } finally {dbg.exitDecision(21);}

                        switch (alt21) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:42: ELSIF expression THEN statementSequence
                    	    {
                    	    dbg.location(133,42);
                    	    ELSIF93=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement1082); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF93);

                    	    dbg.location(133,48);
                    	    pushFollow(FOLLOW_expression_in_ifStatement1084);
                    	    expression94=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression94.getTree());
                    	    dbg.location(133,59);
                    	    THEN95=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1086); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN95);

                    	    dbg.location(133,64);
                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement1088);
                    	    statementSequence96=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence96.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt21++;
                    } while (true);
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(133,84);
                    END97=(Token)match(input,END,FOLLOW_END_in_ifStatement1092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END97);



                    // AST REWRITE
                    // elements: expression, statementSequence, ELSIF, expression, statementSequence, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:5: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ )
                    {
                        dbg.location(134,8);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:134:8: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(134,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(134,13);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:134:13: ^( CONDITION expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(134,15);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(134,25);
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(134,37);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:134:37: ^( BODY statementSequence )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(134,39);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        dbg.location(134,44);
                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(134,63);
                        if ( !(stream_ELSIF.hasNext()||stream_expression.hasNext()||stream_statementSequence.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ELSIF.hasNext()||stream_expression.hasNext()||stream_statementSequence.hasNext() ) {
                            dbg.location(134,63);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:134:63: ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(134,65);
                            root_2 = (Object)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            dbg.location(134,71);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:134:71: ^( CONDITION expression )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            dbg.location(134,73);
                            root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_3);

                            dbg.location(134,83);
                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            dbg.location(134,95);
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:134:95: ^( BODY statementSequence )
                            {
                            Object root_3 = (Object)adaptor.nil();
                            dbg.location(134,97);
                            root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_3);

                            dbg.location(134,102);
                            adaptor.addChild(root_3, stream_statementSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_ELSIF.reset();
                        stream_expression.reset();
                        stream_statementSequence.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:135:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
                    {
                    dbg.location(135,4);
                    IF98=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF98);

                    dbg.location(135,7);
                    pushFollow(FOLLOW_expression_in_ifStatement1140);
                    expression99=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression99.getTree());
                    dbg.location(135,18);
                    THEN100=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN100);

                    dbg.location(135,23);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement1144);
                    statementSequence101=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence101.getTree());
                    dbg.location(135,41);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:135:41: ( ELSE statementSequence )
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:135:42: ELSE statementSequence
                    {
                    dbg.location(135,42);
                    ELSE102=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement1147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE102);

                    dbg.location(135,47);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement1149);
                    statementSequence103=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence103.getTree());

                    }

                    dbg.location(135,66);
                    END104=(Token)match(input,END,FOLLOW_END_in_ifStatement1152); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END104);



                    // AST REWRITE
                    // elements: IF, ELSE, expression, statementSequence, statementSequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:5: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        dbg.location(136,8);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:136:8: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(136,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(136,13);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:136:13: ^( CONDITION expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(136,15);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(136,25);
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(136,36);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:136:36: ^( BODY statementSequence )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(136,38);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        dbg.location(136,43);
                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(136,63);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:136:63: ^( ELSE ^( BODY statementSequence ) )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(136,65);
                        root_2 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        dbg.location(136,70);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:136:70: ^( BODY statementSequence )
                        {
                        Object root_3 = (Object)adaptor.nil();
                        dbg.location(136,72);
                        root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_3);

                        dbg.location(136,77);
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

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:137:4: IF expression THEN statementSequence END
                    {
                    dbg.location(137,4);
                    IF105=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1191); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF105);

                    dbg.location(137,7);
                    pushFollow(FOLLOW_expression_in_ifStatement1193);
                    expression106=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression106.getTree());
                    dbg.location(137,18);
                    THEN107=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1195); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN107);

                    dbg.location(137,23);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement1197);
                    statementSequence108=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence108.getTree());
                    dbg.location(137,41);
                    END109=(Token)match(input,END,FOLLOW_END_in_ifStatement1199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END109);



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
                    // 138:5: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) )
                    {
                        dbg.location(138,8);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:138:8: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(138,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        dbg.location(138,13);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:138:13: ^( CONDITION expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(138,15);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(138,25);
                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(138,37);
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:138:37: ^( BODY statementSequence )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(138,39);
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                        dbg.location(138,44);
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
            if ( state.backtracking>0 ) { memoize(input, 20, ifStatement_StartIndex); }
        }
        dbg.location(138, 63);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:139:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) ) ;
    public final oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        oberon0Parser.whileStatement_return retval = new oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);
        int whileStatement_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE110=null;
        Token DO112=null;
        Token END114=null;
        oberon0Parser.expression_return expression111 = null;

        oberon0Parser.statementSequence_return statementSequence113 = null;


        Object WHILE110_tree=null;
        Object DO112_tree=null;
        Object END114_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try { dbg.enterRule(getGrammarFileName(), "whileStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:139:15: ( WHILE expression DO statementSequence END -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:139:18: WHILE expression DO statementSequence END
            {
            dbg.location(139,18);
            WHILE110=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1228); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE110);

            dbg.location(139,24);
            pushFollow(FOLLOW_expression_in_whileStatement1230);
            expression111=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression111.getTree());
            dbg.location(139,35);
            DO112=(Token)match(input,DO,FOLLOW_DO_in_whileStatement1232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO112);

            dbg.location(139,38);
            pushFollow(FOLLOW_statementSequence_in_whileStatement1234);
            statementSequence113=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence113.getTree());
            dbg.location(139,56);
            END114=(Token)match(input,END,FOLLOW_END_in_whileStatement1236); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END114);



            // AST REWRITE
            // elements: expression, statementSequence, WHILE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 140:5: -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) )
            {
                dbg.location(140,8);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:140:8: ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(140,10);
                root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                dbg.location(140,16);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:140:16: ^( CONDITION expression )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(140,18);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                dbg.location(140,28);
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(140,40);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:140:40: ^( BODY statementSequence )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(140,42);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                dbg.location(140,47);
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
            if ( state.backtracking>0 ) { memoize(input, 21, whileStatement_StartIndex); }
        }
        dbg.location(140, 66);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:142:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final oberon0Parser.statement_return statement() throws RecognitionException {
        oberon0Parser.statement_return retval = new oberon0Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        oberon0Parser.assignment_return assignment115 = null;

        oberon0Parser.procedureCall_return procedureCall116 = null;

        oberon0Parser.ifStatement_return ifStatement117 = null;

        oberon0Parser.whileStatement_return whileStatement118 = null;



        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:2: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(143,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt23=5;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            try {
                isCyclicDecision = true;
                alt23 = dfa23.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:5: assignment
                    {
                    dbg.location(143,5);
                    pushFollow(FOLLOW_assignment_in_statement1268);
                    assignment115=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment115.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:18: procedureCall
                    {
                    dbg.location(143,18);
                    pushFollow(FOLLOW_procedureCall_in_statement1272);
                    procedureCall116=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall116.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:34: ifStatement
                    {
                    dbg.location(143,34);
                    pushFollow(FOLLOW_ifStatement_in_statement1276);
                    ifStatement117=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement117.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:48: whileStatement
                    {
                    dbg.location(143,48);
                    pushFollow(FOLLOW_whileStatement_in_statement1280);
                    whileStatement118=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement118.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}


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
            if ( state.backtracking>0 ) { memoize(input, 22, statement_StartIndex); }
        }
        dbg.location(143, 64);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:145:1: statementSequence : statement ( semicolon statement )* ;
    public final oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        oberon0Parser.statementSequence_return retval = new oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);
        int statementSequence_StartIndex = input.index();
        Object root_0 = null;

        oberon0Parser.statement_return statement119 = null;

        oberon0Parser.semicolon_return semicolon120 = null;

        oberon0Parser.statement_return statement121 = null;



        try { dbg.enterRule(getGrammarFileName(), "statementSequence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:146:2: ( statement ( semicolon statement )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:146:4: statement ( semicolon statement )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(146,4);
            pushFollow(FOLLOW_statement_in_statementSequence1292);
            statement119=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement119.getTree());
            dbg.location(146,14);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:146:14: ( semicolon statement )*
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

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:146:15: semicolon statement
            	    {
            	    dbg.location(146,15);
            	    pushFollow(FOLLOW_semicolon_in_statementSequence1295);
            	    semicolon120=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, semicolon120.getTree());
            	    dbg.location(146,25);
            	    pushFollow(FOLLOW_statement_in_statementSequence1297);
            	    statement121=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement121.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);
            } finally {dbg.exitSubRule(24);}


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
            if ( state.backtracking>0 ) { memoize(input, 23, statementSequence_StartIndex); }
        }
        dbg.location(146, 36);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:148:1: identList : IDENT ( comma IDENT )* ;
    public final oberon0Parser.identList_return identList() throws RecognitionException {
        oberon0Parser.identList_return retval = new oberon0Parser.identList_return();
        retval.start = input.LT(1);
        int identList_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT122=null;
        Token IDENT124=null;
        oberon0Parser.comma_return comma123 = null;


        Object IDENT122_tree=null;
        Object IDENT124_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "identList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:149:2: ( IDENT ( comma IDENT )* )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:149:4: IDENT ( comma IDENT )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(149,4);
            IDENT122=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList1308); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT122_tree = (Object)adaptor.create(IDENT122);
            adaptor.addChild(root_0, IDENT122_tree);
            }
            dbg.location(149,10);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:149:10: ( comma IDENT )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25, decisionCanBacktrack[25]);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==COMMA) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:149:11: comma IDENT
            	    {
            	    dbg.location(149,11);
            	    pushFollow(FOLLOW_comma_in_identList1311);
            	    comma123=comma();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, comma123.getTree());
            	    dbg.location(149,17);
            	    IDENT124=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList1313); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    IDENT124_tree = (Object)adaptor.create(IDENT124);
            	    adaptor.addChild(root_0, IDENT124_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


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
            if ( state.backtracking>0 ) { memoize(input, 24, identList_StartIndex); }
        }
        dbg.location(149, 24);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:151:1: arrayType : ARRAY expression OF type -> ^( ARRAY expression type ) ;
    public final oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        oberon0Parser.arrayType_return retval = new oberon0Parser.arrayType_return();
        retval.start = input.LT(1);
        int arrayType_StartIndex = input.index();
        Object root_0 = null;

        Token ARRAY125=null;
        Token OF127=null;
        oberon0Parser.expression_return expression126 = null;

        oberon0Parser.type_return type128 = null;


        Object ARRAY125_tree=null;
        Object OF127_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "arrayType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:152:2: ( ARRAY expression OF type -> ^( ARRAY expression type ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:152:4: ARRAY expression OF type
            {
            dbg.location(152,4);
            ARRAY125=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1325); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY125);

            dbg.location(152,10);
            pushFollow(FOLLOW_expression_in_arrayType1327);
            expression126=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression126.getTree());
            dbg.location(152,21);
            OF127=(Token)match(input,OF,FOLLOW_OF_in_arrayType1329); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF127);

            dbg.location(152,24);
            pushFollow(FOLLOW_type_in_arrayType1331);
            type128=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type128.getTree());


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
            // 153:4: -> ^( ARRAY expression type )
            {
                dbg.location(153,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:153:7: ^( ARRAY expression type )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(153,9);
                root_1 = (Object)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);

                dbg.location(153,15);
                adaptor.addChild(root_1, stream_expression.nextTree());
                dbg.location(153,26);
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
            if ( state.backtracking>0 ) { memoize(input, 25, arrayType_StartIndex); }
        }
        dbg.location(153, 31);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:155:1: fieldList : ( identList colon type )? ;
    public final oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        oberon0Parser.fieldList_return retval = new oberon0Parser.fieldList_return();
        retval.start = input.LT(1);
        int fieldList_StartIndex = input.index();
        Object root_0 = null;

        oberon0Parser.identList_return identList129 = null;

        oberon0Parser.colon_return colon130 = null;

        oberon0Parser.type_return type131 = null;



        try { dbg.enterRule(getGrammarFileName(), "fieldList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:156:2: ( ( identList colon type )? )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:156:4: ( identList colon type )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(156,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:156:4: ( identList colon type )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==IDENT) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:156:5: identList colon type
                    {
                    dbg.location(156,5);
                    pushFollow(FOLLOW_identList_in_fieldList1357);
                    identList129=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identList129.getTree());
                    dbg.location(156,15);
                    pushFollow(FOLLOW_colon_in_fieldList1359);
                    colon130=colon();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon130.getTree());
                    dbg.location(156,21);
                    pushFollow(FOLLOW_type_in_fieldList1361);
                    type131=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type131.getTree());

                    }
                    break;

            }
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
            if ( state.backtracking>0 ) { memoize(input, 26, fieldList_StartIndex); }
        }
        dbg.location(156, 27);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:158:1: recordType : RECORD fieldList ( semicolon fieldList )* END ;
    public final oberon0Parser.recordType_return recordType() throws RecognitionException {
        oberon0Parser.recordType_return retval = new oberon0Parser.recordType_return();
        retval.start = input.LT(1);
        int recordType_StartIndex = input.index();
        Object root_0 = null;

        Token RECORD132=null;
        Token END136=null;
        oberon0Parser.fieldList_return fieldList133 = null;

        oberon0Parser.semicolon_return semicolon134 = null;

        oberon0Parser.fieldList_return fieldList135 = null;


        Object RECORD132_tree=null;
        Object END136_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "recordType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:159:2: ( RECORD fieldList ( semicolon fieldList )* END )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:159:4: RECORD fieldList ( semicolon fieldList )* END
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(159,4);
            RECORD132=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1373); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RECORD132_tree = (Object)adaptor.create(RECORD132);
            adaptor.addChild(root_0, RECORD132_tree);
            }
            dbg.location(159,11);
            pushFollow(FOLLOW_fieldList_in_recordType1375);
            fieldList133=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldList133.getTree());
            dbg.location(159,21);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:159:21: ( semicolon fieldList )*
            try { dbg.enterSubRule(27);

            loop27:
            do {
                int alt27=2;
                try { dbg.enterDecision(27, decisionCanBacktrack[27]);

                int LA27_0 = input.LA(1);

                if ( (LA27_0==SEMICOLON) ) {
                    alt27=1;
                }


                } finally {dbg.exitDecision(27);}

                switch (alt27) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:159:22: semicolon fieldList
            	    {
            	    dbg.location(159,22);
            	    pushFollow(FOLLOW_semicolon_in_recordType1378);
            	    semicolon134=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, semicolon134.getTree());
            	    dbg.location(159,32);
            	    pushFollow(FOLLOW_fieldList_in_recordType1380);
            	    fieldList135=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldList135.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);
            } finally {dbg.exitSubRule(27);}

            dbg.location(159,44);
            END136=(Token)match(input,END,FOLLOW_END_in_recordType1384); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END136_tree = (Object)adaptor.create(END136);
            adaptor.addChild(root_0, END136_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 27, recordType_StartIndex); }
        }
        dbg.location(159, 47);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:161:1: type : ( IDENT | arrayType | recordType ) ;
    public final oberon0Parser.type_return type() throws RecognitionException {
        oberon0Parser.type_return retval = new oberon0Parser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT137=null;
        oberon0Parser.arrayType_return arrayType138 = null;

        oberon0Parser.recordType_return recordType139 = null;


        Object IDENT137_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:161:6: ( ( IDENT | arrayType | recordType ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:161:8: ( IDENT | arrayType | recordType )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(161,8);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:161:8: ( IDENT | arrayType | recordType )
            int alt28=3;
            try { dbg.enterSubRule(28);
            try { dbg.enterDecision(28, decisionCanBacktrack[28]);

            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt28=1;
                }
                break;
            case ARRAY:
                {
                alt28=2;
                }
                break;
            case RECORD:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:161:9: IDENT
                    {
                    dbg.location(161,9);
                    IDENT137=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT137_tree = (Object)adaptor.create(IDENT137);
                    adaptor.addChild(root_0, IDENT137_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:161:17: arrayType
                    {
                    dbg.location(161,17);
                    pushFollow(FOLLOW_arrayType_in_type1397);
                    arrayType138=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType138.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:161:29: recordType
                    {
                    dbg.location(161,29);
                    pushFollow(FOLLOW_recordType_in_type1401);
                    recordType139=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType139.getTree());

                    }
                    break;

            }
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
            if ( state.backtracking>0 ) { memoize(input, 28, type_StartIndex); }
        }
        dbg.location(161, 40);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:163:1: fpSection : ( VAR )? identList colon type ;
    public final oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        oberon0Parser.fpSection_return retval = new oberon0Parser.fpSection_return();
        retval.start = input.LT(1);
        int fpSection_StartIndex = input.index();
        Object root_0 = null;

        Token VAR140=null;
        oberon0Parser.identList_return identList141 = null;

        oberon0Parser.colon_return colon142 = null;

        oberon0Parser.type_return type143 = null;


        Object VAR140_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fpSection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:164:2: ( ( VAR )? identList colon type )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:164:4: ( VAR )? identList colon type
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(164,4);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:164:4: ( VAR )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==VAR) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:0:0: VAR
                    {
                    dbg.location(164,4);
                    VAR140=(Token)match(input,VAR,FOLLOW_VAR_in_fpSection1412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR140_tree = (Object)adaptor.create(VAR140);
                    adaptor.addChild(root_0, VAR140_tree);
                    }

                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}

            dbg.location(164,9);
            pushFollow(FOLLOW_identList_in_fpSection1415);
            identList141=identList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identList141.getTree());
            dbg.location(164,19);
            pushFollow(FOLLOW_colon_in_fpSection1417);
            colon142=colon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, colon142.getTree());
            dbg.location(164,25);
            pushFollow(FOLLOW_type_in_fpSection1419);
            type143=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type143.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 29, fpSection_StartIndex); }
        }
        dbg.location(164, 29);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:166:1: formalParameters : RNDOPEN ( fpSection ( semicolon fpSection )* )? RNDCLOSE -> ^( PARAMETERS ( fpSection ( fpSection )* )? ) ;
    public final oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        oberon0Parser.formalParameters_return retval = new oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);
        int formalParameters_StartIndex = input.index();
        Object root_0 = null;

        Token RNDOPEN144=null;
        Token RNDCLOSE148=null;
        oberon0Parser.fpSection_return fpSection145 = null;

        oberon0Parser.semicolon_return semicolon146 = null;

        oberon0Parser.fpSection_return fpSection147 = null;


        Object RNDOPEN144_tree=null;
        Object RNDCLOSE148_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
        try { dbg.enterRule(getGrammarFileName(), "formalParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:167:2: ( RNDOPEN ( fpSection ( semicolon fpSection )* )? RNDCLOSE -> ^( PARAMETERS ( fpSection ( fpSection )* )? ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:167:4: RNDOPEN ( fpSection ( semicolon fpSection )* )? RNDCLOSE
            {
            dbg.location(167,4);
            RNDOPEN144=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_formalParameters1429); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN144);

            dbg.location(167,12);
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:167:12: ( fpSection ( semicolon fpSection )* )?
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==VAR||LA31_0==IDENT) ) {
                alt31=1;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:167:13: fpSection ( semicolon fpSection )*
                    {
                    dbg.location(167,13);
                    pushFollow(FOLLOW_fpSection_in_formalParameters1432);
                    fpSection145=fpSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fpSection.add(fpSection145.getTree());
                    dbg.location(167,23);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:167:23: ( semicolon fpSection )*
                    try { dbg.enterSubRule(30);

                    loop30:
                    do {
                        int alt30=2;
                        try { dbg.enterDecision(30, decisionCanBacktrack[30]);

                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==SEMICOLON) ) {
                            alt30=1;
                        }


                        } finally {dbg.exitDecision(30);}

                        switch (alt30) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:167:24: semicolon fpSection
                    	    {
                    	    dbg.location(167,24);
                    	    pushFollow(FOLLOW_semicolon_in_formalParameters1435);
                    	    semicolon146=semicolon();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon146.getTree());
                    	    dbg.location(167,34);
                    	    pushFollow(FOLLOW_fpSection_in_formalParameters1437);
                    	    fpSection147=fpSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fpSection.add(fpSection147.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(30);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(31);}

            dbg.location(167,48);
            RNDCLOSE148=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_formalParameters1443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDCLOSE.add(RNDCLOSE148);



            // AST REWRITE
            // elements: fpSection, fpSection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 168:4: -> ^( PARAMETERS ( fpSection ( fpSection )* )? )
            {
                dbg.location(168,7);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:168:7: ^( PARAMETERS ( fpSection ( fpSection )* )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(168,9);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                dbg.location(168,20);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:168:20: ( fpSection ( fpSection )* )?
                if ( stream_fpSection.hasNext()||stream_fpSection.hasNext() ) {
                    dbg.location(168,21);
                    adaptor.addChild(root_1, stream_fpSection.nextTree());
                    dbg.location(168,31);
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:168:31: ( fpSection )*
                    while ( stream_fpSection.hasNext() ) {
                        dbg.location(168,32);
                        adaptor.addChild(root_1, stream_fpSection.nextTree());

                    }
                    stream_fpSection.reset();

                }
                stream_fpSection.reset();
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
            if ( state.backtracking>0 ) { memoize(input, 30, formalParameters_StartIndex); }
        }
        dbg.location(168, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formalParameters");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class nameident_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameident"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:170:1: nameident : IDENT -> ^( NAME IDENT ) ;
    public final oberon0Parser.nameident_return nameident() throws RecognitionException {
        oberon0Parser.nameident_return retval = new oberon0Parser.nameident_return();
        retval.start = input.LT(1);
        int nameident_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT149=null;

        Object IDENT149_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");

        try { dbg.enterRule(getGrammarFileName(), "nameident");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:171:2: ( IDENT -> ^( NAME IDENT ) )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:171:4: IDENT
            {
            dbg.location(171,4);
            IDENT149=(Token)match(input,IDENT,FOLLOW_IDENT_in_nameident1472); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT149);



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
            // 171:10: -> ^( NAME IDENT )
            {
                dbg.location(171,13);
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:171:13: ^( NAME IDENT )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(171,15);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAME, "NAME"), root_1);

                dbg.location(171,20);
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
        dbg.location(171, 26);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:173:1: number : INTEGER ;
    public final oberon0Parser.number_return number() throws RecognitionException {
        oberon0Parser.number_return retval = new oberon0Parser.number_return();
        retval.start = input.LT(1);
        int number_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER150=null;

        Object INTEGER150_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:173:8: ( INTEGER )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:173:10: INTEGER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(173,10);
            INTEGER150=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1488); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER150_tree = (Object)adaptor.create(INTEGER150);
            adaptor.addChild(root_0, INTEGER150_tree);
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
        dbg.location(173, 17);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:175:1: semicolon : SEMICOLON ;
    public final oberon0Parser.semicolon_return semicolon() throws RecognitionException {
        oberon0Parser.semicolon_return retval = new oberon0Parser.semicolon_return();
        retval.start = input.LT(1);
        int semicolon_StartIndex = input.index();
        Object root_0 = null;

        Token SEMICOLON151=null;

        Object SEMICOLON151_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "semicolon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:176:2: ( SEMICOLON )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:176:4: SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(176,13);
            SEMICOLON151=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_semicolon1498); if (state.failed) return retval;

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
        dbg.location(176, 14);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:178:1: comma : COMMA ;
    public final oberon0Parser.comma_return comma() throws RecognitionException {
        oberon0Parser.comma_return retval = new oberon0Parser.comma_return();
        retval.start = input.LT(1);
        int comma_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA152=null;

        Object COMMA152_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comma");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:178:7: ( COMMA )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:178:9: COMMA
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(178,14);
            COMMA152=(Token)match(input,COMMA,FOLLOW_COMMA_in_comma1508); if (state.failed) return retval;

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
        dbg.location(178, 15);

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:180:1: colon : COLON ;
    public final oberon0Parser.colon_return colon() throws RecognitionException {
        oberon0Parser.colon_return retval = new oberon0Parser.colon_return();
        retval.start = input.LT(1);
        int colon_StartIndex = input.index();
        Object root_0 = null;

        Token COLON153=null;

        Object COLON153_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "colon");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:180:7: ( COLON )
            dbg.enterAlt(1);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:180:9: COLON
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(180,14);
            COLON153=(Token)match(input,COLON,FOLLOW_COLON_in_colon1517); if (state.failed) return retval;

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
        dbg.location(180, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "colon");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "colon"

    // $ANTLR start synpred35_oberon0
    public final void synpred35_oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:15: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
        {
        dbg.location(131,15);
        match(input,IF,FOLLOW_IF_in_synpred35_oberon0992); if (state.failed) return ;
        dbg.location(131,18);
        pushFollow(FOLLOW_expression_in_synpred35_oberon0994);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(131,29);
        match(input,THEN,FOLLOW_THEN_in_synpred35_oberon0996); if (state.failed) return ;
        dbg.location(131,34);
        pushFollow(FOLLOW_statementSequence_in_synpred35_oberon0998);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(131,52);
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:52: ( ELSIF expression THEN statementSequence )+
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

        	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:53: ELSIF expression THEN statementSequence
        	    {
        	    dbg.location(131,53);
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred35_oberon01001); if (state.failed) return ;
        	    dbg.location(131,59);
        	    pushFollow(FOLLOW_expression_in_synpred35_oberon01003);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    dbg.location(131,70);
        	    match(input,THEN,FOLLOW_THEN_in_synpred35_oberon01005); if (state.failed) return ;
        	    dbg.location(131,75);
        	    pushFollow(FOLLOW_statementSequence_in_synpred35_oberon01007);
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

        dbg.location(131,95);
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:95: ( ELSE statementSequence )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:131:96: ELSE statementSequence
        {
        dbg.location(131,96);
        match(input,ELSE,FOLLOW_ELSE_in_synpred35_oberon01012); if (state.failed) return ;
        dbg.location(131,101);
        pushFollow(FOLLOW_statementSequence_in_synpred35_oberon01014);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        dbg.location(131,120);
        match(input,END,FOLLOW_END_in_synpred35_oberon01017); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_oberon0

    // $ANTLR start synpred37_oberon0
    public final void synpred37_oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:4: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
        {
        dbg.location(133,4);
        match(input,IF,FOLLOW_IF_in_synpred37_oberon01073); if (state.failed) return ;
        dbg.location(133,7);
        pushFollow(FOLLOW_expression_in_synpred37_oberon01075);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(133,18);
        match(input,THEN,FOLLOW_THEN_in_synpred37_oberon01077); if (state.failed) return ;
        dbg.location(133,23);
        pushFollow(FOLLOW_statementSequence_in_synpred37_oberon01079);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(133,41);
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:41: ( ELSIF expression THEN statementSequence )+
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

        	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:133:42: ELSIF expression THEN statementSequence
        	    {
        	    dbg.location(133,42);
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred37_oberon01082); if (state.failed) return ;
        	    dbg.location(133,48);
        	    pushFollow(FOLLOW_expression_in_synpred37_oberon01084);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    dbg.location(133,59);
        	    match(input,THEN,FOLLOW_THEN_in_synpred37_oberon01086); if (state.failed) return ;
        	    dbg.location(133,64);
        	    pushFollow(FOLLOW_statementSequence_in_synpred37_oberon01088);
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

        dbg.location(133,84);
        match(input,END,FOLLOW_END_in_synpred37_oberon01092); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_oberon0

    // $ANTLR start synpred38_oberon0
    public final void synpred38_oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:135:4: ( IF expression THEN statementSequence ( ELSE statementSequence ) END )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:135:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
        {
        dbg.location(135,4);
        match(input,IF,FOLLOW_IF_in_synpred38_oberon01138); if (state.failed) return ;
        dbg.location(135,7);
        pushFollow(FOLLOW_expression_in_synpred38_oberon01140);
        expression();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(135,18);
        match(input,THEN,FOLLOW_THEN_in_synpred38_oberon01142); if (state.failed) return ;
        dbg.location(135,23);
        pushFollow(FOLLOW_statementSequence_in_synpred38_oberon01144);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(135,41);
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:135:41: ( ELSE statementSequence )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:135:42: ELSE statementSequence
        {
        dbg.location(135,42);
        match(input,ELSE,FOLLOW_ELSE_in_synpred38_oberon01147); if (state.failed) return ;
        dbg.location(135,47);
        pushFollow(FOLLOW_statementSequence_in_synpred38_oberon01149);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        dbg.location(135,66);
        match(input,END,FOLLOW_END_in_synpred38_oberon01152); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_oberon0

    // $ANTLR start synpred39_oberon0
    public final void synpred39_oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:5: ( assignment )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:5: assignment
        {
        dbg.location(143,5);
        pushFollow(FOLLOW_assignment_in_synpred39_oberon01268);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_oberon0

    // $ANTLR start synpred40_oberon0
    public final void synpred40_oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:18: ( procedureCall )
        dbg.enterAlt(1);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:143:18: procedureCall
        {
        dbg.location(143,18);
        pushFollow(FOLLOW_procedureCall_in_synpred40_oberon01272);
        procedureCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_oberon0

    // Delegated rules

    public final boolean synpred38_oberon0() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred38_oberon0_fragment(); // can never throw exception
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
    public final boolean synpred39_oberon0() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred39_oberon0_fragment(); // can never throw exception
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
    public final boolean synpred35_oberon0() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred35_oberon0_fragment(); // can never throw exception
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
    public final boolean synpred40_oberon0() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred40_oberon0_fragment(); // can never throw exception
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
    public final boolean synpred37_oberon0() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred37_oberon0_fragment(); // can never throw exception
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


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\13\uffff";
    static final String DFA23_eofS =
        "\1\4\12\uffff";
    static final String DFA23_minS =
        "\1\35\1\0\11\uffff";
    static final String DFA23_maxS =
        "\1\60\1\0\11\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA23_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA23_transitionS = {
            "\4\4\1\2\1\3\15\uffff\1\1",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "143:4: ( assignment | procedureCall | ifStatement | whileStatement )?";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_oberon0()) ) {s = 9;}

                        else if ( (synpred40_oberon0()) ) {s = 10;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_MODULE_in_module404 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_nameident_in_module406 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_module408 = new BitSet(new long[]{0x000003E040000000L});
    public static final BitSet FOLLOW_moduleBody_in_module410 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module412 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_module414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody438 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody441 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody443 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_moduleBody447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations472 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations475 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations478 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations486 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_declarations488 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration529 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_nameident_in_constDeclaration532 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration534 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_constDeclaration536 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_constDeclaration538 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_NWTYPE_in_typeDeclaration571 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration574 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration576 = new BitSet(new long[]{0x0001001800000000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration578 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_typeDeclaration580 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations613 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations616 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_colon_in_varDeclarations618 = new BitSet(new long[]{0x0001001800000000L});
    public static final BitSet FOLLOW_type_in_varDeclarations620 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_varDeclarations622 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration648 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration650 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration653 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_procedureDeclaration657 = new BitSet(new long[]{0x000103E000000000L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration659 = new BitSet(new long[]{0x0001020000000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration662 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody703 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody705 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_procedureBody707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector727 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector729 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_sqrExpression_in_selector739 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_IDENT_in_identselector760 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_selector_in_identselector762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_factor772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rndExpression_in_factor780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor784 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_factor_in_factor786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term796 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_term799 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_factor_in_term816 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_simpleExpression828 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression837 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_set_in_simpleExpression840 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression849 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_simpleExpression_in_expression861 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_set_in_expression866 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQROPEN_in_sqrExpression895 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_sqrExpression897 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SQRCLOSE_in_sqrExpression899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_rndExpression911 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_rndExpression913 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_rndExpression915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_assignment927 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment929 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_assignment932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_actualParameters941 = new BitSet(new long[]{0x0003000008300300L});
    public static final BitSet FOLLOW_expression_in_actualParameters944 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_comma_in_actualParameters947 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_actualParameters949 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_actualParameters955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_procedureCall976 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement992 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement994 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement996 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement998 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement1001 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1003 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1005 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1007 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1012 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1014 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1073 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1075 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1077 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1079 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement1082 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1084 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1086 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1088 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1138 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1140 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1142 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1144 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1147 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1149 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1191 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1193 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1195 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1197 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1228 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_whileStatement1230 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1232 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1234 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_whileStatement1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1292 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_semicolon_in_statementSequence1295 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1297 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IDENT_in_identList1308 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_comma_in_identList1311 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList1313 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1325 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_arrayType1327 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OF_in_arrayType1329 = new BitSet(new long[]{0x0001001800000000L});
    public static final BitSet FOLLOW_type_in_arrayType1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1357 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_colon_in_fieldList1359 = new BitSet(new long[]{0x0001001800000000L});
    public static final BitSet FOLLOW_type_in_fieldList1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1373 = new BitSet(new long[]{0x0001000060000000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1375 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_semicolon_in_recordType1378 = new BitSet(new long[]{0x0001000060000000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1380 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_recordType1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection1412 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_identList_in_fpSection1415 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_colon_in_fpSection1417 = new BitSet(new long[]{0x0001001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_formalParameters1429 = new BitSet(new long[]{0x0001008000200000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1432 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_semicolon_in_formalParameters1435 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1437 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_formalParameters1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_nameident1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_semicolon1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_comma1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_colon1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred35_oberon0992 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred35_oberon0994 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred35_oberon0996 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred35_oberon0998 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred35_oberon01001 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred35_oberon01003 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred35_oberon01005 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred35_oberon01007 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred35_oberon01012 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred35_oberon01014 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_synpred35_oberon01017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred37_oberon01073 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred37_oberon01075 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred37_oberon01077 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred37_oberon01079 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred37_oberon01082 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred37_oberon01084 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred37_oberon01086 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred37_oberon01088 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_END_in_synpred37_oberon01092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred38_oberon01138 = new BitSet(new long[]{0x0003000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred38_oberon01140 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred38_oberon01142 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred38_oberon01144 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred38_oberon01147 = new BitSet(new long[]{0x0001000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred38_oberon01149 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_synpred38_oberon01152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred39_oberon01268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred40_oberon01272 = new BitSet(new long[]{0x0000000000000002L});

}