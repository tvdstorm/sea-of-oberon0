// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g 2011-02-16 21:14:12

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "BEGIN", "END", "CONST", "TYPE", "VAR", "ARRAY", "RECORD", "PROCEDURE", "WHILE", "IF", "THEN", "ELSIF", "ELSE", "WITH", "EQUALS", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "PLUS", "MINUS", "OR", "NOT", "MULT", "DIV", "MOD", "AND", "CONSTANTS", "VARIABLES", "TYPES", "PROCEDURES", "MODULEBODY", "PROCEDUREBODY", "FORMALPARAMETER", "FORMALPARAMETERS", "ASSIGN", "ACTUALPARAMETERS", "CALL", "IDENT_SELECT", "SELECTORS", "RECORDSELECTOR", "ARRAYSELECTOR", "IDENT", "EXPRESSION", "LITERAL", "DECLARATIONS", "STATEMENTS", "IFSTATEMENT", "FIELD", "IDENTIFIER", "INTEGER", "WHITESPACE", "';'", "'.'", "'['", "']'", "'('", "')'", "':='", "','", "'DO'", "'OF'", "':'"
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
    public static final int CONSTANTS=33;
    public static final int VARIABLES=34;
    public static final int TYPES=35;
    public static final int PROCEDURES=36;
    public static final int MODULEBODY=37;
    public static final int PROCEDUREBODY=38;
    public static final int FORMALPARAMETER=39;
    public static final int FORMALPARAMETERS=40;
    public static final int ASSIGN=41;
    public static final int ACTUALPARAMETERS=42;
    public static final int CALL=43;
    public static final int IDENT_SELECT=44;
    public static final int SELECTORS=45;
    public static final int RECORDSELECTOR=46;
    public static final int ARRAYSELECTOR=47;
    public static final int IDENT=48;
    public static final int EXPRESSION=49;
    public static final int LITERAL=50;
    public static final int DECLARATIONS=51;
    public static final int STATEMENTS=52;
    public static final int IFSTATEMENT=53;
    public static final int FIELD=54;
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:70:1: module : MODULE identifier ';' moduleBody '.' EOF -> ^( MODULE moduleBody ) ;
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:71:3: ( MODULE identifier ';' moduleBody '.' EOF -> ^( MODULE moduleBody ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:71:5: MODULE identifier ';' moduleBody '.' EOF
            {
            MODULE1=(Token)match(input,MODULE,FOLLOW_MODULE_in_module436); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE1);

            pushFollow(FOLLOW_identifier_in_module438);
            identifier2=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier2.getTree());
            char_literal3=(Token)match(input,58,FOLLOW_58_in_module440); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(char_literal3);

            pushFollow(FOLLOW_moduleBody_in_module442);
            moduleBody4=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody4.getTree());
            char_literal5=(Token)match(input,59,FOLLOW_59_in_module445); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_59.add(char_literal5);

            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_module447); if (state.failed) return retval; 
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
            // 72:3: -> ^( MODULE moduleBody )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:72:6: ^( MODULE moduleBody )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:75:1: moduleBody : declarations ( BEGIN statementSequence )? END identifier -> ^( DECLARATIONS ( declarations )? ) ( statementSequence )? ;
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:76:3: ( declarations ( BEGIN statementSequence )? END identifier -> ^( DECLARATIONS ( declarations )? ) ( statementSequence )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:76:5: declarations ( BEGIN statementSequence )? END identifier
            {
            pushFollow(FOLLOW_declarations_in_moduleBody472);
            declarations7=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations7.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:76:18: ( BEGIN statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==BEGIN) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:76:19: BEGIN statementSequence
                    {
                    BEGIN8=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN8);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody477);
                    statementSequence9=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence9.getTree());

                    }
                    break;

            }

            END10=(Token)match(input,END,FOLLOW_END_in_moduleBody481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END10);

            pushFollow(FOLLOW_identifier_in_moduleBody483);
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
            // 77:3: -> ^( DECLARATIONS ( declarations )? ) ( statementSequence )?
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:77:6: ^( DECLARATIONS ( declarations )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:77:21: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:77:36: ( statementSequence )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:80:1: identifier : IDENTIFIER ;
    public final Oberon0Parser.identifier_return identifier() throws RecognitionException {
        Oberon0Parser.identifier_return retval = new Oberon0Parser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER12=null;

        CommonTree IDENTIFIER12_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:81:3: ( IDENTIFIER )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:81:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENTIFIER12=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier510); if (state.failed) return retval;
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:84:1: integer : INTEGER ;
    public final Oberon0Parser.integer_return integer() throws RecognitionException {
        Oberon0Parser.integer_return retval = new Oberon0Parser.integer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER13=null;

        CommonTree INTEGER13_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:85:3: ( INTEGER )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:85:5: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER13=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer525); if (state.failed) return retval;
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:1: literal : integer ;
    public final Oberon0Parser.literal_return literal() throws RecognitionException {
        Oberon0Parser.literal_return retval = new Oberon0Parser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.integer_return integer14 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:89:3: ( integer )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:89:5: integer
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_integer_in_literal540);
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:92:1: subselector : ( '.' identifier -> ^( RECORDSELECTOR identifier ) | '[' expression ']' -> ^( ARRAYSELECTOR expression ) );
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
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:93:3: ( '.' identifier -> ^( RECORDSELECTOR identifier ) | '[' expression ']' -> ^( ARRAYSELECTOR expression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==59) ) {
                alt2=1;
            }
            else if ( (LA2_0==60) ) {
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:93:5: '.' identifier
                    {
                    char_literal15=(Token)match(input,59,FOLLOW_59_in_subselector555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(char_literal15);

                    pushFollow(FOLLOW_identifier_in_subselector557);
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
                    // 94:3: -> ^( RECORDSELECTOR identifier )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:94:6: ^( RECORDSELECTOR identifier )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:95:5: '[' expression ']'
                    {
                    char_literal17=(Token)match(input,60,FOLLOW_60_in_subselector573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(char_literal17);

                    pushFollow(FOLLOW_expression_in_subselector575);
                    expression18=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression18.getTree());
                    char_literal19=(Token)match(input,61,FOLLOW_61_in_subselector577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(char_literal19);



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
                    // 96:2: -> ^( ARRAYSELECTOR expression )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:96:5: ^( ARRAYSELECTOR expression )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:99:1: selector : ( subselector )* ;
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.subselector_return subselector20 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:100:3: ( ( subselector )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:100:5: ( subselector )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:100:5: ( subselector )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=59 && LA3_0<=60)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:100:6: subselector
            	    {
            	    pushFollow(FOLLOW_subselector_in_selector602);
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:103:1: factor : ( identifier selector -> ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) | literal -> literal | '(' expression ')' -> expression | NOT factor -> ^( NOT factor ) );
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
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:104:3: ( identifier selector -> ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) | literal -> literal | '(' expression ')' -> expression | NOT factor -> ^( NOT factor ) )
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
            case 62:
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:104:5: identifier selector
                    {
                    pushFollow(FOLLOW_identifier_in_factor619);
                    identifier21=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier21.getTree());
                    pushFollow(FOLLOW_selector_in_factor621);
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
                    // 105:3: -> ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:105:6: ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENT_SELECT, "IDENT_SELECT"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:105:32: ( ^( SELECTORS selector ) )?
                        if ( stream_selector.hasNext() ) {
                            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:105:32: ^( SELECTORS selector )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECTORS, "SELECTORS"), root_2);

                            adaptor.addChild(root_2, stream_selector.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_selector.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:106:5: literal
                    {
                    pushFollow(FOLLOW_literal_in_factor644);
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
                    // 107:3: -> literal
                    {
                        adaptor.addChild(root_0, stream_literal.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:108:5: '(' expression ')'
                    {
                    char_literal24=(Token)match(input,62,FOLLOW_62_in_factor656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_62.add(char_literal24);

                    pushFollow(FOLLOW_expression_in_factor658);
                    expression25=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression25.getTree());
                    char_literal26=(Token)match(input,63,FOLLOW_63_in_factor660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(char_literal26);



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
                    // 109:3: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:110:5: NOT factor
                    {
                    NOT27=(Token)match(input,NOT,FOLLOW_NOT_in_factor672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT27);

                    pushFollow(FOLLOW_factor_in_factor674);
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
                    // 111:3: -> ^( NOT factor )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:111:6: ^( NOT factor )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:114:1: strongops : ( MULT | DIV | MOD | AND );
    public final Oberon0Parser.strongops_return strongops() throws RecognitionException {
        Oberon0Parser.strongops_return retval = new Oberon0Parser.strongops_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set29=null;

        CommonTree set29_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:115:3: ( MULT | DIV | MOD | AND )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:121:1: term : factor ( strongops factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.factor_return factor30 = null;

        Oberon0Parser.strongops_return strongops31 = null;

        Oberon0Parser.factor_return factor32 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:122:3: ( factor ( strongops factor )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:122:5: factor ( strongops factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term732);
            factor30=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor30.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:122:12: ( strongops factor )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=MULT && LA5_0<=AND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:122:13: strongops factor
            	    {
            	    pushFollow(FOLLOW_strongops_in_term735);
            	    strongops31=strongops();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(strongops31.getTree(), root_0);
            	    pushFollow(FOLLOW_factor_in_term738);
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:125:1: unary : ( PLUS | MINUS -> ( MINUS )? );
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:126:3: ( PLUS | MINUS -> ( MINUS )? )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:126:5: PLUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLUS33=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary753); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS33_tree = (CommonTree)adaptor.create(PLUS33);
                    adaptor.addChild(root_0, PLUS33_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:126:12: MINUS
                    {
                    MINUS34=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary757); if (state.failed) return retval; 
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
                    // 127:3: -> ( MINUS )?
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:127:6: ( MINUS )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:130:1: weakops : ( PLUS | MINUS | OR );
    public final Oberon0Parser.weakops_return weakops() throws RecognitionException {
        Oberon0Parser.weakops_return retval = new Oberon0Parser.weakops_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set35=null;

        CommonTree set35_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:131:3: ( PLUS | MINUS | OR )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:136:1: simpleExpression : ( unary )? term ( weakops term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.unary_return unary36 = null;

        Oberon0Parser.term_return term37 = null;

        Oberon0Parser.weakops_return weakops38 = null;

        Oberon0Parser.term_return term39 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:137:3: ( ( unary )? term ( weakops term )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:137:5: ( unary )? term ( weakops term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:137:10: ( unary )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=PLUS && LA7_0<=MINUS)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: unary
                    {
                    pushFollow(FOLLOW_unary_in_simpleExpression804);
                    unary36=unary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(unary36.getTree(), root_0);

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression808);
            term37=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term37.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:137:18: ( weakops term )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=PLUS && LA8_0<=OR)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:137:19: weakops term
            	    {
            	    pushFollow(FOLLOW_weakops_in_simpleExpression811);
            	    weakops38=weakops();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(weakops38.getTree(), root_0);
            	    pushFollow(FOLLOW_term_in_simpleExpression814);
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:140:1: comparer : ( EQUALS | NOT_EQUALS | LT | LTE | GT | GTE );
    public final Oberon0Parser.comparer_return comparer() throws RecognitionException {
        Oberon0Parser.comparer_return retval = new Oberon0Parser.comparer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set40=null;

        CommonTree set40_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:141:3: ( EQUALS | NOT_EQUALS | LT | LTE | GT | GTE )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:1: expression : ( simpleExpression comparer simpleExpression -> ^( comparer simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:145:3: ( simpleExpression comparer simpleExpression -> ^( comparer simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
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
            case 62:
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:145:5: simpleExpression comparer simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression866);
                    simpleExpression41=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression41.getTree());
                    pushFollow(FOLLOW_comparer_in_expression868);
                    comparer42=comparer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_comparer.add(comparer42.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression870);
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
                    // 146:3: -> ^( comparer simpleExpression simpleExpression )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:146:6: ^( comparer simpleExpression simpleExpression )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:147:5: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression888);
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
                    // 148:3: -> simpleExpression
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:151:1: assignment : identifier selector ':=' expression -> ^( ASSIGN expression ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal47=null;
        Oberon0Parser.identifier_return identifier45 = null;

        Oberon0Parser.selector_return selector46 = null;

        Oberon0Parser.expression_return expression48 = null;


        CommonTree string_literal47_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:152:3: ( identifier selector ':=' expression -> ^( ASSIGN expression ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:152:5: identifier selector ':=' expression
            {
            pushFollow(FOLLOW_identifier_in_assignment910);
            identifier45=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier45.getTree());
            pushFollow(FOLLOW_selector_in_assignment912);
            selector46=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector46.getTree());
            string_literal47=(Token)match(input,64,FOLLOW_64_in_assignment914); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_64.add(string_literal47);

            pushFollow(FOLLOW_expression_in_assignment916);
            expression48=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());


            // AST REWRITE
            // elements: expression, selector, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 153:3: -> ^( ASSIGN expression ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:153:6: ^( ASSIGN expression ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:153:26: ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENT_SELECT, "IDENT_SELECT"), root_2);

                adaptor.addChild(root_2, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:153:52: ( ^( SELECTORS selector ) )?
                if ( stream_selector.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:153:52: ^( SELECTORS selector )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECTORS, "SELECTORS"), root_3);

                    adaptor.addChild(root_3, stream_selector.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_selector.reset();

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

    public static class actualParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:156:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ( expression )+ ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal49=null;
        Token char_literal51=null;
        Token char_literal53=null;
        Oberon0Parser.expression_return expression50 = null;

        Oberon0Parser.expression_return expression52 = null;


        CommonTree char_literal49_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal53_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:157:3: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:157:5: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal49=(Token)match(input,62,FOLLOW_62_in_actualParameters953); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(char_literal49);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:157:9: ( expression ( ',' expression )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=PLUS && LA11_0<=MINUS)||LA11_0==NOT||(LA11_0>=IDENTIFIER && LA11_0<=INTEGER)||LA11_0==62) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:157:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters956);
                    expression50=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression50.getTree());
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:157:21: ( ',' expression )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==65) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:157:22: ',' expression
                    	    {
                    	    char_literal51=(Token)match(input,65,FOLLOW_65_in_actualParameters959); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_65.add(char_literal51);

                    	    pushFollow(FOLLOW_expression_in_actualParameters961);
                    	    expression52=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression52.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal53=(Token)match(input,63,FOLLOW_63_in_actualParameters967); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(char_literal53);



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
            // 159:3: -> ( expression )+
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:162:1: procedureCall : identifier ( actualParameters )? -> ^( CALL identifier ( actualParameters )? ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.identifier_return identifier54 = null;

        Oberon0Parser.actualParameters_return actualParameters55 = null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:163:3: ( identifier ( actualParameters )? -> ^( CALL identifier ( actualParameters )? ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:163:5: identifier ( actualParameters )?
            {
            pushFollow(FOLLOW_identifier_in_procedureCall992);
            identifier54=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier54.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:163:16: ( actualParameters )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==62) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall994);
                    actualParameters55=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters55.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: identifier, actualParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 164:3: -> ^( CALL identifier ( actualParameters )? )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:164:6: ^( CALL identifier ( actualParameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:164:24: ( actualParameters )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:167:1: ifpart : IF expression THEN statementSequence -> ^( IF expression statementSequence ) ;
    public final Oberon0Parser.ifpart_return ifpart() throws RecognitionException {
        Oberon0Parser.ifpart_return retval = new Oberon0Parser.ifpart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF56=null;
        Token THEN58=null;
        Oberon0Parser.expression_return expression57 = null;

        Oberon0Parser.statementSequence_return statementSequence59 = null;


        CommonTree IF56_tree=null;
        CommonTree THEN58_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:168:3: ( IF expression THEN statementSequence -> ^( IF expression statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:168:5: IF expression THEN statementSequence
            {
            IF56=(Token)match(input,IF,FOLLOW_IF_in_ifpart1021); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF56);

            pushFollow(FOLLOW_expression_in_ifpart1023);
            expression57=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());
            THEN58=(Token)match(input,THEN,FOLLOW_THEN_in_ifpart1025); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN58);

            pushFollow(FOLLOW_statementSequence_in_ifpart1027);
            statementSequence59=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence59.getTree());


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

            root_0 = (CommonTree)adaptor.nil();
            // 169:3: -> ^( IF expression statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:169:6: ^( IF expression statementSequence )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:172:1: elsifpart : ELSIF expression THEN statementSequence -> ^( ELSIF expression statementSequence ) ;
    public final Oberon0Parser.elsifpart_return elsifpart() throws RecognitionException {
        Oberon0Parser.elsifpart_return retval = new Oberon0Parser.elsifpart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELSIF60=null;
        Token THEN62=null;
        Oberon0Parser.expression_return expression61 = null;

        Oberon0Parser.statementSequence_return statementSequence63 = null;


        CommonTree ELSIF60_tree=null;
        CommonTree THEN62_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:173:3: ( ELSIF expression THEN statementSequence -> ^( ELSIF expression statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:173:5: ELSIF expression THEN statementSequence
            {
            ELSIF60=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_elsifpart1054); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF60);

            pushFollow(FOLLOW_expression_in_elsifpart1056);
            expression61=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());
            THEN62=(Token)match(input,THEN,FOLLOW_THEN_in_elsifpart1058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN62);

            pushFollow(FOLLOW_statementSequence_in_elsifpart1060);
            statementSequence63=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence63.getTree());


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
            // 174:3: -> ^( ELSIF expression statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:174:6: ^( ELSIF expression statementSequence )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:177:1: elsepart : ELSE statementSequence -> ^( ELSE statementSequence ) ;
    public final Oberon0Parser.elsepart_return elsepart() throws RecognitionException {
        Oberon0Parser.elsepart_return retval = new Oberon0Parser.elsepart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELSE64=null;
        Oberon0Parser.statementSequence_return statementSequence65 = null;


        CommonTree ELSE64_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:178:3: ( ELSE statementSequence -> ^( ELSE statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:178:5: ELSE statementSequence
            {
            ELSE64=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsepart1085); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE64);

            pushFollow(FOLLOW_statementSequence_in_elsepart1087);
            statementSequence65=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence65.getTree());


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
            // 179:3: -> ^( ELSE statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:179:6: ^( ELSE statementSequence )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:182:1: ifStatement : ifpart ( elsifpart )* ( elsepart )? END -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END ) ;
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token END69=null;
        Oberon0Parser.ifpart_return ifpart66 = null;

        Oberon0Parser.elsifpart_return elsifpart67 = null;

        Oberon0Parser.elsepart_return elsepart68 = null;


        CommonTree END69_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_elsifpart=new RewriteRuleSubtreeStream(adaptor,"rule elsifpart");
        RewriteRuleSubtreeStream stream_ifpart=new RewriteRuleSubtreeStream(adaptor,"rule ifpart");
        RewriteRuleSubtreeStream stream_elsepart=new RewriteRuleSubtreeStream(adaptor,"rule elsepart");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:183:3: ( ifpart ( elsifpart )* ( elsepart )? END -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:183:5: ifpart ( elsifpart )* ( elsepart )? END
            {
            pushFollow(FOLLOW_ifpart_in_ifStatement1110);
            ifpart66=ifpart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifpart.add(ifpart66.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:184:5: ( elsifpart )*
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
            	    pushFollow(FOLLOW_elsifpart_in_ifStatement1116);
            	    elsifpart67=elsifpart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_elsifpart.add(elsifpart67.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:185:5: ( elsepart )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: elsepart
                    {
                    pushFollow(FOLLOW_elsepart_in_ifStatement1123);
                    elsepart68=elsepart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsepart.add(elsepart68.getTree());

                    }
                    break;

            }

            END69=(Token)match(input,END,FOLLOW_END_in_ifStatement1130); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END69);



            // AST REWRITE
            // elements: elsifpart, ifpart, END, elsepart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 187:3: -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:187:6: ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IFSTATEMENT, "IFSTATEMENT"), root_1);

                adaptor.addChild(root_1, stream_ifpart.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:187:27: ( elsifpart )*
                while ( stream_elsifpart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsifpart.nextTree());

                }
                stream_elsifpart.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:187:38: ( elsepart )?
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

    public static class withStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "withStatement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:190:1: withStatement : WITH identifier selector 'DO' statementSequence END -> ^( WITH ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) statementSequence ) ;
    public final Oberon0Parser.withStatement_return withStatement() throws RecognitionException {
        Oberon0Parser.withStatement_return retval = new Oberon0Parser.withStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WITH70=null;
        Token string_literal73=null;
        Token END75=null;
        Oberon0Parser.identifier_return identifier71 = null;

        Oberon0Parser.selector_return selector72 = null;

        Oberon0Parser.statementSequence_return statementSequence74 = null;


        CommonTree WITH70_tree=null;
        CommonTree string_literal73_tree=null;
        CommonTree END75_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:191:3: ( WITH identifier selector 'DO' statementSequence END -> ^( WITH ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:191:5: WITH identifier selector 'DO' statementSequence END
            {
            WITH70=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement1163); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WITH.add(WITH70);

            pushFollow(FOLLOW_identifier_in_withStatement1165);
            identifier71=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier71.getTree());
            pushFollow(FOLLOW_selector_in_withStatement1167);
            selector72=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector72.getTree());
            string_literal73=(Token)match(input,66,FOLLOW_66_in_withStatement1169); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal73);

            pushFollow(FOLLOW_statementSequence_in_withStatement1171);
            statementSequence74=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence74.getTree());
            END75=(Token)match(input,END,FOLLOW_END_in_withStatement1173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END75);



            // AST REWRITE
            // elements: statementSequence, selector, WITH, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 192:3: -> ^( WITH ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:192:6: ^( WITH ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) statementSequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WITH.nextNode(), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:192:13: ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENT_SELECT, "IDENT_SELECT"), root_2);

                adaptor.addChild(root_2, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:192:39: ( ^( SELECTORS selector ) )?
                if ( stream_selector.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:192:39: ^( SELECTORS selector )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECTORS, "SELECTORS"), root_3);

                    adaptor.addChild(root_3, stream_selector.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_selector.reset();

                adaptor.addChild(root_1, root_2);
                }
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
    // $ANTLR end "withStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:195:1: whileStatement : WHILE expression 'DO' statementSequence END -> ^( WHILE expression statementSequence ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE76=null;
        Token string_literal78=null;
        Token END80=null;
        Oberon0Parser.expression_return expression77 = null;

        Oberon0Parser.statementSequence_return statementSequence79 = null;


        CommonTree WHILE76_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree END80_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:196:3: ( WHILE expression 'DO' statementSequence END -> ^( WHILE expression statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:196:5: WHILE expression 'DO' statementSequence END
            {
            WHILE76=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1209); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE76);

            pushFollow(FOLLOW_expression_in_whileStatement1211);
            expression77=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression77.getTree());
            string_literal78=(Token)match(input,66,FOLLOW_66_in_whileStatement1213); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal78);

            pushFollow(FOLLOW_statementSequence_in_whileStatement1215);
            statementSequence79=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence79.getTree());
            END80=(Token)match(input,END,FOLLOW_END_in_whileStatement1217); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END80);



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
            // 197:3: -> ^( WHILE expression statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:197:6: ^( WHILE expression statementSequence )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:200:1: statement : ( assignment | procedureCall | ifStatement | whileStatement | withStatement );
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment81 = null;

        Oberon0Parser.procedureCall_return procedureCall82 = null;

        Oberon0Parser.ifStatement_return ifStatement83 = null;

        Oberon0Parser.whileStatement_return whileStatement84 = null;

        Oberon0Parser.withStatement_return withStatement85 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:201:3: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )
            int alt15=5;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>=59 && LA15_1<=60)||LA15_1==64) ) {
                    alt15=1;
                }
                else if ( (LA15_1==EOF||LA15_1==END||(LA15_1>=ELSIF && LA15_1<=ELSE)||LA15_1==58||LA15_1==62) ) {
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
            case WITH:
                {
                alt15=5;
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:201:5: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_statement1244);
                    assignment81=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment81.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:202:5: procedureCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_procedureCall_in_statement1250);
                    procedureCall82=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall82.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:203:5: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement1256);
                    ifStatement83=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement83.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:204:5: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement1262);
                    whileStatement84=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement84.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:205:5: withStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statement1268);
                    withStatement85=withStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, withStatement85.getTree());

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:208:1: statementSequence : statement ( ';' statement )* -> ^( STATEMENTS ( statement )+ ) ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal87=null;
        Oberon0Parser.statement_return statement86 = null;

        Oberon0Parser.statement_return statement88 = null;


        CommonTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:209:3: ( statement ( ';' statement )* -> ^( STATEMENTS ( statement )+ ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:209:5: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence1283);
            statement86=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement86.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:209:15: ( ';' statement )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==58) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:209:16: ';' statement
            	    {
            	    char_literal87=(Token)match(input,58,FOLLOW_58_in_statementSequence1286); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal87);

            	    pushFollow(FOLLOW_statement_in_statementSequence1288);
            	    statement88=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement88.getTree());

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
            // 210:3: -> ^( STATEMENTS ( statement )+ )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:210:6: ^( STATEMENTS ( statement )+ )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:213:1: identifierList : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final Oberon0Parser.identifierList_return identifierList() throws RecognitionException {
        Oberon0Parser.identifierList_return retval = new Oberon0Parser.identifierList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal90=null;
        Oberon0Parser.identifier_return identifier89 = null;

        Oberon0Parser.identifier_return identifier91 = null;


        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:214:3: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:214:5: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifierList1318);
            identifier89=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier89.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:214:16: ( ',' identifier )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==65) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:214:17: ',' identifier
            	    {
            	    char_literal90=(Token)match(input,65,FOLLOW_65_in_identifierList1321); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_65.add(char_literal90);

            	    pushFollow(FOLLOW_identifier_in_identifierList1323);
            	    identifier91=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier91.getTree());

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
            // 215:3: -> ( identifier )+
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:218:1: arrayType : ARRAY expression 'OF' type -> ^( ARRAY type expression ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY92=null;
        Token string_literal94=null;
        Oberon0Parser.expression_return expression93 = null;

        Oberon0Parser.type_return type95 = null;


        CommonTree ARRAY92_tree=null;
        CommonTree string_literal94_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:219:3: ( ARRAY expression 'OF' type -> ^( ARRAY type expression ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:219:5: ARRAY expression 'OF' type
            {
            ARRAY92=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1347); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY92);

            pushFollow(FOLLOW_expression_in_arrayType1349);
            expression93=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression93.getTree());
            string_literal94=(Token)match(input,67,FOLLOW_67_in_arrayType1351); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(string_literal94);

            pushFollow(FOLLOW_type_in_arrayType1353);
            type95=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type95.getTree());


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

            root_0 = (CommonTree)adaptor.nil();
            // 220:3: -> ^( ARRAY type expression )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:220:6: ^( ARRAY type expression )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:223:1: field : ( identifierList ':' type )? -> ^( FIELD type identifierList ) ;
    public final Oberon0Parser.field_return field() throws RecognitionException {
        Oberon0Parser.field_return retval = new Oberon0Parser.field_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal97=null;
        Oberon0Parser.identifierList_return identifierList96 = null;

        Oberon0Parser.type_return type98 = null;


        CommonTree char_literal97_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:224:3: ( ( identifierList ':' type )? -> ^( FIELD type identifierList ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:224:5: ( identifierList ':' type )?
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:224:5: ( identifierList ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:224:6: identifierList ':' type
                    {
                    pushFollow(FOLLOW_identifierList_in_field1379);
                    identifierList96=identifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierList.add(identifierList96.getTree());
                    char_literal97=(Token)match(input,68,FOLLOW_68_in_field1381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(char_literal97);

                    pushFollow(FOLLOW_type_in_field1383);
                    type98=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type98.getTree());

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
            // 225:3: -> ^( FIELD type identifierList )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:225:6: ^( FIELD type identifierList )
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

    public static class recordType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:228:1: recordType : RECORD field ( ';' field )* 'END' -> ^( RECORD ( field )+ ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD99=null;
        Token char_literal101=null;
        Token string_literal103=null;
        Oberon0Parser.field_return field100 = null;

        Oberon0Parser.field_return field102 = null;


        CommonTree RECORD99_tree=null;
        CommonTree char_literal101_tree=null;
        CommonTree string_literal103_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:3: ( RECORD field ( ';' field )* 'END' -> ^( RECORD ( field )+ ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:5: RECORD field ( ';' field )* 'END'
            {
            RECORD99=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1413); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD99);

            pushFollow(FOLLOW_field_in_recordType1415);
            field100=field();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_field.add(field100.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:18: ( ';' field )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==58) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:19: ';' field
            	    {
            	    char_literal101=(Token)match(input,58,FOLLOW_58_in_recordType1418); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal101);

            	    pushFollow(FOLLOW_field_in_recordType1420);
            	    field102=field();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field.add(field102.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            string_literal103=(Token)match(input,END,FOLLOW_END_in_recordType1424); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal103);



            // AST REWRITE
            // elements: RECORD, field
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 230:3: -> ^( RECORD ( field )+ )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:230:6: ^( RECORD ( field )+ )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:233:1: type : ( identifier | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.identifier_return identifier104 = null;

        Oberon0Parser.arrayType_return arrayType105 = null;

        Oberon0Parser.recordType_return recordType106 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:234:3: ( identifier | arrayType | recordType )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:234:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_type1448);
                    identifier104=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier104.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:235:5: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1454);
                    arrayType105=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType105.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:236:5: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1460);
                    recordType106=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType106.getTree());

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:239:1: fpSection : ( 'VAR' )? identifierList ':' type -> ^( FORMALPARAMETER ( 'VAR' )? type identifierList ) ;
    public final Oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        Oberon0Parser.fpSection_return retval = new Oberon0Parser.fpSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal107=null;
        Token char_literal109=null;
        Oberon0Parser.identifierList_return identifierList108 = null;

        Oberon0Parser.type_return type110 = null;


        CommonTree string_literal107_tree=null;
        CommonTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:240:3: ( ( 'VAR' )? identifierList ':' type -> ^( FORMALPARAMETER ( 'VAR' )? type identifierList ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:240:5: ( 'VAR' )? identifierList ':' type
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:240:5: ( 'VAR' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==VAR) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: 'VAR'
                    {
                    string_literal107=(Token)match(input,VAR,FOLLOW_VAR_in_fpSection1477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(string_literal107);


                    }
                    break;

            }

            pushFollow(FOLLOW_identifierList_in_fpSection1480);
            identifierList108=identifierList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifierList.add(identifierList108.getTree());
            char_literal109=(Token)match(input,68,FOLLOW_68_in_fpSection1482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal109);

            pushFollow(FOLLOW_type_in_fpSection1484);
            type110=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type110.getTree());


            // AST REWRITE
            // elements: identifierList, type, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 241:3: -> ^( FORMALPARAMETER ( 'VAR' )? type identifierList )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:241:6: ^( FORMALPARAMETER ( 'VAR' )? type identifierList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMALPARAMETER, "FORMALPARAMETER"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:241:24: ( 'VAR' )?
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

    public static class formalParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:244:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' -> ( fpSection )+ ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal111=null;
        Token char_literal113=null;
        Token char_literal115=null;
        Oberon0Parser.fpSection_return fpSection112 = null;

        Oberon0Parser.fpSection_return fpSection114 = null;


        CommonTree char_literal111_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:245:3: ( '(' ( fpSection ( ';' fpSection )* )? ')' -> ( fpSection )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:245:5: '(' ( fpSection ( ';' fpSection )* )? ')'
            {
            char_literal111=(Token)match(input,62,FOLLOW_62_in_formalParameters1515); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(char_literal111);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:245:9: ( fpSection ( ';' fpSection )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VAR||LA23_0==IDENTIFIER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:245:10: fpSection ( ';' fpSection )*
                    {
                    pushFollow(FOLLOW_fpSection_in_formalParameters1518);
                    fpSection112=fpSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fpSection.add(fpSection112.getTree());
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:245:20: ( ';' fpSection )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==58) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:245:21: ';' fpSection
                    	    {
                    	    char_literal113=(Token)match(input,58,FOLLOW_58_in_formalParameters1521); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_58.add(char_literal113);

                    	    pushFollow(FOLLOW_fpSection_in_formalParameters1523);
                    	    fpSection114=fpSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fpSection.add(fpSection114.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal115=(Token)match(input,63,FOLLOW_63_in_formalParameters1529); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(char_literal115);



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
            // 247:3: -> ( fpSection )+
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:250:1: procedureHeading : PROCEDURE identifier ( formalParameters )? -> identifier ( formalParameters )? ;
    public final Oberon0Parser.procedureHeading_return procedureHeading() throws RecognitionException {
        Oberon0Parser.procedureHeading_return retval = new Oberon0Parser.procedureHeading_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE116=null;
        Oberon0Parser.identifier_return identifier117 = null;

        Oberon0Parser.formalParameters_return formalParameters118 = null;


        CommonTree PROCEDURE116_tree=null;
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:251:3: ( PROCEDURE identifier ( formalParameters )? -> identifier ( formalParameters )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:251:6: PROCEDURE identifier ( formalParameters )?
            {
            PROCEDURE116=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureHeading1551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE116);

            pushFollow(FOLLOW_identifier_in_procedureHeading1553);
            identifier117=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier117.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:251:27: ( formalParameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==62) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading1555);
                    formalParameters118=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters118.getTree());

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
            // 252:3: -> identifier ( formalParameters )?
            {
                adaptor.addChild(root_0, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:252:17: ( formalParameters )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:255:1: procedureBody : declarations ( 'BEGIN' statementSequence )? 'END' identifier -> ( ^( DECLARATIONS declarations ) )? ( statementSequence )? ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal120=null;
        Token string_literal122=null;
        Oberon0Parser.declarations_return declarations119 = null;

        Oberon0Parser.statementSequence_return statementSequence121 = null;

        Oberon0Parser.identifier_return identifier123 = null;


        CommonTree string_literal120_tree=null;
        CommonTree string_literal122_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:256:3: ( declarations ( 'BEGIN' statementSequence )? 'END' identifier -> ( ^( DECLARATIONS declarations ) )? ( statementSequence )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:256:7: declarations ( 'BEGIN' statementSequence )? 'END' identifier
            {
            pushFollow(FOLLOW_declarations_in_procedureBody1585);
            declarations119=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations119.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:256:20: ( 'BEGIN' statementSequence )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BEGIN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:256:21: 'BEGIN' statementSequence
                    {
                    string_literal120=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(string_literal120);

                    pushFollow(FOLLOW_statementSequence_in_procedureBody1590);
                    statementSequence121=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence121.getTree());

                    }
                    break;

            }

            string_literal122=(Token)match(input,END,FOLLOW_END_in_procedureBody1594); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal122);

            pushFollow(FOLLOW_identifier_in_procedureBody1596);
            identifier123=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier123.getTree());


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
            // 257:3: -> ( ^( DECLARATIONS declarations ) )? ( statementSequence )?
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:257:7: ( ^( DECLARATIONS declarations ) )?
                if ( stream_declarations.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:257:7: ^( DECLARATIONS declarations )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                    adaptor.addChild(root_1, stream_declarations.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_declarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:257:37: ( statementSequence )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:260:1: procedureDeclarations : procedureHeading ';' procedureBody -> ^( PROCEDURE procedureHeading procedureBody ) ;
    public final Oberon0Parser.procedureDeclarations_return procedureDeclarations() throws RecognitionException {
        Oberon0Parser.procedureDeclarations_return retval = new Oberon0Parser.procedureDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal125=null;
        Oberon0Parser.procedureHeading_return procedureHeading124 = null;

        Oberon0Parser.procedureBody_return procedureBody126 = null;


        CommonTree char_literal125_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:261:3: ( procedureHeading ';' procedureBody -> ^( PROCEDURE procedureHeading procedureBody ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:261:5: procedureHeading ';' procedureBody
            {
            pushFollow(FOLLOW_procedureHeading_in_procedureDeclarations1629);
            procedureHeading124=procedureHeading();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_procedureHeading.add(procedureHeading124.getTree());
            char_literal125=(Token)match(input,58,FOLLOW_58_in_procedureDeclarations1631); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(char_literal125);

            pushFollow(FOLLOW_procedureBody_in_procedureDeclarations1633);
            procedureBody126=procedureBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody126.getTree());


            // AST REWRITE
            // elements: procedureHeading, procedureBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 262:3: -> ^( PROCEDURE procedureHeading procedureBody )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:262:6: ^( PROCEDURE procedureHeading procedureBody )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:265:1: constantDeclarations : CONST ( identifier '=' expression ';' )* -> ( ^( CONST identifier expression ) )* ;
    public final Oberon0Parser.constantDeclarations_return constantDeclarations() throws RecognitionException {
        Oberon0Parser.constantDeclarations_return retval = new Oberon0Parser.constantDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST127=null;
        Token char_literal129=null;
        Token char_literal131=null;
        Oberon0Parser.identifier_return identifier128 = null;

        Oberon0Parser.expression_return expression130 = null;


        CommonTree CONST127_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree char_literal131_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:266:3: ( CONST ( identifier '=' expression ';' )* -> ( ^( CONST identifier expression ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:266:5: CONST ( identifier '=' expression ';' )*
            {
            CONST127=(Token)match(input,CONST,FOLLOW_CONST_in_constantDeclarations1660); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST127);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:266:11: ( identifier '=' expression ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENTIFIER) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:266:12: identifier '=' expression ';'
            	    {
            	    pushFollow(FOLLOW_identifier_in_constantDeclarations1663);
            	    identifier128=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier128.getTree());
            	    char_literal129=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constantDeclarations1665); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal129);

            	    pushFollow(FOLLOW_expression_in_constantDeclarations1667);
            	    expression130=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression130.getTree());
            	    char_literal131=(Token)match(input,58,FOLLOW_58_in_constantDeclarations1669); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal131);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // AST REWRITE
            // elements: identifier, CONST, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 267:3: -> ( ^( CONST identifier expression ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:267:6: ( ^( CONST identifier expression ) )*
                while ( stream_identifier.hasNext()||stream_CONST.hasNext()||stream_expression.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:267:6: ^( CONST identifier expression )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_identifier.nextTree());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_identifier.reset();
                stream_CONST.reset();
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:270:1: typeDeclarations : TYPE ( identifier '=' type ';' )* -> ( ^( TYPE identifier type ) )* ;
    public final Oberon0Parser.typeDeclarations_return typeDeclarations() throws RecognitionException {
        Oberon0Parser.typeDeclarations_return retval = new Oberon0Parser.typeDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE132=null;
        Token char_literal134=null;
        Token char_literal136=null;
        Oberon0Parser.identifier_return identifier133 = null;

        Oberon0Parser.type_return type135 = null;


        CommonTree TYPE132_tree=null;
        CommonTree char_literal134_tree=null;
        CommonTree char_literal136_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:271:3: ( TYPE ( identifier '=' type ';' )* -> ( ^( TYPE identifier type ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:271:5: TYPE ( identifier '=' type ';' )*
            {
            TYPE132=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclarations1699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE132);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:271:10: ( identifier '=' type ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENTIFIER) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:271:11: identifier '=' type ';'
            	    {
            	    pushFollow(FOLLOW_identifier_in_typeDeclarations1702);
            	    identifier133=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier133.getTree());
            	    char_literal134=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclarations1704); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal134);

            	    pushFollow(FOLLOW_type_in_typeDeclarations1706);
            	    type135=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type135.getTree());
            	    char_literal136=(Token)match(input,58,FOLLOW_58_in_typeDeclarations1708); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal136);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);



            // AST REWRITE
            // elements: type, TYPE, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 272:3: -> ( ^( TYPE identifier type ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:272:6: ( ^( TYPE identifier type ) )*
                while ( stream_type.hasNext()||stream_TYPE.hasNext()||stream_identifier.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:272:6: ^( TYPE identifier type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_identifier.nextTree());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_TYPE.reset();
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
    // $ANTLR end "typeDeclarations"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:275:1: varDeclarations : VAR ( identifierList ':' type ';' )* -> ( ^( VAR type identifierList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR137=null;
        Token char_literal139=null;
        Token char_literal141=null;
        Oberon0Parser.identifierList_return identifierList138 = null;

        Oberon0Parser.type_return type140 = null;


        CommonTree VAR137_tree=null;
        CommonTree char_literal139_tree=null;
        CommonTree char_literal141_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:276:3: ( VAR ( identifierList ':' type ';' )* -> ( ^( VAR type identifierList ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:276:5: VAR ( identifierList ':' type ';' )*
            {
            VAR137=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1738); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR137);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:276:9: ( identifierList ':' type ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==IDENTIFIER) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:276:10: identifierList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identifierList_in_varDeclarations1741);
            	    identifierList138=identifierList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifierList.add(identifierList138.getTree());
            	    char_literal139=(Token)match(input,68,FOLLOW_68_in_varDeclarations1743); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_68.add(char_literal139);

            	    pushFollow(FOLLOW_type_in_varDeclarations1745);
            	    type140=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type140.getTree());
            	    char_literal141=(Token)match(input,58,FOLLOW_58_in_varDeclarations1747); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal141);


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
            // 277:3: -> ( ^( VAR type identifierList ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:277:6: ( ^( VAR type identifierList ) )*
                while ( stream_type.hasNext()||stream_VAR.hasNext()||stream_identifierList.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:277:6: ^( VAR type identifierList )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:280:1: declarations : ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations ';' )* -> ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( ( procedureDeclarations )* )? ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal146=null;
        Oberon0Parser.constantDeclarations_return constantDeclarations142 = null;

        Oberon0Parser.typeDeclarations_return typeDeclarations143 = null;

        Oberon0Parser.varDeclarations_return varDeclarations144 = null;

        Oberon0Parser.procedureDeclarations_return procedureDeclarations145 = null;


        CommonTree char_literal146_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_procedureDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclarations");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_constantDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclarations");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:281:3: ( ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations ';' )* -> ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( ( procedureDeclarations )* )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:281:5: ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations ';' )*
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:281:5: ( constantDeclarations )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CONST) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: constantDeclarations
                    {
                    pushFollow(FOLLOW_constantDeclarations_in_declarations1777);
                    constantDeclarations142=constantDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constantDeclarations.add(constantDeclarations142.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:282:5: ( typeDeclarations )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==TYPE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: typeDeclarations
                    {
                    pushFollow(FOLLOW_typeDeclarations_in_declarations1784);
                    typeDeclarations143=typeDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclarations.add(typeDeclarations143.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:283:5: ( varDeclarations )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VAR) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1791);
                    varDeclarations144=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations144.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:284:5: ( procedureDeclarations ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PROCEDURE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:284:6: procedureDeclarations ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclarations_in_declarations1800);
            	    procedureDeclarations145=procedureDeclarations();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclarations.add(procedureDeclarations145.getTree());
            	    char_literal146=(Token)match(input,58,FOLLOW_58_in_declarations1802); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal146);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: typeDeclarations, varDeclarations, constantDeclarations, procedureDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 285:2: -> ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( ( procedureDeclarations )* )?
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:285:5: ( constantDeclarations )?
                if ( stream_constantDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_constantDeclarations.nextTree());

                }
                stream_constantDeclarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:286:5: ( typeDeclarations )?
                if ( stream_typeDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclarations.nextTree());

                }
                stream_typeDeclarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:287:5: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:288:5: ( ( procedureDeclarations )* )?
                if ( stream_procedureDeclarations.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:288:6: ( procedureDeclarations )*
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
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:145:5: ( simpleExpression comparer simpleExpression )
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:145:5: simpleExpression comparer simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred21_Oberon0866);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_comparer_in_synpred21_Oberon0868);
        comparer();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred21_Oberon0870);
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


 

    public static final BitSet FOLLOW_MODULE_in_module436 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_module438 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_module440 = new BitSet(new long[]{0x00000000000013E0L});
    public static final BitSet FOLLOW_moduleBody_in_module442 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_module445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody472 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody475 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody477 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_moduleBody481 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_moduleBody483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_literal540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_subselector555 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_subselector557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_subselector573 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_expression_in_subselector575 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_subselector577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subselector_in_selector602 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_identifier_in_factor619 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_selector_in_factor621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_factor656 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_expression_in_factor658 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_factor660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor672 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_factor_in_factor674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_strongops0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term732 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_strongops_in_term735 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_factor_in_term738 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_PLUS_in_unary753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_weakops0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_simpleExpression804 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_term_in_simpleExpression808 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_weakops_in_simpleExpression811 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_term_in_simpleExpression814 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_set_in_comparer0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression866 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_comparer_in_expression868 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_simpleExpression_in_expression870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignment910 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_selector_in_assignment912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_assignment914 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_expression_in_assignment916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_actualParameters953 = new BitSet(new long[]{0xC180000016000000L});
    public static final BitSet FOLLOW_expression_in_actualParameters956 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_actualParameters959 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_expression_in_actualParameters961 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_actualParameters967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_procedureCall992 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifpart1021 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_expression_in_ifpart1023 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifpart1025 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_ifpart1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_elsifpart1054 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_expression_in_elsifpart1056 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_elsifpart1058 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_elsifpart1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsepart1085 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_elsepart1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifpart_in_ifStatement1110 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_elsifpart_in_ifStatement1116 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_elsepart_in_ifStatement1123 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_ifStatement1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement1163 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_withStatement1165 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_selector_in_withStatement1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_withStatement1169 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_withStatement1171 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_withStatement1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1209 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_whileStatement1213 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1215 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_whileStatement1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statement1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1283 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_statementSequence1286 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1288 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierList1318 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_identifierList1321 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_identifierList1323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1347 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_expression_in_arrayType1349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_arrayType1351 = new BitSet(new long[]{0x0080000000000C00L});
    public static final BitSet FOLLOW_type_in_arrayType1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_field1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_field1381 = new BitSet(new long[]{0x0080000000000C00L});
    public static final BitSet FOLLOW_type_in_field1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1413 = new BitSet(new long[]{0x0480000000000040L});
    public static final BitSet FOLLOW_field_in_recordType1415 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_58_in_recordType1418 = new BitSet(new long[]{0x0480000000000040L});
    public static final BitSet FOLLOW_field_in_recordType1420 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_END_in_recordType1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_type1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection1477 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifierList_in_fpSection1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_fpSection1482 = new BitSet(new long[]{0x0080000000000C00L});
    public static final BitSet FOLLOW_type_in_fpSection1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_formalParameters1515 = new BitSet(new long[]{0x8080000000000200L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1518 = new BitSet(new long[]{0x8400000000000000L});
    public static final BitSet FOLLOW_58_in_formalParameters1521 = new BitSet(new long[]{0x0080000000000200L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1523 = new BitSet(new long[]{0x8400000000000000L});
    public static final BitSet FOLLOW_63_in_formalParameters1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureHeading1551 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_procedureHeading1553 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody1585 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1588 = new BitSet(new long[]{0x0080000000046000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1590 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_procedureBody1594 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identifier_in_procedureBody1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclarations1629 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_procedureDeclarations1631 = new BitSet(new long[]{0x00000000000013E0L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclarations1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constantDeclarations1660 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identifier_in_constantDeclarations1663 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUALS_in_constantDeclarations1665 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations1667 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_constantDeclarations1669 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclarations1699 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeDeclarations1702 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations1704 = new BitSet(new long[]{0x0080000000000C00L});
    public static final BitSet FOLLOW_type_in_typeDeclarations1706 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_typeDeclarations1708 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1738 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identifierList_in_varDeclarations1741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_varDeclarations1743 = new BitSet(new long[]{0x0080000000000C00L});
    public static final BitSet FOLLOW_type_in_varDeclarations1745 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_varDeclarations1747 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations1777 = new BitSet(new long[]{0x0000000000001302L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations1784 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1791 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations1800 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_declarations1802 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred21_Oberon0866 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_comparer_in_synpred21_Oberon0868 = new BitSet(new long[]{0x4180000016000000L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred21_Oberon0870 = new BitSet(new long[]{0x0000000000000002L});

}