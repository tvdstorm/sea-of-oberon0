// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g 2011-02-07 11:06:58

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "BEGIN", "END", "CONST", "TYPE", "VAR", "ARRAY", "RECORD", "PROCEDURE", "WHILE", "IF", "THEN", "ELSIF", "ELSE", "EQUALS", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "PLUS", "MINUS", "OR", "NOT", "MULT", "DIV", "MOD", "AND", "CONSTANTS", "VARIABLES", "TYPES", "PROCEDURES", "MODULEBODY", "PROCEDUREBODY", "IDENTIFIERLIST", "FORMALPARAMETER", "FORMALPARAMETERS", "ASSIGN", "ACTUALPARAMETERS", "CALL", "RECORDSELECTOR", "ARRAYSELECTOR", "IDENT", "EXPRESSION", "LITERAL", "DECLARATIONS", "STATEMENTS", "IFSTATEMENT", "IDENTIFIER", "INTEGER", "WHITESPACE", "';'", "'.'", "'['", "']'", "'('", "')'", "':='", "','", "'DO'", "'OF'", "':'"
    };
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
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
    public static final int EQUALS=18;
    public static final int NOT_EQUALS=19;
    public static final int GT=20;
    public static final int GTE=21;
    public static final int LT=22;
    public static final int LTE=23;
    public static final int PLUS=24;
    public static final int MINUS=25;
    public static final int OR=26;
    public static final int NOT=27;
    public static final int MULT=28;
    public static final int DIV=29;
    public static final int MOD=30;
    public static final int AND=31;
    public static final int CONSTANTS=32;
    public static final int VARIABLES=33;
    public static final int TYPES=34;
    public static final int PROCEDURES=35;
    public static final int MODULEBODY=36;
    public static final int PROCEDUREBODY=37;
    public static final int IDENTIFIERLIST=38;
    public static final int FORMALPARAMETER=39;
    public static final int FORMALPARAMETERS=40;
    public static final int ASSIGN=41;
    public static final int ACTUALPARAMETERS=42;
    public static final int CALL=43;
    public static final int RECORDSELECTOR=44;
    public static final int ARRAYSELECTOR=45;
    public static final int IDENT=46;
    public static final int EXPRESSION=47;
    public static final int LITERAL=48;
    public static final int DECLARATIONS=49;
    public static final int STATEMENTS=50;
    public static final int IFSTATEMENT=51;
    public static final int IDENTIFIER=52;
    public static final int INTEGER=53;
    public static final int WHITESPACE=54;

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:67:1: module : MODULE identifier ';' moduleBody '.' EOF -> ^( MODULE moduleBody ) ;
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
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:68:3: ( MODULE identifier ';' moduleBody '.' EOF -> ^( MODULE moduleBody ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:68:5: MODULE identifier ';' moduleBody '.' EOF
            {
            MODULE1=(Token)match(input,MODULE,FOLLOW_MODULE_in_module417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE1);

            pushFollow(FOLLOW_identifier_in_module419);
            identifier2=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier2.getTree());
            char_literal3=(Token)match(input,55,FOLLOW_55_in_module421); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal3);

            pushFollow(FOLLOW_moduleBody_in_module423);
            moduleBody4=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody4.getTree());
            char_literal5=(Token)match(input,56,FOLLOW_56_in_module426); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_56.add(char_literal5);

            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_module428); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF6);



            // AST REWRITE
            // elements: MODULE, moduleBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 69:3: -> ^( MODULE moduleBody )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:69:6: ^( MODULE moduleBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_MODULE.nextNode(), root_1);

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:72:1: moduleBody : declarations ( BEGIN statementSequence )? END identifier -> ^( DECLARATIONS ( declarations )? ) ( statementSequence )? ;
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:73:3: ( declarations ( BEGIN statementSequence )? END identifier -> ^( DECLARATIONS ( declarations )? ) ( statementSequence )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:73:5: declarations ( BEGIN statementSequence )? END identifier
            {
            pushFollow(FOLLOW_declarations_in_moduleBody453);
            declarations7=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations7.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:73:18: ( BEGIN statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==BEGIN) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:73:19: BEGIN statementSequence
                    {
                    BEGIN8=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN8);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody458);
                    statementSequence9=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence9.getTree());

                    }
                    break;

            }

            END10=(Token)match(input,END,FOLLOW_END_in_moduleBody462); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END10);

            pushFollow(FOLLOW_identifier_in_moduleBody464);
            identifier11=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier11.getTree());


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

            root_0 = (CommonTree)adaptor.nil();
            // 74:3: -> ^( DECLARATIONS ( declarations )? ) ( statementSequence )?
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:74:6: ^( DECLARATIONS ( declarations )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:74:21: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:74:36: ( statementSequence )?
                if ( stream_statementSequence.hasNext() ) {
                    adaptor.addChild(root_0, stream_statementSequence.nextTree());

                }
                stream_statementSequence.reset();

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

    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:77:1: identifier : IDENTIFIER ;
    public final Oberon0Parser.identifier_return identifier() throws RecognitionException {
        Oberon0Parser.identifier_return retval = new Oberon0Parser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER12=null;

        CommonTree IDENTIFIER12_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:78:3: ( IDENTIFIER )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:78:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENTIFIER12=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER12_tree = (CommonTree)adaptor.create(IDENTIFIER12);
            adaptor.addChild(root_0, IDENTIFIER12_tree);
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

    public static class integer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:81:1: integer : INTEGER ;
    public final Oberon0Parser.integer_return integer() throws RecognitionException {
        Oberon0Parser.integer_return retval = new Oberon0Parser.integer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER13=null;

        CommonTree INTEGER13_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:82:3: ( INTEGER )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:82:5: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER13=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer506); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER13_tree = (CommonTree)adaptor.create(INTEGER13);
            adaptor.addChild(root_0, INTEGER13_tree);
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:85:1: literal : integer ;
    public final Oberon0Parser.literal_return literal() throws RecognitionException {
        Oberon0Parser.literal_return retval = new Oberon0Parser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.integer_return integer14 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:86:3: ( integer )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:86:5: integer
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_integer_in_literal521);
            integer14=integer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, integer14.getTree());

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:89:1: subselector : ( '.' identifier -> ^( RECORDSELECTOR identifier ) | '[' expression ']' -> ^( ARRAYSELECTOR expression ) );
    public final Oberon0Parser.subselector_return subselector() throws RecognitionException {
        Oberon0Parser.subselector_return retval = new Oberon0Parser.subselector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal19=null;
        Oberon0Parser.identifier_return identifier16 = null;

        Oberon0Parser.expression_return expression18 = null;


        CommonTree char_literal15_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal19_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:90:3: ( '.' identifier -> ^( RECORDSELECTOR identifier ) | '[' expression ']' -> ^( ARRAYSELECTOR expression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==56) ) {
                alt2=1;
            }
            else if ( (LA2_0==57) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:90:5: '.' identifier
                    {
                    char_literal15=(Token)match(input,56,FOLLOW_56_in_subselector536); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(char_literal15);

                    pushFollow(FOLLOW_identifier_in_subselector538);
                    identifier16=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier16.getTree());


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
                    // 91:3: -> ^( RECORDSELECTOR identifier )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:91:6: ^( RECORDSELECTOR identifier )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:92:5: '[' expression ']'
                    {
                    char_literal17=(Token)match(input,57,FOLLOW_57_in_subselector554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal17);

                    pushFollow(FOLLOW_expression_in_subselector556);
                    expression18=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression18.getTree());
                    char_literal19=(Token)match(input,58,FOLLOW_58_in_subselector558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal19);



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
                    // 93:2: -> ^( ARRAYSELECTOR expression )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:93:5: ^( ARRAYSELECTOR expression )
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

    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:96:1: selector : ( subselector )* ;
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.subselector_return subselector20 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:97:3: ( ( subselector )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:97:5: ( subselector )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:97:5: ( subselector )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=56 && LA3_0<=57)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:97:6: subselector
            	    {
            	    pushFollow(FOLLOW_subselector_in_selector583);
            	    subselector20=subselector();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, subselector20.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "selector"

    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:100:1: factor : ( identifier selector -> identifier selector | literal -> literal | '(' expression ')' -> expression | NOT factor -> ^( NOT factor ) );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal24=null;
        Token char_literal26=null;
        Token NOT27=null;
        Oberon0Parser.identifier_return identifier21 = null;

        Oberon0Parser.selector_return selector22 = null;

        Oberon0Parser.literal_return literal23 = null;

        Oberon0Parser.expression_return expression25 = null;

        Oberon0Parser.factor_return factor28 = null;


        CommonTree char_literal24_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree NOT27_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:101:3: ( identifier selector -> identifier selector | literal -> literal | '(' expression ')' -> expression | NOT factor -> ^( NOT factor ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt4=1;
                }
                break;
            case INTEGER:
                {
                alt4=2;
                }
                break;
            case 59:
                {
                alt4=3;
                }
                break;
            case NOT:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:101:5: identifier selector
                    {
                    pushFollow(FOLLOW_identifier_in_factor600);
                    identifier21=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier21.getTree());
                    pushFollow(FOLLOW_selector_in_factor602);
                    selector22=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_selector.add(selector22.getTree());


                    // AST REWRITE
                    // elements: selector, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 102:3: -> identifier selector
                    {
                        adaptor.addChild(root_0, stream_identifier.nextTree());
                        adaptor.addChild(root_0, stream_selector.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:103:5: literal
                    {
                    pushFollow(FOLLOW_literal_in_factor617);
                    literal23=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literal.add(literal23.getTree());


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
                    // 104:3: -> literal
                    {
                        adaptor.addChild(root_0, stream_literal.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:105:5: '(' expression ')'
                    {
                    char_literal24=(Token)match(input,59,FOLLOW_59_in_factor629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(char_literal24);

                    pushFollow(FOLLOW_expression_in_factor631);
                    expression25=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression25.getTree());
                    char_literal26=(Token)match(input,60,FOLLOW_60_in_factor633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(char_literal26);



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
                    // 106:3: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:107:5: NOT factor
                    {
                    NOT27=(Token)match(input,NOT,FOLLOW_NOT_in_factor645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT27);

                    pushFollow(FOLLOW_factor_in_factor647);
                    factor28=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_factor.add(factor28.getTree());


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
                    // 108:3: -> ^( NOT factor )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:108:6: ^( NOT factor )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:111:1: strongops : ( MULT | DIV | MOD | AND );
    public final Oberon0Parser.strongops_return strongops() throws RecognitionException {
        Oberon0Parser.strongops_return retval = new Oberon0Parser.strongops_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set29=null;

        CommonTree set29_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:112:3: ( MULT | DIV | MOD | AND )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set29=(Token)input.LT(1);
            if ( (input.LA(1)>=MULT && input.LA(1)<=AND) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set29));
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

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:118:1: term : factor ( strongops factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.factor_return factor30 = null;

        Oberon0Parser.strongops_return strongops31 = null;

        Oberon0Parser.factor_return factor32 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:119:3: ( factor ( strongops factor )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:119:5: factor ( strongops factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term705);
            factor30=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor30.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:119:12: ( strongops factor )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=MULT && LA5_0<=AND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:119:13: strongops factor
            	    {
            	    pushFollow(FOLLOW_strongops_in_term708);
            	    strongops31=strongops();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(strongops31.getTree(), root_0);
            	    pushFollow(FOLLOW_factor_in_term711);
            	    factor32=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor32.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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

    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:122:1: unary : ( PLUS | MINUS -> ( MINUS )? );
    public final Oberon0Parser.unary_return unary() throws RecognitionException {
        Oberon0Parser.unary_return retval = new Oberon0Parser.unary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS33=null;
        Token MINUS34=null;

        CommonTree PLUS33_tree=null;
        CommonTree MINUS34_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:123:3: ( PLUS | MINUS -> ( MINUS )? )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==PLUS) ) {
                alt6=1;
            }
            else if ( (LA6_0==MINUS) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:123:5: PLUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLUS33=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary726); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS33_tree = (CommonTree)adaptor.create(PLUS33);
                    adaptor.addChild(root_0, PLUS33_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:123:12: MINUS
                    {
                    MINUS34=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS34);



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
                    // 124:3: -> ( MINUS )?
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:124:6: ( MINUS )?
                        if ( stream_MINUS.hasNext() ) {
                            adaptor.addChild(root_0, stream_MINUS.nextNode());

                        }
                        stream_MINUS.reset();

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
    // $ANTLR end "unary"

    public static class weakops_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "weakops"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:127:1: weakops : ( PLUS | MINUS | OR );
    public final Oberon0Parser.weakops_return weakops() throws RecognitionException {
        Oberon0Parser.weakops_return retval = new Oberon0Parser.weakops_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set35=null;

        CommonTree set35_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:128:3: ( PLUS | MINUS | OR )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set35=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=OR) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set35));
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

    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:133:1: simpleExpression : ( unary )? term ( weakops term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.unary_return unary36 = null;

        Oberon0Parser.term_return term37 = null;

        Oberon0Parser.weakops_return weakops38 = null;

        Oberon0Parser.term_return term39 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:134:3: ( ( unary )? term ( weakops term )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:134:5: ( unary )? term ( weakops term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:134:10: ( unary )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=PLUS && LA7_0<=MINUS)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: unary
                    {
                    pushFollow(FOLLOW_unary_in_simpleExpression777);
                    unary36=unary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(unary36.getTree(), root_0);

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression781);
            term37=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term37.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:134:18: ( weakops term )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=PLUS && LA8_0<=OR)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:134:19: weakops term
            	    {
            	    pushFollow(FOLLOW_weakops_in_simpleExpression784);
            	    weakops38=weakops();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(weakops38.getTree(), root_0);
            	    pushFollow(FOLLOW_term_in_simpleExpression787);
            	    term39=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term39.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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

    public static class comparer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparer"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:137:1: comparer : ( EQUALS | NOT_EQUALS | LT | LTE | GT | GTE );
    public final Oberon0Parser.comparer_return comparer() throws RecognitionException {
        Oberon0Parser.comparer_return retval = new Oberon0Parser.comparer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set40=null;

        CommonTree set40_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:138:3: ( EQUALS | NOT_EQUALS | LT | LTE | GT | GTE )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set40=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set40));
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

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:141:1: expression : ( simpleExpression comparer simpleExpression -> ^( comparer simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.simpleExpression_return simpleExpression41 = null;

        Oberon0Parser.comparer_return comparer42 = null;

        Oberon0Parser.simpleExpression_return simpleExpression43 = null;

        Oberon0Parser.simpleExpression_return simpleExpression44 = null;


        RewriteRuleSubtreeStream stream_comparer=new RewriteRuleSubtreeStream(adaptor,"rule comparer");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:142:3: ( simpleExpression comparer simpleExpression -> ^( comparer simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
            int alt9=2;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                int LA9_1 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case MINUS:
                {
                int LA9_2 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case IDENTIFIER:
                {
                int LA9_3 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
                {
                int LA9_4 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                int LA9_5 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    throw nvae;
                }
                }
                break;
            case NOT:
                {
                int LA9_6 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:142:5: simpleExpression comparer simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression839);
                    simpleExpression41=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression41.getTree());
                    pushFollow(FOLLOW_comparer_in_expression841);
                    comparer42=comparer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_comparer.add(comparer42.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression843);
                    simpleExpression43=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression43.getTree());


                    // AST REWRITE
                    // elements: simpleExpression, simpleExpression, comparer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 143:3: -> ^( comparer simpleExpression simpleExpression )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:143:6: ^( comparer simpleExpression simpleExpression )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:5: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression861);
                    simpleExpression44=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression44.getTree());


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
                    // 145:3: -> simpleExpression
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

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:148:1: assignment : selector ':=' expression -> ^( ASSIGN selector expression ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal46=null;
        Oberon0Parser.selector_return selector45 = null;

        Oberon0Parser.expression_return expression47 = null;


        CommonTree string_literal46_tree=null;
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:149:3: ( selector ':=' expression -> ^( ASSIGN selector expression ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:149:5: selector ':=' expression
            {
            pushFollow(FOLLOW_selector_in_assignment883);
            selector45=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector45.getTree());
            string_literal46=(Token)match(input,61,FOLLOW_61_in_assignment885); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(string_literal46);

            pushFollow(FOLLOW_expression_in_assignment887);
            expression47=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression47.getTree());


            // AST REWRITE
            // elements: expression, selector
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 150:3: -> ^( ASSIGN selector expression )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:150:6: ^( ASSIGN selector expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                adaptor.addChild(root_1, stream_selector.nextTree());
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
    // $ANTLR end "assignment"

    public static class actualParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:153:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ( expression )+ ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        Token char_literal52=null;
        Oberon0Parser.expression_return expression49 = null;

        Oberon0Parser.expression_return expression51 = null;


        CommonTree char_literal48_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree char_literal52_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:154:3: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:154:5: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal48=(Token)match(input,59,FOLLOW_59_in_actualParameters913); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal48);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:154:9: ( expression ( ',' expression )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=PLUS && LA11_0<=MINUS)||LA11_0==NOT||(LA11_0>=IDENTIFIER && LA11_0<=INTEGER)||LA11_0==59) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:154:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters916);
                    expression49=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression49.getTree());
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:154:21: ( ',' expression )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==62) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:154:22: ',' expression
                    	    {
                    	    char_literal50=(Token)match(input,62,FOLLOW_62_in_actualParameters919); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_62.add(char_literal50);

                    	    pushFollow(FOLLOW_expression_in_actualParameters921);
                    	    expression51=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression51.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal52=(Token)match(input,60,FOLLOW_60_in_actualParameters927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_60.add(char_literal52);



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
            // 156:3: -> ( expression )+
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

    public static class procedureCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:159:1: procedureCall : identifier ( actualParameters )? -> ^( CALL identifier ( actualParameters )? ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.identifier_return identifier53 = null;

        Oberon0Parser.actualParameters_return actualParameters54 = null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:160:3: ( identifier ( actualParameters )? -> ^( CALL identifier ( actualParameters )? ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:160:5: identifier ( actualParameters )?
            {
            pushFollow(FOLLOW_identifier_in_procedureCall952);
            identifier53=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier53.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:160:16: ( actualParameters )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==59) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall954);
                    actualParameters54=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters54.getTree());

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
            // 161:3: -> ^( CALL identifier ( actualParameters )? )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:161:6: ^( CALL identifier ( actualParameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:161:24: ( actualParameters )?
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

    public static class ifpart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifpart"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:164:1: ifpart : IF expression THEN statementSequence -> ^( IF expression statementSequence ) ;
    public final Oberon0Parser.ifpart_return ifpart() throws RecognitionException {
        Oberon0Parser.ifpart_return retval = new Oberon0Parser.ifpart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF55=null;
        Token THEN57=null;
        Oberon0Parser.expression_return expression56 = null;

        Oberon0Parser.statementSequence_return statementSequence58 = null;


        CommonTree IF55_tree=null;
        CommonTree THEN57_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:165:3: ( IF expression THEN statementSequence -> ^( IF expression statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:165:5: IF expression THEN statementSequence
            {
            IF55=(Token)match(input,IF,FOLLOW_IF_in_ifpart981); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF55);

            pushFollow(FOLLOW_expression_in_ifpart983);
            expression56=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression56.getTree());
            THEN57=(Token)match(input,THEN,FOLLOW_THEN_in_ifpart985); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN57);

            pushFollow(FOLLOW_statementSequence_in_ifpart987);
            statementSequence58=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence58.getTree());


            // AST REWRITE
            // elements: statementSequence, expression, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 166:3: -> ^( IF expression statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:166:6: ^( IF expression statementSequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_statementSequence.nextTree());

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:169:1: elsifpart : ELSIF expression THEN statementSequence -> ^( ELSIF expression statementSequence ) ;
    public final Oberon0Parser.elsifpart_return elsifpart() throws RecognitionException {
        Oberon0Parser.elsifpart_return retval = new Oberon0Parser.elsifpart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELSIF59=null;
        Token THEN61=null;
        Oberon0Parser.expression_return expression60 = null;

        Oberon0Parser.statementSequence_return statementSequence62 = null;


        CommonTree ELSIF59_tree=null;
        CommonTree THEN61_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:170:3: ( ELSIF expression THEN statementSequence -> ^( ELSIF expression statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:170:5: ELSIF expression THEN statementSequence
            {
            ELSIF59=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_elsifpart1014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF59);

            pushFollow(FOLLOW_expression_in_elsifpart1016);
            expression60=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression60.getTree());
            THEN61=(Token)match(input,THEN,FOLLOW_THEN_in_elsifpart1018); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN61);

            pushFollow(FOLLOW_statementSequence_in_elsifpart1020);
            statementSequence62=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence62.getTree());


            // AST REWRITE
            // elements: statementSequence, ELSIF, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 171:3: -> ^( ELSIF expression statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:171:6: ^( ELSIF expression statementSequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_statementSequence.nextTree());

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:174:1: elsepart : ELSE statementSequence -> ^( ELSE statementSequence ) ;
    public final Oberon0Parser.elsepart_return elsepart() throws RecognitionException {
        Oberon0Parser.elsepart_return retval = new Oberon0Parser.elsepart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELSE63=null;
        Oberon0Parser.statementSequence_return statementSequence64 = null;


        CommonTree ELSE63_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:175:3: ( ELSE statementSequence -> ^( ELSE statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:175:5: ELSE statementSequence
            {
            ELSE63=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsepart1045); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE63);

            pushFollow(FOLLOW_statementSequence_in_elsepart1047);
            statementSequence64=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence64.getTree());


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
            // 176:3: -> ^( ELSE statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:176:6: ^( ELSE statementSequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_statementSequence.nextTree());

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

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:179:1: ifStatement : ifpart ( elsifpart )* ( elsepart )? END -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END ) ;
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token END68=null;
        Oberon0Parser.ifpart_return ifpart65 = null;

        Oberon0Parser.elsifpart_return elsifpart66 = null;

        Oberon0Parser.elsepart_return elsepart67 = null;


        CommonTree END68_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_elsifpart=new RewriteRuleSubtreeStream(adaptor,"rule elsifpart");
        RewriteRuleSubtreeStream stream_ifpart=new RewriteRuleSubtreeStream(adaptor,"rule ifpart");
        RewriteRuleSubtreeStream stream_elsepart=new RewriteRuleSubtreeStream(adaptor,"rule elsepart");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:180:3: ( ifpart ( elsifpart )* ( elsepart )? END -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:180:5: ifpart ( elsifpart )* ( elsepart )? END
            {
            pushFollow(FOLLOW_ifpart_in_ifStatement1070);
            ifpart65=ifpart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifpart.add(ifpart65.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:181:5: ( elsifpart )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ELSIF) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: elsifpart
            	    {
            	    pushFollow(FOLLOW_elsifpart_in_ifStatement1076);
            	    elsifpart66=elsifpart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elsifpart.add(elsifpart66.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:182:5: ( elsepart )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: elsepart
                    {
                    pushFollow(FOLLOW_elsepart_in_ifStatement1083);
                    elsepart67=elsepart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsepart.add(elsepart67.getTree());

                    }
                    break;

            }

            END68=(Token)match(input,END,FOLLOW_END_in_ifStatement1090); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END68);



            // AST REWRITE
            // elements: END, elsifpart, elsepart, ifpart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 184:3: -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:184:6: ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IFSTATEMENT, "IFSTATEMENT"), root_1);

                adaptor.addChild(root_1, stream_ifpart.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:184:27: ( elsifpart )*
                while ( stream_elsifpart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsifpart.nextTree());

                }
                stream_elsifpart.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:184:38: ( elsepart )?
                if ( stream_elsepart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsepart.nextTree());

                }
                stream_elsepart.reset();
                adaptor.addChild(root_1, stream_END.nextNode());

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

    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:187:1: whileStatement : WHILE expression 'DO' statementSequence END -> ^( WHILE expression statementSequence ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE69=null;
        Token string_literal71=null;
        Token END73=null;
        Oberon0Parser.expression_return expression70 = null;

        Oberon0Parser.statementSequence_return statementSequence72 = null;


        CommonTree WHILE69_tree=null;
        CommonTree string_literal71_tree=null;
        CommonTree END73_tree=null;
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:188:3: ( WHILE expression 'DO' statementSequence END -> ^( WHILE expression statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:188:5: WHILE expression 'DO' statementSequence END
            {
            WHILE69=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1121); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE69);

            pushFollow(FOLLOW_expression_in_whileStatement1123);
            expression70=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression70.getTree());
            string_literal71=(Token)match(input,63,FOLLOW_63_in_whileStatement1125); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(string_literal71);

            pushFollow(FOLLOW_statementSequence_in_whileStatement1127);
            statementSequence72=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence72.getTree());
            END73=(Token)match(input,END,FOLLOW_END_in_whileStatement1129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END73);



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

            root_0 = (CommonTree)adaptor.nil();
            // 189:3: -> ^( WHILE expression statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:189:6: ^( WHILE expression statementSequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_statementSequence.nextTree());

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

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:192:1: statement : ( assignment | procedureCall | ifStatement | whileStatement );
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment74 = null;

        Oberon0Parser.procedureCall_return procedureCall75 = null;

        Oberon0Parser.ifStatement_return ifStatement76 = null;

        Oberon0Parser.whileStatement_return whileStatement77 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:193:3: ( assignment | procedureCall | ifStatement | whileStatement )
            int alt15=4;
            switch ( input.LA(1) ) {
            case EOF:
            case END:
            case THEN:
            case ELSIF:
            case ELSE:
            case EQUALS:
            case NOT_EQUALS:
            case GT:
            case GTE:
            case LT:
            case LTE:
            case PLUS:
            case MINUS:
            case OR:
            case MULT:
            case DIV:
            case MOD:
            case AND:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt15=1;
                }
                break;
            case IDENTIFIER:
                {
                alt15=2;
                }
                break;
            case IF:
                {
                alt15=3;
                }
                break;
            case WHILE:
                {
                alt15=4;
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:193:5: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_statement1156);
                    assignment74=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment74.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:194:5: procedureCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_procedureCall_in_statement1162);
                    procedureCall75=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall75.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:195:5: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement1168);
                    ifStatement76=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement76.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:196:5: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement1174);
                    whileStatement77=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement77.getTree());

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

    public static class statementSequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:199:1: statementSequence : statement ( ';' statement )* -> ^( STATEMENTS ( statement )+ ) ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal79=null;
        Oberon0Parser.statement_return statement78 = null;

        Oberon0Parser.statement_return statement80 = null;


        CommonTree char_literal79_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:200:3: ( statement ( ';' statement )* -> ^( STATEMENTS ( statement )+ ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:200:5: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence1189);
            statement78=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement78.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:200:15: ( ';' statement )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==55) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:200:16: ';' statement
            	    {
            	    char_literal79=(Token)match(input,55,FOLLOW_55_in_statementSequence1192); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal79);

            	    pushFollow(FOLLOW_statement_in_statementSequence1194);
            	    statement80=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement80.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // 201:3: -> ^( STATEMENTS ( statement )+ )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:201:6: ^( STATEMENTS ( statement )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STATEMENTS, "STATEMENTS"), root_1);

                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

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
    // $ANTLR end "statementSequence"

    public static class identifierList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierList"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:204:1: identifierList : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final Oberon0Parser.identifierList_return identifierList() throws RecognitionException {
        Oberon0Parser.identifierList_return retval = new Oberon0Parser.identifierList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal82=null;
        Oberon0Parser.identifier_return identifier81 = null;

        Oberon0Parser.identifier_return identifier83 = null;


        CommonTree char_literal82_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:205:3: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:205:5: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifierList1224);
            identifier81=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier81.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:205:16: ( ',' identifier )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==62) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:205:17: ',' identifier
            	    {
            	    char_literal82=(Token)match(input,62,FOLLOW_62_in_identifierList1227); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_62.add(char_literal82);

            	    pushFollow(FOLLOW_identifier_in_identifierList1229);
            	    identifier83=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier83.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // 206:3: -> ( identifier )+
            {
                if ( !(stream_identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_0, stream_identifier.nextTree());

                }
                stream_identifier.reset();

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

    public static class arrayType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:209:1: arrayType : ARRAY expression 'OF' type -> ^( ARRAY type expression ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY84=null;
        Token string_literal86=null;
        Oberon0Parser.expression_return expression85 = null;

        Oberon0Parser.type_return type87 = null;


        CommonTree ARRAY84_tree=null;
        CommonTree string_literal86_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:210:3: ( ARRAY expression 'OF' type -> ^( ARRAY type expression ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:210:5: ARRAY expression 'OF' type
            {
            ARRAY84=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1253); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY84);

            pushFollow(FOLLOW_expression_in_arrayType1255);
            expression85=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression85.getTree());
            string_literal86=(Token)match(input,64,FOLLOW_64_in_arrayType1257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_64.add(string_literal86);

            pushFollow(FOLLOW_type_in_arrayType1259);
            type87=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type87.getTree());


            // AST REWRITE
            // elements: expression, type, ARRAY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 211:3: -> ^( ARRAY type expression )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:211:6: ^( ARRAY type expression )
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

    public static class field_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:214:1: field : ( identifierList ':' type )? -> type identifierList ;
    public final Oberon0Parser.field_return field() throws RecognitionException {
        Oberon0Parser.field_return retval = new Oberon0Parser.field_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal89=null;
        Oberon0Parser.identifierList_return identifierList88 = null;

        Oberon0Parser.type_return type90 = null;


        CommonTree char_literal89_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:215:3: ( ( identifierList ':' type )? -> type identifierList )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:215:5: ( identifierList ':' type )?
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:215:5: ( identifierList ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:215:6: identifierList ':' type
                    {
                    pushFollow(FOLLOW_identifierList_in_field1285);
                    identifierList88=identifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierList.add(identifierList88.getTree());
                    char_literal89=(Token)match(input,65,FOLLOW_65_in_field1287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(char_literal89);

                    pushFollow(FOLLOW_type_in_field1289);
                    type90=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type90.getTree());

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
            // 216:3: -> type identifierList
            {
                adaptor.addChild(root_0, stream_type.nextTree());
                adaptor.addChild(root_0, stream_identifierList.nextTree());

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

    public static class recordType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:219:1: recordType : RECORD field ( ';' field )* 'END' -> ^( RECORD ( field )+ ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD91=null;
        Token char_literal93=null;
        Token string_literal95=null;
        Oberon0Parser.field_return field92 = null;

        Oberon0Parser.field_return field94 = null;


        CommonTree RECORD91_tree=null;
        CommonTree char_literal93_tree=null;
        CommonTree string_literal95_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:220:3: ( RECORD field ( ';' field )* 'END' -> ^( RECORD ( field )+ ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:220:5: RECORD field ( ';' field )* 'END'
            {
            RECORD91=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1315); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD91);

            pushFollow(FOLLOW_field_in_recordType1317);
            field92=field();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_field.add(field92.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:220:18: ( ';' field )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==55) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:220:19: ';' field
            	    {
            	    char_literal93=(Token)match(input,55,FOLLOW_55_in_recordType1320); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal93);

            	    pushFollow(FOLLOW_field_in_recordType1322);
            	    field94=field();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field.add(field94.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            string_literal95=(Token)match(input,END,FOLLOW_END_in_recordType1326); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal95);



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
            // 221:3: -> ^( RECORD ( field )+ )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:221:6: ^( RECORD ( field )+ )
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

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:224:1: type : ( identifier | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.identifier_return identifier96 = null;

        Oberon0Parser.arrayType_return arrayType97 = null;

        Oberon0Parser.recordType_return recordType98 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:225:3: ( identifier | arrayType | recordType )
            int alt20=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt20=1;
                }
                break;
            case ARRAY:
                {
                alt20=2;
                }
                break;
            case RECORD:
                {
                alt20=3;
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:225:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_type1350);
                    identifier96=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier96.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:226:5: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1356);
                    arrayType97=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType97.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:227:5: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1362);
                    recordType98=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType98.getTree());

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

    public static class fpSection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fpSection"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:230:1: fpSection : ( 'VAR' )? identifierList ':' type -> ^( FORMALPARAMETER ( 'VAR' )? type ^( IDENTIFIERLIST identifierList ) ) ;
    public final Oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        Oberon0Parser.fpSection_return retval = new Oberon0Parser.fpSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal99=null;
        Token char_literal101=null;
        Oberon0Parser.identifierList_return identifierList100 = null;

        Oberon0Parser.type_return type102 = null;


        CommonTree string_literal99_tree=null;
        CommonTree char_literal101_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:231:3: ( ( 'VAR' )? identifierList ':' type -> ^( FORMALPARAMETER ( 'VAR' )? type ^( IDENTIFIERLIST identifierList ) ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:231:5: ( 'VAR' )? identifierList ':' type
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:231:5: ( 'VAR' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==VAR) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: 'VAR'
                    {
                    string_literal99=(Token)match(input,VAR,FOLLOW_VAR_in_fpSection1379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(string_literal99);


                    }
                    break;

            }

            pushFollow(FOLLOW_identifierList_in_fpSection1382);
            identifierList100=identifierList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifierList.add(identifierList100.getTree());
            char_literal101=(Token)match(input,65,FOLLOW_65_in_fpSection1384); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(char_literal101);

            pushFollow(FOLLOW_type_in_fpSection1386);
            type102=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type102.getTree());


            // AST REWRITE
            // elements: type, VAR, identifierList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 232:3: -> ^( FORMALPARAMETER ( 'VAR' )? type ^( IDENTIFIERLIST identifierList ) )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:232:6: ^( FORMALPARAMETER ( 'VAR' )? type ^( IDENTIFIERLIST identifierList ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMALPARAMETER, "FORMALPARAMETER"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:232:24: ( 'VAR' )?
                if ( stream_VAR.hasNext() ) {
                    adaptor.addChild(root_1, stream_VAR.nextNode());

                }
                stream_VAR.reset();
                adaptor.addChild(root_1, stream_type.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:232:36: ^( IDENTIFIERLIST identifierList )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENTIFIERLIST, "IDENTIFIERLIST"), root_2);

                adaptor.addChild(root_2, stream_identifierList.nextTree());

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
    // $ANTLR end "fpSection"

    public static class formalParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:235:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' -> ( fpSection )+ ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal107=null;
        Oberon0Parser.fpSection_return fpSection104 = null;

        Oberon0Parser.fpSection_return fpSection106 = null;


        CommonTree char_literal103_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree char_literal107_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:236:3: ( '(' ( fpSection ( ';' fpSection )* )? ')' -> ( fpSection )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:236:5: '(' ( fpSection ( ';' fpSection )* )? ')'
            {
            char_literal103=(Token)match(input,59,FOLLOW_59_in_formalParameters1421); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal103);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:236:9: ( fpSection ( ';' fpSection )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VAR||LA23_0==IDENTIFIER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:236:10: fpSection ( ';' fpSection )*
                    {
                    pushFollow(FOLLOW_fpSection_in_formalParameters1424);
                    fpSection104=fpSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fpSection.add(fpSection104.getTree());
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:236:20: ( ';' fpSection )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==55) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:236:21: ';' fpSection
                    	    {
                    	    char_literal105=(Token)match(input,55,FOLLOW_55_in_formalParameters1427); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_55.add(char_literal105);

                    	    pushFollow(FOLLOW_fpSection_in_formalParameters1429);
                    	    fpSection106=fpSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fpSection.add(fpSection106.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal107=(Token)match(input,60,FOLLOW_60_in_formalParameters1435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_60.add(char_literal107);



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
            // 238:3: -> ( fpSection )+
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

    public static class procedureHeading_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureHeading"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:241:1: procedureHeading : PROCEDURE identifier ( formalParameters )? -> identifier ( formalParameters )? ;
    public final Oberon0Parser.procedureHeading_return procedureHeading() throws RecognitionException {
        Oberon0Parser.procedureHeading_return retval = new Oberon0Parser.procedureHeading_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE108=null;
        Oberon0Parser.identifier_return identifier109 = null;

        Oberon0Parser.formalParameters_return formalParameters110 = null;


        CommonTree PROCEDURE108_tree=null;
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:242:3: ( PROCEDURE identifier ( formalParameters )? -> identifier ( formalParameters )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:242:6: PROCEDURE identifier ( formalParameters )?
            {
            PROCEDURE108=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureHeading1457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE108);

            pushFollow(FOLLOW_identifier_in_procedureHeading1459);
            identifier109=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier109.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:242:27: ( formalParameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==59) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading1461);
                    formalParameters110=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters110.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: formalParameters, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 243:3: -> identifier ( formalParameters )?
            {
                adaptor.addChild(root_0, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:243:17: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_0, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();

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

    public static class procedureBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:246:1: procedureBody : declarations ( 'BEGIN' statementSequence )? 'END' identifier -> ^( DECLARATIONS declarations ) ( statementSequence )? ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal112=null;
        Token string_literal114=null;
        Oberon0Parser.declarations_return declarations111 = null;

        Oberon0Parser.statementSequence_return statementSequence113 = null;

        Oberon0Parser.identifier_return identifier115 = null;


        CommonTree string_literal112_tree=null;
        CommonTree string_literal114_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:247:3: ( declarations ( 'BEGIN' statementSequence )? 'END' identifier -> ^( DECLARATIONS declarations ) ( statementSequence )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:247:7: declarations ( 'BEGIN' statementSequence )? 'END' identifier
            {
            pushFollow(FOLLOW_declarations_in_procedureBody1491);
            declarations111=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations111.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:247:20: ( 'BEGIN' statementSequence )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BEGIN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:247:21: 'BEGIN' statementSequence
                    {
                    string_literal112=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(string_literal112);

                    pushFollow(FOLLOW_statementSequence_in_procedureBody1496);
                    statementSequence113=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence113.getTree());

                    }
                    break;

            }

            string_literal114=(Token)match(input,END,FOLLOW_END_in_procedureBody1500); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal114);

            pushFollow(FOLLOW_identifier_in_procedureBody1502);
            identifier115=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier115.getTree());


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
            // 248:3: -> ^( DECLARATIONS declarations ) ( statementSequence )?
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:248:7: ^( DECLARATIONS declarations )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                adaptor.addChild(root_1, stream_declarations.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:248:36: ( statementSequence )?
                if ( stream_statementSequence.hasNext() ) {
                    adaptor.addChild(root_0, stream_statementSequence.nextTree());

                }
                stream_statementSequence.reset();

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

    public static class procedureDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:251:1: procedureDeclarations : procedureHeading ';' procedureBody -> ^( PROCEDURE procedureHeading procedureBody ) ;
    public final Oberon0Parser.procedureDeclarations_return procedureDeclarations() throws RecognitionException {
        Oberon0Parser.procedureDeclarations_return retval = new Oberon0Parser.procedureDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal117=null;
        Oberon0Parser.procedureHeading_return procedureHeading116 = null;

        Oberon0Parser.procedureBody_return procedureBody118 = null;


        CommonTree char_literal117_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:252:3: ( procedureHeading ';' procedureBody -> ^( PROCEDURE procedureHeading procedureBody ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:252:5: procedureHeading ';' procedureBody
            {
            pushFollow(FOLLOW_procedureHeading_in_procedureDeclarations1534);
            procedureHeading116=procedureHeading();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_procedureHeading.add(procedureHeading116.getTree());
            char_literal117=(Token)match(input,55,FOLLOW_55_in_procedureDeclarations1536); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal117);

            pushFollow(FOLLOW_procedureBody_in_procedureDeclarations1538);
            procedureBody118=procedureBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody118.getTree());


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
            // 253:3: -> ^( PROCEDURE procedureHeading procedureBody )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:253:6: ^( PROCEDURE procedureHeading procedureBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE, "PROCEDURE"), root_1);

                adaptor.addChild(root_1, stream_procedureHeading.nextTree());
                adaptor.addChild(root_1, stream_procedureBody.nextTree());

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
    // $ANTLR end "procedureDeclarations"

    public static class constantDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:256:1: constantDeclarations : CONST ( identifier '=' expression ';' )* -> ( ^( CONST identifier expression ) )* ;
    public final Oberon0Parser.constantDeclarations_return constantDeclarations() throws RecognitionException {
        Oberon0Parser.constantDeclarations_return retval = new Oberon0Parser.constantDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST119=null;
        Token char_literal121=null;
        Token char_literal123=null;
        Oberon0Parser.identifier_return identifier120 = null;

        Oberon0Parser.expression_return expression122 = null;


        CommonTree CONST119_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree char_literal123_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:257:3: ( CONST ( identifier '=' expression ';' )* -> ( ^( CONST identifier expression ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:257:5: CONST ( identifier '=' expression ';' )*
            {
            CONST119=(Token)match(input,CONST,FOLLOW_CONST_in_constantDeclarations1565); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST119);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:257:11: ( identifier '=' expression ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENTIFIER) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:257:12: identifier '=' expression ';'
            	    {
            	    pushFollow(FOLLOW_identifier_in_constantDeclarations1568);
            	    identifier120=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier120.getTree());
            	    char_literal121=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constantDeclarations1570); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal121);

            	    pushFollow(FOLLOW_expression_in_constantDeclarations1572);
            	    expression122=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression122.getTree());
            	    char_literal123=(Token)match(input,55,FOLLOW_55_in_constantDeclarations1574); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal123);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // AST REWRITE
            // elements: CONST, identifier, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 258:3: -> ( ^( CONST identifier expression ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:258:6: ( ^( CONST identifier expression ) )*
                while ( stream_CONST.hasNext()||stream_identifier.hasNext()||stream_expression.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:258:6: ^( CONST identifier expression )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_identifier.nextTree());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_CONST.reset();
                stream_identifier.reset();
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
    // $ANTLR end "constantDeclarations"

    public static class typeDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:261:1: typeDeclarations : TYPE ( identifier '=' type ';' )* -> ( ^( TYPE identifier type ) )* ;
    public final Oberon0Parser.typeDeclarations_return typeDeclarations() throws RecognitionException {
        Oberon0Parser.typeDeclarations_return retval = new Oberon0Parser.typeDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE124=null;
        Token char_literal126=null;
        Token char_literal128=null;
        Oberon0Parser.identifier_return identifier125 = null;

        Oberon0Parser.type_return type127 = null;


        CommonTree TYPE124_tree=null;
        CommonTree char_literal126_tree=null;
        CommonTree char_literal128_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:262:3: ( TYPE ( identifier '=' type ';' )* -> ( ^( TYPE identifier type ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:262:5: TYPE ( identifier '=' type ';' )*
            {
            TYPE124=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclarations1604); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE124);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:262:10: ( identifier '=' type ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENTIFIER) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:262:11: identifier '=' type ';'
            	    {
            	    pushFollow(FOLLOW_identifier_in_typeDeclarations1607);
            	    identifier125=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier125.getTree());
            	    char_literal126=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclarations1609); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal126);

            	    pushFollow(FOLLOW_type_in_typeDeclarations1611);
            	    type127=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type127.getTree());
            	    char_literal128=(Token)match(input,55,FOLLOW_55_in_typeDeclarations1613); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal128);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);



            // AST REWRITE
            // elements: identifier, type, TYPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 263:3: -> ( ^( TYPE identifier type ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:263:6: ( ^( TYPE identifier type ) )*
                while ( stream_identifier.hasNext()||stream_type.hasNext()||stream_TYPE.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:263:6: ^( TYPE identifier type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_identifier.nextTree());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_identifier.reset();
                stream_type.reset();
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

    public static class varDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:266:1: varDeclarations : VAR ( identifierList ':' type ';' )* -> ( ^( VAR type identifierList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR129=null;
        Token char_literal131=null;
        Token char_literal133=null;
        Oberon0Parser.identifierList_return identifierList130 = null;

        Oberon0Parser.type_return type132 = null;


        CommonTree VAR129_tree=null;
        CommonTree char_literal131_tree=null;
        CommonTree char_literal133_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:267:3: ( VAR ( identifierList ':' type ';' )* -> ( ^( VAR type identifierList ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:267:5: VAR ( identifierList ':' type ';' )*
            {
            VAR129=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR129);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:267:9: ( identifierList ':' type ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==IDENTIFIER) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:267:10: identifierList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identifierList_in_varDeclarations1646);
            	    identifierList130=identifierList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifierList.add(identifierList130.getTree());
            	    char_literal131=(Token)match(input,65,FOLLOW_65_in_varDeclarations1648); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_65.add(char_literal131);

            	    pushFollow(FOLLOW_type_in_varDeclarations1650);
            	    type132=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type132.getTree());
            	    char_literal133=(Token)match(input,55,FOLLOW_55_in_varDeclarations1652); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal133);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);



            // AST REWRITE
            // elements: type, VAR, identifierList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 268:3: -> ( ^( VAR type identifierList ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:268:6: ( ^( VAR type identifierList ) )*
                while ( stream_type.hasNext()||stream_VAR.hasNext()||stream_identifierList.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:268:6: ^( VAR type identifierList )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_identifierList.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_VAR.reset();
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

    public static class declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:271:1: declarations : ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations ';' )* -> ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( ( procedureDeclarations )* )? ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal138=null;
        Oberon0Parser.constantDeclarations_return constantDeclarations134 = null;

        Oberon0Parser.typeDeclarations_return typeDeclarations135 = null;

        Oberon0Parser.varDeclarations_return varDeclarations136 = null;

        Oberon0Parser.procedureDeclarations_return procedureDeclarations137 = null;


        CommonTree char_literal138_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_procedureDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclarations");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_constantDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclarations");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:272:3: ( ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations ';' )* -> ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( ( procedureDeclarations )* )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:272:5: ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations ';' )*
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:272:5: ( constantDeclarations )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CONST) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: constantDeclarations
                    {
                    pushFollow(FOLLOW_constantDeclarations_in_declarations1682);
                    constantDeclarations134=constantDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constantDeclarations.add(constantDeclarations134.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:273:5: ( typeDeclarations )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==TYPE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: typeDeclarations
                    {
                    pushFollow(FOLLOW_typeDeclarations_in_declarations1689);
                    typeDeclarations135=typeDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclarations.add(typeDeclarations135.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:274:5: ( varDeclarations )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VAR) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1696);
                    varDeclarations136=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations136.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:275:5: ( procedureDeclarations ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PROCEDURE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:275:6: procedureDeclarations ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclarations_in_declarations1705);
            	    procedureDeclarations137=procedureDeclarations();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclarations.add(procedureDeclarations137.getTree());
            	    char_literal138=(Token)match(input,55,FOLLOW_55_in_declarations1707); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal138);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: procedureDeclarations, varDeclarations, typeDeclarations, constantDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 280:2: -> ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( ( procedureDeclarations )* )?
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:280:5: ( constantDeclarations )?
                if ( stream_constantDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_constantDeclarations.nextTree());

                }
                stream_constantDeclarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:281:5: ( typeDeclarations )?
                if ( stream_typeDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclarations.nextTree());

                }
                stream_typeDeclarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:282:5: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:283:5: ( ( procedureDeclarations )* )?
                if ( stream_procedureDeclarations.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:283:6: ( procedureDeclarations )*
                    while ( stream_procedureDeclarations.hasNext() ) {
                        adaptor.addChild(root_0, stream_procedureDeclarations.nextTree());

                    }
                    stream_procedureDeclarations.reset();

                }
                stream_procedureDeclarations.reset();

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

    // $ANTLR start synpred21_Oberon0
    public final void synpred21_Oberon0_fragment() throws RecognitionException {   
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:142:5: ( simpleExpression comparer simpleExpression )
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:142:5: simpleExpression comparer simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred21_Oberon0839);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_comparer_in_synpred21_Oberon0841);
        comparer();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred21_Oberon0843);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Oberon0

    // Delegated rules

    public final boolean synpred21_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_MODULE_in_module417 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_module419 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_module421 = new BitSet(new long[]{0x00000000000013E0L});
    public static final BitSet FOLLOW_moduleBody_in_module423 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_module426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody453 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody456 = new BitSet(new long[]{0x2310000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody458 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_moduleBody462 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_moduleBody464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_literal521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_subselector536 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_subselector538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_subselector554 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_expression_in_subselector556 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_subselector558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subselector_in_selector583 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_identifier_in_factor600 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_selector_in_factor602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_factor629 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_expression_in_factor631 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_factor633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor645 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_factor_in_factor647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_strongops0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term705 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_strongops_in_term708 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_factor_in_term711 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_PLUS_in_unary726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_weakops0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_simpleExpression777 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_term_in_simpleExpression781 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_weakops_in_simpleExpression784 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_term_in_simpleExpression787 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_comparer0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression839 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_comparer_in_expression841 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_simpleExpression_in_expression843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_assignment883 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_assignment885 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_expression_in_assignment887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_actualParameters913 = new BitSet(new long[]{0x183000000B000000L});
    public static final BitSet FOLLOW_expression_in_actualParameters916 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_62_in_actualParameters919 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_expression_in_actualParameters921 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_60_in_actualParameters927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_procedureCall952 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifpart981 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_expression_in_ifpart983 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifpart985 = new BitSet(new long[]{0x2310000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_ifpart987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_elsifpart1014 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_expression_in_elsifpart1016 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_elsifpart1018 = new BitSet(new long[]{0x2310000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_elsifpart1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsepart1045 = new BitSet(new long[]{0x2310000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_elsepart1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifpart_in_ifStatement1070 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_elsifpart_in_ifStatement1076 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_elsepart_in_ifStatement1083 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_ifStatement1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1121 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1123 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_whileStatement1125 = new BitSet(new long[]{0x2310000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1127 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_whileStatement1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1189 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_statementSequence1192 = new BitSet(new long[]{0x2310000000006000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1194 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierList1224 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_identifierList1227 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_identifierList1229 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1253 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_expression_in_arrayType1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayType1257 = new BitSet(new long[]{0x0010000000000C00L});
    public static final BitSet FOLLOW_type_in_arrayType1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_field1285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_field1287 = new BitSet(new long[]{0x0010000000000C00L});
    public static final BitSet FOLLOW_type_in_field1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1315 = new BitSet(new long[]{0x0090000000000040L});
    public static final BitSet FOLLOW_field_in_recordType1317 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_55_in_recordType1320 = new BitSet(new long[]{0x0090000000000040L});
    public static final BitSet FOLLOW_field_in_recordType1322 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_END_in_recordType1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_type1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection1379 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_identifierList_in_fpSection1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_fpSection1384 = new BitSet(new long[]{0x0010000000000C00L});
    public static final BitSet FOLLOW_type_in_fpSection1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_formalParameters1421 = new BitSet(new long[]{0x1010000000000200L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1424 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_55_in_formalParameters1427 = new BitSet(new long[]{0x0010000000000200L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1429 = new BitSet(new long[]{0x1080000000000000L});
    public static final BitSet FOLLOW_60_in_formalParameters1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureHeading1457 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_procedureHeading1459 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody1491 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1494 = new BitSet(new long[]{0x2310000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1496 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_procedureBody1500 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_identifier_in_procedureBody1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclarations1534 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_procedureDeclarations1536 = new BitSet(new long[]{0x00000000000013E0L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclarations1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constantDeclarations1565 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_identifier_in_constantDeclarations1568 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_constantDeclarations1570 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations1572 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_constantDeclarations1574 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclarations1604 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeDeclarations1607 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations1609 = new BitSet(new long[]{0x0010000000000C00L});
    public static final BitSet FOLLOW_type_in_typeDeclarations1611 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_typeDeclarations1613 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1643 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_identifierList_in_varDeclarations1646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_varDeclarations1648 = new BitSet(new long[]{0x0010000000000C00L});
    public static final BitSet FOLLOW_type_in_varDeclarations1650 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_varDeclarations1652 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations1682 = new BitSet(new long[]{0x0000000000001302L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations1689 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1696 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations1705 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_declarations1707 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred21_Oberon0839 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_comparer_in_synpred21_Oberon0841 = new BitSet(new long[]{0x083000000B000000L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred21_Oberon0843 = new BitSet(new long[]{0x0000000000000002L});

}