// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g 2011-01-24 15:44:32
package oberon0.grammar;
import oberon0.Oberon0AST;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MULTIPLY", "DIVIDE", "MOD", "AMPERSAND", "ADD", "SUBTRACT", "OR", "EQUALS", "HASH", "SMALLERTHEN", "SMALLEREQUAL", "GREATERTHEN", "GREATEREQUAL", "DOT", "COMMA", "COLON", "RNDOPEN", "RNDCLOSE", "SQROPEN", "SQRCLOSE", "OF", "THEN", "DO", "TILDE", "ASSIGN", "SEMICOLON", "END", "ELSE", "ELSIF", "IF", "WHILE", "ARRAY", "RECORD", "CONST", "TYPEDECL", "VAR", "PROCEDURE", "BEGIN", "MODULE", "PARAMETERS", "REFVAR", "BODY", "CONDITION", "TYPE", "NAME", "PROCEDURECALL", "SELECTOR", "IDENT", "INTEGER", "WS", "OPTWS"
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


        public Oberon0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Oberon0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[86+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:75:1: module : MODULE nameident semicolon moduleBody IDENT DOT EOF -> ^( MODULE nameident moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);
        int module_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token MODULE1=null;
        Token IDENT5=null;
        Token DOT6=null;
        Token EOF7=null;
        Oberon0Parser.nameident_return nameident2 = null;

        Oberon0Parser.semicolon_return semicolon3 = null;

        Oberon0Parser.moduleBody_return moduleBody4 = null;


        Oberon0AST MODULE1_tree=null;
        Oberon0AST IDENT5_tree=null;
        Oberon0AST DOT6_tree=null;
        Oberon0AST EOF7_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_nameident=new RewriteRuleSubtreeStream(adaptor,"rule nameident");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:75:8: ( MODULE nameident semicolon moduleBody IDENT DOT EOF -> ^( MODULE nameident moduleBody ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:75:10: MODULE nameident semicolon moduleBody IDENT DOT EOF
            {
            MODULE1=(Token)match(input,MODULE,FOLLOW_MODULE_in_module436); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE1);

            pushFollow(FOLLOW_nameident_in_module438);
            nameident2=nameident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nameident.add(nameident2.getTree());
            pushFollow(FOLLOW_semicolon_in_module440);
            semicolon3=semicolon();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_semicolon.add(semicolon3.getTree());
            pushFollow(FOLLOW_moduleBody_in_module442);
            moduleBody4=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody4.getTree());
            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_module444); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT5);

            DOT6=(Token)match(input,DOT,FOLLOW_DOT_in_module446); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT6);

            EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_module448); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF7);



            // AST REWRITE
            // elements: MODULE, moduleBody, nameident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Oberon0AST)adaptor.nil();
            // 76:4: -> ^( MODULE nameident moduleBody )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:76:7: ^( MODULE nameident moduleBody )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot(stream_MODULE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_nameident.nextTree());
                adaptor.addChild(root_1, stream_moduleBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, module_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "module"

    public static class moduleBody_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moduleBody"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:78:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
    public final Oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        Oberon0Parser.moduleBody_return retval = new Oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);
        int moduleBody_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token BEGIN9=null;
        Token END11=null;
        Oberon0Parser.declarations_return declarations8 = null;

        Oberon0Parser.statementSequence_return statementSequence10 = null;


        Oberon0AST BEGIN9_tree=null;
        Oberon0AST END11_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:79:2: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:79:4: declarations ( BEGIN statementSequence )? END
            {
            pushFollow(FOLLOW_declarations_in_moduleBody470);
            declarations8=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations8.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:79:17: ( BEGIN statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==BEGIN) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:79:18: BEGIN statementSequence
                    {
                    BEGIN9=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN9);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody475);
                    statementSequence10=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence10.getTree());

                    }
                    break;

            }

            END11=(Token)match(input,END,FOLLOW_END_in_moduleBody479); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END11);



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

            root_0 = (Oberon0AST)adaptor.nil();
            // 80:4: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:80:7: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:80:21: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:80:21: ^( BODY statementSequence )
                    {
                    Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                    root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_1);

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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, moduleBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "moduleBody"

    public static class declarations_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:82:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);
        int declarations_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Oberon0Parser.constDeclaration_return constDeclaration12 = null;

        Oberon0Parser.typeDeclaration_return typeDeclaration13 = null;

        Oberon0Parser.varDeclarations_return varDeclarations14 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration15 = null;

        Oberon0Parser.semicolon_return semicolon16 = null;


        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:83:2: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:83:4: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration semicolon )*
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:83:4: ( constDeclaration )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations503);
                    constDeclaration12=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration12.getTree());

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:83:22: ( typeDeclaration )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPEDECL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations506);
                    typeDeclaration13=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration13.getTree());

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:83:39: ( varDeclarations )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations509);
                    varDeclarations14=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations14.getTree());

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:84:3: ( procedureDeclaration semicolon )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==PROCEDURE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:84:4: procedureDeclaration semicolon
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations516);
            	    procedureDeclaration15=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration15.getTree());
            	    pushFollow(FOLLOW_semicolon_in_declarations518);
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



            // AST REWRITE
            // elements: varDeclarations, typeDeclaration, procedureDeclaration, constDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Oberon0AST)adaptor.nil();
            // 85:4: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:85:7: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:85:25: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:85:42: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:86:5: ( procedureDeclaration )*
                while ( stream_procedureDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_procedureDeclaration.nextTree());

                }
                stream_procedureDeclaration.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, declarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "declarations"

    public static class constDeclaration_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:88:1: constDeclaration : ( CONST ( nameident EQUALS expression semicolon )* ) -> ^( CONST ( nameident expression )* ) ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);
        int constDeclaration_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token CONST17=null;
        Token EQUALS19=null;
        Oberon0Parser.nameident_return nameident18 = null;

        Oberon0Parser.expression_return expression20 = null;

        Oberon0Parser.semicolon_return semicolon21 = null;


        Oberon0AST CONST17_tree=null;
        Oberon0AST EQUALS19_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_nameident=new RewriteRuleSubtreeStream(adaptor,"rule nameident");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:89:2: ( ( CONST ( nameident EQUALS expression semicolon )* ) -> ^( CONST ( nameident expression )* ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:89:4: ( CONST ( nameident EQUALS expression semicolon )* )
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:89:4: ( CONST ( nameident EQUALS expression semicolon )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:89:5: CONST ( nameident EQUALS expression semicolon )*
            {
            CONST17=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST17);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:89:11: ( nameident EQUALS expression semicolon )*
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
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:89:12: nameident EQUALS expression semicolon
            	    {
            	    pushFollow(FOLLOW_nameident_in_constDeclaration561);
            	    nameident18=nameident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_nameident.add(nameident18.getTree());
            	    EQUALS19=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration563); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS19);

            	    pushFollow(FOLLOW_expression_in_constDeclaration565);
            	    expression20=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression20.getTree());
            	    pushFollow(FOLLOW_semicolon_in_constDeclaration567);
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


            }



            // AST REWRITE
            // elements: expression, CONST, nameident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Oberon0AST)adaptor.nil();
            // 90:4: -> ^( CONST ( nameident expression )* )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:90:7: ^( CONST ( nameident expression )* )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:90:15: ( nameident expression )*
                while ( stream_expression.hasNext()||stream_nameident.hasNext() ) {
                    adaptor.addChild(root_1, stream_nameident.nextTree());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();
                stream_nameident.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, constDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constDeclaration"

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:92:1: typeDeclaration : ( TYPEDECL ( IDENT EQUALS type semicolon )* ) -> ^( TYPEDECL ( IDENT type )* ) ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token TYPEDECL22=null;
        Token IDENT23=null;
        Token EQUALS24=null;
        Oberon0Parser.type_return type25 = null;

        Oberon0Parser.semicolon_return semicolon26 = null;


        Oberon0AST TYPEDECL22_tree=null;
        Oberon0AST IDENT23_tree=null;
        Oberon0AST EQUALS24_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_TYPEDECL=new RewriteRuleTokenStream(adaptor,"token TYPEDECL");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:93:2: ( ( TYPEDECL ( IDENT EQUALS type semicolon )* ) -> ^( TYPEDECL ( IDENT type )* ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:93:4: ( TYPEDECL ( IDENT EQUALS type semicolon )* )
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:93:4: ( TYPEDECL ( IDENT EQUALS type semicolon )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:93:5: TYPEDECL ( IDENT EQUALS type semicolon )*
            {
            TYPEDECL22=(Token)match(input,TYPEDECL,FOLLOW_TYPEDECL_in_typeDeclaration600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPEDECL.add(TYPEDECL22);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:93:14: ( IDENT EQUALS type semicolon )*
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
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:93:15: IDENT EQUALS type semicolon
            	    {
            	    IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration603); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT23);

            	    EQUALS24=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration605); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS24);

            	    pushFollow(FOLLOW_type_in_typeDeclaration607);
            	    type25=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type25.getTree());
            	    pushFollow(FOLLOW_semicolon_in_typeDeclaration609);
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


            }



            // AST REWRITE
            // elements: IDENT, type, TYPEDECL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Oberon0AST)adaptor.nil();
            // 94:4: -> ^( TYPEDECL ( IDENT type )* )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:94:7: ^( TYPEDECL ( IDENT type )* )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot(stream_TYPEDECL.nextNode(), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:94:18: ( IDENT type )*
                while ( stream_IDENT.hasNext()||stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_IDENT.reset();
                stream_type.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, typeDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDeclaration"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:96:1: varDeclarations : ( VAR ( identList COLON type semicolon )* ) -> ( ^( VAR identList type ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);
        int varDeclarations_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token VAR27=null;
        Token COLON29=null;
        Oberon0Parser.identList_return identList28 = null;

        Oberon0Parser.type_return type30 = null;

        Oberon0Parser.semicolon_return semicolon31 = null;


        Oberon0AST VAR27_tree=null;
        Oberon0AST COLON29_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:97:2: ( ( VAR ( identList COLON type semicolon )* ) -> ( ^( VAR identList type ) )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:97:4: ( VAR ( identList COLON type semicolon )* )
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:97:4: ( VAR ( identList COLON type semicolon )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:97:5: VAR ( identList COLON type semicolon )*
            {
            VAR27=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations642); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR27);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:97:9: ( identList COLON type semicolon )*
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
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:97:10: identList COLON type semicolon
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations645);
            	    identList28=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList28.getTree());
            	    COLON29=(Token)match(input,COLON,FOLLOW_COLON_in_varDeclarations647); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COLON.add(COLON29);

            	    pushFollow(FOLLOW_type_in_varDeclarations649);
            	    type30=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type30.getTree());
            	    pushFollow(FOLLOW_semicolon_in_varDeclarations651);
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

            root_0 = (Oberon0AST)adaptor.nil();
            // 98:4: -> ( ^( VAR identList type ) )*
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:98:7: ( ^( VAR identList type ) )*
                while ( stream_type.hasNext()||stream_VAR.hasNext()||stream_identList.hasNext() ) {
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:98:7: ^( VAR identList type )
                    {
                    Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                    root_1 = (Oberon0AST)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_identList.nextTree());
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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, varDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDeclarations"

    public static class procedureDeclaration_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:100:1: procedureDeclaration : PROCEDURE nameident ( formalParameters )? SEMICOLON declarations ( procedureBody )? IDENT -> ^( PROCEDURE nameident ( formalParameters )? declarations ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);
        int procedureDeclaration_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token PROCEDURE32=null;
        Token SEMICOLON35=null;
        Token IDENT38=null;
        Oberon0Parser.nameident_return nameident33 = null;

        Oberon0Parser.formalParameters_return formalParameters34 = null;

        Oberon0Parser.declarations_return declarations36 = null;

        Oberon0Parser.procedureBody_return procedureBody37 = null;


        Oberon0AST PROCEDURE32_tree=null;
        Oberon0AST SEMICOLON35_tree=null;
        Oberon0AST IDENT38_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_nameident=new RewriteRuleSubtreeStream(adaptor,"rule nameident");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:101:2: ( PROCEDURE nameident ( formalParameters )? SEMICOLON declarations ( procedureBody )? IDENT -> ^( PROCEDURE nameident ( formalParameters )? declarations ( procedureBody )? ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:101:4: PROCEDURE nameident ( formalParameters )? SEMICOLON declarations ( procedureBody )? IDENT
            {
            PROCEDURE32=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE32);

            pushFollow(FOLLOW_nameident_in_procedureDeclaration679);
            nameident33=nameident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_nameident.add(nameident33.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:101:24: ( formalParameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RNDOPEN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:101:25: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration682);
                    formalParameters34=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters34.getTree());

                    }
                    break;

            }

            SEMICOLON35=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_procedureDeclaration686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON35);

            pushFollow(FOLLOW_declarations_in_procedureDeclaration688);
            declarations36=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations36.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:101:67: ( procedureBody )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==BEGIN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:101:68: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration691);
                    procedureBody37=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody37.getTree());

                    }
                    break;

            }

            IDENT38=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT38);



            // AST REWRITE
            // elements: declarations, PROCEDURE, procedureBody, formalParameters, nameident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Oberon0AST)adaptor.nil();
            // 102:4: -> ^( PROCEDURE nameident ( formalParameters )? declarations ( procedureBody )? )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:102:7: ^( PROCEDURE nameident ( formalParameters )? declarations ( procedureBody )? )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_nameident.nextTree());
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:102:29: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                adaptor.addChild(root_1, stream_declarations.nextTree());
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:102:62: ( procedureBody )?
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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, procedureDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "procedureDeclaration"

    public static class procedureBody_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:104:1: procedureBody : BEGIN statementSequence END -> ^( BODY statementSequence ) ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);
        int procedureBody_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token BEGIN39=null;
        Token END41=null;
        Oberon0Parser.statementSequence_return statementSequence40 = null;


        Oberon0AST BEGIN39_tree=null;
        Oberon0AST END41_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:105:2: ( BEGIN statementSequence END -> ^( BODY statementSequence ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:105:4: BEGIN statementSequence END
            {
            BEGIN39=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody732); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN39);

            pushFollow(FOLLOW_statementSequence_in_procedureBody734);
            statementSequence40=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence40.getTree());
            END41=(Token)match(input,END,FOLLOW_END_in_procedureBody736); if (state.failed) return retval; 
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

            root_0 = (Oberon0AST)adaptor.nil();
            // 106:4: -> ^( BODY statementSequence )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:106:7: ^( BODY statementSequence )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_statementSequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, procedureBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "procedureBody"

    public static class assignment_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:108:1: assignment : identselector ASSIGN expression ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);
        int assignment_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token ASSIGN43=null;
        Oberon0Parser.identselector_return identselector42 = null;

        Oberon0Parser.expression_return expression44 = null;


        Oberon0AST ASSIGN43_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:109:2: ( identselector ASSIGN expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:109:4: identselector ASSIGN expression
            {
            root_0 = (Oberon0AST)adaptor.nil();

            pushFollow(FOLLOW_identselector_in_assignment756);
            identselector42=identselector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identselector42.getTree());
            ASSIGN43=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment758); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN43_tree = (Oberon0AST)adaptor.create(ASSIGN43);
            root_0 = (Oberon0AST)adaptor.becomeRoot(ASSIGN43_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_assignment761);
            expression44=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression44.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, assignment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class actualParameters_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:111:1: actualParameters : RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE -> ^( PARAMETERS ( expression )+ ) ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);
        int actualParameters_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token RNDOPEN45=null;
        Token COMMA47=null;
        Token RNDCLOSE49=null;
        Oberon0Parser.expression_return expression46 = null;

        Oberon0Parser.expression_return expression48 = null;


        Oberon0AST RNDOPEN45_tree=null;
        Oberon0AST COMMA47_tree=null;
        Oberon0AST RNDCLOSE49_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:112:2: ( RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE -> ^( PARAMETERS ( expression )+ ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:112:4: RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE
            {
            RNDOPEN45=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_actualParameters770); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN45);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:112:12: ( expression ( COMMA expression )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=ADD && LA12_0<=SUBTRACT)||LA12_0==RNDOPEN||LA12_0==TILDE||(LA12_0>=IDENT && LA12_0<=INTEGER)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:112:13: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters773);
                    expression46=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression46.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:112:24: ( COMMA expression )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:112:25: COMMA expression
                    	    {
                    	    COMMA47=(Token)match(input,COMMA,FOLLOW_COMMA_in_actualParameters776); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA47);

                    	    pushFollow(FOLLOW_expression_in_actualParameters778);
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


                    }
                    break;

            }

            RNDCLOSE49=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_actualParameters784); if (state.failed) return retval; 
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

            root_0 = (Oberon0AST)adaptor.nil();
            // 113:4: -> ^( PARAMETERS ( expression )+ )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:113:7: ^( PARAMETERS ( expression )+ )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, actualParameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "actualParameters"

    public static class procedureCall_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:115:1: procedureCall : identselector ( actualParameters )? -> ^( PROCEDURECALL identselector ( actualParameters )? ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);
        int procedureCall_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Oberon0Parser.identselector_return identselector50 = null;

        Oberon0Parser.actualParameters_return actualParameters51 = null;


        RewriteRuleSubtreeStream stream_identselector=new RewriteRuleSubtreeStream(adaptor,"rule identselector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:116:2: ( identselector ( actualParameters )? -> ^( PROCEDURECALL identselector ( actualParameters )? ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:116:4: identselector ( actualParameters )?
            {
            pushFollow(FOLLOW_identselector_in_procedureCall805);
            identselector50=identselector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identselector.add(identselector50.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:116:18: ( actualParameters )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RNDOPEN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:116:19: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall808);
                    actualParameters51=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters51.getTree());

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

            root_0 = (Oberon0AST)adaptor.nil();
            // 117:4: -> ^( PROCEDURECALL identselector ( actualParameters )? )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:117:7: ^( PROCEDURECALL identselector ( actualParameters )? )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_1);

                adaptor.addChild(root_1, stream_identselector.nextTree());
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:117:37: ( actualParameters )?
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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, procedureCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:120:1: ifStatement : ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ) );
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Oberon0AST root_0 = null;

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
        Oberon0Parser.expression_return expression53 = null;

        Oberon0Parser.statementSequence_return statementSequence55 = null;

        Oberon0Parser.expression_return expression57 = null;

        Oberon0Parser.statementSequence_return statementSequence59 = null;

        Oberon0Parser.statementSequence_return statementSequence61 = null;

        Oberon0Parser.expression_return expression64 = null;

        Oberon0Parser.statementSequence_return statementSequence66 = null;

        Oberon0Parser.expression_return expression68 = null;

        Oberon0Parser.statementSequence_return statementSequence70 = null;

        Oberon0Parser.expression_return expression73 = null;

        Oberon0Parser.statementSequence_return statementSequence75 = null;

        Oberon0Parser.statementSequence_return statementSequence77 = null;

        Oberon0Parser.expression_return expression80 = null;

        Oberon0Parser.statementSequence_return statementSequence82 = null;


        Oberon0AST IF52_tree=null;
        Oberon0AST THEN54_tree=null;
        Oberon0AST ELSIF56_tree=null;
        Oberon0AST THEN58_tree=null;
        Oberon0AST ELSE60_tree=null;
        Oberon0AST END62_tree=null;
        Oberon0AST IF63_tree=null;
        Oberon0AST THEN65_tree=null;
        Oberon0AST ELSIF67_tree=null;
        Oberon0AST THEN69_tree=null;
        Oberon0AST END71_tree=null;
        Oberon0AST IF72_tree=null;
        Oberon0AST THEN74_tree=null;
        Oberon0AST ELSE76_tree=null;
        Oberon0AST END78_tree=null;
        Oberon0AST IF79_tree=null;
        Oberon0AST THEN81_tree=null;
        Oberon0AST END83_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:120:12: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ) )
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
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:120:14: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
                    {
                    IF52=(Token)match(input,IF,FOLLOW_IF_in_ifStatement837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF52);

                    pushFollow(FOLLOW_expression_in_ifStatement839);
                    expression53=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());
                    THEN54=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN54);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement843);
                    statementSequence55=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence55.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:121:3: ( ELSIF expression THEN statementSequence )+
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
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:121:4: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF56=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement849); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF56);

                    	    pushFollow(FOLLOW_expression_in_ifStatement851);
                    	    expression57=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());
                    	    THEN58=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement853); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN58);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement855);
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
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:122:3: ( ELSE statementSequence )
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:122:4: ELSE statementSequence
                    {
                    ELSE60=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE60);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement865);
                    statementSequence61=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence61.getTree());

                    }

                    END62=(Token)match(input,END,FOLLOW_END_in_ifStatement868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END62);



                    // AST REWRITE
                    // elements: statementSequence, ELSE, expression, statementSequence, expression, statementSequence, IF, ELSIF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Oberon0AST)adaptor.nil();
                    // 123:4: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:123:7: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                        root_1 = (Oberon0AST)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:123:12: ^( CONDITION expression )
                        {
                        Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                        root_2 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:123:36: ^( BODY statementSequence )
                        {
                        Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                        root_2 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_expression.hasNext()||stream_statementSequence.hasNext()||stream_ELSIF.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext()||stream_statementSequence.hasNext()||stream_ELSIF.hasNext() ) {
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:124:5: ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) )
                            {
                            Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                            root_2 = (Oberon0AST)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:124:13: ^( CONDITION expression )
                            {
                            Oberon0AST root_3 = (Oberon0AST)adaptor.nil();
                            root_3 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(CONDITION, "CONDITION"), root_3);

                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:124:37: ^( BODY statementSequence )
                            {
                            Oberon0AST root_3 = (Oberon0AST)adaptor.nil();
                            root_3 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_3);

                            adaptor.addChild(root_3, stream_statementSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        stream_statementSequence.reset();
                        stream_ELSIF.reset();
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:125:5: ^( ELSE ^( BODY statementSequence ) )
                        {
                        Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                        root_2 = (Oberon0AST)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:125:12: ^( BODY statementSequence )
                        {
                        Oberon0AST root_3 = (Oberon0AST)adaptor.nil();
                        root_3 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_3);

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
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:126:5: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
                    {
                    IF63=(Token)match(input,IF,FOLLOW_IF_in_ifStatement933); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF63);

                    pushFollow(FOLLOW_expression_in_ifStatement935);
                    expression64=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression64.getTree());
                    THEN65=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN65);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement939);
                    statementSequence66=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence66.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:127:3: ( ELSIF expression THEN statementSequence )+
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
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:127:4: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF67=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement945); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF67);

                    	    pushFollow(FOLLOW_expression_in_ifStatement947);
                    	    expression68=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression68.getTree());
                    	    THEN69=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement949); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN69);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement951);
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
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    END71=(Token)match(input,END,FOLLOW_END_in_ifStatement955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END71);



                    // AST REWRITE
                    // elements: statementSequence, IF, expression, ELSIF, statementSequence, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Oberon0AST)adaptor.nil();
                    // 128:4: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:128:7: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) ) )+ )
                        {
                        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                        root_1 = (Oberon0AST)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:128:12: ^( CONDITION expression )
                        {
                        Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                        root_2 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:128:36: ^( BODY statementSequence )
                        {
                        Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                        root_2 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_statementSequence.hasNext()||stream_ELSIF.hasNext()||stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_statementSequence.hasNext()||stream_ELSIF.hasNext()||stream_expression.hasNext() ) {
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:129:5: ^( ELSIF ^( CONDITION expression ) ^( BODY statementSequence ) )
                            {
                            Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                            root_2 = (Oberon0AST)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:129:13: ^( CONDITION expression )
                            {
                            Oberon0AST root_3 = (Oberon0AST)adaptor.nil();
                            root_3 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(CONDITION, "CONDITION"), root_3);

                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:129:37: ^( BODY statementSequence )
                            {
                            Oberon0AST root_3 = (Oberon0AST)adaptor.nil();
                            root_3 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_3);

                            adaptor.addChild(root_3, stream_statementSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_statementSequence.reset();
                        stream_ELSIF.reset();
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:130:5: IF expression THEN statementSequence ( ELSE statementSequence ) END
                    {
                    IF72=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF72);

                    pushFollow(FOLLOW_expression_in_ifStatement1007);
                    expression73=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression73.getTree());
                    THEN74=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN74);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement1011);
                    statementSequence75=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence75.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:131:3: ( ELSE statementSequence )
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:131:4: ELSE statementSequence
                    {
                    ELSE76=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement1017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE76);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement1019);
                    statementSequence77=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence77.getTree());

                    }

                    END78=(Token)match(input,END,FOLLOW_END_in_ifStatement1022); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END78);



                    // AST REWRITE
                    // elements: statementSequence, statementSequence, IF, expression, ELSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Oberon0AST)adaptor.nil();
                    // 132:4: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:132:7: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                        root_1 = (Oberon0AST)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:132:12: ^( CONDITION expression )
                        {
                        Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                        root_2 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:132:35: ^( BODY statementSequence )
                        {
                        Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                        root_2 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:133:5: ^( ELSE ^( BODY statementSequence ) )
                        {
                        Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                        root_2 = (Oberon0AST)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:133:12: ^( BODY statementSequence )
                        {
                        Oberon0AST root_3 = (Oberon0AST)adaptor.nil();
                        root_3 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_3);

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
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:134:5: IF expression THEN statementSequence END
                    {
                    IF79=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF79);

                    pushFollow(FOLLOW_expression_in_ifStatement1067);
                    expression80=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression80.getTree());
                    THEN81=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1069); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN81);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement1071);
                    statementSequence82=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence82.getTree());
                    END83=(Token)match(input,END,FOLLOW_END_in_ifStatement1073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END83);



                    // AST REWRITE
                    // elements: expression, IF, statementSequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Oberon0AST)adaptor.nil();
                    // 135:4: -> ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:135:7: ^( IF ^( CONDITION expression ) ^( BODY statementSequence ) )
                        {
                        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                        root_1 = (Oberon0AST)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:135:12: ^( CONDITION expression )
                        {
                        Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                        root_2 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:135:36: ^( BODY statementSequence )
                        {
                        Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                        root_2 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_2);

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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, ifStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:137:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);
        int whileStatement_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token WHILE84=null;
        Token DO86=null;
        Token END88=null;
        Oberon0Parser.expression_return expression85 = null;

        Oberon0Parser.statementSequence_return statementSequence87 = null;


        Oberon0AST WHILE84_tree=null;
        Oberon0AST DO86_tree=null;
        Oberon0AST END88_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:137:15: ( WHILE expression DO statementSequence END -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:137:18: WHILE expression DO statementSequence END
            {
            WHILE84=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1102); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE84);

            pushFollow(FOLLOW_expression_in_whileStatement1104);
            expression85=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression85.getTree());
            DO86=(Token)match(input,DO,FOLLOW_DO_in_whileStatement1106); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO86);

            pushFollow(FOLLOW_statementSequence_in_whileStatement1108);
            statementSequence87=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence87.getTree());
            END88=(Token)match(input,END,FOLLOW_END_in_whileStatement1110); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END88);



            // AST REWRITE
            // elements: WHILE, expression, statementSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Oberon0AST)adaptor.nil();
            // 138:5: -> ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:138:8: ^( WHILE ^( CONDITION expression ) ^( BODY statementSequence ) )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:138:16: ^( CONDITION expression )
                {
                Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                root_2 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:138:40: ^( BODY statementSequence )
                {
                Oberon0AST root_2 = (Oberon0AST)adaptor.nil();
                root_2 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(BODY, "BODY"), root_2);

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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, whileStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class statement_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:140:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Oberon0Parser.assignment_return assignment89 = null;

        Oberon0Parser.procedureCall_return procedureCall90 = null;

        Oberon0Parser.ifStatement_return ifStatement91 = null;

        Oberon0Parser.whileStatement_return whileStatement92 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:2: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (Oberon0AST)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt17=5;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1142);
                    assignment89=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment89.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:18: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1146);
                    procedureCall90=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall90.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:34: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1150);
                    ifStatement91=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement91.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:48: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1154);
                    whileStatement92=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement92.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementSequence_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:143:1: statementSequence : statement ( semicolon statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);
        int statementSequence_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Oberon0Parser.statement_return statement93 = null;

        Oberon0Parser.semicolon_return semicolon94 = null;

        Oberon0Parser.statement_return statement95 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:144:2: ( statement ( semicolon statement )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:144:4: statement ( semicolon statement )*
            {
            root_0 = (Oberon0AST)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementSequence1166);
            statement93=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement93.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:144:14: ( semicolon statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==SEMICOLON) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:144:15: semicolon statement
            	    {
            	    pushFollow(FOLLOW_semicolon_in_statementSequence1169);
            	    semicolon94=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, semicolon94.getTree());
            	    pushFollow(FOLLOW_statement_in_statementSequence1171);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, statementSequence_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statementSequence"

    public static class identList_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:146:1: identList : IDENT ( comma IDENT )* -> ^( NAME ( IDENT )+ ) ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);
        int identList_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token IDENT96=null;
        Token IDENT98=null;
        Oberon0Parser.comma_return comma97 = null;


        Oberon0AST IDENT96_tree=null;
        Oberon0AST IDENT98_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_comma=new RewriteRuleSubtreeStream(adaptor,"rule comma");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:147:2: ( IDENT ( comma IDENT )* -> ^( NAME ( IDENT )+ ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:147:4: IDENT ( comma IDENT )*
            {
            IDENT96=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList1182); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT96);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:147:10: ( comma IDENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:147:11: comma IDENT
            	    {
            	    pushFollow(FOLLOW_comma_in_identList1185);
            	    comma97=comma();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_comma.add(comma97.getTree());
            	    IDENT98=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList1187); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT98);


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

            root_0 = (Oberon0AST)adaptor.nil();
            // 147:25: -> ^( NAME ( IDENT )+ )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:148:4: ^( NAME ( IDENT )+ )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(NAME, "NAME"), root_1);

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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, identList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "identList"

    public static class arrayType_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:150:1: arrayType : ARRAY expression OF type -> ^( ARRAY expression type ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);
        int arrayType_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token ARRAY99=null;
        Token OF101=null;
        Oberon0Parser.expression_return expression100 = null;

        Oberon0Parser.type_return type102 = null;


        Oberon0AST ARRAY99_tree=null;
        Oberon0AST OF101_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:151:2: ( ARRAY expression OF type -> ^( ARRAY expression type ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:151:4: ARRAY expression OF type
            {
            ARRAY99=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1211); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY99);

            pushFollow(FOLLOW_expression_in_arrayType1213);
            expression100=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression100.getTree());
            OF101=(Token)match(input,OF,FOLLOW_OF_in_arrayType1215); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF101);

            pushFollow(FOLLOW_type_in_arrayType1217);
            type102=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type102.getTree());


            // AST REWRITE
            // elements: ARRAY, expression, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Oberon0AST)adaptor.nil();
            // 152:4: -> ^( ARRAY expression type )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:152:7: ^( ARRAY expression type )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, arrayType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayType"

    public static class fieldList_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:154:1: fieldList : ( identList colon type )? ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);
        int fieldList_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Oberon0Parser.identList_return identList103 = null;

        Oberon0Parser.colon_return colon104 = null;

        Oberon0Parser.type_return type105 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:155:2: ( ( identList colon type )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:155:4: ( identList colon type )?
            {
            root_0 = (Oberon0AST)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:155:4: ( identList colon type )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:155:5: identList colon type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList1243);
                    identList103=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identList103.getTree());
                    pushFollow(FOLLOW_colon_in_fieldList1245);
                    colon104=colon();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, colon104.getTree());
                    pushFollow(FOLLOW_type_in_fieldList1247);
                    type105=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type105.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, fieldList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldList"

    public static class recordType_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:157:1: recordType : RECORD fieldList ( semicolon fieldList )* END -> ^( RECORD ( fieldList )+ ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);
        int recordType_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token RECORD106=null;
        Token END110=null;
        Oberon0Parser.fieldList_return fieldList107 = null;

        Oberon0Parser.semicolon_return semicolon108 = null;

        Oberon0Parser.fieldList_return fieldList109 = null;


        Oberon0AST RECORD106_tree=null;
        Oberon0AST END110_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        RewriteRuleSubtreeStream stream_semicolon=new RewriteRuleSubtreeStream(adaptor,"rule semicolon");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:158:2: ( RECORD fieldList ( semicolon fieldList )* END -> ^( RECORD ( fieldList )+ ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:158:4: RECORD fieldList ( semicolon fieldList )* END
            {
            RECORD106=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1259); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD106);

            pushFollow(FOLLOW_fieldList_in_recordType1261);
            fieldList107=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList107.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:158:21: ( semicolon fieldList )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==SEMICOLON) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:158:22: semicolon fieldList
            	    {
            	    pushFollow(FOLLOW_semicolon_in_recordType1264);
            	    semicolon108=semicolon();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_semicolon.add(semicolon108.getTree());
            	    pushFollow(FOLLOW_fieldList_in_recordType1266);
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

            END110=(Token)match(input,END,FOLLOW_END_in_recordType1270); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END110);



            // AST REWRITE
            // elements: fieldList, RECORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Oberon0AST)adaptor.nil();
            // 159:4: -> ^( RECORD ( fieldList )+ )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:159:7: ^( RECORD ( fieldList )+ )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, recordType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "recordType"

    public static class type_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:161:1: type : ( IDENT -> ^( TYPE IDENT ) | arrayType -> ^( TYPE arrayType ) | recordType -> ^( TYPE recordType ) ) ;
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token IDENT111=null;
        Oberon0Parser.arrayType_return arrayType112 = null;

        Oberon0Parser.recordType_return recordType113 = null;


        Oberon0AST IDENT111_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleSubtreeStream stream_arrayType=new RewriteRuleSubtreeStream(adaptor,"rule arrayType");
        RewriteRuleSubtreeStream stream_recordType=new RewriteRuleSubtreeStream(adaptor,"rule recordType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:161:6: ( ( IDENT -> ^( TYPE IDENT ) | arrayType -> ^( TYPE arrayType ) | recordType -> ^( TYPE recordType ) ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:161:8: ( IDENT -> ^( TYPE IDENT ) | arrayType -> ^( TYPE arrayType ) | recordType -> ^( TYPE recordType ) )
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:161:8: ( IDENT -> ^( TYPE IDENT ) | arrayType -> ^( TYPE arrayType ) | recordType -> ^( TYPE recordType ) )
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
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:161:9: IDENT
                    {
                    IDENT111=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1291); if (state.failed) return retval; 
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

                    root_0 = (Oberon0AST)adaptor.nil();
                    // 161:15: -> ^( TYPE IDENT )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:161:18: ^( TYPE IDENT )
                        {
                        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                        root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(TYPE, "TYPE"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:162:5: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type1306);
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

                    root_0 = (Oberon0AST)adaptor.nil();
                    // 162:15: -> ^( TYPE arrayType )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:162:18: ^( TYPE arrayType )
                        {
                        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                        root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(TYPE, "TYPE"), root_1);

                        adaptor.addChild(root_1, stream_arrayType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:163:5: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type1320);
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

                    root_0 = (Oberon0AST)adaptor.nil();
                    // 163:16: -> ^( TYPE recordType )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:163:19: ^( TYPE recordType )
                        {
                        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                        root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(TYPE, "TYPE"), root_1);

                        adaptor.addChild(root_1, stream_recordType.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class fpSection_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fpSection"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:165:1: fpSection : ( identList COLON type -> ^( REFVAR identList type ) | VAR identList COLON type -> ^( VAR identList type ) );
    public final Oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        Oberon0Parser.fpSection_return retval = new Oberon0Parser.fpSection_return();
        retval.start = input.LT(1);
        int fpSection_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token COLON115=null;
        Token VAR117=null;
        Token COLON119=null;
        Oberon0Parser.identList_return identList114 = null;

        Oberon0Parser.type_return type116 = null;

        Oberon0Parser.identList_return identList118 = null;

        Oberon0Parser.type_return type120 = null;


        Oberon0AST COLON115_tree=null;
        Oberon0AST VAR117_tree=null;
        Oberon0AST COLON119_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:166:2: ( identList COLON type -> ^( REFVAR identList type ) | VAR identList COLON type -> ^( VAR identList type ) )
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
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:166:4: identList COLON type
                    {
                    pushFollow(FOLLOW_identList_in_fpSection1339);
                    identList114=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList114.getTree());
                    COLON115=(Token)match(input,COLON,FOLLOW_COLON_in_fpSection1341); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON115);

                    pushFollow(FOLLOW_type_in_fpSection1343);
                    type116=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type116.getTree());


                    // AST REWRITE
                    // elements: type, identList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Oberon0AST)adaptor.nil();
                    // 167:4: -> ^( REFVAR identList type )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:167:7: ^( REFVAR identList type )
                        {
                        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                        root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(REFVAR, "REFVAR"), root_1);

                        adaptor.addChild(root_1, stream_identList.nextTree());
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:168:4: VAR identList COLON type
                    {
                    VAR117=(Token)match(input,VAR,FOLLOW_VAR_in_fpSection1361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR117);

                    pushFollow(FOLLOW_identList_in_fpSection1363);
                    identList118=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList118.getTree());
                    COLON119=(Token)match(input,COLON,FOLLOW_COLON_in_fpSection1365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON119);

                    pushFollow(FOLLOW_type_in_fpSection1367);
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

                    root_0 = (Oberon0AST)adaptor.nil();
                    // 169:4: -> ^( VAR identList type )
                    {
                        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:169:7: ^( VAR identList type )
                        {
                        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                        root_1 = (Oberon0AST)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, fpSection_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fpSection"

    public static class formalParameters_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:171:1: formalParameters : RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE -> ^( PARAMETERS ( ( fpSection )+ )? ) ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);
        int formalParameters_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token RNDOPEN121=null;
        Token SEMICOLON123=null;
        Token RNDCLOSE125=null;
        Oberon0Parser.fpSection_return fpSection122 = null;

        Oberon0Parser.fpSection_return fpSection124 = null;


        Oberon0AST RNDOPEN121_tree=null;
        Oberon0AST SEMICOLON123_tree=null;
        Oberon0AST RNDCLOSE125_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:172:2: ( RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE -> ^( PARAMETERS ( ( fpSection )+ )? ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:172:4: RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE
            {
            RNDOPEN121=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_formalParameters1390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN121);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:172:12: ( fpSection ( SEMICOLON fpSection )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==VAR||LA25_0==IDENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:172:13: fpSection ( SEMICOLON fpSection )*
                    {
                    pushFollow(FOLLOW_fpSection_in_formalParameters1393);
                    fpSection122=fpSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fpSection.add(fpSection122.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:172:23: ( SEMICOLON fpSection )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==SEMICOLON) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:172:24: SEMICOLON fpSection
                    	    {
                    	    SEMICOLON123=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_formalParameters1396); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON123);

                    	    pushFollow(FOLLOW_fpSection_in_formalParameters1398);
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


                    }
                    break;

            }

            RNDCLOSE125=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_formalParameters1404); if (state.failed) return retval; 
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

            root_0 = (Oberon0AST)adaptor.nil();
            // 173:4: -> ^( PARAMETERS ( ( fpSection )+ )? )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:173:7: ^( PARAMETERS ( ( fpSection )+ )? )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:173:20: ( ( fpSection )+ )?
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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, formalParameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class selector_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:175:1: selector : ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )* ;
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);
        int selector_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token DOT126=null;
        Token IDENT127=null;
        Oberon0Parser.sqrExpression_return sqrExpression128 = null;


        Oberon0AST DOT126_tree=null;
        Oberon0AST IDENT127_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_sqrExpression=new RewriteRuleSubtreeStream(adaptor,"rule sqrExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:175:9: ( ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:175:12: ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )*
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:175:12: ( DOT IDENT -> ^( SELECTOR IDENT ) | sqrExpression -> ^( SELECTOR sqrExpression ) )*
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
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:175:13: DOT IDENT
            	    {
            	    DOT126=(Token)match(input,DOT,FOLLOW_DOT_in_selector1432); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT126);

            	    IDENT127=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1434); if (state.failed) return retval; 
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

            	    root_0 = (Oberon0AST)adaptor.nil();
            	    // 176:4: -> ^( SELECTOR IDENT )
            	    {
            	        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:176:7: ^( SELECTOR IDENT )
            	        {
            	        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
            	        root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(SELECTOR, "SELECTOR"), root_1);

            	        adaptor.addChild(root_1, stream_IDENT.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:177:5: sqrExpression
            	    {
            	    pushFollow(FOLLOW_sqrExpression_in_selector1453);
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

            	    root_0 = (Oberon0AST)adaptor.nil();
            	    // 178:4: -> ^( SELECTOR sqrExpression )
            	    {
            	        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:178:7: ^( SELECTOR sqrExpression )
            	        {
            	        Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
            	        root_1 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(SELECTOR, "SELECTOR"), root_1);

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

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, selector_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class identselector_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identselector"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:181:1: identselector : IDENT selector ;
    public final Oberon0Parser.identselector_return identselector() throws RecognitionException {
        Oberon0Parser.identselector_return retval = new Oberon0Parser.identselector_return();
        retval.start = input.LT(1);
        int identselector_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token IDENT129=null;
        Oberon0Parser.selector_return selector130 = null;


        Oberon0AST IDENT129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:182:2: ( IDENT selector )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:182:4: IDENT selector
            {
            root_0 = (Oberon0AST)adaptor.nil();

            IDENT129=(Token)match(input,IDENT,FOLLOW_IDENT_in_identselector1478); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT129_tree = (Oberon0AST)adaptor.create(IDENT129);
            root_0 = (Oberon0AST)adaptor.becomeRoot(IDENT129_tree, root_0);
            }
            pushFollow(FOLLOW_selector_in_identselector1481);
            selector130=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selector130.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, identselector_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "identselector"

    public static class factor_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:184:1: factor : ( identselector | number | rndExpression | TILDE factor ) ;
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);
        int factor_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token TILDE134=null;
        Oberon0Parser.identselector_return identselector131 = null;

        Oberon0Parser.number_return number132 = null;

        Oberon0Parser.rndExpression_return rndExpression133 = null;

        Oberon0Parser.factor_return factor135 = null;


        Oberon0AST TILDE134_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:184:9: ( ( identselector | number | rndExpression | TILDE factor ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:184:11: ( identselector | number | rndExpression | TILDE factor )
            {
            root_0 = (Oberon0AST)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:184:11: ( identselector | number | rndExpression | TILDE factor )
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
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:184:12: identselector
                    {
                    pushFollow(FOLLOW_identselector_in_factor1491);
                    identselector131=identselector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identselector131.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:184:28: number
                    {
                    pushFollow(FOLLOW_number_in_factor1495);
                    number132=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number132.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:184:37: rndExpression
                    {
                    pushFollow(FOLLOW_rndExpression_in_factor1499);
                    rndExpression133=rndExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rndExpression133.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:184:53: TILDE factor
                    {
                    TILDE134=(Token)match(input,TILDE,FOLLOW_TILDE_in_factor1503); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TILDE134_tree = (Oberon0AST)adaptor.create(TILDE134);
                    adaptor.addChild(root_0, TILDE134_tree);
                    }
                    pushFollow(FOLLOW_factor_in_factor1505);
                    factor135=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor135.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, factor_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class term_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:186:1: term : factor ( ( MULTIPLY | DIVIDE | MOD | AMPERSAND ) factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);
        int term_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token set137=null;
        Oberon0Parser.factor_return factor136 = null;

        Oberon0Parser.factor_return factor138 = null;


        Oberon0AST set137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:186:7: ( factor ( ( MULTIPLY | DIVIDE | MOD | AMPERSAND ) factor )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:186:9: factor ( ( MULTIPLY | DIVIDE | MOD | AMPERSAND ) factor )*
            {
            root_0 = (Oberon0AST)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term1515);
            factor136=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor136.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:186:16: ( ( MULTIPLY | DIVIDE | MOD | AMPERSAND ) factor )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=MULTIPLY && LA28_0<=AMPERSAND)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:186:17: ( MULTIPLY | DIVIDE | MOD | AMPERSAND ) factor
            	    {
            	    set137=(Token)input.LT(1);
            	    set137=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULTIPLY && input.LA(1)<=AMPERSAND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(set137), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term1535);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, term_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:188:1: simpleExpression : ( ADD | SUBTRACT )? term ( ( ADD | SUBTRACT | OR ) term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);
        int simpleExpression_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token set139=null;
        Token set141=null;
        Oberon0Parser.term_return term140 = null;

        Oberon0Parser.term_return term142 = null;


        Oberon0AST set139_tree=null;
        Oberon0AST set141_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:189:2: ( ( ADD | SUBTRACT )? term ( ( ADD | SUBTRACT | OR ) term )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:189:4: ( ADD | SUBTRACT )? term ( ( ADD | SUBTRACT | OR ) term )*
            {
            root_0 = (Oberon0AST)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:189:4: ( ADD | SUBTRACT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=ADD && LA29_0<=SUBTRACT)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:
                    {
                    set139=(Token)input.LT(1);
                    if ( (input.LA(1)>=ADD && input.LA(1)<=SUBTRACT) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Oberon0AST)adaptor.create(set139));
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

            pushFollow(FOLLOW_term_in_simpleExpression1556);
            term140=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term140.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:189:27: ( ( ADD | SUBTRACT | OR ) term )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=ADD && LA30_0<=OR)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:189:28: ( ADD | SUBTRACT | OR ) term
            	    {
            	    set141=(Token)input.LT(1);
            	    set141=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=OR) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(set141), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression1572);
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


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, simpleExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:191:1: expression : simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )? ;
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token set144=null;
        Oberon0Parser.simpleExpression_return simpleExpression143 = null;

        Oberon0Parser.simpleExpression_return simpleExpression145 = null;


        Oberon0AST set144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:192:2: ( simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:192:4: simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )?
            {
            root_0 = (Oberon0AST)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression1584);
            simpleExpression143=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression143.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:193:3: ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=EQUALS && LA31_0<=GREATEREQUAL)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:193:4: ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression
                    {
                    set144=(Token)input.LT(1);
                    set144=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALS && input.LA(1)<=GREATEREQUAL) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Oberon0AST)adaptor.becomeRoot((Oberon0AST)adaptor.create(set144), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleExpression_in_expression1607);
                    simpleExpression145=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression145.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class sqrExpression_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sqrExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:196:1: sqrExpression : SQROPEN expression SQRCLOSE -> expression ;
    public final Oberon0Parser.sqrExpression_return sqrExpression() throws RecognitionException {
        Oberon0Parser.sqrExpression_return retval = new Oberon0Parser.sqrExpression_return();
        retval.start = input.LT(1);
        int sqrExpression_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token SQROPEN146=null;
        Token SQRCLOSE148=null;
        Oberon0Parser.expression_return expression147 = null;


        Oberon0AST SQROPEN146_tree=null;
        Oberon0AST SQRCLOSE148_tree=null;
        RewriteRuleTokenStream stream_SQROPEN=new RewriteRuleTokenStream(adaptor,"token SQROPEN");
        RewriteRuleTokenStream stream_SQRCLOSE=new RewriteRuleTokenStream(adaptor,"token SQRCLOSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:197:2: ( SQROPEN expression SQRCLOSE -> expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:197:4: SQROPEN expression SQRCLOSE
            {
            SQROPEN146=(Token)match(input,SQROPEN,FOLLOW_SQROPEN_in_sqrExpression1618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SQROPEN.add(SQROPEN146);

            pushFollow(FOLLOW_expression_in_sqrExpression1620);
            expression147=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression147.getTree());
            SQRCLOSE148=(Token)match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_sqrExpression1622); if (state.failed) return retval; 
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

            root_0 = (Oberon0AST)adaptor.nil();
            // 197:32: -> expression
            {
                adaptor.addChild(root_0, stream_expression.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, sqrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sqrExpression"

    public static class rndExpression_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rndExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:198:1: rndExpression : RNDOPEN expression RNDCLOSE -> expression ;
    public final Oberon0Parser.rndExpression_return rndExpression() throws RecognitionException {
        Oberon0Parser.rndExpression_return retval = new Oberon0Parser.rndExpression_return();
        retval.start = input.LT(1);
        int rndExpression_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token RNDOPEN149=null;
        Token RNDCLOSE151=null;
        Oberon0Parser.expression_return expression150 = null;


        Oberon0AST RNDOPEN149_tree=null;
        Oberon0AST RNDCLOSE151_tree=null;
        RewriteRuleTokenStream stream_RNDOPEN=new RewriteRuleTokenStream(adaptor,"token RNDOPEN");
        RewriteRuleTokenStream stream_RNDCLOSE=new RewriteRuleTokenStream(adaptor,"token RNDCLOSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:199:2: ( RNDOPEN expression RNDCLOSE -> expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:199:4: RNDOPEN expression RNDCLOSE
            {
            RNDOPEN149=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_rndExpression1634); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RNDOPEN.add(RNDOPEN149);

            pushFollow(FOLLOW_expression_in_rndExpression1636);
            expression150=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression150.getTree());
            RNDCLOSE151=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_rndExpression1638); if (state.failed) return retval; 
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

            root_0 = (Oberon0AST)adaptor.nil();
            // 199:31: -> expression
            {
                adaptor.addChild(root_0, stream_expression.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, rndExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "rndExpression"

    public static class nameident_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameident"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:201:1: nameident : IDENT -> ^( IDENT ) ;
    public final Oberon0Parser.nameident_return nameident() throws RecognitionException {
        Oberon0Parser.nameident_return retval = new Oberon0Parser.nameident_return();
        retval.start = input.LT(1);
        int nameident_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token IDENT152=null;

        Oberon0AST IDENT152_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:202:2: ( IDENT -> ^( IDENT ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:202:4: IDENT
            {
            IDENT152=(Token)match(input,IDENT,FOLLOW_IDENT_in_nameident1650); if (state.failed) return retval; 
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

            root_0 = (Oberon0AST)adaptor.nil();
            // 202:10: -> ^( IDENT )
            {
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:202:13: ^( IDENT )
                {
                Oberon0AST root_1 = (Oberon0AST)adaptor.nil();
                root_1 = (Oberon0AST)adaptor.becomeRoot(stream_IDENT.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, nameident_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nameident"

    public static class number_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:204:1: number : INTEGER ;
    public final Oberon0Parser.number_return number() throws RecognitionException {
        Oberon0Parser.number_return retval = new Oberon0Parser.number_return();
        retval.start = input.LT(1);
        int number_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token INTEGER153=null;

        Oberon0AST INTEGER153_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:204:8: ( INTEGER )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:204:10: INTEGER
            {
            root_0 = (Oberon0AST)adaptor.nil();

            INTEGER153=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER153_tree = (Oberon0AST)adaptor.create(INTEGER153);
            adaptor.addChild(root_0, INTEGER153_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, number_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class semicolon_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "semicolon"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:206:1: semicolon : SEMICOLON ;
    public final Oberon0Parser.semicolon_return semicolon() throws RecognitionException {
        Oberon0Parser.semicolon_return retval = new Oberon0Parser.semicolon_return();
        retval.start = input.LT(1);
        int semicolon_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token SEMICOLON154=null;

        Oberon0AST SEMICOLON154_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:207:2: ( SEMICOLON )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:207:4: SEMICOLON
            {
            root_0 = (Oberon0AST)adaptor.nil();

            SEMICOLON154=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_semicolon1674); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, semicolon_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "semicolon"

    public static class comma_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comma"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:209:1: comma : COMMA ;
    public final Oberon0Parser.comma_return comma() throws RecognitionException {
        Oberon0Parser.comma_return retval = new Oberon0Parser.comma_return();
        retval.start = input.LT(1);
        int comma_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token COMMA155=null;

        Oberon0AST COMMA155_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:209:7: ( COMMA )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:209:9: COMMA
            {
            root_0 = (Oberon0AST)adaptor.nil();

            COMMA155=(Token)match(input,COMMA,FOLLOW_COMMA_in_comma1684); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, comma_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "comma"

    public static class colon_return extends ParserRuleReturnScope {
        Oberon0AST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "colon"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:211:1: colon : COLON ;
    public final Oberon0Parser.colon_return colon() throws RecognitionException {
        Oberon0Parser.colon_return retval = new Oberon0Parser.colon_return();
        retval.start = input.LT(1);
        int colon_StartIndex = input.index();
        Oberon0AST root_0 = null;

        Token COLON156=null;

        Oberon0AST COLON156_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:211:7: ( COLON )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:211:9: COLON
            {
            root_0 = (Oberon0AST)adaptor.nil();

            COLON156=(Token)match(input,COLON,FOLLOW_COLON_in_colon1693); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Oberon0AST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Oberon0AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, colon_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "colon"

    // $ANTLR start synpred15_Oberon0
    public final void synpred15_Oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:120:14: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:120:14: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred15_Oberon0837); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred15_Oberon0839);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred15_Oberon0841); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred15_Oberon0843);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:121:3: ( ELSIF expression THEN statementSequence )+
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
        	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:121:4: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred15_Oberon0849); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred15_Oberon0851);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred15_Oberon0853); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred15_Oberon0855);
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
                    throw eee;
            }
            cnt33++;
        } while (true);

        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:122:3: ( ELSE statementSequence )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:122:4: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred15_Oberon0863); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred15_Oberon0865);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred15_Oberon0868); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Oberon0

    // $ANTLR start synpred17_Oberon0
    public final void synpred17_Oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:126:5: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:126:5: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
        {
        match(input,IF,FOLLOW_IF_in_synpred17_Oberon0933); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred17_Oberon0935);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred17_Oberon0937); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred17_Oberon0939);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:127:3: ( ELSIF expression THEN statementSequence )+
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
        	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:127:4: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred17_Oberon0945); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred17_Oberon0947);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred17_Oberon0949); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred17_Oberon0951);
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
                    throw eee;
            }
            cnt34++;
        } while (true);

        match(input,END,FOLLOW_END_in_synpred17_Oberon0955); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Oberon0

    // $ANTLR start synpred18_Oberon0
    public final void synpred18_Oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:130:5: ( IF expression THEN statementSequence ( ELSE statementSequence ) END )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:130:5: IF expression THEN statementSequence ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred18_Oberon01005); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred18_Oberon01007);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred18_Oberon01009); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred18_Oberon01011);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:131:3: ( ELSE statementSequence )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:131:4: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred18_Oberon01017); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred18_Oberon01019);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred18_Oberon01022); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_Oberon0

    // $ANTLR start synpred19_Oberon0
    public final void synpred19_Oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:5: ( assignment )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:5: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred19_Oberon01142);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Oberon0

    // $ANTLR start synpred20_Oberon0
    public final void synpred20_Oberon0_fragment() throws RecognitionException {   
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:18: ( procedureCall )
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\oberon0\\grammar\\Oberon0.g:141:18: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred20_Oberon01146);
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
            return "141:4: ( assignment | procedureCall | ifStatement | whileStatement )?";
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
 

    public static final BitSet FOLLOW_MODULE_in_module436 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_nameident_in_module438 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_module440 = new BitSet(new long[]{0x000003E040000000L});
    public static final BitSet FOLLOW_moduleBody_in_module442 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module444 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_module446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody470 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody473 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody475 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_moduleBody479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations503 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations506 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations509 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations516 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_declarations518 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration558 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_nameident_in_constDeclaration561 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration563 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_constDeclaration565 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_constDeclaration567 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_TYPEDECL_in_typeDeclaration600 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration603 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration605 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration607 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_typeDeclaration609 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations642 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations645 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_varDeclarations647 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_varDeclarations649 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_semicolon_in_varDeclarations651 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration677 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_nameident_in_procedureDeclaration679 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration682 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_procedureDeclaration686 = new BitSet(new long[]{0x000803E000000000L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration688 = new BitSet(new long[]{0x0008020000000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration691 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody732 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody734 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_procedureBody736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_assignment756 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment758 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_assignment761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_actualParameters770 = new BitSet(new long[]{0x0018000008300300L});
    public static final BitSet FOLLOW_expression_in_actualParameters773 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_COMMA_in_actualParameters776 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_actualParameters778 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_actualParameters784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_procedureCall805 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement837 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement839 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement841 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement843 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement849 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement851 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement853 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement855 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement863 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement865 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement933 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement935 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement937 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement939 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement945 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement947 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement949 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement951 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_END_in_ifStatement955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1005 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1007 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1009 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1011 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1017 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1019 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1065 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1067 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1069 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1071 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1102 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_whileStatement1104 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1106 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1108 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_whileStatement1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1166 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_semicolon_in_statementSequence1169 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1171 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IDENT_in_identList1182 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_comma_in_identList1185 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList1187 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1211 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_arrayType1213 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OF_in_arrayType1215 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_arrayType1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1243 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_colon_in_fieldList1245 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_fieldList1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1259 = new BitSet(new long[]{0x0008000060000000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1261 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_semicolon_in_recordType1264 = new BitSet(new long[]{0x0008000060000000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1266 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_recordType1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fpSection1339 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_fpSection1341 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection1361 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_identList_in_fpSection1363 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_fpSection1365 = new BitSet(new long[]{0x0008001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_formalParameters1390 = new BitSet(new long[]{0x0008008000200000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1393 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_SEMICOLON_in_formalParameters1396 = new BitSet(new long[]{0x0008008000000000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1398 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_formalParameters1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector1432 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector1434 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_sqrExpression_in_selector1453 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_IDENT_in_identselector1478 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_selector_in_identselector1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identselector_in_factor1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rndExpression_in_factor1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor1503 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_factor_in_factor1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1515 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_term1518 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_factor_in_term1535 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_set_in_simpleExpression1547 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1556 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_set_in_simpleExpression1559 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1572 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1584 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_set_in_expression1589 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQROPEN_in_sqrExpression1618 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_sqrExpression1620 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SQRCLOSE_in_sqrExpression1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_rndExpression1634 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_rndExpression1636 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_rndExpression1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_nameident1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_semicolon1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_comma1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_colon1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred15_Oberon0837 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred15_Oberon0839 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred15_Oberon0841 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred15_Oberon0843 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred15_Oberon0849 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred15_Oberon0851 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred15_Oberon0853 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred15_Oberon0855 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred15_Oberon0863 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred15_Oberon0865 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_synpred15_Oberon0868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred17_Oberon0933 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred17_Oberon0935 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred17_Oberon0937 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred17_Oberon0939 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred17_Oberon0945 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred17_Oberon0947 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred17_Oberon0949 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred17_Oberon0951 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_END_in_synpred17_Oberon0955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred18_Oberon01005 = new BitSet(new long[]{0x0018000008100300L});
    public static final BitSet FOLLOW_expression_in_synpred18_Oberon01007 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_synpred18_Oberon01009 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred18_Oberon01011 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred18_Oberon01017 = new BitSet(new long[]{0x0008000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred18_Oberon01019 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_synpred18_Oberon01022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred19_Oberon01142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred20_Oberon01146 = new BitSet(new long[]{0x0000000000000002L});

}