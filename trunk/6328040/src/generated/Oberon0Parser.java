// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g 2011-01-29 20:57:42
package generated; 
//import oberon0.OberonAST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MULTIPLY", "DIVIDE", "MOD", "AMPERSAND", "ADD", "SUBTRACT", "OR", "EQUALS", "HASH", "SMALLERTHEN", "SMALLEREQUAL", "GREATERTHEN", "GREATEREQUAL", "DOT", "COMMA", "COLON", "RNDOPEN", "RNDCLOSE", "SQROPEN", "SQRCLOSE", "OF", "THEN", "DO", "TILDE", "ASSIGNMENT", "SEMICOLON", "END", "ELSE", "ELSIF", "IF", "WHILE", "ARRAY", "RECORD", "CONST", "TYPEDECL", "VAR", "PROCEDURE", "BEGIN", "MODULE", "FORMALPARAMETERS", "ACTUALPARAMETERS", "REFVAR", "BODY", "CONDITION", "PROCEDURECALL", "SELECTOR", "OBERONPROGRAM", "DECLARATIONS", "IFBLOCK", "IDENTLIST", "ROUTINENAME", "IDENT", "INTEGER", "BOOLEAN", "WS", "OPTWS"
    };
    public static final int EOF=-1;
    public static final int MULTIPLY=4;
    public static final int DIVIDE=5;
    public static final int MOD=6;
    public static final int AMPERSAND=7;
    public static final int ADD=8;
    public static final int SUBTRACT=9;
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
    public static final int ASSIGNMENT=28;
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
    public static final int FORMALPARAMETERS=43;
    public static final int ACTUALPARAMETERS=44;
    public static final int REFVAR=45;
    public static final int BODY=46;
    public static final int CONDITION=47;
    public static final int PROCEDURECALL=48;
    public static final int SELECTOR=49;
    public static final int OBERONPROGRAM=50;
    public static final int DECLARATIONS=51;
    public static final int IFBLOCK=52;
    public static final int IDENTLIST=53;
    public static final int ROUTINENAME=54;
    public static final int IDENT=55;
    public static final int INTEGER=56;
    public static final int BOOLEAN=57;
    public static final int WS=58;
    public static final int OPTWS=59;

    // delegates
    // delegators


        public Oberon0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Oberon0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[90+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g"; }


    public static class oberonprogram_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oberonprogram"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:73:1: oberonprogram : module -> ^( OBERONPROGRAM module ) ;
    public final Oberon0Parser.oberonprogram_return oberonprogram() throws RecognitionException {
        Oberon0Parser.oberonprogram_return retval = new Oberon0Parser.oberonprogram_return();
        retval.start = input.LT(1);
        int oberonprogram_StartIndex = input.index();
        Object root_0 = null;

        Oberon0Parser.module_return module1 = null;


        RewriteRuleSubtreeStream stream_module=new RewriteRuleSubtreeStream(adaptor,"rule module");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:74:2: ( module -> ^( OBERONPROGRAM module ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:74:4: module
            {
            pushFollow(FOLLOW_module_in_oberonprogram461);
            module1=module();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_module.add(module1.getTree());


            // AST REWRITE
            // elements: module
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 75:4: -> ^( OBERONPROGRAM module )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:75:7: ^( OBERONPROGRAM module )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBERONPROGRAM, "OBERONPROGRAM"), root_1);

                adaptor.addChild(root_1, stream_module.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 1, oberonprogram_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "oberonprogram"

    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:76:1: module : MODULE routinename semicolon moduleBody IDENT DOT EOF -> ^( MODULE routinename moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);
        int module_StartIndex = input.index();
        Object root_0 = null;

        Token MODULE2=null;
        Token IDENT6=null;
        Token DOT7=null;
        Token EOF8=null;
        Oberon0Parser.routinename_return routinename3 = null;

        Oberon0Parser.semicolon_return semicolon4 = null;

        Oberon0Parser.moduleBody_return moduleBody5 = null;


        Object MODULE2_tree=null;
        Object IDENT6_tree=null;
        Object DOT7_tree=null;
        Object EOF8_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_routinename=new RewriteRuleSubtreeStream(adaptor,"rule routinename");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:76:8: ( MODULE routinename semicolon moduleBody IDENT DOT EOF -> ^( MODULE routinename moduleBody ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:76:10: MODULE routinename semicolon moduleBody IDENT DOT EOF
            {
            MODULE2=(Token)match(input,MODULE,FOLLOW_MODULE_in_module480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE2);

            pushFollow(FOLLOW_routinename_in_module482);
            routinename3=routinename();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_routinename.add(routinename3.getTree());
            pushFollow(FOLLOW_semicolon_in_module484);
            semicolon4=semicolon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semicolon.add(semicolon4.getTree());
            pushFollow(FOLLOW_moduleBody_in_module486);
            moduleBody5=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody5.getTree());
            IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_module488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT6);

            DOT7=(Token)match(input,DOT,FOLLOW_DOT_in_module490); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT7);

            EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_module492); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF8);



            // AST REWRITE
            // elements: moduleBody, MODULE, routinename
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:4: -> ^( MODULE routinename moduleBody )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:77:7: ^( MODULE routinename moduleBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_MODULE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_routinename.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 2, module_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "module"

    public static class moduleBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moduleBody"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:78:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
    public final Oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        Oberon0Parser.moduleBody_return retval = new Oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);
        int moduleBody_StartIndex = input.index();
        Object root_0 = null;

        Token BEGIN10=null;
        Token END12=null;
        Oberon0Parser.declarations_return declarations9 = null;

        Oberon0Parser.statementSequence_return statementSequence11 = null;


        Object BEGIN10_tree=null;
        Object END12_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:79:2: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:79:4: declarations ( BEGIN statementSequence )? END
            {
            pushFollow(FOLLOW_declarations_in_moduleBody513);
            declarations9=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations9.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:79:17: ( BEGIN statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==BEGIN) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:79:18: BEGIN statementSequence
                    {
                    BEGIN10=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN10);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody518);
                    statementSequence11=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence11.getTree());

                    }
                    break;

            }

            END12=(Token)match(input,END,FOLLOW_END_in_moduleBody522); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END12);



            // AST REWRITE
            // elements: declarations, statementSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 80:4: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:80:7: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:80:21: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:80:21: ^( BODY statementSequence )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 3, moduleBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "moduleBody"

    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:81:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )* -> ^( DECLARATIONS ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ) ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);
        int declarations_StartIndex = input.index();
        Object root_0 = null;

        Oberon0Parser.constDeclaration_return constDeclaration13 = null;

        Oberon0Parser.typeDeclaration_return typeDeclaration14 = null;

        Oberon0Parser.varDeclarations_return varDeclarations15 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration16 = null;

        Oberon0Parser.semicolon_return semicolon17 = null;


        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:82:2: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )* -> ^( DECLARATIONS ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:82:5: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )*
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:82:5: ( constDeclaration )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations546);
                    constDeclaration13=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration13.getTree());

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:82:23: ( typeDeclaration )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPEDECL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations549);
                    typeDeclaration14=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration14.getTree());

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:82:40: ( varDeclarations )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations552);
                    varDeclarations15=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations15.getTree());

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:83:4: ( procedureDeclaration semicolon )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==PROCEDURE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:83:5: procedureDeclaration semicolon
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations560);
            	    procedureDeclaration16=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration16.getTree());
            	    pushFollow(FOLLOW_semicolon_in_declarations562);
            	    semicolon17=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: constDeclaration, procedureDeclaration, varDeclarations, typeDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 84:5: -> ^( DECLARATIONS ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:84:8: ^( DECLARATIONS ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:84:23: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:84:41: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:84:58: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:85:5: ( procedureDeclaration )*
                while ( stream_procedureDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_procedureDeclaration.nextTree());

                }
                stream_procedureDeclaration.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 4, declarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "declarations"

    public static class constDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:86:1: constDeclaration : ( CONST ( IDENT EQUALS expression semicolon )* ) -> ^( CONST ( IDENT expression )* ) ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);
        int constDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token CONST18=null;
        Token IDENT19=null;
        Token EQUALS20=null;
        Oberon0Parser.expression_return expression21 = null;

        Oberon0Parser.semicolon_return semicolon22 = null;


        Object CONST18_tree=null;
        Object IDENT19_tree=null;
        Object EQUALS20_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:87:2: ( ( CONST ( IDENT EQUALS expression semicolon )* ) -> ^( CONST ( IDENT expression )* ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:87:4: ( CONST ( IDENT EQUALS expression semicolon )* )
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:87:4: ( CONST ( IDENT EQUALS expression semicolon )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:87:5: CONST ( IDENT EQUALS expression semicolon )*
            {
            CONST18=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST18);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:87:11: ( IDENT EQUALS expression semicolon )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==EQUALS) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:87:12: IDENT EQUALS expression semicolon
            	    {
            	    IDENT19=(Token)match(input,IDENT,FOLLOW_IDENT_in_constDeclaration608); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT19);

            	    EQUALS20=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration610); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS20);

            	    pushFollow(FOLLOW_expression_in_constDeclaration612);
            	    expression21=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression21.getTree());
            	    pushFollow(FOLLOW_semicolon_in_constDeclaration614);
            	    semicolon22=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon22.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: IDENT, CONST, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 88:4: -> ^( CONST ( IDENT expression )* )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:88:7: ^( CONST ( IDENT expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:88:15: ( IDENT expression )*
                while ( stream_IDENT.hasNext()||stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_IDENT.reset();
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
            if ( state.backtracking>0 ) { memoize(input, 5, constDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constDeclaration"

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:89:1: typeDeclaration : ( TYPEDECL ( IDENT EQUALS type semicolon )* ) -> ^( TYPEDECL ( IDENT type )* ) ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDECL23=null;
        Token IDENT24=null;
        Token EQUALS25=null;
        Oberon0Parser.type_return type26 = null;

        Oberon0Parser.semicolon_return semicolon27 = null;


        Object TYPEDECL23_tree=null;
        Object IDENT24_tree=null;
        Object EQUALS25_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_TYPEDECL=new RewriteRuleTokenStream(adaptor,"token TYPEDECL");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:90:2: ( ( TYPEDECL ( IDENT EQUALS type semicolon )* ) -> ^( TYPEDECL ( IDENT type )* ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:90:4: ( TYPEDECL ( IDENT EQUALS type semicolon )* )
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:90:4: ( TYPEDECL ( IDENT EQUALS type semicolon )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:90:5: TYPEDECL ( IDENT EQUALS type semicolon )*
            {
            TYPEDECL23=(Token)match(input,TYPEDECL,FOLLOW_TYPEDECL_in_typeDeclaration644); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPEDECL.add(TYPEDECL23);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:90:14: ( IDENT EQUALS type semicolon )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENT) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==EQUALS) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:90:15: IDENT EQUALS type semicolon
            	    {
            	    IDENT24=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration647); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT24);

            	    EQUALS25=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration649); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS25);

            	    pushFollow(FOLLOW_type_in_typeDeclaration651);
            	    type26=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type26.getTree());
            	    pushFollow(FOLLOW_semicolon_in_typeDeclaration653);
            	    semicolon27=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon27.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
            // 91:4: -> ^( TYPEDECL ( IDENT type )* )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:91:7: ^( TYPEDECL ( IDENT type )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_TYPEDECL.nextNode(), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:91:18: ( IDENT type )*
                while ( stream_type.hasNext()||stream_IDENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENT.nextNode());
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
            if ( state.backtracking>0 ) { memoize(input, 6, typeDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDeclaration"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:92:1: varDeclarations : ( VAR ( identList COLON type semicolon )* ) -> ( ^( VAR identList type ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);
        int varDeclarations_StartIndex = input.index();
        Object root_0 = null;

        Token VAR28=null;
        Token COLON30=null;
        Oberon0Parser.identList_return identList29 = null;

        Oberon0Parser.type_return type31 = null;

        Oberon0Parser.semicolon_return semicolon32 = null;


        Object VAR28_tree=null;
        Object COLON30_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:93:2: ( ( VAR ( identList COLON type semicolon )* ) -> ( ^( VAR identList type ) )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:93:4: ( VAR ( identList COLON type semicolon )* )
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:93:4: ( VAR ( identList COLON type semicolon )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:93:5: VAR ( identList COLON type semicolon )*
            {
            VAR28=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations683); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR28);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:93:9: ( identList COLON type semicolon )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENT) ) {
                    int LA8_2 = input.LA(2);

                    if ( ((LA8_2>=COMMA && LA8_2<=COLON)) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:93:10: identList COLON type semicolon
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations686);
            	    identList29=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList29.getTree());
            	    COLON30=(Token)match(input,COLON,FOLLOW_COLON_in_varDeclarations688); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON30);

            	    pushFollow(FOLLOW_type_in_varDeclarations690);
            	    type31=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type31.getTree());
            	    pushFollow(FOLLOW_semicolon_in_varDeclarations692);
            	    semicolon32=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon32.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: VAR, identList, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:4: -> ( ^( VAR identList type ) )*
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:94:7: ( ^( VAR identList type ) )*
                while ( stream_VAR.hasNext()||stream_identList.hasNext()||stream_type.hasNext() ) {
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:94:7: ^( VAR identList type )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_identList.nextTree());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_VAR.reset();
                stream_identList.reset();
                stream_type.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 7, varDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclarations"

    public static class procedureDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:95:1: procedureDeclaration : PROCEDURE routinename ( formalParameters )? SEMICOLON declarations ( procedureBody )? IDENT -> ^( PROCEDURE routinename ( formalParameters )? declarations ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);
        int procedureDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token PROCEDURE33=null;
        Token SEMICOLON36=null;
        Token IDENT39=null;
        Oberon0Parser.routinename_return routinename34 = null;

        Oberon0Parser.formalParameters_return formalParameters35 = null;

        Oberon0Parser.declarations_return declarations37 = null;

        Oberon0Parser.procedureBody_return procedureBody38 = null;


        Object PROCEDURE33_tree=null;
        Object SEMICOLON36_tree=null;
        Object IDENT39_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_routinename=new RewriteRuleSubtreeStream(adaptor,"rule routinename");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:96:2: ( PROCEDURE routinename ( formalParameters )? SEMICOLON declarations ( procedureBody )? IDENT -> ^( PROCEDURE routinename ( formalParameters )? declarations ( procedureBody )? ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:96:4: PROCEDURE routinename ( formalParameters )? SEMICOLON declarations ( procedureBody )? IDENT
            {
            PROCEDURE33=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration717); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE33);

            pushFollow(FOLLOW_routinename_in_procedureDeclaration719);
            routinename34=routinename();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_routinename.add(routinename34.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:96:26: ( formalParameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RNDOPEN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:96:27: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration722);
                    formalParameters35=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters35.getTree());

                    }
                    break;

            }

            SEMICOLON36=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_procedureDeclaration726); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON36);

            pushFollow(FOLLOW_declarations_in_procedureDeclaration728);
            declarations37=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations37.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:96:69: ( procedureBody )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BEGIN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:96:70: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration731);
                    procedureBody38=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody38.getTree());

                    }
                    break;

            }

            IDENT39=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration735); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT39);



            // AST REWRITE
            // elements: PROCEDURE, routinename, procedureBody, declarations, formalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 97:4: -> ^( PROCEDURE routinename ( formalParameters )? declarations ( procedureBody )? )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:97:7: ^( PROCEDURE routinename ( formalParameters )? declarations ( procedureBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_routinename.nextTree());
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:97:31: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                adaptor.addChild(root_1, stream_declarations.nextTree());
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:97:64: ( procedureBody )?
                if ( stream_procedureBody.hasNext() ) {
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
            if ( state.backtracking>0 ) { memoize(input, 8, procedureDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "procedureDeclaration"

    public static class procedureBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:98:1: procedureBody : BEGIN statementSequence END -> ^( BODY statementSequence ) ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);
        int procedureBody_StartIndex = input.index();
        Object root_0 = null;

        Token BEGIN40=null;
        Token END42=null;
        Oberon0Parser.statementSequence_return statementSequence41 = null;


        Object BEGIN40_tree=null;
        Object END42_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:99:2: ( BEGIN statementSequence END -> ^( BODY statementSequence ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:99:4: BEGIN statementSequence END
            {
            BEGIN40=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN40);

            pushFollow(FOLLOW_statementSequence_in_procedureBody771);
            statementSequence41=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence41.getTree());
            END42=(Token)match(input,END,FOLLOW_END_in_procedureBody773); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END42);



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
            // 100:4: -> ^( BODY statementSequence )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:100:7: ^( BODY statementSequence )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 9, procedureBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "procedureBody"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:101:1: assignment : identselector ASSIGNMENT expression ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);
        int assignment_StartIndex = input.index();
        Object root_0 = null;

        Token ASSIGNMENT44=null;
        Oberon0Parser.identselector_return identselector43 = null;

        Oberon0Parser.expression_return expression45 = null;


        Object ASSIGNMENT44_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:102:2: ( identselector ASSIGNMENT expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:102:4: identselector ASSIGNMENT expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identselector_in_assignment792);
            identselector43=identselector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identselector43.getTree());
            ASSIGNMENT44=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment794); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGNMENT44_tree = (Object)adaptor.create(ASSIGNMENT44);
            root_0 = (Object)adaptor.becomeRoot(ASSIGNMENT44_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_assignment797);
            expression45=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression45.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, assignment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class actualParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:103:1: actualParameters : RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE -> ^( ACTUALPARAMETERS ( expression )+ ) ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);
        int actualParameters_StartIndex = input.index();
        Object root_0 = null;

        Token RNDOPEN46=null;
        Token COMMA48=null;
        Token RNDCLOSE50=null;
        Oberon0Parser.expression_return expression47 = null;

        Oberon0Parser.expression_return expression49 = null;


        Object RNDOPEN46_tree=null;
        Object COMMA48_tree=null;
        Object RNDCLOSE50_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:104:2: ( RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE -> ^( ACTUALPARAMETERS ( expression )+ ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:104:4: RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE
            {
            RNDOPEN46=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_actualParameters805); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN46);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:104:12: ( expression ( COMMA expression )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=ADD && LA12_0<=SUBTRACT)||LA12_0==RNDOPEN||LA12_0==TILDE||(LA12_0>=IDENT && LA12_0<=INTEGER)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:104:13: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters808);
                    expression47=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression47.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:104:24: ( COMMA expression )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:104:25: COMMA expression
                    	    {
                    	    COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_actualParameters811); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA48);

                    	    pushFollow(FOLLOW_expression_in_actualParameters813);
                    	    expression49=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression49.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            RNDCLOSE50=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_actualParameters819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDCLOSE.add(RNDCLOSE50);



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
            // 105:4: -> ^( ACTUALPARAMETERS ( expression )+ )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:105:7: ^( ACTUALPARAMETERS ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTUALPARAMETERS, "ACTUALPARAMETERS"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
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
            if ( state.backtracking>0 ) { memoize(input, 11, actualParameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "actualParameters"

    public static class procedureCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:106:1: procedureCall : identselector ( actualParameters )? -> ^( PROCEDURECALL identselector ( actualParameters )? ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);
        int procedureCall_StartIndex = input.index();
        Object root_0 = null;

        Oberon0Parser.identselector_return identselector51 = null;

        Oberon0Parser.actualParameters_return actualParameters52 = null;


        RewriteRuleSubtreeStream stream_identselector=new RewriteRuleSubtreeStream(adaptor,"rule identselector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:107:2: ( identselector ( actualParameters )? -> ^( PROCEDURECALL identselector ( actualParameters )? ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:107:4: identselector ( actualParameters )?
            {
            pushFollow(FOLLOW_identselector_in_procedureCall839);
            identselector51=identselector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identselector.add(identselector51.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:107:18: ( actualParameters )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RNDOPEN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:107:19: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall842);
                    actualParameters52=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters52.getTree());

                    }
                    break;

            }



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
            // 108:4: -> ^( PROCEDURECALL identselector ( actualParameters )? )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:108:7: ^( PROCEDURECALL identselector ( actualParameters )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_1);

                adaptor.addChild(root_1, stream_identselector.nextTree());
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:108:37: ( actualParameters )?
                if ( stream_actualParameters.hasNext() ) {
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
            if ( state.backtracking>0 ) { memoize(input, 12, procedureCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class elseStatementPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStatementPart"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:110:1: elseStatementPart : ELSE statementSequence -> ^( ELSE ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.elseStatementPart_return elseStatementPart() throws RecognitionException {
        Oberon0Parser.elseStatementPart_return retval = new Oberon0Parser.elseStatementPart_return();
        retval.start = input.LT(1);
        int elseStatementPart_StartIndex = input.index();
        Object root_0 = null;

        Token ELSE53=null;
        Oberon0Parser.statementSequence_return statementSequence54 = null;


        Object ELSE53_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:111:2: ( ELSE statementSequence -> ^( ELSE ^( BODY statementSequence ) ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:111:4: ELSE statementSequence
            {
            ELSE53=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseStatementPart872); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE53);

            pushFollow(FOLLOW_statementSequence_in_elseStatementPart874);
            statementSequence54=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence54.getTree());


            // AST REWRITE
            // elements: ELSE, statementSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:4: -> ^( ELSE ^( BODY statementSequence ) )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:112:7: ^( ELSE ^( BODY statementSequence ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:112:14: ^( BODY statementSequence )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

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
            if ( state.backtracking>0 ) { memoize(input, 13, elseStatementPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseStatementPart"

    public static class elseifStatementPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseifStatementPart"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:113:1: elseifStatementPart : ELSIF expression THEN statementSequence -> ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.elseifStatementPart_return elseifStatementPart() throws RecognitionException {
        Oberon0Parser.elseifStatementPart_return retval = new Oberon0Parser.elseifStatementPart_return();
        retval.start = input.LT(1);
        int elseifStatementPart_StartIndex = input.index();
        Object root_0 = null;

        Token ELSIF55=null;
        Token THEN57=null;
        Oberon0Parser.expression_return expression56 = null;

        Oberon0Parser.statementSequence_return statementSequence58 = null;


        Object ELSIF55_tree=null;
        Object THEN57_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:114:2: ( ELSIF expression THEN statementSequence -> ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:114:4: ELSIF expression THEN statementSequence
            {
            ELSIF55=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_elseifStatementPart898); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF55);

            pushFollow(FOLLOW_expression_in_elseifStatementPart900);
            expression56=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression56.getTree());
            THEN57=(Token)match(input,THEN,FOLLOW_THEN_in_elseifStatementPart902); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN57);

            pushFollow(FOLLOW_statementSequence_in_elseifStatementPart904);
            statementSequence58=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence58.getTree());


            // AST REWRITE
            // elements: expression, statementSequence, ELSIF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 115:4: -> ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:115:7: ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:115:15: ^( CONDITION expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:116:5: ^( BODY statementSequence )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

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
            if ( state.backtracking>0 ) { memoize(input, 14, elseifStatementPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "elseifStatementPart"

    public static class ifStatementPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatementPart"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:117:1: ifStatementPart : IF expression THEN statementSequence -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.ifStatementPart_return ifStatementPart() throws RecognitionException {
        Oberon0Parser.ifStatementPart_return retval = new Oberon0Parser.ifStatementPart_return();
        retval.start = input.LT(1);
        int ifStatementPart_StartIndex = input.index();
        Object root_0 = null;

        Token IF59=null;
        Token THEN61=null;
        Oberon0Parser.expression_return expression60 = null;

        Oberon0Parser.statementSequence_return statementSequence62 = null;


        Object IF59_tree=null;
        Object THEN61_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:118:2: ( IF expression THEN statementSequence -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:118:4: IF expression THEN statementSequence
            {
            IF59=(Token)match(input,IF,FOLLOW_IF_in_ifStatementPart938); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF59);

            pushFollow(FOLLOW_expression_in_ifStatementPart940);
            expression60=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression60.getTree());
            THEN61=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatementPart942); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN61);

            pushFollow(FOLLOW_statementSequence_in_ifStatementPart944);
            statementSequence62=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence62.getTree());


            // AST REWRITE
            // elements: expression, statementSequence, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 119:4: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:119:6: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:119:11: ^( CONDITION expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:120:5: ^( BODY statementSequence )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

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
            if ( state.backtracking>0 ) { memoize(input, 15, ifStatementPart_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatementPart"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:122:1: ifStatement : ( ifStatementPart ( elseifStatementPart )+ elseStatementPart END -> ^( IFBLOCK ifStatementPart ( elseifStatementPart )+ elseStatementPart ) | ifStatementPart ( elseifStatementPart )+ END -> ^( IFBLOCK ifStatementPart ( elseifStatementPart )+ ) | ifStatementPart elseStatementPart END -> ^( IFBLOCK ifStatementPart elseStatementPart ) | ifStatementPart END -> ^( IFBLOCK ifStatementPart ) );
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Object root_0 = null;

        Token END66=null;
        Token END69=null;
        Token END72=null;
        Token END74=null;
        Oberon0Parser.ifStatementPart_return ifStatementPart63 = null;

        Oberon0Parser.elseifStatementPart_return elseifStatementPart64 = null;

        Oberon0Parser.elseStatementPart_return elseStatementPart65 = null;

        Oberon0Parser.ifStatementPart_return ifStatementPart67 = null;

        Oberon0Parser.elseifStatementPart_return elseifStatementPart68 = null;

        Oberon0Parser.ifStatementPart_return ifStatementPart70 = null;

        Oberon0Parser.elseStatementPart_return elseStatementPart71 = null;

        Oberon0Parser.ifStatementPart_return ifStatementPart73 = null;


        Object END66_tree=null;
        Object END69_tree=null;
        Object END72_tree=null;
        Object END74_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_elseStatementPart=new RewriteRuleSubtreeStream(adaptor,"rule elseStatementPart");
        RewriteRuleSubtreeStream stream_elseifStatementPart=new RewriteRuleSubtreeStream(adaptor,"rule elseifStatementPart");
        RewriteRuleSubtreeStream stream_ifStatementPart=new RewriteRuleSubtreeStream(adaptor,"rule ifStatementPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:122:12: ( ifStatementPart ( elseifStatementPart )+ elseStatementPart END -> ^( IFBLOCK ifStatementPart ( elseifStatementPart )+ elseStatementPart ) | ifStatementPart ( elseifStatementPart )+ END -> ^( IFBLOCK ifStatementPart ( elseifStatementPart )+ ) | ifStatementPart elseStatementPart END -> ^( IFBLOCK ifStatementPart elseStatementPart ) | ifStatementPart END -> ^( IFBLOCK ifStatementPart ) )
            int alt16=4;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IF) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred15_Oberon0()) ) {
                    alt16=1;
                }
                else if ( (synpred17_Oberon0()) ) {
                    alt16=2;
                }
                else if ( (synpred18_Oberon0()) ) {
                    alt16=3;
                }
                else if ( (true) ) {
                    alt16=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:122:15: ifStatementPart ( elseifStatementPart )+ elseStatementPart END
                    {
                    pushFollow(FOLLOW_ifStatementPart_in_ifStatement979);
                    ifStatementPart63=ifStatementPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifStatementPart.add(ifStatementPart63.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:122:31: ( elseifStatementPart )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==ELSIF) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:0:0: elseifStatementPart
                    	    {
                    	    pushFollow(FOLLOW_elseifStatementPart_in_ifStatement981);
                    	    elseifStatementPart64=elseifStatementPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elseifStatementPart.add(elseifStatementPart64.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    pushFollow(FOLLOW_elseStatementPart_in_ifStatement989);
                    elseStatementPart65=elseStatementPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStatementPart.add(elseStatementPart65.getTree());
                    END66=(Token)match(input,END,FOLLOW_END_in_ifStatement991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END66);



                    // AST REWRITE
                    // elements: elseStatementPart, elseifStatementPart, ifStatementPart
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:4: -> ^( IFBLOCK ifStatementPart ( elseifStatementPart )+ elseStatementPart )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:124:7: ^( IFBLOCK ifStatementPart ( elseifStatementPart )+ elseStatementPart )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_1);

                        adaptor.addChild(root_1, stream_ifStatementPart.nextTree());
                        if ( !(stream_elseifStatementPart.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_elseifStatementPart.hasNext() ) {
                            adaptor.addChild(root_1, stream_elseifStatementPart.nextTree());

                        }
                        stream_elseifStatementPart.reset();
                        adaptor.addChild(root_1, stream_elseStatementPart.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:127:6: ifStatementPart ( elseifStatementPart )+ END
                    {
                    pushFollow(FOLLOW_ifStatementPart_in_ifStatement1024);
                    ifStatementPart67=ifStatementPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifStatementPart.add(ifStatementPart67.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:127:22: ( elseifStatementPart )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ELSIF) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:0:0: elseifStatementPart
                    	    {
                    	    pushFollow(FOLLOW_elseifStatementPart_in_ifStatement1026);
                    	    elseifStatementPart68=elseifStatementPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_elseifStatementPart.add(elseifStatementPart68.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    END69=(Token)match(input,END,FOLLOW_END_in_ifStatement1029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END69);



                    // AST REWRITE
                    // elements: ifStatementPart, elseifStatementPart
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 128:5: -> ^( IFBLOCK ifStatementPart ( elseifStatementPart )+ )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:128:8: ^( IFBLOCK ifStatementPart ( elseifStatementPart )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_1);

                        adaptor.addChild(root_1, stream_ifStatementPart.nextTree());
                        if ( !(stream_elseifStatementPart.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_elseifStatementPart.hasNext() ) {
                            adaptor.addChild(root_1, stream_elseifStatementPart.nextTree());

                        }
                        stream_elseifStatementPart.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:129:6: ifStatementPart elseStatementPart END
                    {
                    pushFollow(FOLLOW_ifStatementPart_in_ifStatement1051);
                    ifStatementPart70=ifStatementPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifStatementPart.add(ifStatementPart70.getTree());
                    pushFollow(FOLLOW_elseStatementPart_in_ifStatement1053);
                    elseStatementPart71=elseStatementPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseStatementPart.add(elseStatementPart71.getTree());
                    END72=(Token)match(input,END,FOLLOW_END_in_ifStatement1055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END72);



                    // AST REWRITE
                    // elements: ifStatementPart, elseStatementPart
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:5: -> ^( IFBLOCK ifStatementPart elseStatementPart )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:130:8: ^( IFBLOCK ifStatementPart elseStatementPart )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_1);

                        adaptor.addChild(root_1, stream_ifStatementPart.nextTree());
                        adaptor.addChild(root_1, stream_elseStatementPart.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:131:6: ifStatementPart END
                    {
                    pushFollow(FOLLOW_ifStatementPart_in_ifStatement1077);
                    ifStatementPart73=ifStatementPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifStatementPart.add(ifStatementPart73.getTree());
                    END74=(Token)match(input,END,FOLLOW_END_in_ifStatement1079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END74);



                    // AST REWRITE
                    // elements: ifStatementPart
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 132:5: -> ^( IFBLOCK ifStatementPart )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:132:8: ^( IFBLOCK ifStatementPart )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFBLOCK, "IFBLOCK"), root_1);

                        adaptor.addChild(root_1, stream_ifStatementPart.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 16, ifStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:134:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);
        int whileStatement_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE75=null;
        Token DO77=null;
        Token END79=null;
        Oberon0Parser.expression_return expression76 = null;

        Oberon0Parser.statementSequence_return statementSequence78 = null;


        Object WHILE75_tree=null;
        Object DO77_tree=null;
        Object END79_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:134:15: ( WHILE expression DO statementSequence END -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:134:18: WHILE expression DO statementSequence END
            {
            WHILE75=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1099); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE75);

            pushFollow(FOLLOW_expression_in_whileStatement1101);
            expression76=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression76.getTree());
            DO77=(Token)match(input,DO,FOLLOW_DO_in_whileStatement1103); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO77);

            pushFollow(FOLLOW_statementSequence_in_whileStatement1105);
            statementSequence78=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence78.getTree());
            END79=(Token)match(input,END,FOLLOW_END_in_whileStatement1107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END79);



            // AST REWRITE
            // elements: statementSequence, WHILE, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:5: -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:135:8: ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:135:16: ^( CONDITION expression )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:135:40: ^( BODY statementSequence )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

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
            if ( state.backtracking>0 ) { memoize(input, 17, whileStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:136:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Oberon0Parser.assignment_return assignment80 = null;

        Oberon0Parser.procedureCall_return procedureCall81 = null;

        Oberon0Parser.ifStatement_return ifStatement82 = null;

        Oberon0Parser.whileStatement_return whileStatement83 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:2: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt17=5;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1138);
                    assignment80=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment80.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:18: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1142);
                    procedureCall81=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall81.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:34: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1146);
                    ifStatement82=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement82.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:48: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1150);
                    whileStatement83=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement83.getTree());

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 18, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementSequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:138:1: statementSequence : statement ( semicolon statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);
        int statementSequence_StartIndex = input.index();
        Object root_0 = null;

        Oberon0Parser.statement_return statement84 = null;

        Oberon0Parser.semicolon_return semicolon85 = null;

        Oberon0Parser.statement_return statement86 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:139:2: ( statement ( semicolon statement )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:139:4: statement ( semicolon statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementSequence1160);
            statement84=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement84.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:139:14: ( semicolon statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==SEMICOLON) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:139:15: semicolon statement
            	    {
            	    pushFollow(FOLLOW_semicolon_in_statementSequence1163);
            	    semicolon85=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, semicolon85.getTree());
            	    pushFollow(FOLLOW_statement_in_statementSequence1165);
            	    statement86=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement86.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 19, statementSequence_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statementSequence"

    public static class identList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:140:1: identList : IDENT ( comma IDENT )* -> ^( IDENTLIST ( IDENT )+ ) ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);
        int identList_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT87=null;
        Token IDENT89=null;
        Oberon0Parser.comma_return comma88 = null;


        Object IDENT87_tree=null;
        Object IDENT89_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_comma=new RewriteRuleSubtreeStream(adaptor,"rule comma");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:141:2: ( IDENT ( comma IDENT )* -> ^( IDENTLIST ( IDENT )+ ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:141:4: IDENT ( comma IDENT )*
            {
            IDENT87=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList1175); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT87);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:141:10: ( comma IDENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:141:11: comma IDENT
            	    {
            	    pushFollow(FOLLOW_comma_in_identList1178);
            	    comma88=comma();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_comma.add(comma88.getTree());
            	    IDENT89=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList1180); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT89);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);



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
            // 142:4: -> ^( IDENTLIST ( IDENT )+ )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:142:6: ^( IDENTLIST ( IDENT )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDENTLIST, "IDENTLIST"), root_1);

                if ( !(stream_IDENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENT.hasNext() ) {
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
            if ( state.backtracking>0 ) { memoize(input, 20, identList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "identList"

    public static class arrayType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:143:1: arrayType : ARRAY expression OF type -> ^( ARRAY expression type ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);
        int arrayType_StartIndex = input.index();
        Object root_0 = null;

        Token ARRAY90=null;
        Token OF92=null;
        Oberon0Parser.expression_return expression91 = null;

        Oberon0Parser.type_return type93 = null;


        Object ARRAY90_tree=null;
        Object OF92_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:144:2: ( ARRAY expression OF type -> ^( ARRAY expression type ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:144:4: ARRAY expression OF type
            {
            ARRAY90=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1203); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY90);

            pushFollow(FOLLOW_expression_in_arrayType1205);
            expression91=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression91.getTree());
            OF92=(Token)match(input,OF,FOLLOW_OF_in_arrayType1207); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF92);

            pushFollow(FOLLOW_type_in_arrayType1209);
            type93=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type93.getTree());


            // AST REWRITE
            // elements: type, expression, ARRAY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 145:4: -> ^( ARRAY expression type )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:145:7: ^( ARRAY expression type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 21, arrayType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayType"

    public static class fieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:146:1: fieldList : ( identList colon type )? ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);
        int fieldList_StartIndex = input.index();
        Object root_0 = null;

        Oberon0Parser.identList_return identList94 = null;

        Oberon0Parser.colon_return colon95 = null;

        Oberon0Parser.type_return type96 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:147:2: ( ( identList colon type )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:147:4: ( identList colon type )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:147:4: ( identList colon type )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:147:5: identList colon type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList1233);
                    identList94=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identList94.getTree());
                    pushFollow(FOLLOW_colon_in_fieldList1235);
                    colon95=colon();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon95.getTree());
                    pushFollow(FOLLOW_type_in_fieldList1237);
                    type96=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type96.getTree());

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 22, fieldList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldList"

    public static class recordType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:148:1: recordType : RECORD fieldList ( semicolon fieldList )* END -> ^( RECORD ( fieldList )+ ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);
        int recordType_StartIndex = input.index();
        Object root_0 = null;

        Token RECORD97=null;
        Token END101=null;
        Oberon0Parser.fieldList_return fieldList98 = null;

        Oberon0Parser.semicolon_return semicolon99 = null;

        Oberon0Parser.fieldList_return fieldList100 = null;


        Object RECORD97_tree=null;
        Object END101_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:149:2: ( RECORD fieldList ( semicolon fieldList )* END -> ^( RECORD ( fieldList )+ ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:149:4: RECORD fieldList ( semicolon fieldList )* END
            {
            RECORD97=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD97);

            pushFollow(FOLLOW_fieldList_in_recordType1250);
            fieldList98=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList98.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:149:21: ( semicolon fieldList )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==SEMICOLON) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:149:22: semicolon fieldList
            	    {
            	    pushFollow(FOLLOW_semicolon_in_recordType1253);
            	    semicolon99=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon99.getTree());
            	    pushFollow(FOLLOW_fieldList_in_recordType1255);
            	    fieldList100=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldList.add(fieldList100.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            END101=(Token)match(input,END,FOLLOW_END_in_recordType1259); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END101);



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
            // 150:4: -> ^( RECORD ( fieldList )+ )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:150:7: ^( RECORD ( fieldList )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                if ( !(stream_fieldList.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fieldList.hasNext() ) {
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
            if ( state.backtracking>0 ) { memoize(input, 23, recordType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "recordType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:151:1: type : ( IDENT | arrayType | recordType ) ;
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT102=null;
        Oberon0Parser.arrayType_return arrayType103 = null;

        Oberon0Parser.recordType_return recordType104 = null;


        Object IDENT102_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:151:6: ( ( IDENT | arrayType | recordType ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:151:8: ( IDENT | arrayType | recordType )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:151:8: ( IDENT | arrayType | recordType )
            int alt22=3;
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

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:151:9: IDENT
                    {
                    IDENT102=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT102_tree = (Object)adaptor.create(IDENT102);
                    adaptor.addChild(root_0, IDENT102_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:151:17: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type1283);
                    arrayType103=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType103.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:151:29: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type1287);
                    recordType104=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType104.getTree());

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 24, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class fpSection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fpSection"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:152:1: fpSection : ( identList COLON type -> ^( REFVAR identList type ) | VAR identList COLON type -> ^( VAR identList type ) );
    public final Oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        Oberon0Parser.fpSection_return retval = new Oberon0Parser.fpSection_return();
        retval.start = input.LT(1);
        int fpSection_StartIndex = input.index();
        Object root_0 = null;

        Token COLON106=null;
        Token VAR108=null;
        Token COLON110=null;
        Oberon0Parser.identList_return identList105 = null;

        Oberon0Parser.type_return type107 = null;

        Oberon0Parser.identList_return identList109 = null;

        Oberon0Parser.type_return type111 = null;


        Object COLON106_tree=null;
        Object VAR108_tree=null;
        Object COLON110_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:153:2: ( identList COLON type -> ^( REFVAR identList type ) | VAR identList COLON type -> ^( VAR identList type ) )
            int alt23=2;
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

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:153:4: identList COLON type
                    {
                    pushFollow(FOLLOW_identList_in_fpSection1297);
                    identList105=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList105.getTree());
                    COLON106=(Token)match(input,COLON,FOLLOW_COLON_in_fpSection1299); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON106);

                    pushFollow(FOLLOW_type_in_fpSection1301);
                    type107=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type107.getTree());


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
                    // 154:4: -> ^( REFVAR identList type )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:154:7: ^( REFVAR identList type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REFVAR, "REFVAR"), root_1);

                        adaptor.addChild(root_1, stream_identList.nextTree());
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:155:4: VAR identList COLON type
                    {
                    VAR108=(Token)match(input,VAR,FOLLOW_VAR_in_fpSection1319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR108);

                    pushFollow(FOLLOW_identList_in_fpSection1321);
                    identList109=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList109.getTree());
                    COLON110=(Token)match(input,COLON,FOLLOW_COLON_in_fpSection1323); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON110);

                    pushFollow(FOLLOW_type_in_fpSection1325);
                    type111=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type111.getTree());


                    // AST REWRITE
                    // elements: VAR, type, identList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:4: -> ^( VAR identList type )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:156:7: ^( VAR identList type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_identList.nextTree());
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
            if ( state.backtracking>0 ) { memoize(input, 25, fpSection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fpSection"

    public static class formalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:157:1: formalParameters : RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE -> ^( FORMALPARAMETERS ( ( fpSection )+ )? ) ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);
        int formalParameters_StartIndex = input.index();
        Object root_0 = null;

        Token RNDOPEN112=null;
        Token SEMICOLON114=null;
        Token RNDCLOSE116=null;
        Oberon0Parser.fpSection_return fpSection113 = null;

        Oberon0Parser.fpSection_return fpSection115 = null;


        Object RNDOPEN112_tree=null;
        Object SEMICOLON114_tree=null;
        Object RNDCLOSE116_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:158:2: ( RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE -> ^( FORMALPARAMETERS ( ( fpSection )+ )? ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:158:4: RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE
            {
            RNDOPEN112=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_formalParameters1347); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN112);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:158:12: ( fpSection ( SEMICOLON fpSection )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==VAR||LA25_0==IDENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:158:13: fpSection ( SEMICOLON fpSection )*
                    {
                    pushFollow(FOLLOW_fpSection_in_formalParameters1350);
                    fpSection113=fpSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fpSection.add(fpSection113.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:158:23: ( SEMICOLON fpSection )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==SEMICOLON) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:158:24: SEMICOLON fpSection
                    	    {
                    	    SEMICOLON114=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_formalParameters1353); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON114);

                    	    pushFollow(FOLLOW_fpSection_in_formalParameters1355);
                    	    fpSection115=fpSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fpSection.add(fpSection115.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            RNDCLOSE116=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_formalParameters1361); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDCLOSE.add(RNDCLOSE116);



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
            // 159:4: -> ^( FORMALPARAMETERS ( ( fpSection )+ )? )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:159:7: ^( FORMALPARAMETERS ( ( fpSection )+ )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMALPARAMETERS, "FORMALPARAMETERS"), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:159:26: ( ( fpSection )+ )?
                if ( stream_fpSection.hasNext() ) {
                    if ( !(stream_fpSection.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_fpSection.hasNext() ) {
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
            if ( state.backtracking>0 ) { memoize(input, 26, formalParameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:160:1: selector : ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )* ;
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);
        int selector_StartIndex = input.index();
        Object root_0 = null;

        Token DOT117=null;
        Token IDENT118=null;
        Oberon0Parser.sqrExpression_return sqrExpression119 = null;


        Object DOT117_tree=null;
        Object IDENT118_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_sqrExpression=new RewriteRuleSubtreeStream(adaptor,"rule sqrExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:160:9: ( ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:160:12: ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )*
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:160:12: ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==DOT) ) {
                    alt26=1;
                }
                else if ( (LA26_0==SQROPEN) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:160:13: DOT IDENT
            	    {
            	    DOT117=(Token)match(input,DOT,FOLLOW_DOT_in_selector1385); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT117);

            	    IDENT118=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1387); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT118);



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
            	    // 161:4: -> ^( SELECTOR IDENT )
            	    {
            	        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:161:7: ^( SELECTOR IDENT )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECTOR, "SELECTOR"), root_1);

            	        adaptor.addChild(root_1, stream_IDENT.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:162:5: sqrExpression
            	    {
            	    pushFollow(FOLLOW_sqrExpression_in_selector1406);
            	    sqrExpression119=sqrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sqrExpression.add(sqrExpression119.getTree());


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
            	    // 163:4: -> ^( SELECTOR sqrExpression )
            	    {
            	        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:163:7: ^( SELECTOR sqrExpression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECTOR, "SELECTOR"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 27, selector_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class identselector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identselector"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:165:1: identselector : IDENT selector ;
    public final Oberon0Parser.identselector_return identselector() throws RecognitionException {
        Oberon0Parser.identselector_return retval = new Oberon0Parser.identselector_return();
        retval.start = input.LT(1);
        int identselector_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT120=null;
        Oberon0Parser.selector_return selector121 = null;


        Object IDENT120_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:166:2: ( IDENT selector )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:166:4: IDENT selector
            {
            root_0 = (Object)adaptor.nil();

            IDENT120=(Token)match(input,IDENT,FOLLOW_IDENT_in_identselector1430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT120_tree = (Object)adaptor.create(IDENT120);
            root_0 = (Object)adaptor.becomeRoot(IDENT120_tree, root_0);
            }
            pushFollow(FOLLOW_selector_in_identselector1433);
            selector121=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selector121.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 28, identselector_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "identselector"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:167:1: factor : ( identselector | number | rndExpression | TILDE factor ) ;
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);
        int factor_StartIndex = input.index();
        Object root_0 = null;

        Token TILDE125=null;
        Oberon0Parser.identselector_return identselector122 = null;

        Oberon0Parser.number_return number123 = null;

        Oberon0Parser.rndExpression_return rndExpression124 = null;

        Oberon0Parser.factor_return factor126 = null;


        Object TILDE125_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:167:9: ( ( identselector | number | rndExpression | TILDE factor ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:167:11: ( identselector | number | rndExpression | TILDE factor )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:167:11: ( identselector | number | rndExpression | TILDE factor )
            int alt27=4;
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

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:167:12: identselector
                    {
                    pushFollow(FOLLOW_identselector_in_factor1442);
                    identselector122=identselector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identselector122.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:167:28: number
                    {
                    pushFollow(FOLLOW_number_in_factor1446);
                    number123=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number123.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:167:37: rndExpression
                    {
                    pushFollow(FOLLOW_rndExpression_in_factor1450);
                    rndExpression124=rndExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rndExpression124.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:167:53: TILDE factor
                    {
                    TILDE125=(Token)match(input,TILDE,FOLLOW_TILDE_in_factor1454); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TILDE125_tree = (Object)adaptor.create(TILDE125);
                    adaptor.addChild(root_0, TILDE125_tree);
                    }
                    pushFollow(FOLLOW_factor_in_factor1456);
                    factor126=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor126.getTree());

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 29, factor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:168:1: term : factor ( ( MULTIPLY | DIVIDE | MOD | AMPERSAND ) factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);
        int term_StartIndex = input.index();
        Object root_0 = null;

        Token set128=null;
        Oberon0Parser.factor_return factor127 = null;

        Oberon0Parser.factor_return factor129 = null;


        Object set128_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:168:7: ( factor ( ( MULTIPLY | DIVIDE | MOD | AMPERSAND ) factor )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:168:9: factor ( ( MULTIPLY | DIVIDE | MOD | AMPERSAND ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term1465);
            factor127=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor127.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:168:16: ( ( MULTIPLY | DIVIDE | MOD | AMPERSAND ) factor )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=MULTIPLY && LA28_0<=AMPERSAND)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:168:17: ( MULTIPLY | DIVIDE | MOD | AMPERSAND ) factor
            	    {
            	    set128=(Token)input.LT(1);
            	    set128=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULTIPLY && input.LA(1)<=AMPERSAND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set128), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term1485);
            	    factor129=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor129.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 30, term_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:169:1: simpleExpression : ( ADD | SUBTRACT )? term ( ( ADD | SUBTRACT | OR ) term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);
        int simpleExpression_StartIndex = input.index();
        Object root_0 = null;

        Token set130=null;
        Token set132=null;
        Oberon0Parser.term_return term131 = null;

        Oberon0Parser.term_return term133 = null;


        Object set130_tree=null;
        Object set132_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:170:2: ( ( ADD | SUBTRACT )? term ( ( ADD | SUBTRACT | OR ) term )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:170:4: ( ADD | SUBTRACT )? term ( ( ADD | SUBTRACT | OR ) term )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:170:4: ( ADD | SUBTRACT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=ADD && LA29_0<=SUBTRACT)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:
                    {
                    set130=(Token)input.LT(1);
                    if ( (input.LA(1)>=ADD && input.LA(1)<=SUBTRACT) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set130));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression1505);
            term131=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term131.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:170:27: ( ( ADD | SUBTRACT | OR ) term )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=ADD && LA30_0<=OR)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:170:28: ( ADD | SUBTRACT | OR ) term
            	    {
            	    set132=(Token)input.LT(1);
            	    set132=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=OR) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set132), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression1521);
            	    term133=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term133.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 31, simpleExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:171:1: expression : simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )? ;
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        Token set135=null;
        Oberon0Parser.simpleExpression_return simpleExpression134 = null;

        Oberon0Parser.simpleExpression_return simpleExpression136 = null;


        Object set135_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:172:2: ( simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:172:4: simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression1532);
            simpleExpression134=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression134.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:173:3: ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=EQUALS && LA31_0<=GREATEREQUAL)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:173:4: ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression
                    {
                    set135=(Token)input.LT(1);
                    set135=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALS && input.LA(1)<=GREATEREQUAL) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set135), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleExpression_in_expression1555);
                    simpleExpression136=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression136.getTree());

                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 32, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class sqrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqrExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:175:1: sqrExpression : SQROPEN expression SQRCLOSE -> expression ;
    public final Oberon0Parser.sqrExpression_return sqrExpression() throws RecognitionException {
        Oberon0Parser.sqrExpression_return retval = new Oberon0Parser.sqrExpression_return();
        retval.start = input.LT(1);
        int sqrExpression_StartIndex = input.index();
        Object root_0 = null;

        Token SQROPEN137=null;
        Token SQRCLOSE139=null;
        Oberon0Parser.expression_return expression138 = null;


        Object SQROPEN137_tree=null;
        Object SQRCLOSE139_tree=null;
        RewriteRuleTokenStream stream_SQROPEN=new RewriteRuleTokenStream(adaptor,"token SQROPEN");
        RewriteRuleTokenStream stream_SQRCLOSE=new RewriteRuleTokenStream(adaptor,"token SQRCLOSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:176:2: ( SQROPEN expression SQRCLOSE -> expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:176:4: SQROPEN expression SQRCLOSE
            {
            SQROPEN137=(Token)match(input,SQROPEN,FOLLOW_SQROPEN_in_sqrExpression1565); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SQROPEN.add(SQROPEN137);

            pushFollow(FOLLOW_expression_in_sqrExpression1567);
            expression138=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression138.getTree());
            SQRCLOSE139=(Token)match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_sqrExpression1569); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SQRCLOSE.add(SQRCLOSE139);



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
            // 176:32: -> expression
            {
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
            if ( state.backtracking>0 ) { memoize(input, 33, sqrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sqrExpression"

    public static class rndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rndExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:177:1: rndExpression : RNDOPEN expression RNDCLOSE -> expression ;
    public final Oberon0Parser.rndExpression_return rndExpression() throws RecognitionException {
        Oberon0Parser.rndExpression_return retval = new Oberon0Parser.rndExpression_return();
        retval.start = input.LT(1);
        int rndExpression_StartIndex = input.index();
        Object root_0 = null;

        Token RNDOPEN140=null;
        Token RNDCLOSE142=null;
        Oberon0Parser.expression_return expression141 = null;


        Object RNDOPEN140_tree=null;
        Object RNDCLOSE142_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:178:2: ( RNDOPEN expression RNDCLOSE -> expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:178:4: RNDOPEN expression RNDCLOSE
            {
            RNDOPEN140=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_rndExpression1581); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN140);

            pushFollow(FOLLOW_expression_in_rndExpression1583);
            expression141=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression141.getTree());
            RNDCLOSE142=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_rndExpression1585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDCLOSE.add(RNDCLOSE142);



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
            // 178:31: -> expression
            {
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
            if ( state.backtracking>0 ) { memoize(input, 34, rndExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "rndExpression"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:180:1: number : INTEGER ;
    public final Oberon0Parser.number_return number() throws RecognitionException {
        Oberon0Parser.number_return retval = new Oberon0Parser.number_return();
        retval.start = input.LT(1);
        int number_StartIndex = input.index();
        Object root_0 = null;

        Token INTEGER143=null;

        Object INTEGER143_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:180:8: ( INTEGER )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:180:10: INTEGER
            {
            root_0 = (Object)adaptor.nil();

            INTEGER143=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1596); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER143_tree = (Object)adaptor.create(INTEGER143);
            adaptor.addChild(root_0, INTEGER143_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 35, number_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class semicolon_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "semicolon"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:181:1: semicolon : SEMICOLON ;
    public final Oberon0Parser.semicolon_return semicolon() throws RecognitionException {
        Oberon0Parser.semicolon_return retval = new Oberon0Parser.semicolon_return();
        retval.start = input.LT(1);
        int semicolon_StartIndex = input.index();
        Object root_0 = null;

        Token SEMICOLON144=null;

        Object SEMICOLON144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:182:2: ( SEMICOLON )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:182:4: SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            SEMICOLON144=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_semicolon1605); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 36, semicolon_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "semicolon"

    public static class comma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comma"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:183:1: comma : COMMA ;
    public final Oberon0Parser.comma_return comma() throws RecognitionException {
        Oberon0Parser.comma_return retval = new Oberon0Parser.comma_return();
        retval.start = input.LT(1);
        int comma_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA145=null;

        Object COMMA145_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:183:7: ( COMMA )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:183:9: COMMA
            {
            root_0 = (Object)adaptor.nil();

            COMMA145=(Token)match(input,COMMA,FOLLOW_COMMA_in_comma1613); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 37, comma_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "comma"

    public static class colon_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "colon"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:184:1: colon : COLON ;
    public final Oberon0Parser.colon_return colon() throws RecognitionException {
        Oberon0Parser.colon_return retval = new Oberon0Parser.colon_return();
        retval.start = input.LT(1);
        int colon_StartIndex = input.index();
        Object root_0 = null;

        Token COLON146=null;

        Object COLON146_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:184:7: ( COLON )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:184:9: COLON
            {
            root_0 = (Object)adaptor.nil();

            COLON146=(Token)match(input,COLON,FOLLOW_COLON_in_colon1621); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 38, colon_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "colon"

    public static class routinename_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "routinename"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:186:1: routinename : IDENT -> ^( ROUTINENAME IDENT ) ;
    public final Oberon0Parser.routinename_return routinename() throws RecognitionException {
        Oberon0Parser.routinename_return retval = new Oberon0Parser.routinename_return();
        retval.start = input.LT(1);
        int routinename_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT147=null;

        Object IDENT147_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:187:2: ( IDENT -> ^( ROUTINENAME IDENT ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:187:4: IDENT
            {
            IDENT147=(Token)match(input,IDENT,FOLLOW_IDENT_in_routinename1631); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT147);



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
            // 187:10: -> ^( ROUTINENAME IDENT )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:187:13: ^( ROUTINENAME IDENT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROUTINENAME, "ROUTINENAME"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 39, routinename_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "routinename"

    // $ANTLR start synpred15_Oberon0
    public final void synpred15_Oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:122:15: ( ifStatementPart ( elseifStatementPart )+ elseStatementPart END )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:122:15: ifStatementPart ( elseifStatementPart )+ elseStatementPart END
        {
        pushFollow(FOLLOW_ifStatementPart_in_synpred15_Oberon0979);
        ifStatementPart();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:122:31: ( elseifStatementPart )+
        int cnt33=0;
        loop33:
        do {
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ELSIF) ) {
                alt33=1;
            }


            switch (alt33) {
        	case 1 :
        	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:0:0: elseifStatementPart
        	    {
        	    pushFollow(FOLLOW_elseifStatementPart_in_synpred15_Oberon0981);
        	    elseifStatementPart();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt33 >= 1 ) break loop33;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(33, input);
                    throw eee;
            }
            cnt33++;
        } while (true);

        pushFollow(FOLLOW_elseStatementPart_in_synpred15_Oberon0989);
        elseStatementPart();

        state._fsp--;
        if (state.failed) return ;
        match(input,END,FOLLOW_END_in_synpred15_Oberon0991); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Oberon0

    // $ANTLR start synpred17_Oberon0
    public final void synpred17_Oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:127:6: ( ifStatementPart ( elseifStatementPart )+ END )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:127:6: ifStatementPart ( elseifStatementPart )+ END
        {
        pushFollow(FOLLOW_ifStatementPart_in_synpred17_Oberon01024);
        ifStatementPart();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:127:22: ( elseifStatementPart )+
        int cnt34=0;
        loop34:
        do {
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ELSIF) ) {
                alt34=1;
            }


            switch (alt34) {
        	case 1 :
        	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:0:0: elseifStatementPart
        	    {
        	    pushFollow(FOLLOW_elseifStatementPart_in_synpred17_Oberon01026);
        	    elseifStatementPart();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt34 >= 1 ) break loop34;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(34, input);
                    throw eee;
            }
            cnt34++;
        } while (true);

        match(input,END,FOLLOW_END_in_synpred17_Oberon01029); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Oberon0

    // $ANTLR start synpred18_Oberon0
    public final void synpred18_Oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:129:6: ( ifStatementPart elseStatementPart END )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:129:6: ifStatementPart elseStatementPart END
        {
        pushFollow(FOLLOW_ifStatementPart_in_synpred18_Oberon01051);
        ifStatementPart();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_elseStatementPart_in_synpred18_Oberon01053);
        elseStatementPart();

        state._fsp--;
        if (state.failed) return ;
        match(input,END,FOLLOW_END_in_synpred18_Oberon01055); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_Oberon0

    // $ANTLR start synpred19_Oberon0
    public final void synpred19_Oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:5: ( assignment )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:5: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred19_Oberon01138);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Oberon0

    // $ANTLR start synpred20_Oberon0
    public final void synpred20_Oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:18: ( procedureCall )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\Oberon0.g:137:18: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred20_Oberon01142);
        procedureCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_Oberon0

    // Delegated rules

    public final boolean synpred15_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
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
        "\1\67\1\0\11\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA17_transitionS = {
            "\4\4\1\2\1\3\24\uffff\1\1",
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
            return "137:4: ( assignment | procedureCall | ifStatement | whileStatement )?";
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
                        if ( (synpred19_Oberon0()) ) {s = 9;}

                        else if ( (synpred20_Oberon0()) ) {s = 10;}

                         
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
 

    public static final BitSet FOLLOW_module_in_oberonprogram461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module480 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_routinename_in_module482 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_module484 = new BitSet(new long[]{0x000003E040000000L});
    public static final BitSet FOLLOW_moduleBody_in_module486 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module488 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_module490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody513 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody516 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody518 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_moduleBody522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations546 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations549 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations552 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations560 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_declarations562 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration605 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_constDeclaration608 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration610 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_constDeclaration612 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_constDeclaration614 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_TYPEDECL_in_typeDeclaration644 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration647 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration649 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration651 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_typeDeclaration653 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations683 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations686 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_varDeclarations688 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_varDeclarations690 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_varDeclarations692 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration717 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_routinename_in_procedureDeclaration719 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration722 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_procedureDeclaration726 = new BitSet(new long[]{0x008003E000000000L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration728 = new BitSet(new long[]{0x0080020000000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration731 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody769 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody771 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_procedureBody773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_assignment792 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment794 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_assignment797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_actualParameters805 = new BitSet(new long[]{0x0180000008300300L});
    public static final BitSet FOLLOW_expression_in_actualParameters808 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_COMMA_in_actualParameters811 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_actualParameters813 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_actualParameters819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_procedureCall839 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStatementPart872 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatementPart874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_elseifStatementPart898 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_elseifStatementPart900 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_elseifStatementPart902 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_elseifStatementPart904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatementPart938 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatementPart940 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatementPart942 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatementPart944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatementPart_in_ifStatement979 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_elseifStatementPart_in_ifStatement981 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_elseStatementPart_in_ifStatement989 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatementPart_in_ifStatement1024 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_elseifStatementPart_in_ifStatement1026 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatementPart_in_ifStatement1051 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_elseStatementPart_in_ifStatement1053 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatementPart_in_ifStatement1077 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1099 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_whileStatement1101 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1103 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1105 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_whileStatement1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1160 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_semicolon_in_statementSequence1163 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1165 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IDENT_in_identList1175 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_comma_in_identList1178 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList1180 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1203 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_arrayType1205 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OF_in_arrayType1207 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_arrayType1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1233 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_colon_in_fieldList1235 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_fieldList1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1248 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1250 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_semicolon_in_recordType1253 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1255 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_recordType1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fpSection1297 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_fpSection1299 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection1319 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identList_in_fpSection1321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_fpSection1323 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_formalParameters1347 = new BitSet(new long[]{0x0080008000200000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1350 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_SEMICOLON_in_formalParameters1353 = new BitSet(new long[]{0x0080008000000000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1355 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_formalParameters1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector1385 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector1387 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_sqrExpression_in_selector1406 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_IDENT_in_identselector1430 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_selector_in_identselector1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_factor1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rndExpression_in_factor1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor1454 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_factor1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1465 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_term1468 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1485 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_simpleExpression1496 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1505 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_set_in_simpleExpression1508 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1521 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1532 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_set_in_expression1537 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQROPEN_in_sqrExpression1565 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_sqrExpression1567 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SQRCLOSE_in_sqrExpression1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_rndExpression1581 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_rndExpression1583 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_rndExpression1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_semicolon1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_comma1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_colon1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_routinename1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatementPart_in_synpred15_Oberon0979 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_elseifStatementPart_in_synpred15_Oberon0981 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_elseStatementPart_in_synpred15_Oberon0989 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_synpred15_Oberon0991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatementPart_in_synpred17_Oberon01024 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_elseifStatementPart_in_synpred17_Oberon01026 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_END_in_synpred17_Oberon01029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatementPart_in_synpred18_Oberon01051 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_elseStatementPart_in_synpred18_Oberon01053 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_synpred18_Oberon01055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred19_Oberon01138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred20_Oberon01142 = new BitSet(new long[]{0x0000000000000002L});

}