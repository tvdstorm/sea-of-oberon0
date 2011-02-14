// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g 2011-02-14 08:31:51

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "BEGIN", "END", "CONST", "TYPE", "VAR", "ARRAY", "RECORD", "PROCEDURE", "WHILE", "IF", "THEN", "ELSIF", "ELSE", "EQUALS", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "PLUS", "MINUS", "OR", "NOT", "MULT", "DIV", "MOD", "AND", "CONSTANTS", "VARIABLES", "TYPES", "PROCEDURES", "MODULEBODY", "PROCEDUREBODY", "FORMALPARAMETER", "FORMALPARAMETERS", "ASSIGN", "ACTUALPARAMETERS", "CALL", "IDENT_SELECT", "SELECTORS", "RECORDSELECTOR", "ARRAYSELECTOR", "IDENT", "EXPRESSION", "LITERAL", "DECLARATIONS", "STATEMENTS", "IFSTATEMENT", "FIELD", "IDENTIFIER", "INTEGER", "WHITESPACE", "';'", "'.'", "'['", "']'", "'('", "')'", "':='", "','", "'DO'", "'OF'", "':'"
    };
    public static final int EOF=-1;
    public static final int T__57=57;
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
    public static final int FORMALPARAMETER=38;
    public static final int FORMALPARAMETERS=39;
    public static final int ASSIGN=40;
    public static final int ACTUALPARAMETERS=41;
    public static final int CALL=42;
    public static final int IDENT_SELECT=43;
    public static final int SELECTORS=44;
    public static final int RECORDSELECTOR=45;
    public static final int ARRAYSELECTOR=46;
    public static final int IDENT=47;
    public static final int EXPRESSION=48;
    public static final int LITERAL=49;
    public static final int DECLARATIONS=50;
    public static final int STATEMENTS=51;
    public static final int IFSTATEMENT=52;
    public static final int FIELD=53;
    public static final int IDENTIFIER=54;
    public static final int INTEGER=55;
    public static final int WHITESPACE=56;

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:69:1: module : MODULE identifier ';' moduleBody '.' EOF -> ^( MODULE moduleBody ) ;
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
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:70:3: ( MODULE identifier ';' moduleBody '.' EOF -> ^( MODULE moduleBody ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:70:5: MODULE identifier ';' moduleBody '.' EOF
            {
            MODULE1=(Token)match(input,MODULE,FOLLOW_MODULE_in_module427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE1);

            pushFollow(FOLLOW_identifier_in_module429);
            identifier2=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier2.getTree());
            char_literal3=(Token)match(input,57,FOLLOW_57_in_module431); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal3);

            pushFollow(FOLLOW_moduleBody_in_module433);
            moduleBody4=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody4.getTree());
            char_literal5=(Token)match(input,58,FOLLOW_58_in_module436); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(char_literal5);

            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_module438); if (state.failed) return retval; 
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
            // 71:3: -> ^( MODULE moduleBody )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:71:6: ^( MODULE moduleBody )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:74:1: moduleBody : declarations ( BEGIN statementSequence )? END identifier -> ^( DECLARATIONS ( declarations )? ) ( statementSequence )? ;
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:75:3: ( declarations ( BEGIN statementSequence )? END identifier -> ^( DECLARATIONS ( declarations )? ) ( statementSequence )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:75:5: declarations ( BEGIN statementSequence )? END identifier
            {
            pushFollow(FOLLOW_declarations_in_moduleBody463);
            declarations7=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations7.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:75:18: ( BEGIN statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==BEGIN) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:75:19: BEGIN statementSequence
                    {
                    BEGIN8=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN8);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody468);
                    statementSequence9=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence9.getTree());

                    }
                    break;

            }

            END10=(Token)match(input,END,FOLLOW_END_in_moduleBody472); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END10);

            pushFollow(FOLLOW_identifier_in_moduleBody474);
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
            // 76:3: -> ^( DECLARATIONS ( declarations )? ) ( statementSequence )?
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:76:6: ^( DECLARATIONS ( declarations )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:76:21: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:76:36: ( statementSequence )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:79:1: identifier : IDENTIFIER ;
    public final Oberon0Parser.identifier_return identifier() throws RecognitionException {
        Oberon0Parser.identifier_return retval = new Oberon0Parser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER12=null;

        CommonTree IDENTIFIER12_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:80:3: ( IDENTIFIER )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:80:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENTIFIER12=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier501); if (state.failed) return retval;
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:83:1: integer : INTEGER ;
    public final Oberon0Parser.integer_return integer() throws RecognitionException {
        Oberon0Parser.integer_return retval = new Oberon0Parser.integer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER13=null;

        CommonTree INTEGER13_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:84:3: ( INTEGER )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:84:5: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER13=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer516); if (state.failed) return retval;
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:87:1: literal : integer ;
    public final Oberon0Parser.literal_return literal() throws RecognitionException {
        Oberon0Parser.literal_return retval = new Oberon0Parser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.integer_return integer14 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:3: ( integer )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:88:5: integer
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_integer_in_literal531);
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:91:1: subselector : ( '.' identifier -> ^( RECORDSELECTOR identifier ) | '[' expression ']' -> ^( ARRAYSELECTOR expression ) );
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
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:92:3: ( '.' identifier -> ^( RECORDSELECTOR identifier ) | '[' expression ']' -> ^( ARRAYSELECTOR expression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==58) ) {
                alt2=1;
            }
            else if ( (LA2_0==59) ) {
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:92:5: '.' identifier
                    {
                    char_literal15=(Token)match(input,58,FOLLOW_58_in_subselector546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal15);

                    pushFollow(FOLLOW_identifier_in_subselector548);
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
                    // 93:3: -> ^( RECORDSELECTOR identifier )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:93:6: ^( RECORDSELECTOR identifier )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:94:5: '[' expression ']'
                    {
                    char_literal17=(Token)match(input,59,FOLLOW_59_in_subselector564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(char_literal17);

                    pushFollow(FOLLOW_expression_in_subselector566);
                    expression18=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression18.getTree());
                    char_literal19=(Token)match(input,60,FOLLOW_60_in_subselector568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(char_literal19);



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
                    // 95:2: -> ^( ARRAYSELECTOR expression )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:95:5: ^( ARRAYSELECTOR expression )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:98:1: selector : ( subselector )* ;
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.subselector_return subselector20 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:99:3: ( ( subselector )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:99:5: ( subselector )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:99:5: ( subselector )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=58 && LA3_0<=59)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:99:6: subselector
            	    {
            	    pushFollow(FOLLOW_subselector_in_selector593);
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:102:1: factor : ( identifier selector -> ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) | literal -> literal | '(' expression ')' -> expression | NOT factor -> ^( NOT factor ) );
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
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:103:3: ( identifier selector -> ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) | literal -> literal | '(' expression ')' -> expression | NOT factor -> ^( NOT factor ) )
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
            case 61:
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:103:5: identifier selector
                    {
                    pushFollow(FOLLOW_identifier_in_factor610);
                    identifier21=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier21.getTree());
                    pushFollow(FOLLOW_selector_in_factor612);
                    selector22=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_selector.add(selector22.getTree());


                    // AST REWRITE
                    // elements: identifier, selector
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 104:3: -> ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:104:6: ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENT_SELECT, "IDENT_SELECT"), root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:104:32: ( ^( SELECTORS selector ) )?
                        if ( stream_selector.hasNext() ) {
                            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:104:32: ^( SELECTORS selector )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:105:5: literal
                    {
                    pushFollow(FOLLOW_literal_in_factor635);
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
                    // 106:3: -> literal
                    {
                        adaptor.addChild(root_0, stream_literal.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:107:5: '(' expression ')'
                    {
                    char_literal24=(Token)match(input,61,FOLLOW_61_in_factor647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(char_literal24);

                    pushFollow(FOLLOW_expression_in_factor649);
                    expression25=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression25.getTree());
                    char_literal26=(Token)match(input,62,FOLLOW_62_in_factor651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_62.add(char_literal26);



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
                    // 108:3: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:109:5: NOT factor
                    {
                    NOT27=(Token)match(input,NOT,FOLLOW_NOT_in_factor663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT27);

                    pushFollow(FOLLOW_factor_in_factor665);
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
                    // 110:3: -> ^( NOT factor )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:110:6: ^( NOT factor )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:113:1: strongops : ( MULT | DIV | MOD | AND );
    public final Oberon0Parser.strongops_return strongops() throws RecognitionException {
        Oberon0Parser.strongops_return retval = new Oberon0Parser.strongops_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set29=null;

        CommonTree set29_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:114:3: ( MULT | DIV | MOD | AND )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:120:1: term : factor ( strongops factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.factor_return factor30 = null;

        Oberon0Parser.strongops_return strongops31 = null;

        Oberon0Parser.factor_return factor32 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:121:3: ( factor ( strongops factor )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:121:5: factor ( strongops factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term723);
            factor30=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor30.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:121:12: ( strongops factor )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=MULT && LA5_0<=AND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:121:13: strongops factor
            	    {
            	    pushFollow(FOLLOW_strongops_in_term726);
            	    strongops31=strongops();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(strongops31.getTree(), root_0);
            	    pushFollow(FOLLOW_factor_in_term729);
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:124:1: unary : ( PLUS | MINUS -> ( MINUS )? );
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:125:3: ( PLUS | MINUS -> ( MINUS )? )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:125:5: PLUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLUS33=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS33_tree = (CommonTree)adaptor.create(PLUS33);
                    adaptor.addChild(root_0, PLUS33_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:125:12: MINUS
                    {
                    MINUS34=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary748); if (state.failed) return retval; 
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
                    // 126:3: -> ( MINUS )?
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:126:6: ( MINUS )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:129:1: weakops : ( PLUS | MINUS | OR );
    public final Oberon0Parser.weakops_return weakops() throws RecognitionException {
        Oberon0Parser.weakops_return retval = new Oberon0Parser.weakops_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set35=null;

        CommonTree set35_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:130:3: ( PLUS | MINUS | OR )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:135:1: simpleExpression : ( unary )? term ( weakops term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.unary_return unary36 = null;

        Oberon0Parser.term_return term37 = null;

        Oberon0Parser.weakops_return weakops38 = null;

        Oberon0Parser.term_return term39 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:136:3: ( ( unary )? term ( weakops term )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:136:5: ( unary )? term ( weakops term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:136:10: ( unary )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=PLUS && LA7_0<=MINUS)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: unary
                    {
                    pushFollow(FOLLOW_unary_in_simpleExpression795);
                    unary36=unary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(unary36.getTree(), root_0);

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression799);
            term37=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term37.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:136:18: ( weakops term )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=PLUS && LA8_0<=OR)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:136:19: weakops term
            	    {
            	    pushFollow(FOLLOW_weakops_in_simpleExpression802);
            	    weakops38=weakops();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(weakops38.getTree(), root_0);
            	    pushFollow(FOLLOW_term_in_simpleExpression805);
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:139:1: comparer : ( EQUALS | NOT_EQUALS | LT | LTE | GT | GTE );
    public final Oberon0Parser.comparer_return comparer() throws RecognitionException {
        Oberon0Parser.comparer_return retval = new Oberon0Parser.comparer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set40=null;

        CommonTree set40_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:140:3: ( EQUALS | NOT_EQUALS | LT | LTE | GT | GTE )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:143:1: expression : ( simpleExpression comparer simpleExpression -> ^( comparer simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:3: ( simpleExpression comparer simpleExpression -> ^( comparer simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
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
            case 61:
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:5: simpleExpression comparer simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression857);
                    simpleExpression41=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression41.getTree());
                    pushFollow(FOLLOW_comparer_in_expression859);
                    comparer42=comparer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_comparer.add(comparer42.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression861);
                    simpleExpression43=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression43.getTree());


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
                    // 145:3: -> ^( comparer simpleExpression simpleExpression )
                    {
                        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:145:6: ^( comparer simpleExpression simpleExpression )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:146:5: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression879);
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
                    // 147:3: -> simpleExpression
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:150:1: assignment : identifier selector ':=' expression -> ^( ASSIGN expression ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal47=null;
        Oberon0Parser.identifier_return identifier45 = null;

        Oberon0Parser.selector_return selector46 = null;

        Oberon0Parser.expression_return expression48 = null;


        CommonTree string_literal47_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:151:3: ( identifier selector ':=' expression -> ^( ASSIGN expression ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:151:5: identifier selector ':=' expression
            {
            pushFollow(FOLLOW_identifier_in_assignment901);
            identifier45=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier45.getTree());
            pushFollow(FOLLOW_selector_in_assignment903);
            selector46=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector46.getTree());
            string_literal47=(Token)match(input,63,FOLLOW_63_in_assignment905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(string_literal47);

            pushFollow(FOLLOW_expression_in_assignment907);
            expression48=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());


            // AST REWRITE
            // elements: identifier, selector, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 152:3: -> ^( ASSIGN expression ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:152:6: ^( ASSIGN expression ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:152:26: ^( IDENT_SELECT identifier ( ^( SELECTORS selector ) )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IDENT_SELECT, "IDENT_SELECT"), root_2);

                adaptor.addChild(root_2, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:152:52: ( ^( SELECTORS selector ) )?
                if ( stream_selector.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:152:52: ^( SELECTORS selector )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:155:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ( expression )+ ;
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
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:156:3: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:156:5: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal49=(Token)match(input,61,FOLLOW_61_in_actualParameters944); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal49);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:156:9: ( expression ( ',' expression )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=PLUS && LA11_0<=MINUS)||LA11_0==NOT||(LA11_0>=IDENTIFIER && LA11_0<=INTEGER)||LA11_0==61) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:156:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters947);
                    expression50=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression50.getTree());
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:156:21: ( ',' expression )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==64) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:156:22: ',' expression
                    	    {
                    	    char_literal51=(Token)match(input,64,FOLLOW_64_in_actualParameters950); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_64.add(char_literal51);

                    	    pushFollow(FOLLOW_expression_in_actualParameters952);
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

            char_literal53=(Token)match(input,62,FOLLOW_62_in_actualParameters958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(char_literal53);



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
            // 158:3: -> ( expression )+
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:161:1: procedureCall : identifier ( actualParameters )? -> ^( CALL identifier ( actualParameters )? ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.identifier_return identifier54 = null;

        Oberon0Parser.actualParameters_return actualParameters55 = null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:162:3: ( identifier ( actualParameters )? -> ^( CALL identifier ( actualParameters )? ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:162:5: identifier ( actualParameters )?
            {
            pushFollow(FOLLOW_identifier_in_procedureCall983);
            identifier54=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier54.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:162:16: ( actualParameters )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==61) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall985);
                    actualParameters55=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters55.getTree());

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
            // 163:3: -> ^( CALL identifier ( actualParameters )? )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:163:6: ^( CALL identifier ( actualParameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:163:24: ( actualParameters )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:166:1: ifpart : IF expression THEN statementSequence -> ^( IF expression statementSequence ) ;
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:167:3: ( IF expression THEN statementSequence -> ^( IF expression statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:167:5: IF expression THEN statementSequence
            {
            IF56=(Token)match(input,IF,FOLLOW_IF_in_ifpart1012); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF56);

            pushFollow(FOLLOW_expression_in_ifpart1014);
            expression57=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());
            THEN58=(Token)match(input,THEN,FOLLOW_THEN_in_ifpart1016); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN58);

            pushFollow(FOLLOW_statementSequence_in_ifpart1018);
            statementSequence59=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence59.getTree());


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

            root_0 = (CommonTree)adaptor.nil();
            // 168:3: -> ^( IF expression statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:168:6: ^( IF expression statementSequence )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:171:1: elsifpart : ELSIF expression THEN statementSequence -> ^( ELSIF expression statementSequence ) ;
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:172:3: ( ELSIF expression THEN statementSequence -> ^( ELSIF expression statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:172:5: ELSIF expression THEN statementSequence
            {
            ELSIF60=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_elsifpart1045); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF60);

            pushFollow(FOLLOW_expression_in_elsifpart1047);
            expression61=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());
            THEN62=(Token)match(input,THEN,FOLLOW_THEN_in_elsifpart1049); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(THEN62);

            pushFollow(FOLLOW_statementSequence_in_elsifpart1051);
            statementSequence63=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence63.getTree());


            // AST REWRITE
            // elements: statementSequence, expression, ELSIF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 173:3: -> ^( ELSIF expression statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:173:6: ^( ELSIF expression statementSequence )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:176:1: elsepart : ELSE statementSequence -> ^( ELSE statementSequence ) ;
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:177:3: ( ELSE statementSequence -> ^( ELSE statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:177:5: ELSE statementSequence
            {
            ELSE64=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsepart1076); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE64);

            pushFollow(FOLLOW_statementSequence_in_elsepart1078);
            statementSequence65=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence65.getTree());


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

            root_0 = (CommonTree)adaptor.nil();
            // 178:3: -> ^( ELSE statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:178:6: ^( ELSE statementSequence )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:181:1: ifStatement : ifpart ( elsifpart )* ( elsepart )? END -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END ) ;
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:182:3: ( ifpart ( elsifpart )* ( elsepart )? END -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:182:5: ifpart ( elsifpart )* ( elsepart )? END
            {
            pushFollow(FOLLOW_ifpart_in_ifStatement1101);
            ifpart66=ifpart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifpart.add(ifpart66.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:183:5: ( elsifpart )*
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
            	    pushFollow(FOLLOW_elsifpart_in_ifStatement1107);
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

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:184:5: ( elsepart )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: elsepart
                    {
                    pushFollow(FOLLOW_elsepart_in_ifStatement1114);
                    elsepart68=elsepart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsepart.add(elsepart68.getTree());

                    }
                    break;

            }

            END69=(Token)match(input,END,FOLLOW_END_in_ifStatement1121); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END69);



            // AST REWRITE
            // elements: elsepart, ifpart, elsifpart, END
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 186:3: -> ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:186:6: ^( IFSTATEMENT ifpart ( elsifpart )* ( elsepart )? END )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IFSTATEMENT, "IFSTATEMENT"), root_1);

                adaptor.addChild(root_1, stream_ifpart.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:186:27: ( elsifpart )*
                while ( stream_elsifpart.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsifpart.nextTree());

                }
                stream_elsifpart.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:186:38: ( elsepart )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:189:1: whileStatement : WHILE expression 'DO' statementSequence END -> ^( WHILE expression statementSequence ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE70=null;
        Token string_literal72=null;
        Token END74=null;
        Oberon0Parser.expression_return expression71 = null;

        Oberon0Parser.statementSequence_return statementSequence73 = null;


        CommonTree WHILE70_tree=null;
        CommonTree string_literal72_tree=null;
        CommonTree END74_tree=null;
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:190:3: ( WHILE expression 'DO' statementSequence END -> ^( WHILE expression statementSequence ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:190:5: WHILE expression 'DO' statementSequence END
            {
            WHILE70=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1152); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE70);

            pushFollow(FOLLOW_expression_in_whileStatement1154);
            expression71=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression71.getTree());
            string_literal72=(Token)match(input,65,FOLLOW_65_in_whileStatement1156); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(string_literal72);

            pushFollow(FOLLOW_statementSequence_in_whileStatement1158);
            statementSequence73=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence73.getTree());
            END74=(Token)match(input,END,FOLLOW_END_in_whileStatement1160); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END74);



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

            root_0 = (CommonTree)adaptor.nil();
            // 191:3: -> ^( WHILE expression statementSequence )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:191:6: ^( WHILE expression statementSequence )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:194:1: statement : ( assignment | procedureCall | ifStatement | whileStatement );
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment75 = null;

        Oberon0Parser.procedureCall_return procedureCall76 = null;

        Oberon0Parser.ifStatement_return ifStatement77 = null;

        Oberon0Parser.whileStatement_return whileStatement78 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:195:3: ( assignment | procedureCall | ifStatement | whileStatement )
            int alt15=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>=58 && LA15_1<=59)||LA15_1==63) ) {
                    alt15=1;
                }
                else if ( (LA15_1==EOF||LA15_1==END||(LA15_1>=ELSIF && LA15_1<=ELSE)||LA15_1==57||LA15_1==61) ) {
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
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:195:5: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_statement1187);
                    assignment75=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment75.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:196:5: procedureCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_procedureCall_in_statement1193);
                    procedureCall76=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall76.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:197:5: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement1199);
                    ifStatement77=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement77.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:198:5: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement1205);
                    whileStatement78=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement78.getTree());

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:201:1: statementSequence : statement ( ';' statement )* -> ^( STATEMENTS ( statement )+ ) ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal80=null;
        Oberon0Parser.statement_return statement79 = null;

        Oberon0Parser.statement_return statement81 = null;


        CommonTree char_literal80_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:202:3: ( statement ( ';' statement )* -> ^( STATEMENTS ( statement )+ ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:202:5: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence1220);
            statement79=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement79.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:202:15: ( ';' statement )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==57) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:202:16: ';' statement
            	    {
            	    char_literal80=(Token)match(input,57,FOLLOW_57_in_statementSequence1223); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal80);

            	    pushFollow(FOLLOW_statement_in_statementSequence1225);
            	    statement81=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement81.getTree());

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
            // 203:3: -> ^( STATEMENTS ( statement )+ )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:203:6: ^( STATEMENTS ( statement )+ )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:206:1: identifierList : identifier ( ',' identifier )* -> ( identifier )+ ;
    public final Oberon0Parser.identifierList_return identifierList() throws RecognitionException {
        Oberon0Parser.identifierList_return retval = new Oberon0Parser.identifierList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal83=null;
        Oberon0Parser.identifier_return identifier82 = null;

        Oberon0Parser.identifier_return identifier84 = null;


        CommonTree char_literal83_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:207:3: ( identifier ( ',' identifier )* -> ( identifier )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:207:5: identifier ( ',' identifier )*
            {
            pushFollow(FOLLOW_identifier_in_identifierList1255);
            identifier82=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier82.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:207:16: ( ',' identifier )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==64) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:207:17: ',' identifier
            	    {
            	    char_literal83=(Token)match(input,64,FOLLOW_64_in_identifierList1258); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_64.add(char_literal83);

            	    pushFollow(FOLLOW_identifier_in_identifierList1260);
            	    identifier84=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier84.getTree());

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
            // 208:3: -> ( identifier )+
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:211:1: arrayType : ARRAY expression 'OF' type -> ^( ARRAY type expression ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY85=null;
        Token string_literal87=null;
        Oberon0Parser.expression_return expression86 = null;

        Oberon0Parser.type_return type88 = null;


        CommonTree ARRAY85_tree=null;
        CommonTree string_literal87_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:212:3: ( ARRAY expression 'OF' type -> ^( ARRAY type expression ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:212:5: ARRAY expression 'OF' type
            {
            ARRAY85=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY85);

            pushFollow(FOLLOW_expression_in_arrayType1286);
            expression86=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression86.getTree());
            string_literal87=(Token)match(input,66,FOLLOW_66_in_arrayType1288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal87);

            pushFollow(FOLLOW_type_in_arrayType1290);
            type88=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type88.getTree());


            // AST REWRITE
            // elements: type, ARRAY, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 213:3: -> ^( ARRAY type expression )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:213:6: ^( ARRAY type expression )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:216:1: field : ( identifierList ':' type )? -> ^( FIELD type identifierList ) ;
    public final Oberon0Parser.field_return field() throws RecognitionException {
        Oberon0Parser.field_return retval = new Oberon0Parser.field_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal90=null;
        Oberon0Parser.identifierList_return identifierList89 = null;

        Oberon0Parser.type_return type91 = null;


        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:217:3: ( ( identifierList ':' type )? -> ^( FIELD type identifierList ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:217:5: ( identifierList ':' type )?
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:217:5: ( identifierList ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:217:6: identifierList ':' type
                    {
                    pushFollow(FOLLOW_identifierList_in_field1316);
                    identifierList89=identifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifierList.add(identifierList89.getTree());
                    char_literal90=(Token)match(input,67,FOLLOW_67_in_field1318); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(char_literal90);

                    pushFollow(FOLLOW_type_in_field1320);
                    type91=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type91.getTree());

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
            // 218:3: -> ^( FIELD type identifierList )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:218:6: ^( FIELD type identifierList )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:221:1: recordType : RECORD field ( ';' field )* 'END' -> ^( RECORD ( field )+ ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD92=null;
        Token char_literal94=null;
        Token string_literal96=null;
        Oberon0Parser.field_return field93 = null;

        Oberon0Parser.field_return field95 = null;


        CommonTree RECORD92_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree string_literal96_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:222:3: ( RECORD field ( ';' field )* 'END' -> ^( RECORD ( field )+ ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:222:5: RECORD field ( ';' field )* 'END'
            {
            RECORD92=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1350); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD92);

            pushFollow(FOLLOW_field_in_recordType1352);
            field93=field();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_field.add(field93.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:222:18: ( ';' field )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==57) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:222:19: ';' field
            	    {
            	    char_literal94=(Token)match(input,57,FOLLOW_57_in_recordType1355); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal94);

            	    pushFollow(FOLLOW_field_in_recordType1357);
            	    field95=field();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_field.add(field95.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            string_literal96=(Token)match(input,END,FOLLOW_END_in_recordType1361); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal96);



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
            // 223:3: -> ^( RECORD ( field )+ )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:223:6: ^( RECORD ( field )+ )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:226:1: type : ( identifier | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.identifier_return identifier97 = null;

        Oberon0Parser.arrayType_return arrayType98 = null;

        Oberon0Parser.recordType_return recordType99 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:227:3: ( identifier | arrayType | recordType )
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:227:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_type1385);
                    identifier97=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier97.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:228:5: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1391);
                    arrayType98=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType98.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:229:5: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1397);
                    recordType99=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType99.getTree());

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:232:1: fpSection : ( 'VAR' )? identifierList ':' type -> ^( FORMALPARAMETER ( 'VAR' )? type identifierList ) ;
    public final Oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        Oberon0Parser.fpSection_return retval = new Oberon0Parser.fpSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal100=null;
        Token char_literal102=null;
        Oberon0Parser.identifierList_return identifierList101 = null;

        Oberon0Parser.type_return type103 = null;


        CommonTree string_literal100_tree=null;
        CommonTree char_literal102_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:233:3: ( ( 'VAR' )? identifierList ':' type -> ^( FORMALPARAMETER ( 'VAR' )? type identifierList ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:233:5: ( 'VAR' )? identifierList ':' type
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:233:5: ( 'VAR' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==VAR) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: 'VAR'
                    {
                    string_literal100=(Token)match(input,VAR,FOLLOW_VAR_in_fpSection1414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(string_literal100);


                    }
                    break;

            }

            pushFollow(FOLLOW_identifierList_in_fpSection1417);
            identifierList101=identifierList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifierList.add(identifierList101.getTree());
            char_literal102=(Token)match(input,67,FOLLOW_67_in_fpSection1419); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal102);

            pushFollow(FOLLOW_type_in_fpSection1421);
            type103=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type103.getTree());


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
            // 234:3: -> ^( FORMALPARAMETER ( 'VAR' )? type identifierList )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:234:6: ^( FORMALPARAMETER ( 'VAR' )? type identifierList )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMALPARAMETER, "FORMALPARAMETER"), root_1);

                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:234:24: ( 'VAR' )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:237:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' -> ( fpSection )+ ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal104=null;
        Token char_literal106=null;
        Token char_literal108=null;
        Oberon0Parser.fpSection_return fpSection105 = null;

        Oberon0Parser.fpSection_return fpSection107 = null;


        CommonTree char_literal104_tree=null;
        CommonTree char_literal106_tree=null;
        CommonTree char_literal108_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_fpSection=new RewriteRuleSubtreeStream(adaptor,"rule fpSection");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:3: ( '(' ( fpSection ( ';' fpSection )* )? ')' -> ( fpSection )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:5: '(' ( fpSection ( ';' fpSection )* )? ')'
            {
            char_literal104=(Token)match(input,61,FOLLOW_61_in_formalParameters1452); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal104);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:9: ( fpSection ( ';' fpSection )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VAR||LA23_0==IDENTIFIER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:10: fpSection ( ';' fpSection )*
                    {
                    pushFollow(FOLLOW_fpSection_in_formalParameters1455);
                    fpSection105=fpSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fpSection.add(fpSection105.getTree());
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:20: ( ';' fpSection )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==57) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:238:21: ';' fpSection
                    	    {
                    	    char_literal106=(Token)match(input,57,FOLLOW_57_in_formalParameters1458); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_57.add(char_literal106);

                    	    pushFollow(FOLLOW_fpSection_in_formalParameters1460);
                    	    fpSection107=fpSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fpSection.add(fpSection107.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal108=(Token)match(input,62,FOLLOW_62_in_formalParameters1466); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(char_literal108);



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
            // 240:3: -> ( fpSection )+
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:243:1: procedureHeading : PROCEDURE identifier ( formalParameters )? -> identifier ( formalParameters )? ;
    public final Oberon0Parser.procedureHeading_return procedureHeading() throws RecognitionException {
        Oberon0Parser.procedureHeading_return retval = new Oberon0Parser.procedureHeading_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE109=null;
        Oberon0Parser.identifier_return identifier110 = null;

        Oberon0Parser.formalParameters_return formalParameters111 = null;


        CommonTree PROCEDURE109_tree=null;
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:244:3: ( PROCEDURE identifier ( formalParameters )? -> identifier ( formalParameters )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:244:6: PROCEDURE identifier ( formalParameters )?
            {
            PROCEDURE109=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureHeading1488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE109);

            pushFollow(FOLLOW_identifier_in_procedureHeading1490);
            identifier110=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier110.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:244:27: ( formalParameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==61) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading1492);
                    formalParameters111=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters111.getTree());

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
            // 245:3: -> identifier ( formalParameters )?
            {
                adaptor.addChild(root_0, stream_identifier.nextTree());
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:245:17: ( formalParameters )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:248:1: procedureBody : declarations ( 'BEGIN' statementSequence )? 'END' identifier -> ( ^( DECLARATIONS declarations ) )? ( statementSequence )? ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal113=null;
        Token string_literal115=null;
        Oberon0Parser.declarations_return declarations112 = null;

        Oberon0Parser.statementSequence_return statementSequence114 = null;

        Oberon0Parser.identifier_return identifier116 = null;


        CommonTree string_literal113_tree=null;
        CommonTree string_literal115_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:249:3: ( declarations ( 'BEGIN' statementSequence )? 'END' identifier -> ( ^( DECLARATIONS declarations ) )? ( statementSequence )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:249:7: declarations ( 'BEGIN' statementSequence )? 'END' identifier
            {
            pushFollow(FOLLOW_declarations_in_procedureBody1522);
            declarations112=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations112.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:249:20: ( 'BEGIN' statementSequence )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BEGIN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:249:21: 'BEGIN' statementSequence
                    {
                    string_literal113=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1525); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(string_literal113);

                    pushFollow(FOLLOW_statementSequence_in_procedureBody1527);
                    statementSequence114=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence114.getTree());

                    }
                    break;

            }

            string_literal115=(Token)match(input,END,FOLLOW_END_in_procedureBody1531); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal115);

            pushFollow(FOLLOW_identifier_in_procedureBody1533);
            identifier116=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier116.getTree());


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
            // 250:3: -> ( ^( DECLARATIONS declarations ) )? ( statementSequence )?
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:250:7: ( ^( DECLARATIONS declarations ) )?
                if ( stream_declarations.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:250:7: ^( DECLARATIONS declarations )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                    adaptor.addChild(root_1, stream_declarations.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_declarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:250:37: ( statementSequence )?
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:253:1: procedureDeclarations : procedureHeading ';' procedureBody -> ^( PROCEDURE procedureHeading procedureBody ) ;
    public final Oberon0Parser.procedureDeclarations_return procedureDeclarations() throws RecognitionException {
        Oberon0Parser.procedureDeclarations_return retval = new Oberon0Parser.procedureDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal118=null;
        Oberon0Parser.procedureHeading_return procedureHeading117 = null;

        Oberon0Parser.procedureBody_return procedureBody119 = null;


        CommonTree char_literal118_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:254:3: ( procedureHeading ';' procedureBody -> ^( PROCEDURE procedureHeading procedureBody ) )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:254:5: procedureHeading ';' procedureBody
            {
            pushFollow(FOLLOW_procedureHeading_in_procedureDeclarations1566);
            procedureHeading117=procedureHeading();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_procedureHeading.add(procedureHeading117.getTree());
            char_literal118=(Token)match(input,57,FOLLOW_57_in_procedureDeclarations1568); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal118);

            pushFollow(FOLLOW_procedureBody_in_procedureDeclarations1570);
            procedureBody119=procedureBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody119.getTree());


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
            // 255:3: -> ^( PROCEDURE procedureHeading procedureBody )
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:255:6: ^( PROCEDURE procedureHeading procedureBody )
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:258:1: constantDeclarations : CONST ( identifier '=' expression ';' )* -> ( ^( CONST identifier expression ) )* ;
    public final Oberon0Parser.constantDeclarations_return constantDeclarations() throws RecognitionException {
        Oberon0Parser.constantDeclarations_return retval = new Oberon0Parser.constantDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST120=null;
        Token char_literal122=null;
        Token char_literal124=null;
        Oberon0Parser.identifier_return identifier121 = null;

        Oberon0Parser.expression_return expression123 = null;


        CommonTree CONST120_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree char_literal124_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:259:3: ( CONST ( identifier '=' expression ';' )* -> ( ^( CONST identifier expression ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:259:5: CONST ( identifier '=' expression ';' )*
            {
            CONST120=(Token)match(input,CONST,FOLLOW_CONST_in_constantDeclarations1597); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST120);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:259:11: ( identifier '=' expression ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENTIFIER) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:259:12: identifier '=' expression ';'
            	    {
            	    pushFollow(FOLLOW_identifier_in_constantDeclarations1600);
            	    identifier121=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier121.getTree());
            	    char_literal122=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constantDeclarations1602); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal122);

            	    pushFollow(FOLLOW_expression_in_constantDeclarations1604);
            	    expression123=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression123.getTree());
            	    char_literal124=(Token)match(input,57,FOLLOW_57_in_constantDeclarations1606); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal124);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // AST REWRITE
            // elements: CONST, expression, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 260:3: -> ( ^( CONST identifier expression ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:260:6: ( ^( CONST identifier expression ) )*
                while ( stream_CONST.hasNext()||stream_expression.hasNext()||stream_identifier.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:260:6: ^( CONST identifier expression )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_identifier.nextTree());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_CONST.reset();
                stream_expression.reset();
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
    // $ANTLR end "constantDeclarations"

    public static class typeDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:263:1: typeDeclarations : TYPE ( identifier '=' type ';' )* -> ( ^( TYPE identifier type ) )* ;
    public final Oberon0Parser.typeDeclarations_return typeDeclarations() throws RecognitionException {
        Oberon0Parser.typeDeclarations_return retval = new Oberon0Parser.typeDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE125=null;
        Token char_literal127=null;
        Token char_literal129=null;
        Oberon0Parser.identifier_return identifier126 = null;

        Oberon0Parser.type_return type128 = null;


        CommonTree TYPE125_tree=null;
        CommonTree char_literal127_tree=null;
        CommonTree char_literal129_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:264:3: ( TYPE ( identifier '=' type ';' )* -> ( ^( TYPE identifier type ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:264:5: TYPE ( identifier '=' type ';' )*
            {
            TYPE125=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclarations1636); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE125);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:264:10: ( identifier '=' type ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENTIFIER) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:264:11: identifier '=' type ';'
            	    {
            	    pushFollow(FOLLOW_identifier_in_typeDeclarations1639);
            	    identifier126=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier126.getTree());
            	    char_literal127=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclarations1641); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal127);

            	    pushFollow(FOLLOW_type_in_typeDeclarations1643);
            	    type128=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type128.getTree());
            	    char_literal129=(Token)match(input,57,FOLLOW_57_in_typeDeclarations1645); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal129);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);



            // AST REWRITE
            // elements: TYPE, type, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 265:3: -> ( ^( TYPE identifier type ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:265:6: ( ^( TYPE identifier type ) )*
                while ( stream_TYPE.hasNext()||stream_type.hasNext()||stream_identifier.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:265:6: ^( TYPE identifier type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_identifier.nextTree());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_TYPE.reset();
                stream_type.reset();
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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:268:1: varDeclarations : VAR ( identifierList ':' type ';' )* -> ( ^( VAR type identifierList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR130=null;
        Token char_literal132=null;
        Token char_literal134=null;
        Oberon0Parser.identifierList_return identifierList131 = null;

        Oberon0Parser.type_return type133 = null;


        CommonTree VAR130_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree char_literal134_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_identifierList=new RewriteRuleSubtreeStream(adaptor,"rule identifierList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:269:3: ( VAR ( identifierList ':' type ';' )* -> ( ^( VAR type identifierList ) )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:269:5: VAR ( identifierList ':' type ';' )*
            {
            VAR130=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1675); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR130);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:269:9: ( identifierList ':' type ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==IDENTIFIER) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:269:10: identifierList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identifierList_in_varDeclarations1678);
            	    identifierList131=identifierList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifierList.add(identifierList131.getTree());
            	    char_literal132=(Token)match(input,67,FOLLOW_67_in_varDeclarations1680); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_67.add(char_literal132);

            	    pushFollow(FOLLOW_type_in_varDeclarations1682);
            	    type133=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type133.getTree());
            	    char_literal134=(Token)match(input,57,FOLLOW_57_in_varDeclarations1684); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal134);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);



            // AST REWRITE
            // elements: VAR, identifierList, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 270:3: -> ( ^( VAR type identifierList ) )*
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:270:6: ( ^( VAR type identifierList ) )*
                while ( stream_VAR.hasNext()||stream_identifierList.hasNext()||stream_type.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:270:6: ^( VAR type identifierList )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_identifierList.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_VAR.reset();
                stream_identifierList.reset();
                stream_type.reset();

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:273:1: declarations : ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations ';' )* -> ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( ( procedureDeclarations )* )? ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal139=null;
        Oberon0Parser.constantDeclarations_return constantDeclarations135 = null;

        Oberon0Parser.typeDeclarations_return typeDeclarations136 = null;

        Oberon0Parser.varDeclarations_return varDeclarations137 = null;

        Oberon0Parser.procedureDeclarations_return procedureDeclarations138 = null;


        CommonTree char_literal139_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_procedureDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclarations");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_constantDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclarations");
        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:274:3: ( ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations ';' )* -> ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( ( procedureDeclarations )* )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:274:5: ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( procedureDeclarations ';' )*
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:274:5: ( constantDeclarations )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CONST) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: constantDeclarations
                    {
                    pushFollow(FOLLOW_constantDeclarations_in_declarations1714);
                    constantDeclarations135=constantDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constantDeclarations.add(constantDeclarations135.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:275:5: ( typeDeclarations )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==TYPE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: typeDeclarations
                    {
                    pushFollow(FOLLOW_typeDeclarations_in_declarations1721);
                    typeDeclarations136=typeDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclarations.add(typeDeclarations136.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:276:5: ( varDeclarations )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VAR) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1728);
                    varDeclarations137=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations137.getTree());

                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:277:5: ( procedureDeclarations ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PROCEDURE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:277:6: procedureDeclarations ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclarations_in_declarations1737);
            	    procedureDeclarations138=procedureDeclarations();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclarations.add(procedureDeclarations138.getTree());
            	    char_literal139=(Token)match(input,57,FOLLOW_57_in_declarations1739); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_57.add(char_literal139);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: varDeclarations, typeDeclarations, constantDeclarations, procedureDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 278:2: -> ( constantDeclarations )? ( typeDeclarations )? ( varDeclarations )? ( ( procedureDeclarations )* )?
            {
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:278:5: ( constantDeclarations )?
                if ( stream_constantDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_constantDeclarations.nextTree());

                }
                stream_constantDeclarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:279:5: ( typeDeclarations )?
                if ( stream_typeDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclarations.nextTree());

                }
                stream_typeDeclarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:280:5: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:281:5: ( ( procedureDeclarations )* )?
                if ( stream_procedureDeclarations.hasNext() ) {
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:281:6: ( procedureDeclarations )*
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
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:5: ( simpleExpression comparer simpleExpression )
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:144:5: simpleExpression comparer simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred21_Oberon0857);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_comparer_in_synpred21_Oberon0859);
        comparer();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred21_Oberon0861);
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


 

    public static final BitSet FOLLOW_MODULE_in_module427 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifier_in_module429 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_module431 = new BitSet(new long[]{0x00000000000013E0L});
    public static final BitSet FOLLOW_moduleBody_in_module433 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_module436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody463 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody466 = new BitSet(new long[]{0x0040000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody468 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_moduleBody472 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifier_in_moduleBody474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_literal531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_subselector546 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifier_in_subselector548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_subselector564 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_expression_in_subselector566 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_subselector568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subselector_in_selector593 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_identifier_in_factor610 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_selector_in_factor612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_factor635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_factor647 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_expression_in_factor649 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_factor651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor663 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_factor_in_factor665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_strongops0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term723 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_strongops_in_term726 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_factor_in_term729 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_PLUS_in_unary744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_weakops0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_simpleExpression795 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_term_in_simpleExpression799 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_weakops_in_simpleExpression802 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_term_in_simpleExpression805 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_comparer0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression857 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_comparer_in_expression859 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_simpleExpression_in_expression861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignment901 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_selector_in_assignment903 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_assignment905 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_expression_in_assignment907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_actualParameters944 = new BitSet(new long[]{0x60C000000B000000L});
    public static final BitSet FOLLOW_expression_in_actualParameters947 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_actualParameters950 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_expression_in_actualParameters952 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_62_in_actualParameters958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_procedureCall983 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifpart1012 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_expression_in_ifpart1014 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifpart1016 = new BitSet(new long[]{0x0040000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_ifpart1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_elsifpart1045 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_expression_in_elsifpart1047 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_elsifpart1049 = new BitSet(new long[]{0x0040000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_elsifpart1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elsepart1076 = new BitSet(new long[]{0x0040000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_elsepart1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifpart_in_ifStatement1101 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_elsifpart_in_ifStatement1107 = new BitSet(new long[]{0x0000000000030040L});
    public static final BitSet FOLLOW_elsepart_in_ifStatement1114 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_ifStatement1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1152 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_whileStatement1156 = new BitSet(new long[]{0x0040000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1158 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_whileStatement1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1220 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_statementSequence1223 = new BitSet(new long[]{0x0040000000006000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1225 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierList1255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_identifierList1258 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifier_in_identifierList1260 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1284 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_expression_in_arrayType1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_arrayType1288 = new BitSet(new long[]{0x0040000000000C00L});
    public static final BitSet FOLLOW_type_in_arrayType1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_field1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_field1318 = new BitSet(new long[]{0x0040000000000C00L});
    public static final BitSet FOLLOW_type_in_field1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1350 = new BitSet(new long[]{0x0240000000000040L});
    public static final BitSet FOLLOW_field_in_recordType1352 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_57_in_recordType1355 = new BitSet(new long[]{0x0240000000000040L});
    public static final BitSet FOLLOW_field_in_recordType1357 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_END_in_recordType1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_type1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection1414 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifierList_in_fpSection1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_fpSection1419 = new BitSet(new long[]{0x0040000000000C00L});
    public static final BitSet FOLLOW_type_in_fpSection1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_formalParameters1452 = new BitSet(new long[]{0x4040000000000200L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1455 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_57_in_formalParameters1458 = new BitSet(new long[]{0x0040000000000200L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters1460 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_62_in_formalParameters1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureHeading1488 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifier_in_procedureHeading1490 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody1522 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1525 = new BitSet(new long[]{0x0040000000006000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1527 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_procedureBody1531 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifier_in_procedureBody1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclarations1566 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_procedureDeclarations1568 = new BitSet(new long[]{0x00000000000013E0L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclarations1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constantDeclarations1597 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_identifier_in_constantDeclarations1600 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_constantDeclarations1602 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations1604 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_constantDeclarations1606 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclarations1636 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeDeclarations1639 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations1641 = new BitSet(new long[]{0x0040000000000C00L});
    public static final BitSet FOLLOW_type_in_typeDeclarations1643 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_typeDeclarations1645 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1675 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_identifierList_in_varDeclarations1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_varDeclarations1680 = new BitSet(new long[]{0x0040000000000C00L});
    public static final BitSet FOLLOW_type_in_varDeclarations1682 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_varDeclarations1684 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations1714 = new BitSet(new long[]{0x0000000000001302L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations1721 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1728 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations1737 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_declarations1739 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred21_Oberon0857 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_comparer_in_synpred21_Oberon0859 = new BitSet(new long[]{0x20C000000B000000L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred21_Oberon0861 = new BitSet(new long[]{0x0000000000000002L});

}