// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g 2011-02-18 00:15:28

package com.douwekasemier.oberon0.core;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "BEGIN", "END", "CONST", "TYPE", "VAR", "ARRAY", "RECORD", "PROCEDURE", "WHILE", "IF", "THEN", "ELSIF", "ELSE", "WITH", "EQUALS", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "PLUS", "MINUS", "OR", "NOT", "MULT", "DIV", "MOD", "AND", "ACTUALS", "ARRAYSELECTOR", "ASSIGN", "CALL", "CONSTANTS", "DECLARATIONS", "EXPRESSION", "FIELD", "FORMALPARAMETER", "FORMALPARAMETERS", "IDENT_SELECT", "IDENTIFIERS", "IFSTATEMENT", "LITERAL", "MODULEBODY", "PROCEDUREBODY", "PROCEDURES", "RECORDSELECTOR", "SELECTORS", "STATEMENTS", "TYPES", "VARIABLES", "IDENTIFIER", "INTEGER", "WHITESPACE", "';'", "'.'", "'('", "')'", "':'", "','", "'['", "']'", "':='", "'DO'", "'OF'"
    };
    public static final int EOF=-1;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int MODULE=4;
    public static final int BEGIN=5;
    public static final int END=6;
    public static final int CONST=7;
    public static final int TYPE=8;
    public static final int VAR=9;
    public static final int ARRAY=10;
    public static final int RECORD=11;
    public static final int PROCEDURE=12;
    public static final int WHILE=13;
    public static final int IF=14;
    public static final int THEN=15;
    public static final int ELSIF=16;
    public static final int ELSE=17;
    public static final int WITH=18;
    public static final int EQUALS=19;
    public static final int NOT_EQUALS=20;
    public static final int GT=21;
    public static final int GTE=22;
    public static final int LT=23;
    public static final int LTE=24;
    public static final int PLUS=25;
    public static final int MINUS=26;
    public static final int OR=27;
    public static final int NOT=28;
    public static final int MULT=29;
    public static final int DIV=30;
    public static final int MOD=31;
    public static final int AND=32;
    public static final int ACTUALS=33;
    public static final int ARRAYSELECTOR=34;
    public static final int ASSIGN=35;
    public static final int CALL=36;
    public static final int CONSTANTS=37;
    public static final int DECLARATIONS=38;
    public static final int EXPRESSION=39;
    public static final int FIELD=40;
    public static final int FORMALPARAMETER=41;
    public static final int FORMALPARAMETERS=42;
    public static final int IDENT_SELECT=43;
    public static final int IDENTIFIERS=44;
    public static final int IFSTATEMENT=45;
    public static final int LITERAL=46;
    public static final int MODULEBODY=47;
    public static final int PROCEDUREBODY=48;
    public static final int PROCEDURES=49;
    public static final int RECORDSELECTOR=50;
    public static final int SELECTORS=51;
    public static final int STATEMENTS=52;
    public static final int TYPES=53;
    public static final int VARIABLES=54;
    public static final int IDENTIFIER=55;
    public static final int INTEGER=56;
    public static final int WHITESPACE=57;

    // delegates
    // delegators


        public Oberon0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Oberon0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g"; }


    public static class module_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:78:1: module : MODULE identifier ';' moduleBody '.' EOF -> ^( MODULE identifier moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MODULE1=null;
        Token char_literal3=null;
        Token char_literal5=null;
        Token EOF6=null;
        Oberon0Parser.identifier_return identifier2 = null;

        Oberon0Parser.moduleBody_return moduleBody4 = null;


        CommonTree MODULE1_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree EOF6_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:79:3: ( MODULE identifier ';' moduleBody '.' EOF -> ^( MODULE identifier moduleBody ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:79:5: MODULE identifier ';' moduleBody '.' EOF
            {
            MODULE1=(Token)match(input,MODULE,FOLLOW_MODULE_in_module636); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE1);

            pushFollow(FOLLOW_identifier_in_module638);
            identifier2=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier2.getTree());
            char_literal3=(Token)match(input,58,FOLLOW_58_in_module640); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(char_literal3);

            pushFollow(FOLLOW_moduleBody_in_module642);
            moduleBody4=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody4.getTree());
            char_literal5=(Token)match(input,59,FOLLOW_59_in_module644); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal5);

            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_module646); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF6);



            // AST REWRITE
            // elements: moduleBody, MODULE, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 80:3: -> ^( MODULE identifier moduleBody )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:80:6: ^( MODULE identifier moduleBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_MODULE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                adaptor.addChild(root_1, stream_moduleBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "module"

    public static class moduleBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moduleBody"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:82:1: moduleBody : declarations ( BEGIN statementSequence )? END identifier -> ^( DECLARATIONS ( declarations )? ) ^( STATEMENTS ( statementSequence )? ) ;
    public final Oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        Oberon0Parser.moduleBody_return retval = new Oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN8=null;
        Token END10=null;
        Oberon0Parser.declarations_return declarations7 = null;

        Oberon0Parser.statementSequence_return statementSequence9 = null;

        Oberon0Parser.identifier_return identifier11 = null;


        CommonTree BEGIN8_tree=null;
        CommonTree END10_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:83:3: ( declarations ( BEGIN statementSequence )? END identifier -> ^( DECLARATIONS ( declarations )? ) ^( STATEMENTS ( statementSequence )? ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:83:5: declarations ( BEGIN statementSequence )? END identifier
            {
            pushFollow(FOLLOW_declarations_in_moduleBody668);
            declarations7=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations7.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:83:18: ( BEGIN statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==BEGIN) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:83:19: BEGIN statementSequence
                    {
                    BEGIN8=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN8);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody673);
                    statementSequence9=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence9.getTree());

                    }
                    break;

            }

            END10=(Token)match(input,END,FOLLOW_END_in_moduleBody677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END10);

            pushFollow(FOLLOW_identifier_in_moduleBody679);
            identifier11=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier11.getTree());


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

            root_0 = (CommonTree)adaptor.nil();
            // 84:3: -> ^( DECLARATIONS ( declarations )? ) ^( STATEMENTS ( statementSequence )? )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:84:7: ^( DECLARATIONS ( declarations )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:84:22: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:84:37: ^( STATEMENTS ( statementSequence )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENTS, "STATEMENTS"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:84:50: ( statementSequence )?
                if ( stream_statementSequence.hasNext() ) {
                    adaptor.addChild(root_1, stream_statementSequence.nextTree());

                }
                stream_statementSequence.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "moduleBody"

    public static class declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:86:1: declarations : ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations )? -> ^( CONSTANTS ( constantDeclarations )? ) ^( TYPES ( typeDeclarations )? ) ^( VARIABLES ( varDeclarations )? ) ^( PROCEDURES ( procedureDeclarations )? ) ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.constantDeclarations_return constantDeclarations12 = null;

        Oberon0Parser.typeDeclarations_return typeDeclarations13 = null;

        Oberon0Parser.varDeclarations_return varDeclarations14 = null;

        Oberon0Parser.procedureDeclarations_return procedureDeclarations15 = null;


        RewriteRuleSubtreeStream stream_procedureDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclarations");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_constantDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclarations");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:87:3: ( ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations )? -> ^( CONSTANTS ( constantDeclarations )? ) ^( TYPES ( typeDeclarations )? ) ^( VARIABLES ( varDeclarations )? ) ^( PROCEDURES ( procedureDeclarations )? ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:87:5: ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations )?
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:87:5: ( constantDeclarations )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: constantDeclarations
                    {
                    pushFollow(FOLLOW_constantDeclarations_in_declarations709);
                    constantDeclarations12=constantDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constantDeclarations.add(constantDeclarations12.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:87:27: ( typeDeclarations )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: typeDeclarations
                    {
                    pushFollow(FOLLOW_typeDeclarations_in_declarations712);
                    typeDeclarations13=typeDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclarations.add(typeDeclarations13.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:87:45: ( varDeclarations )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations715);
                    varDeclarations14=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations14.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:87:62: ( procedureDeclarations )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case PROCEDURE:
                    {
                    alt5=1;
                    }
                    break;
                case BEGIN:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5_Oberon0()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case END:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (synpred5_Oberon0()) ) {
                        alt5=1;
                    }
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: procedureDeclarations
                    {
                    pushFollow(FOLLOW_procedureDeclarations_in_declarations718);
                    procedureDeclarations15=procedureDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureDeclarations.add(procedureDeclarations15.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: constantDeclarations, varDeclarations, procedureDeclarations, typeDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 88:3: -> ^( CONSTANTS ( constantDeclarations )? ) ^( TYPES ( typeDeclarations )? ) ^( VARIABLES ( varDeclarations )? ) ^( PROCEDURES ( procedureDeclarations )? )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:6: ^( CONSTANTS ( constantDeclarations )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONSTANTS, "CONSTANTS"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:18: ( constantDeclarations )?
                if ( stream_constantDeclarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_constantDeclarations.nextTree());

                }
                stream_constantDeclarations.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:41: ^( TYPES ( typeDeclarations )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPES, "TYPES"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:49: ( typeDeclarations )?
                if ( stream_typeDeclarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeDeclarations.nextTree());

                }
                stream_typeDeclarations.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:68: ^( VARIABLES ( varDeclarations )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLES, "VARIABLES"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:80: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:98: ^( PROCEDURES ( procedureDeclarations )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURES, "PROCEDURES"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:111: ( procedureDeclarations )?
                if ( stream_procedureDeclarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_procedureDeclarations.nextTree());

                }
                stream_procedureDeclarations.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarations"

    public static class constantDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:90:1: constantDeclarations : CONST ( identifier '=' expression ';' )* -> ( ^( CONST identifier expression ) )* ;
    public final Oberon0Parser.constantDeclarations_return constantDeclarations() throws RecognitionException {
        Oberon0Parser.constantDeclarations_return retval = new Oberon0Parser.constantDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST16=null;
        Token char_literal18=null;
        Token char_literal20=null;
        Oberon0Parser.identifier_return identifier17 = null;

        Oberon0Parser.expression_return expression19 = null;


        CommonTree CONST16_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:91:3: ( CONST ( identifier '=' expression ';' )* -> ( ^( CONST identifier expression ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:91:5: CONST ( identifier '=' expression ';' )*
            {
            CONST16=(Token)match(input,CONST,FOLLOW_CONST_in_constantDeclarations761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST16);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:91:11: ( identifier '=' expression ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENTIFIER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:91:12: identifier '=' expression ';'
            	    {
            	    pushFollow(FOLLOW_identifier_in_constantDeclarations764);
            	    identifier17=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier17.getTree());
            	    char_literal18=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constantDeclarations766); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal18);

            	    pushFollow(FOLLOW_expression_in_constantDeclarations768);
            	    expression19=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression19.getTree());
            	    char_literal20=(Token)match(input,58,FOLLOW_58_in_constantDeclarations770); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal20);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: identifier, expression, CONST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 92:3: -> ( ^( CONST identifier expression ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:92:6: ( ^( CONST identifier expression ) )*
                while ( stream_identifier.hasNext()||stream_expression.hasNext()||stream_CONST.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:92:6: ^( CONST identifier expression )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_identifier.nextTree());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_identifier.reset();
                stream_expression.reset();
                stream_CONST.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constantDeclarations"

    public static class typeDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:94:1: typeDeclarations : TYPE ( identifier '=' type ';' )* -> ( ^( TYPE identifier type ) )* ;
    public final Oberon0Parser.typeDeclarations_return typeDeclarations() throws RecognitionException {
        Oberon0Parser.typeDeclarations_return retval = new Oberon0Parser.typeDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE21=null;
        Token char_literal23=null;
        Token char_literal25=null;
        Oberon0Parser.identifier_return identifier22 = null;

        Oberon0Parser.type_return type24 = null;


        CommonTree TYPE21_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree char_literal25_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:95:3: ( TYPE ( identifier '=' type ';' )* -> ( ^( TYPE identifier type ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:95:5: TYPE ( identifier '=' type ';' )*
            {
            TYPE21=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclarations795); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE21);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:95:10: ( identifier '=' type ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENTIFIER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:95:11: identifier '=' type ';'
            	    {
            	    pushFollow(FOLLOW_identifier_in_typeDeclarations798);
            	    identifier22=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier22.getTree());
            	    char_literal23=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclarations800); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal23);

            	    pushFollow(FOLLOW_type_in_typeDeclarations802);
            	    type24=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type24.getTree());
            	    char_literal25=(Token)match(input,58,FOLLOW_58_in_typeDeclarations804); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal25);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



            // AST REWRITE
            // elements: type, identifier, TYPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 96:3: -> ( ^( TYPE identifier type ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:96:6: ( ^( TYPE identifier type ) )*
                while ( stream_type.hasNext()||stream_identifier.hasNext()||stream_TYPE.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:96:6: ^( TYPE identifier type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_identifier.nextTree());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_identifier.reset();
                stream_TYPE.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeDeclarations"

    public static class procedureDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:98:1: procedureDeclarations : ( procedureHeading ';' procedureBody ';' )* -> ( ^( PROCEDURE procedureHeading procedureBody ) )* ;
    public final Oberon0Parser.procedureDeclarations_return procedureDeclarations() throws RecognitionException {
        Oberon0Parser.procedureDeclarations_return retval = new Oberon0Parser.procedureDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal27=null;
        Token char_literal29=null;
        Oberon0Parser.procedureHeading_return procedureHeading26 = null;

        Oberon0Parser.procedureBody_return procedureBody28 = null;


        CommonTree char_literal27_tree=null;
        CommonTree char_literal29_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:99:3: ( ( procedureHeading ';' procedureBody ';' )* -> ( ^( PROCEDURE procedureHeading procedureBody ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:99:5: ( procedureHeading ';' procedureBody ';' )*
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:99:5: ( procedureHeading ';' procedureBody ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==PROCEDURE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:99:6: procedureHeading ';' procedureBody ';'
            	    {
            	    pushFollow(FOLLOW_procedureHeading_in_procedureDeclarations830);
            	    procedureHeading26=procedureHeading();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureHeading.add(procedureHeading26.getTree());
            	    char_literal27=(Token)match(input,58,FOLLOW_58_in_procedureDeclarations832); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal27);

            	    pushFollow(FOLLOW_procedureBody_in_procedureDeclarations834);
            	    procedureBody28=procedureBody();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody28.getTree());
            	    char_literal29=(Token)match(input,58,FOLLOW_58_in_procedureDeclarations836); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal29);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: procedureBody, procedureHeading
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 100:3: -> ( ^( PROCEDURE procedureHeading procedureBody ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:100:6: ( ^( PROCEDURE procedureHeading procedureBody ) )*
                while ( stream_procedureBody.hasNext()||stream_procedureHeading.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:100:6: ^( PROCEDURE procedureHeading procedureBody )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE, "PROCEDURE"), root_1);

                    adaptor.addChild(root_1, stream_procedureHeading.nextTree());
                    adaptor.addChild(root_1, stream_procedureBody.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_procedureBody.reset();
                stream_procedureHeading.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureDeclarations"

    public static class procedureHeading_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureHeading"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:102:1: procedureHeading : PROCEDURE identifier ( formalParameters )? -> identifier ^( FORMALPARAMETERS ( formalParameters )? ) ;
    public final Oberon0Parser.procedureHeading_return procedureHeading() throws RecognitionException {
        Oberon0Parser.procedureHeading_return retval = new Oberon0Parser.procedureHeading_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE30=null;
        Oberon0Parser.identifier_return identifier31 = null;

        Oberon0Parser.formalParameters_return formalParameters32 = null;


        CommonTree PROCEDURE30_tree=null;
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:103:3: ( PROCEDURE identifier ( formalParameters )? -> identifier ^( FORMALPARAMETERS ( formalParameters )? ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:103:5: PROCEDURE identifier ( formalParameters )?
            {
            PROCEDURE30=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureHeading861); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE30);

            pushFollow(FOLLOW_identifier_in_procedureHeading863);
            identifier31=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier31.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:103:26: ( formalParameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==60) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading865);
                    formalParameters32=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters32.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: identifier, formalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:5: -> identifier ^( FORMALPARAMETERS ( formalParameters )? )
            {
                adaptor.addChild(root_0, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:104:19: ^( FORMALPARAMETERS ( formalParameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMALPARAMETERS, "FORMALPARAMETERS"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:104:38: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureHeading"

    public static class formalParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:106:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' -> ( fpSection )+ ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal33=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Oberon0Parser.fpSection_return fpSection34 = null;

        Oberon0Parser.fpSection_return fpSection36 = null;


        CommonTree char_literal33_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal37_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:107:3: ( '(' ( fpSection ( ';' fpSection )* )? ')' -> ( fpSection )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:107:5: '(' ( fpSection ( ';' fpSection )* )? ')'
            {
            char_literal33=(Token)match(input,60,FOLLOW_60_in_formalParameters891); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_60.add(char_literal33);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:107:9: ( fpSection ( ';' fpSection )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==VAR||LA11_0==IDENTIFIER) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:107:10: fpSection ( ';' fpSection )*
                    {
                    pushFollow(FOLLOW_fpSection_in_formalParameters894);
                    fpSection34=fpSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fpSection.add(fpSection34.getTree());
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:107:20: ( ';' fpSection )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==58) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:107:21: ';' fpSection
                    	    {
                    	    char_literal35=(Token)match(input,58,FOLLOW_58_in_formalParameters897); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_58.add(char_literal35);

                    	    pushFollow(FOLLOW_fpSection_in_formalParameters899);
                    	    fpSection36=fpSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fpSection.add(fpSection36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal37=(Token)match(input,61,FOLLOW_61_in_formalParameters905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal37);



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

            root_0 = (CommonTree)adaptor.nil();
            // 108:3: -> ( fpSection )+
            {
                if ( !(stream_fpSection.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fpSection.hasNext() ) {
                    adaptor.addChild(root_0, stream_fpSection.nextTree());

                }
                stream_fpSection.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class fpSection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fpSection"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:110:1: fpSection : ( 'VAR' )? identifierList ':' type -> ^( FORMALPARAMETER ( 'VAR' )? type identifierList ) ;
    public final Oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        Oberon0Parser.fpSection_return retval = new Oberon0Parser.fpSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal38=null;
        Token char_literal40=null;
        Oberon0Parser.identifierList_return identifierList39 = null;

        Oberon0Parser.type_return type41 = null;


        CommonTree string_literal38_tree=null;
        CommonTree char_literal40_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:111:3: ( ( 'VAR' )? identifierList ':' type -> ^( FORMALPARAMETER ( 'VAR' )? type identifierList ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:111:5: ( 'VAR' )? identifierList ':' type
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:111:5: ( 'VAR' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==VAR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: 'VAR'
                    {
                    string_literal38=(Token)match(input,VAR,FOLLOW_VAR_in_fpSection923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(string_literal38);


                    }
                    break;

            }

            pushFollow(FOLLOW_identifierList_in_fpSection926);
            identifierList39=identifierList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifierList.add(identifierList39.getTree());
            char_literal40=(Token)match(input,62,FOLLOW_62_in_fpSection928); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(char_literal40);

            pushFollow(FOLLOW_type_in_fpSection930);
            type41=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type41.getTree());


            // AST REWRITE
            // elements: identifierList, VAR, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 112:3: -> ^( FORMALPARAMETER ( 'VAR' )? type identifierList )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:112:6: ^( FORMALPARAMETER ( 'VAR' )? type identifierList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMALPARAMETER, "FORMALPARAMETER"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:112:24: ( 'VAR' )?
                if ( stream_VAR.hasNext() ) {
                    adaptor.addChild(root_1, stream_VAR.nextNode());

                }
                stream_VAR.reset();
                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_identifierList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fpSection"

    public static class procedureBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:114:1: procedureBody : declarations ( 'BEGIN' statementSequence )? 'END' identifier -> ^( DECLARATIONS ( declarations )? ) ^( STATEMENTS ( statementSequence )? ) ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal43=null;
        Token string_literal45=null;
        Oberon0Parser.declarations_return declarations42 = null;

        Oberon0Parser.statementSequence_return statementSequence44 = null;

        Oberon0Parser.identifier_return identifier46 = null;


        CommonTree string_literal43_tree=null;
        CommonTree string_literal45_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:115:3: ( declarations ( 'BEGIN' statementSequence )? 'END' identifier -> ^( DECLARATIONS ( declarations )? ) ^( STATEMENTS ( statementSequence )? ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:115:5: declarations ( 'BEGIN' statementSequence )? 'END' identifier
            {
            pushFollow(FOLLOW_declarations_in_procedureBody957);
            declarations42=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations42.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:115:18: ( 'BEGIN' statementSequence )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==BEGIN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:115:19: 'BEGIN' statementSequence
                    {
                    string_literal43=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody960); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(string_literal43);

                    pushFollow(FOLLOW_statementSequence_in_procedureBody962);
                    statementSequence44=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence44.getTree());

                    }
                    break;

            }

            string_literal45=(Token)match(input,END,FOLLOW_END_in_procedureBody966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal45);

            pushFollow(FOLLOW_identifier_in_procedureBody968);
            identifier46=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier46.getTree());


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

            root_0 = (CommonTree)adaptor.nil();
            // 116:3: -> ^( DECLARATIONS ( declarations )? ) ^( STATEMENTS ( statementSequence )? )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:116:6: ^( DECLARATIONS ( declarations )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:116:21: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:116:36: ^( STATEMENTS ( statementSequence )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENTS, "STATEMENTS"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:116:49: ( statementSequence )?
                if ( stream_statementSequence.hasNext() ) {
                    adaptor.addChild(root_1, stream_statementSequence.nextTree());

                }
                stream_statementSequence.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureBody"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:118:1: varDeclarations : VAR ( identifierList ':' type ';' )* -> ( ^( VAR type identifierList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR47=null;
        Token char_literal49=null;
        Token char_literal51=null;
        Oberon0Parser.identifierList_return identifierList48 = null;

        Oberon0Parser.type_return type50 = null;


        CommonTree VAR47_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree char_literal51_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:119:3: ( VAR ( identifierList ':' type ';' )* -> ( ^( VAR type identifierList ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:119:5: VAR ( identifierList ':' type ';' )*
            {
            VAR47=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations997); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR47);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:119:9: ( identifierList ':' type ';' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==IDENTIFIER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:119:10: identifierList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identifierList_in_varDeclarations1000);
            	    identifierList48=identifierList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifierList.add(identifierList48.getTree());
            	    char_literal49=(Token)match(input,62,FOLLOW_62_in_varDeclarations1002); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_62.add(char_literal49);

            	    pushFollow(FOLLOW_type_in_varDeclarations1004);
            	    type50=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type50.getTree());
            	    char_literal51=(Token)match(input,58,FOLLOW_58_in_varDeclarations1006); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal51);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);



            // AST REWRITE
            // elements: VAR, type, identifierList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 120:3: -> ( ^( VAR type identifierList ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:120:6: ( ^( VAR type identifierList ) )*
                while ( stream_VAR.hasNext()||stream_type.hasNext()||stream_identifierList.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:120:6: ^( VAR type identifierList )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_identifierList.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_VAR.reset();
                stream_type.reset();
                stream_identifierList.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclarations"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:124:1: expression : ( simpleExpression comparer simpleExpression -> ^( comparer simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.simpleExpression_return simpleExpression52 = null;

        Oberon0Parser.comparer_return comparer53 = null;

        Oberon0Parser.simpleExpression_return simpleExpression54 = null;

        Oberon0Parser.simpleExpression_return simpleExpression55 = null;


        RewriteRuleSubtreeStream stream_comparer=new RewriteRuleSubtreeStream(adaptor,"rule comparer");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:125:3: ( simpleExpression comparer simpleExpression -> ^( comparer simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
            int alt15=2;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                int LA15_1 = input.LA(2);

                if ( (synpred15_Oberon0()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case MINUS:
                {
                int LA15_2 = input.LA(2);

                if ( (synpred15_Oberon0()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred15_Oberon0()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
                {
                int LA15_4 = input.LA(2);

                if ( (synpred15_Oberon0()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                int LA15_5 = input.LA(2);

                if ( (synpred15_Oberon0()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 5, input);

                    throw nvae;
                }
                }
                break;
            case NOT:
                {
                int LA15_6 = input.LA(2);

                if ( (synpred15_Oberon0()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:125:5: simpleExpression comparer simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression1033);
                    simpleExpression52=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression52.getTree());
                    pushFollow(FOLLOW_comparer_in_expression1035);
                    comparer53=comparer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_comparer.add(comparer53.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression1037);
                    simpleExpression54=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression54.getTree());


                    // AST REWRITE
                    // elements: comparer, simpleExpression, simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 126:3: -> ^( comparer simpleExpression simpleExpression )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:126:6: ^( comparer simpleExpression simpleExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_comparer.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:127:5: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression1055);
                    simpleExpression55=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression55.getTree());


                    // AST REWRITE
                    // elements: simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 128:3: -> simpleExpression
                    {
                        adaptor.addChild(root_0, stream_simpleExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class comparer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparer"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:130:1: comparer : ( EQUALS | NOT_EQUALS | LT | LTE | GT | GTE );
    public final Oberon0Parser.comparer_return comparer() throws RecognitionException {
        Oberon0Parser.comparer_return retval = new Oberon0Parser.comparer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set56=null;

        CommonTree set56_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:131:3: ( EQUALS | NOT_EQUALS | LT | LTE | GT | GTE )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set56=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set56));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparer"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:139:1: simpleExpression : ( unary )? term ( weakops term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.unary_return unary57 = null;

        Oberon0Parser.term_return term58 = null;

        Oberon0Parser.weakops_return weakops59 = null;

        Oberon0Parser.term_return term60 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:140:3: ( ( unary )? term ( weakops term )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:140:5: ( unary )? term ( weakops term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:140:10: ( unary )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=PLUS && LA16_0<=MINUS)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: unary
                    {
                    pushFollow(FOLLOW_unary_in_simpleExpression1115);
                    unary57=unary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(unary57.getTree(), root_0);

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression1119);
            term58=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term58.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:140:18: ( weakops term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=PLUS && LA17_0<=OR)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:140:19: weakops term
            	    {
            	    pushFollow(FOLLOW_weakops_in_simpleExpression1122);
            	    weakops59=weakops();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(weakops59.getTree(), root_0);
            	    pushFollow(FOLLOW_term_in_simpleExpression1125);
            	    term60=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term60.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:143:1: unary : ( PLUS | MINUS ) -> ( MINUS )? ;
    public final Oberon0Parser.unary_return unary() throws RecognitionException {
        Oberon0Parser.unary_return retval = new Oberon0Parser.unary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS61=null;
        Token MINUS62=null;

        CommonTree PLUS61_tree=null;
        CommonTree MINUS62_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:3: ( ( PLUS | MINUS ) -> ( MINUS )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:5: ( PLUS | MINUS )
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:5: ( PLUS | MINUS )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==PLUS) ) {
                alt18=1;
            }
            else if ( (LA18_0==MINUS) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:6: PLUS
                    {
                    PLUS61=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary1141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS61);


                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:13: MINUS
                    {
                    MINUS62=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary1145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS62);


                    }
                    break;

            }



            // AST REWRITE
            // elements: MINUS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:3: -> ( MINUS )?
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:145:6: ( MINUS )?
                if ( stream_MINUS.hasNext() ) {
                    adaptor.addChild(root_0, stream_MINUS.nextNode());

                }
                stream_MINUS.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:148:1: term : factor ( strongops factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.factor_return factor63 = null;

        Oberon0Parser.strongops_return strongops64 = null;

        Oberon0Parser.factor_return factor65 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:149:3: ( factor ( strongops factor )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:149:5: factor ( strongops factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term1166);
            factor63=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor63.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:149:12: ( strongops factor )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=MULT && LA19_0<=AND)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:149:13: strongops factor
            	    {
            	    pushFollow(FOLLOW_strongops_in_term1169);
            	    strongops64=strongops();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(strongops64.getTree(), root_0);
            	    pushFollow(FOLLOW_factor_in_term1172);
            	    factor65=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor65.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:151:1: factor : ( identifier selectors -> ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) ) | literal -> literal | '(' expression ')' -> expression | NOT factor -> ^( NOT factor ) );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal69=null;
        Token char_literal71=null;
        Token NOT72=null;
        Oberon0Parser.identifier_return identifier66 = null;

        Oberon0Parser.selectors_return selectors67 = null;

        Oberon0Parser.literal_return literal68 = null;

        Oberon0Parser.expression_return expression70 = null;

        Oberon0Parser.factor_return factor73 = null;


        CommonTree char_literal69_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree NOT72_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_selectors=new RewriteRuleSubtreeStream(adaptor,"rule selectors");
        RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:152:3: ( identifier selectors -> ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) ) | literal -> literal | '(' expression ')' -> expression | NOT factor -> ^( NOT factor ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt20=1;
                }
                break;
            case INTEGER:
                {
                alt20=2;
                }
                break;
            case 60:
                {
                alt20=3;
                }
                break;
            case NOT:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:152:5: identifier selectors
                    {
                    pushFollow(FOLLOW_identifier_in_factor1185);
                    identifier66=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier66.getTree());
                    pushFollow(FOLLOW_selectors_in_factor1187);
                    selectors67=selectors();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_selectors.add(selectors67.getTree());


                    // AST REWRITE
                    // elements: identifier, selectors
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 153:3: -> ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:153:6: ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENT_SELECT, "IDENT_SELECT"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:153:33: ^( SELECTORS ( selectors )? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECTORS, "SELECTORS"), root_2);

                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:153:45: ( selectors )?
                        if ( stream_selectors.hasNext() ) {
                            adaptor.addChild(root_2, stream_selectors.nextTree());

                        }
                        stream_selectors.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:154:5: literal
                    {
                    pushFollow(FOLLOW_literal_in_factor1212);
                    literal68=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literal.add(literal68.getTree());


                    // AST REWRITE
                    // elements: literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 155:3: -> literal
                    {
                        adaptor.addChild(root_0, stream_literal.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:156:5: '(' expression ')'
                    {
                    char_literal69=(Token)match(input,60,FOLLOW_60_in_factor1224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(char_literal69);

                    pushFollow(FOLLOW_expression_in_factor1226);
                    expression70=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression70.getTree());
                    char_literal71=(Token)match(input,61,FOLLOW_61_in_factor1228); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(char_literal71);



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

                    root_0 = (CommonTree)adaptor.nil();
                    // 157:3: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:158:5: NOT factor
                    {
                    NOT72=(Token)match(input,NOT,FOLLOW_NOT_in_factor1240); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT72);

                    pushFollow(FOLLOW_factor_in_factor1242);
                    factor73=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_factor.add(factor73.getTree());


                    // AST REWRITE
                    // elements: NOT, factor
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 159:3: -> ^( NOT factor )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:159:6: ^( NOT factor )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_factor.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class strongops_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "strongops"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:161:1: strongops : ( MULT | DIV | MOD | AND );
    public final Oberon0Parser.strongops_return strongops() throws RecognitionException {
        Oberon0Parser.strongops_return retval = new Oberon0Parser.strongops_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set74=null;

        CommonTree set74_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:162:3: ( MULT | DIV | MOD | AND )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set74=(Token)input.LT(1);
            if ( (input.LA(1)>=MULT && input.LA(1)<=AND) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set74));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "strongops"

    public static class weakops_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "weakops"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:167:1: weakops : ( PLUS | MINUS | OR );
    public final Oberon0Parser.weakops_return weakops() throws RecognitionException {
        Oberon0Parser.weakops_return retval = new Oberon0Parser.weakops_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set75=null;

        CommonTree set75_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:168:3: ( PLUS | MINUS | OR )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set75=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=OR) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set75));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "weakops"

    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:172:1: identifier : IDENTIFIER ;
    public final Oberon0Parser.identifier_return identifier() throws RecognitionException {
        Oberon0Parser.identifier_return retval = new Oberon0Parser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER76=null;

        CommonTree IDENTIFIER76_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:173:3: ( IDENTIFIER )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:173:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier1315); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER76_tree = (CommonTree)adaptor.create(IDENTIFIER76);
            adaptor.addChild(root_0, IDENTIFIER76_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifier"

    public static class identifierList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierList"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:175:1: identifierList : identifier ( ',' identifier )* -> ^( IDENTIFIERS ( identifier )+ ) ;
    public final Oberon0Parser.identifierList_return identifierList() throws RecognitionException {
        Oberon0Parser.identifierList_return retval = new Oberon0Parser.identifierList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal78=null;
        Oberon0Parser.identifier_return identifier77 = null;

        Oberon0Parser.identifier_return identifier79 = null;


        CommonTree char_literal78_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:175:15: ( identifier ( ',' identifier )* -> ^( IDENTIFIERS ( identifier )+ ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:176:3: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifierList1325);
            identifier77=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier77.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:176:14: ( ',' identifier )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==63) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:176:15: ',' identifier
            	    {
            	    char_literal78=(Token)match(input,63,FOLLOW_63_in_identifierList1328); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_63.add(char_literal78);

            	    pushFollow(FOLLOW_identifier_in_identifierList1330);
            	    identifier79=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier79.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);



            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 177:3: -> ^( IDENTIFIERS ( identifier )+ )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:177:6: ^( IDENTIFIERS ( identifier )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENTIFIERS, "IDENTIFIERS"), root_1);

                if ( !(stream_identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifierList"

    public static class integer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:179:1: integer : INTEGER ;
    public final Oberon0Parser.integer_return integer() throws RecognitionException {
        Oberon0Parser.integer_return retval = new Oberon0Parser.integer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER80=null;

        CommonTree INTEGER80_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:180:3: ( INTEGER )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:180:5: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER80=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer1353); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER80_tree = (CommonTree)adaptor.create(INTEGER80);
            adaptor.addChild(root_0, INTEGER80_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integer"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:182:1: literal : integer ;
    public final Oberon0Parser.literal_return literal() throws RecognitionException {
        Oberon0Parser.literal_return retval = new Oberon0Parser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.integer_return integer81 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:183:3: ( integer )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:183:5: integer
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_integer_in_literal1364);
            integer81=integer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, integer81.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class subselector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subselector"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:185:1: subselector : ( '.' identifier -> ^( RECORDSELECTOR identifier ) | '[' expression ']' -> ^( ARRAYSELECTOR expression ) );
    public final Oberon0Parser.subselector_return subselector() throws RecognitionException {
        Oberon0Parser.subselector_return retval = new Oberon0Parser.subselector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        Oberon0Parser.identifier_return identifier83 = null;

        Oberon0Parser.expression_return expression85 = null;


        CommonTree char_literal82_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:186:3: ( '.' identifier -> ^( RECORDSELECTOR identifier ) | '[' expression ']' -> ^( ARRAYSELECTOR expression ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==59) ) {
                alt22=1;
            }
            else if ( (LA22_0==64) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:186:5: '.' identifier
                    {
                    char_literal82=(Token)match(input,59,FOLLOW_59_in_subselector1375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(char_literal82);

                    pushFollow(FOLLOW_identifier_in_subselector1377);
                    identifier83=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier83.getTree());


                    // AST REWRITE
                    // elements: identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 187:3: -> ^( RECORDSELECTOR identifier )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:187:6: ^( RECORDSELECTOR identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RECORDSELECTOR, "RECORDSELECTOR"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:188:5: '[' expression ']'
                    {
                    char_literal84=(Token)match(input,64,FOLLOW_64_in_subselector1394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_64.add(char_literal84);

                    pushFollow(FOLLOW_expression_in_subselector1396);
                    expression85=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression85.getTree());
                    char_literal86=(Token)match(input,65,FOLLOW_65_in_subselector1398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(char_literal86);



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

                    root_0 = (CommonTree)adaptor.nil();
                    // 189:3: -> ^( ARRAYSELECTOR expression )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:189:6: ^( ARRAYSELECTOR expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAYSELECTOR, "ARRAYSELECTOR"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subselector"

    public static class selectors_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectors"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:191:1: selectors : ( subselector )* ;
    public final Oberon0Parser.selectors_return selectors() throws RecognitionException {
        Oberon0Parser.selectors_return retval = new Oberon0Parser.selectors_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.subselector_return subselector87 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:192:3: ( ( subselector )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:192:5: ( subselector )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:192:5: ( subselector )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==59||LA23_0==64) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:192:6: subselector
            	    {
            	    pushFollow(FOLLOW_subselector_in_selectors1420);
            	    subselector87=subselector();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, subselector87.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selectors"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:197:1: statement : ( assignment | procedureCall | ifStatement | whileStatement | withStatement );
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment88 = null;

        Oberon0Parser.procedureCall_return procedureCall89 = null;

        Oberon0Parser.ifStatement_return ifStatement90 = null;

        Oberon0Parser.whileStatement_return whileStatement91 = null;

        Oberon0Parser.withStatement_return withStatement92 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:198:3: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )
            int alt24=5;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==59||LA24_1==64||LA24_1==66) ) {
                    alt24=1;
                }
                else if ( (LA24_1==EOF||LA24_1==END||(LA24_1>=ELSIF && LA24_1<=ELSE)||LA24_1==58||LA24_1==60) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case IF:
                {
                alt24=3;
                }
                break;
            case WHILE:
                {
                alt24=4;
                }
                break;
            case WITH:
                {
                alt24=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:198:5: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_statement1436);
                    assignment88=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment88.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:199:5: procedureCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_procedureCall_in_statement1442);
                    procedureCall89=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall89.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:200:5: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement1448);
                    ifStatement90=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement90.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:201:5: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement1454);
                    whileStatement91=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement91.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:202:5: withStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statement1460);
                    withStatement92=withStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, withStatement92.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:204:1: assignment : identifier selectors ':=' expression -> ^( ASSIGN expression ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) ) ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal95=null;
        Oberon0Parser.identifier_return identifier93 = null;

        Oberon0Parser.selectors_return selectors94 = null;

        Oberon0Parser.expression_return expression96 = null;


        CommonTree string_literal95_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_selectors=new RewriteRuleSubtreeStream(adaptor,"rule selectors");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:205:3: ( identifier selectors ':=' expression -> ^( ASSIGN expression ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) ) ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:205:5: identifier selectors ':=' expression
            {
            pushFollow(FOLLOW_identifier_in_assignment1471);
            identifier93=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier93.getTree());
            pushFollow(FOLLOW_selectors_in_assignment1473);
            selectors94=selectors();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selectors.add(selectors94.getTree());
            string_literal95=(Token)match(input,66,FOLLOW_66_in_assignment1475); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal95);

            pushFollow(FOLLOW_expression_in_assignment1477);
            expression96=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression96.getTree());


            // AST REWRITE
            // elements: selectors, identifier, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 206:3: -> ^( ASSIGN expression ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) ) )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:206:6: ^( ASSIGN expression ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:206:27: ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENT_SELECT, "IDENT_SELECT"), root_2);

                adaptor.addChild(root_2, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:206:54: ^( SELECTORS ( selectors )? )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECTORS, "SELECTORS"), root_3);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:206:66: ( selectors )?
                if ( stream_selectors.hasNext() ) {
                    adaptor.addChild(root_3, stream_selectors.nextTree());

                }
                stream_selectors.reset();

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:208:1: ifStatement : ifpart ( elsifpart )* ( elsepart )? END -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? ) ;
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token END100=null;
        Oberon0Parser.ifpart_return ifpart97 = null;

        Oberon0Parser.elsifpart_return elsifpart98 = null;

        Oberon0Parser.elsepart_return elsepart99 = null;


        CommonTree END100_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_elsifpart=new RewriteRuleSubtreeStream(adaptor,"rule elsifpart");
        RewriteRuleSubtreeStream stream_ifpart=new RewriteRuleSubtreeStream(adaptor,"rule ifpart");
        RewriteRuleSubtreeStream stream_elsepart=new RewriteRuleSubtreeStream(adaptor,"rule elsepart");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:209:3: ( ifpart ( elsifpart )* ( elsepart )? END -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:209:5: ifpart ( elsifpart )* ( elsepart )? END
            {
            pushFollow(FOLLOW_ifpart_in_ifStatement1514);
            ifpart97=ifpart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifpart.add(ifpart97.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:209:12: ( elsifpart )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ELSIF) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: elsifpart
            	    {
            	    pushFollow(FOLLOW_elsifpart_in_ifStatement1516);
            	    elsifpart98=elsifpart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elsifpart.add(elsifpart98.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:209:23: ( elsepart )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ELSE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: elsepart
                    {
                    pushFollow(FOLLOW_elsepart_in_ifStatement1519);
                    elsepart99=elsepart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsepart.add(elsepart99.getTree());

                    }
                    break;

            }

            END100=(Token)match(input,END,FOLLOW_END_in_ifStatement1522); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END100);



            // AST REWRITE
            // elements: ifpart, elsifpart, elsepart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 210:3: -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:210:6: ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IFSTATEMENT, "IFSTATEMENT"), root_1);

                adaptor.addChild(root_1, stream_ifpart.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:210:27: ( elsifpart )*
                while ( stream_elsifpart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsifpart.nextTree());

                }
                stream_elsifpart.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:210:38: ( elsepart )?
                if ( stream_elsepart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsepart.nextTree());

                }
                stream_elsepart.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class ifpart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifpart"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:212:1: ifpart : IF expression THEN statementSequence -> ^( IF expression ^( STATEMENTS statementSequence ) ) ;
    public final Oberon0Parser.ifpart_return ifpart() throws RecognitionException {
        Oberon0Parser.ifpart_return retval = new Oberon0Parser.ifpart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF101=null;
        Token THEN103=null;
        Oberon0Parser.expression_return expression102 = null;

        Oberon0Parser.statementSequence_return statementSequence104 = null;


        CommonTree IF101_tree=null;
        CommonTree THEN103_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:213:3: ( IF expression THEN statementSequence -> ^( IF expression ^( STATEMENTS statementSequence ) ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:213:5: IF expression THEN statementSequence
            {
            IF101=(Token)match(input,IF,FOLLOW_IF_in_ifpart1548); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF101);

            pushFollow(FOLLOW_expression_in_ifpart1550);
            expression102=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression102.getTree());
            THEN103=(Token)match(input,THEN,FOLLOW_THEN_in_ifpart1552); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN103);

            pushFollow(FOLLOW_statementSequence_in_ifpart1554);
            statementSequence104=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence104.getTree());


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

            root_0 = (CommonTree)adaptor.nil();
            // 214:3: -> ^( IF expression ^( STATEMENTS statementSequence ) )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:214:6: ^( IF expression ^( STATEMENTS statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:214:22: ^( STATEMENTS statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifpart"

    public static class elsifpart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elsifpart"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:216:1: elsifpart : ELSIF expression THEN statementSequence -> ^( ELSIF expression ^( STATEMENTS statementSequence ) ) ;
    public final Oberon0Parser.elsifpart_return elsifpart() throws RecognitionException {
        Oberon0Parser.elsifpart_return retval = new Oberon0Parser.elsifpart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELSIF105=null;
        Token THEN107=null;
        Oberon0Parser.expression_return expression106 = null;

        Oberon0Parser.statementSequence_return statementSequence108 = null;


        CommonTree ELSIF105_tree=null;
        CommonTree THEN107_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:217:3: ( ELSIF expression THEN statementSequence -> ^( ELSIF expression ^( STATEMENTS statementSequence ) ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:217:5: ELSIF expression THEN statementSequence
            {
            ELSIF105=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_elsifpart1580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF105);

            pushFollow(FOLLOW_expression_in_elsifpart1582);
            expression106=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression106.getTree());
            THEN107=(Token)match(input,THEN,FOLLOW_THEN_in_elsifpart1584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN107);

            pushFollow(FOLLOW_statementSequence_in_elsifpart1586);
            statementSequence108=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence108.getTree());


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

            root_0 = (CommonTree)adaptor.nil();
            // 218:3: -> ^( ELSIF expression ^( STATEMENTS statementSequence ) )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:218:6: ^( ELSIF expression ^( STATEMENTS statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:218:25: ^( STATEMENTS statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elsifpart"

    public static class elsepart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elsepart"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:220:1: elsepart : ELSE statementSequence -> ^( ELSE ^( STATEMENTS statementSequence ) ) ;
    public final Oberon0Parser.elsepart_return elsepart() throws RecognitionException {
        Oberon0Parser.elsepart_return retval = new Oberon0Parser.elsepart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELSE109=null;
        Oberon0Parser.statementSequence_return statementSequence110 = null;


        CommonTree ELSE109_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:221:3: ( ELSE statementSequence -> ^( ELSE ^( STATEMENTS statementSequence ) ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:221:5: ELSE statementSequence
            {
            ELSE109=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsepart1612); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE109);

            pushFollow(FOLLOW_statementSequence_in_elsepart1614);
            statementSequence110=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence110.getTree());


            // AST REWRITE
            // elements: statementSequence, ELSE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 222:3: -> ^( ELSE ^( STATEMENTS statementSequence ) )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:222:6: ^( ELSE ^( STATEMENTS statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:222:13: ^( STATEMENTS statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elsepart"

    public static class procedureCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:224:1: procedureCall : identifier ( actualParameters )? -> ^( CALL identifier ^( ACTUALS ( actualParameters )? ) ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.identifier_return identifier111 = null;

        Oberon0Parser.actualParameters_return actualParameters112 = null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:225:3: ( identifier ( actualParameters )? -> ^( CALL identifier ^( ACTUALS ( actualParameters )? ) ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:225:5: identifier ( actualParameters )?
            {
            pushFollow(FOLLOW_identifier_in_procedureCall1639);
            identifier111=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier111.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:225:16: ( actualParameters )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==60) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall1641);
                    actualParameters112=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters112.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: actualParameters, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 226:3: -> ^( CALL identifier ^( ACTUALS ( actualParameters )? ) )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:226:6: ^( CALL identifier ^( ACTUALS ( actualParameters )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:226:24: ^( ACTUALS ( actualParameters )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACTUALS, "ACTUALS"), root_2);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:226:34: ( actualParameters )?
                if ( stream_actualParameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_actualParameters.nextTree());

                }
                stream_actualParameters.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class actualParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:228:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ( expression )+ ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        Oberon0Parser.expression_return expression114 = null;

        Oberon0Parser.expression_return expression116 = null;


        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        CommonTree char_literal117_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:3: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:5: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal113=(Token)match(input,60,FOLLOW_60_in_actualParameters1669); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_60.add(char_literal113);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:9: ( expression ( ',' expression )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=PLUS && LA29_0<=MINUS)||LA29_0==NOT||(LA29_0>=IDENTIFIER && LA29_0<=INTEGER)||LA29_0==60) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters1672);
                    expression114=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression114.getTree());
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:21: ( ',' expression )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==63) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:22: ',' expression
                    	    {
                    	    char_literal115=(Token)match(input,63,FOLLOW_63_in_actualParameters1675); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_63.add(char_literal115);

                    	    pushFollow(FOLLOW_expression_in_actualParameters1677);
                    	    expression116=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression116.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal117=(Token)match(input,61,FOLLOW_61_in_actualParameters1683); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal117);



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

            root_0 = (CommonTree)adaptor.nil();
            // 230:3: -> ( expression )+
            {
                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actualParameters"

    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:232:1: whileStatement : WHILE expression 'DO' statementSequence END -> ^( WHILE expression ^( STATEMENTS statementSequence ) ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE118=null;
        Token string_literal120=null;
        Token END122=null;
        Oberon0Parser.expression_return expression119 = null;

        Oberon0Parser.statementSequence_return statementSequence121 = null;


        CommonTree WHILE118_tree=null;
        CommonTree string_literal120_tree=null;
        CommonTree END122_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:233:3: ( WHILE expression 'DO' statementSequence END -> ^( WHILE expression ^( STATEMENTS statementSequence ) ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:233:5: WHILE expression 'DO' statementSequence END
            {
            WHILE118=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1700); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE118);

            pushFollow(FOLLOW_expression_in_whileStatement1702);
            expression119=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression119.getTree());
            string_literal120=(Token)match(input,67,FOLLOW_67_in_whileStatement1704); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(string_literal120);

            pushFollow(FOLLOW_statementSequence_in_whileStatement1706);
            statementSequence121=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence121.getTree());
            END122=(Token)match(input,END,FOLLOW_END_in_whileStatement1708); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END122);



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

            root_0 = (CommonTree)adaptor.nil();
            // 234:3: -> ^( WHILE expression ^( STATEMENTS statementSequence ) )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:234:6: ^( WHILE expression ^( STATEMENTS statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:234:25: ^( STATEMENTS statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class withStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "withStatement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:236:1: withStatement : WITH identifier selectors 'DO' statementSequence END -> ^( WITH ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) ) ^( STATEMENTS statementSequence ) ) ;
    public final Oberon0Parser.withStatement_return withStatement() throws RecognitionException {
        Oberon0Parser.withStatement_return retval = new Oberon0Parser.withStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WITH123=null;
        Token string_literal126=null;
        Token END128=null;
        Oberon0Parser.identifier_return identifier124 = null;

        Oberon0Parser.selectors_return selectors125 = null;

        Oberon0Parser.statementSequence_return statementSequence127 = null;


        CommonTree WITH123_tree=null;
        CommonTree string_literal126_tree=null;
        CommonTree END128_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_selectors=new RewriteRuleSubtreeStream(adaptor,"rule selectors");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:237:3: ( WITH identifier selectors 'DO' statementSequence END -> ^( WITH ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) ) ^( STATEMENTS statementSequence ) ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:237:5: WITH identifier selectors 'DO' statementSequence END
            {
            WITH123=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement1734); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WITH.add(WITH123);

            pushFollow(FOLLOW_identifier_in_withStatement1736);
            identifier124=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier124.getTree());
            pushFollow(FOLLOW_selectors_in_withStatement1738);
            selectors125=selectors();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selectors.add(selectors125.getTree());
            string_literal126=(Token)match(input,67,FOLLOW_67_in_withStatement1740); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(string_literal126);

            pushFollow(FOLLOW_statementSequence_in_withStatement1742);
            statementSequence127=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence127.getTree());
            END128=(Token)match(input,END,FOLLOW_END_in_withStatement1744); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END128);



            // AST REWRITE
            // elements: identifier, WITH, statementSequence, selectors
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 238:3: -> ^( WITH ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) ) ^( STATEMENTS statementSequence ) )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:6: ^( WITH ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) ) ^( STATEMENTS statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WITH.nextNode(), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:14: ^( IDENT_SELECT identifier ^( SELECTORS ( selectors )? ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENT_SELECT, "IDENT_SELECT"), root_2);

                adaptor.addChild(root_2, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:41: ^( SELECTORS ( selectors )? )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECTORS, "SELECTORS"), root_3);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:53: ( selectors )?
                if ( stream_selectors.hasNext() ) {
                    adaptor.addChild(root_3, stream_selectors.nextTree());

                }
                stream_selectors.reset();

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:67: ^( STATEMENTS statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "withStatement"

    public static class statementSequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:240:1: statementSequence : statement ( ';' statement )* -> ( statement )+ ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal130=null;
        Oberon0Parser.statement_return statement129 = null;

        Oberon0Parser.statement_return statement131 = null;


        CommonTree char_literal130_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:241:3: ( statement ( ';' statement )* -> ( statement )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:241:5: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence1785);
            statement129=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement129.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:241:15: ( ';' statement )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==58) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:241:16: ';' statement
            	    {
            	    char_literal130=(Token)match(input,58,FOLLOW_58_in_statementSequence1788); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal130);

            	    pushFollow(FOLLOW_statement_in_statementSequence1790);
            	    statement131=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement131.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 242:3: -> ( statement )+
            {
                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_0, stream_statement.nextTree());

                }
                stream_statement.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementSequence"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:246:1: type : ( identifier | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.identifier_return identifier132 = null;

        Oberon0Parser.arrayType_return arrayType133 = null;

        Oberon0Parser.recordType_return recordType134 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:247:3: ( identifier | arrayType | recordType )
            int alt31=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt31=1;
                }
                break;
            case ARRAY:
                {
                alt31=2;
                }
                break;
            case RECORD:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:247:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_type1811);
                    identifier132=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier132.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:248:5: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1817);
                    arrayType133=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType133.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:249:5: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1823);
                    recordType134=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType134.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class arrayType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:251:1: arrayType : ARRAY expression 'OF' type -> ^( ARRAY type expression ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY135=null;
        Token string_literal137=null;
        Oberon0Parser.expression_return expression136 = null;

        Oberon0Parser.type_return type138 = null;


        CommonTree ARRAY135_tree=null;
        CommonTree string_literal137_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:252:3: ( ARRAY expression 'OF' type -> ^( ARRAY type expression ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:252:5: ARRAY expression 'OF' type
            {
            ARRAY135=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1834); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY135);

            pushFollow(FOLLOW_expression_in_arrayType1836);
            expression136=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression136.getTree());
            string_literal137=(Token)match(input,68,FOLLOW_68_in_arrayType1838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(string_literal137);

            pushFollow(FOLLOW_type_in_arrayType1840);
            type138=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type138.getTree());


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

            root_0 = (CommonTree)adaptor.nil();
            // 253:3: -> ^( ARRAY type expression )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:253:6: ^( ARRAY type expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayType"

    public static class recordType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:255:1: recordType : RECORD field ( ';' field )* 'END' -> ^( RECORD ( field )+ ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD139=null;
        Token char_literal141=null;
        Token string_literal143=null;
        Oberon0Parser.field_return field140 = null;

        Oberon0Parser.field_return field142 = null;


        CommonTree RECORD139_tree=null;
        CommonTree char_literal141_tree=null;
        CommonTree string_literal143_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:256:3: ( RECORD field ( ';' field )* 'END' -> ^( RECORD ( field )+ ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:256:5: RECORD field ( ';' field )* 'END'
            {
            RECORD139=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1862); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD139);

            pushFollow(FOLLOW_field_in_recordType1864);
            field140=field();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_field.add(field140.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:256:18: ( ';' field )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==58) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:256:19: ';' field
            	    {
            	    char_literal141=(Token)match(input,58,FOLLOW_58_in_recordType1867); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal141);

            	    pushFollow(FOLLOW_field_in_recordType1869);
            	    field142=field();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field.add(field142.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            string_literal143=(Token)match(input,END,FOLLOW_END_in_recordType1873); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal143);



            // AST REWRITE
            // elements: field, RECORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 257:3: -> ^( RECORD ( field )+ )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:257:6: ^( RECORD ( field )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                if ( !(stream_field.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_field.hasNext() ) {
                    adaptor.addChild(root_1, stream_field.nextTree());

                }
                stream_field.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "recordType"

    public static class field_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:259:1: field : ( identifierList ':' type )? -> ^( FIELD type identifierList ) ;
    public final Oberon0Parser.field_return field() throws RecognitionException {
        Oberon0Parser.field_return retval = new Oberon0Parser.field_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal145=null;
        Oberon0Parser.identifierList_return identifierList144 = null;

        Oberon0Parser.type_return type146 = null;


        CommonTree char_literal145_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:260:3: ( ( identifierList ':' type )? -> ^( FIELD type identifierList ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:260:5: ( identifierList ':' type )?
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:260:5: ( identifierList ':' type )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENTIFIER) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:260:6: identifierList ':' type
                    {
                    pushFollow(FOLLOW_identifierList_in_field1895);
                    identifierList144=identifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierList.add(identifierList144.getTree());
                    char_literal145=(Token)match(input,62,FOLLOW_62_in_field1897); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_62.add(char_literal145);

                    pushFollow(FOLLOW_type_in_field1899);
                    type146=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type146.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: identifierList, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 261:3: -> ^( FIELD type identifierList )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:261:6: ^( FIELD type identifierList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD, "FIELD"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_identifierList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field"

    // $ANTLR start synpred5_Oberon0
    public final void synpred5_Oberon0_fragment() throws RecognitionException {   
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:87:62: ( procedureDeclarations )
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:87:62: procedureDeclarations
        {
        pushFollow(FOLLOW_procedureDeclarations_in_synpred5_Oberon0718);
        procedureDeclarations();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Oberon0

    // $ANTLR start synpred15_Oberon0
    public final void synpred15_Oberon0_fragment() throws RecognitionException {   
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:125:5: ( simpleExpression comparer simpleExpression )
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:125:5: simpleExpression comparer simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred15_Oberon01033);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_comparer_in_synpred15_Oberon01035);
        comparer();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred15_Oberon01037);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Oberon0

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
    public final boolean synpred5_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_MODULE_in_module636 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_module638 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_module640 = new BitSet(new long[]{0x0000000000001380L});
    public static final BitSet FOLLOW_moduleBody_in_module642 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_module644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody668 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody671 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody673 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_moduleBody677 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_moduleBody679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations709 = new BitSet(new long[]{0x0000000000001300L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations712 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations715 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constantDeclarations761 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identifier_in_constantDeclarations764 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUALS_in_constantDeclarations766 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations768 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_constantDeclarations770 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclarations795 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeDeclarations798 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations800 = new BitSet(new long[]{0x0080000000000C00L});
    public static final BitSet FOLLOW_type_in_typeDeclarations802 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_typeDeclarations804 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclarations830 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_procedureDeclarations832 = new BitSet(new long[]{0x0000000000001380L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclarations834 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_procedureDeclarations836 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureHeading861 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_procedureHeading863 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_formalParameters891 = new BitSet(new long[]{0x2080000000000200L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters894 = new BitSet(new long[]{0x2400000000000000L});
    public static final BitSet FOLLOW_58_in_formalParameters897 = new BitSet(new long[]{0x0080000000000200L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters899 = new BitSet(new long[]{0x2400000000000000L});
    public static final BitSet FOLLOW_61_in_formalParameters905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection923 = new BitSet(new long[]{0x0080000000000200L});
    public static final BitSet FOLLOW_identifierList_in_fpSection926 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_fpSection928 = new BitSet(new long[]{0x0080000000000C00L});
    public static final BitSet FOLLOW_type_in_fpSection930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody957 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody960 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody962 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_procedureBody966 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_procedureBody968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations997 = new BitSet(new long[]{0x0080000000000202L});
    public static final BitSet FOLLOW_identifierList_in_varDeclarations1000 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_varDeclarations1002 = new BitSet(new long[]{0x0080000000000C00L});
    public static final BitSet FOLLOW_type_in_varDeclarations1004 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_varDeclarations1006 = new BitSet(new long[]{0x0080000000000202L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1033 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_comparer_in_expression1035 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparer0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_simpleExpression1115 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_term_in_simpleExpression1119 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_weakops_in_simpleExpression1122 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_term_in_simpleExpression1125 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_PLUS_in_unary1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1166 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_strongops_in_term1169 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_factor_in_term1172 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_identifier_in_factor1185 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_selectors_in_factor1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_factor1224 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_expression_in_factor1226 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_factor1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor1240 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_factor_in_factor1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_strongops0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_weakops0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierList1325 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_identifierList1328 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_identifierList1330 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_literal1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_subselector1375 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_subselector1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_subselector1394 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_expression_in_subselector1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_subselector1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subselector_in_selectors1420 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_assignment_in_statement1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statement1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignment1471 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_selectors_in_assignment1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_assignment1475 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_expression_in_assignment1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifpart_in_ifStatement1514 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_elsifpart_in_ifStatement1516 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_elsepart_in_ifStatement1519 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_ifStatement1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifpart1548 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_expression_in_ifpart1550 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifpart1552 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_ifpart1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_elsifpart1580 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_expression_in_elsifpart1582 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_elsifpart1584 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_elsifpart1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsepart1612 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_elsepart1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_procedureCall1639 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_actualParameters1669 = new BitSet(new long[]{0x3180000016000000L});
    public static final BitSet FOLLOW_expression_in_actualParameters1672 = new BitSet(new long[]{0xA000000000000000L});
    public static final BitSet FOLLOW_63_in_actualParameters1675 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_expression_in_actualParameters1677 = new BitSet(new long[]{0xA000000000000000L});
    public static final BitSet FOLLOW_61_in_actualParameters1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1700 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_whileStatement1704 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1706 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_whileStatement1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement1734 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_withStatement1736 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_selectors_in_withStatement1738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_withStatement1740 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_withStatement1742 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_withStatement1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1785 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_statementSequence1788 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1790 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_identifier_in_type1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1834 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_expression_in_arrayType1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_arrayType1838 = new BitSet(new long[]{0x0080000000000C00L});
    public static final BitSet FOLLOW_type_in_arrayType1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1862 = new BitSet(new long[]{0x0480000000000240L});
    public static final BitSet FOLLOW_field_in_recordType1864 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_58_in_recordType1867 = new BitSet(new long[]{0x0480000000000240L});
    public static final BitSet FOLLOW_field_in_recordType1869 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_END_in_recordType1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_field1895 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_field1897 = new BitSet(new long[]{0x0080000000000C00L});
    public static final BitSet FOLLOW_type_in_field1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureDeclarations_in_synpred5_Oberon0718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred15_Oberon01033 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_comparer_in_synpred15_Oberon01035 = new BitSet(new long[]{0x1180000016000000L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred15_Oberon01037 = new BitSet(new long[]{0x0000000000000002L});

}