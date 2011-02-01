// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon.g 2011-01-30 11:05:14

package uva.oberon0.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

@SuppressWarnings("unused")
public class OberonParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "CONST", "VAR", "VARREF", "PROCEDURE", "BODY", "EXIT", "RETURN", "IF", "THEN", "ELSE", "ELSIF", "END", "WHILE", "EQUAL", "UNEQUAL", "LESS", "LESS_EQUAL", "GREAT", "GREAT_EQUAL", "MIN", "PLUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "DECLARATIONS", "INPUTVARS", "CALL", "CALL_READ", "CALL_WRITE", "CALL_WRITELN", "CALLVARS", "ASSIGN", "INT_TYPE", "ARRAY", "ID", "INT", "WHITESPACE", "'MODULE'", "';'", "'BEGIN'", "'.'", "':'", "'PROCEDURE'", "'('", "')'", "','", "'OF'", "'DO'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int MODULE=4;
    public static final int CONST=5;
    public static final int VAR=6;
    public static final int VARREF=7;
    public static final int PROCEDURE=8;
    public static final int BODY=9;
    public static final int EXIT=10;
    public static final int RETURN=11;
    public static final int IF=12;
    public static final int THEN=13;
    public static final int ELSE=14;
    public static final int ELSIF=15;
    public static final int END=16;
    public static final int WHILE=17;
    public static final int EQUAL=18;
    public static final int UNEQUAL=19;
    public static final int LESS=20;
    public static final int LESS_EQUAL=21;
    public static final int GREAT=22;
    public static final int GREAT_EQUAL=23;
    public static final int MIN=24;
    public static final int PLUS=25;
    public static final int MUL=26;
    public static final int DIV=27;
    public static final int MOD=28;
    public static final int AND=29;
    public static final int OR=30;
    public static final int NOT=31;
    public static final int DECLARATIONS=32;
    public static final int INPUTVARS=33;
    public static final int CALL=34;
    public static final int CALL_READ=35;
    public static final int CALL_WRITE=36;
    public static final int CALL_WRITELN=37;
    public static final int CALLVARS=38;
    public static final int ASSIGN=39;
    public static final int INT_TYPE=40;
    public static final int ARRAY=41;
    public static final int ID=42;
    public static final int INT=43;
    public static final int WHITESPACE=44;

    // delegates
    // delegators


        public OberonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public OberonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return OberonParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Projects UVA\\Oberon.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // D:\\Projects UVA\\Oberon.g:70:1: module : 'MODULE' ID ';' declarations 'BEGIN' statements 'END' ID '.' -> ^( MODULE ID declarations ^( BODY statements ) ) ;
    public final OberonParser.module_return module() throws RecognitionException {
        OberonParser.module_return retval = new OberonParser.module_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token ID2=null;
        Token char_literal3=null;
        Token string_literal5=null;
        Token string_literal7=null;
        Token ID8=null;
        Token char_literal9=null;
        OberonParser.declarations_return declarations4 = null;

        OberonParser.statements_return statements6 = null;


        Object string_literal1_tree=null;
        Object ID2_tree=null;
        Object char_literal3_tree=null;
        Object string_literal5_tree=null;
        Object string_literal7_tree=null;
        Object ID8_tree=null;
        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // D:\\Projects UVA\\Oberon.g:70:9: ( 'MODULE' ID ';' declarations 'BEGIN' statements 'END' ID '.' -> ^( MODULE ID declarations ^( BODY statements ) ) )
            // D:\\Projects UVA\\Oberon.g:70:11: 'MODULE' ID ';' declarations 'BEGIN' statements 'END' ID '.'
            {
            string_literal1=(Token)match(input,45,FOLLOW_45_in_module302); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_45.add(string_literal1);

            ID2=(Token)match(input,ID,FOLLOW_ID_in_module304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID2);

            char_literal3=(Token)match(input,46,FOLLOW_46_in_module306); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal3);

            pushFollow(FOLLOW_declarations_in_module310);
            declarations4=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations4.getTree());
            string_literal5=(Token)match(input,47,FOLLOW_47_in_module314); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(string_literal5);

            pushFollow(FOLLOW_statements_in_module318);
            statements6=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements6.getTree());
            string_literal7=(Token)match(input,END,FOLLOW_END_in_module322); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal7);

            ID8=(Token)match(input,ID,FOLLOW_ID_in_module324); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID8);

            char_literal9=(Token)match(input,48,FOLLOW_48_in_module326); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(char_literal9);



            // AST REWRITE
            // elements: statements, declarations, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 75:2: -> ^( MODULE ID declarations ^( BODY statements ) )
            {
                // D:\\Projects UVA\\Oberon.g:75:5: ^( MODULE ID declarations ^( BODY statements ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODULE, "MODULE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_declarations.nextTree());
                // D:\\Projects UVA\\Oberon.g:75:30: ^( BODY statements )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                adaptor.addChild(root_2, stream_statements.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "module"

    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // D:\\Projects UVA\\Oberon.g:77:1: declarations : ( declaration )* -> ^( DECLARATIONS ( declaration )* ) ;
    public final OberonParser.declarations_return declarations() throws RecognitionException {
        OberonParser.declarations_return retval = new OberonParser.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OberonParser.declaration_return declaration10 = null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // D:\\Projects UVA\\Oberon.g:78:2: ( ( declaration )* -> ^( DECLARATIONS ( declaration )* ) )
            // D:\\Projects UVA\\Oberon.g:78:4: ( declaration )*
            {
            // D:\\Projects UVA\\Oberon.g:78:4: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=CONST && LA1_0<=VAR)||LA1_0==50) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:78:4: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_declarations354);
            	    declaration10=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration10.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:2: -> ^( DECLARATIONS ( declaration )* )
            {
                // D:\\Projects UVA\\Oberon.g:79:5: ^( DECLARATIONS ( declaration )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);

                // D:\\Projects UVA\\Oberon.g:79:20: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

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
        }
        return retval;
    }
    // $ANTLR end "declarations"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // D:\\Projects UVA\\Oberon.g:81:1: declaration : ( constDeclaration | varDeclaration | procedure );
    public final OberonParser.declaration_return declaration() throws RecognitionException {
        OberonParser.declaration_return retval = new OberonParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OberonParser.constDeclaration_return constDeclaration11 = null;

        OberonParser.varDeclaration_return varDeclaration12 = null;

        OberonParser.procedure_return procedure13 = null;



        try {
            // D:\\Projects UVA\\Oberon.g:82:2: ( constDeclaration | varDeclaration | procedure )
            int alt2=3;
            switch ( input.LA(1) ) {
            case CONST:
                {
                alt2=1;
                }
                break;
            case VAR:
                {
                alt2=2;
                }
                break;
            case 50:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:82:4: constDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constDeclaration_in_declaration378);
                    constDeclaration11=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constDeclaration11.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:82:21: varDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_declaration380);
                    varDeclaration12=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration12.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:82:36: procedure
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_procedure_in_declaration382);
                    procedure13=procedure();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedure13.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class constDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constDeclaration"
    // D:\\Projects UVA\\Oberon.g:84:1: constDeclaration : 'CONST' ( ID '=' expression ';' ) -> ^( CONST ID expression ) ;
    public final OberonParser.constDeclaration_return constDeclaration() throws RecognitionException {
        OberonParser.constDeclaration_return retval = new OberonParser.constDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal14=null;
        Token ID15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        OberonParser.expression_return expression17 = null;


        Object string_literal14_tree=null;
        Object ID15_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Projects UVA\\Oberon.g:85:2: ( 'CONST' ( ID '=' expression ';' ) -> ^( CONST ID expression ) )
            // D:\\Projects UVA\\Oberon.g:85:4: 'CONST' ( ID '=' expression ';' )
            {
            string_literal14=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration393); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(string_literal14);

            // D:\\Projects UVA\\Oberon.g:85:12: ( ID '=' expression ';' )
            // D:\\Projects UVA\\Oberon.g:85:13: ID '=' expression ';'
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_constDeclaration396); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID15);

            char_literal16=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_constDeclaration398); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUAL.add(char_literal16);

            pushFollow(FOLLOW_expression_in_constDeclaration400);
            expression17=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression17.getTree());
            char_literal18=(Token)match(input,46,FOLLOW_46_in_constDeclaration402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal18);


            }



            // AST REWRITE
            // elements: ID, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:2: -> ^( CONST ID expression )
            {
                // D:\\Projects UVA\\Oberon.g:86:5: ^( CONST ID expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_expression.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "constDeclaration"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // D:\\Projects UVA\\Oberon.g:88:1: varDeclaration : 'VAR' ( idList ':' type ';' )* -> ( ^( VAR idList type ) )* ;
    public final OberonParser.varDeclaration_return varDeclaration() throws RecognitionException {
        OberonParser.varDeclaration_return retval = new OberonParser.varDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal19=null;
        Token char_literal21=null;
        Token char_literal23=null;
        OberonParser.idList_return idList20 = null;

        OberonParser.type_return type22 = null;


        Object string_literal19_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Projects UVA\\Oberon.g:89:2: ( 'VAR' ( idList ':' type ';' )* -> ( ^( VAR idList type ) )* )
            // D:\\Projects UVA\\Oberon.g:89:4: 'VAR' ( idList ':' type ';' )*
            {
            string_literal19=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclaration423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(string_literal19);

            // D:\\Projects UVA\\Oberon.g:89:10: ( idList ':' type ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:89:11: idList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_idList_in_varDeclaration426);
            	    idList20=idList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_idList.add(idList20.getTree());
            	    char_literal21=(Token)match(input,49,FOLLOW_49_in_varDeclaration428); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal21);

            	    pushFollow(FOLLOW_type_in_varDeclaration430);
            	    type22=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type22.getTree());
            	    char_literal23=(Token)match(input,46,FOLLOW_46_in_varDeclaration432); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal23);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);



            // AST REWRITE
            // elements: type, idList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:2: -> ( ^( VAR idList type ) )*
            {
                // D:\\Projects UVA\\Oberon.g:90:5: ( ^( VAR idList type ) )*
                while ( stream_type.hasNext()||stream_idList.hasNext() ) {
                    // D:\\Projects UVA\\Oberon.g:90:5: ^( VAR idList type )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                    adaptor.addChild(root_1, stream_idList.nextTree());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_idList.reset();

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
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class procedure_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedure"
    // D:\\Projects UVA\\Oberon.g:92:1: procedure : 'PROCEDURE' ID ( procedureVars )? ';' declarations 'BEGIN' statements 'END' ID ';' -> ^( PROCEDURE ID ( procedureVars )? ^( BODY declarations statements ) ) ;
    public final OberonParser.procedure_return procedure() throws RecognitionException {
        OberonParser.procedure_return retval = new OberonParser.procedure_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal24=null;
        Token ID25=null;
        Token char_literal27=null;
        Token string_literal29=null;
        Token string_literal31=null;
        Token ID32=null;
        Token char_literal33=null;
        OberonParser.procedureVars_return procedureVars26 = null;

        OberonParser.declarations_return declarations28 = null;

        OberonParser.statements_return statements30 = null;


        Object string_literal24_tree=null;
        Object ID25_tree=null;
        Object char_literal27_tree=null;
        Object string_literal29_tree=null;
        Object string_literal31_tree=null;
        Object ID32_tree=null;
        Object char_literal33_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_procedureVars=new RewriteRuleSubtreeStream(adaptor,"rule procedureVars");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // D:\\Projects UVA\\Oberon.g:93:2: ( 'PROCEDURE' ID ( procedureVars )? ';' declarations 'BEGIN' statements 'END' ID ';' -> ^( PROCEDURE ID ( procedureVars )? ^( BODY declarations statements ) ) )
            // D:\\Projects UVA\\Oberon.g:93:4: 'PROCEDURE' ID ( procedureVars )? ';' declarations 'BEGIN' statements 'END' ID ';'
            {
            string_literal24=(Token)match(input,50,FOLLOW_50_in_procedure455); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(string_literal24);

            ID25=(Token)match(input,ID,FOLLOW_ID_in_procedure457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID25);

            // D:\\Projects UVA\\Oberon.g:93:19: ( procedureVars )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==51) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:93:19: procedureVars
                    {
                    pushFollow(FOLLOW_procedureVars_in_procedure459);
                    procedureVars26=procedureVars();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureVars.add(procedureVars26.getTree());

                    }
                    break;

            }

            char_literal27=(Token)match(input,46,FOLLOW_46_in_procedure462); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal27);

            pushFollow(FOLLOW_declarations_in_procedure466);
            declarations28=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations28.getTree());
            string_literal29=(Token)match(input,47,FOLLOW_47_in_procedure470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(string_literal29);

            pushFollow(FOLLOW_statements_in_procedure474);
            statements30=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements30.getTree());
            string_literal31=(Token)match(input,END,FOLLOW_END_in_procedure478); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal31);

            ID32=(Token)match(input,ID,FOLLOW_ID_in_procedure480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID32);

            char_literal33=(Token)match(input,46,FOLLOW_46_in_procedure482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal33);



            // AST REWRITE
            // elements: statements, procedureVars, ID, declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:2: -> ^( PROCEDURE ID ( procedureVars )? ^( BODY declarations statements ) )
            {
                // D:\\Projects UVA\\Oberon.g:98:5: ^( PROCEDURE ID ( procedureVars )? ^( BODY declarations statements ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE, "PROCEDURE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // D:\\Projects UVA\\Oberon.g:98:20: ( procedureVars )?
                if ( stream_procedureVars.hasNext() ) {
                    adaptor.addChild(root_1, stream_procedureVars.nextTree());

                }
                stream_procedureVars.reset();
                // D:\\Projects UVA\\Oberon.g:98:35: ^( BODY declarations statements )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                adaptor.addChild(root_2, stream_declarations.nextTree());
                adaptor.addChild(root_2, stream_statements.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "procedure"

    public static class procedureVars_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureVars"
    // D:\\Projects UVA\\Oberon.g:100:1: procedureVars : '(' procedureVar ( ';' procedureVar )* ')' -> ^( INPUTVARS ( procedureVar )* ) ;
    public final OberonParser.procedureVars_return procedureVars() throws RecognitionException {
        OberonParser.procedureVars_return retval = new OberonParser.procedureVars_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal34=null;
        Token char_literal36=null;
        Token char_literal38=null;
        OberonParser.procedureVar_return procedureVar35 = null;

        OberonParser.procedureVar_return procedureVar37 = null;


        Object char_literal34_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_procedureVar=new RewriteRuleSubtreeStream(adaptor,"rule procedureVar");
        try {
            // D:\\Projects UVA\\Oberon.g:101:2: ( '(' procedureVar ( ';' procedureVar )* ')' -> ^( INPUTVARS ( procedureVar )* ) )
            // D:\\Projects UVA\\Oberon.g:101:4: '(' procedureVar ( ';' procedureVar )* ')'
            {
            char_literal34=(Token)match(input,51,FOLLOW_51_in_procedureVars511); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal34);

            pushFollow(FOLLOW_procedureVar_in_procedureVars513);
            procedureVar35=procedureVar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_procedureVar.add(procedureVar35.getTree());
            // D:\\Projects UVA\\Oberon.g:101:21: ( ';' procedureVar )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==46) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:101:22: ';' procedureVar
            	    {
            	    char_literal36=(Token)match(input,46,FOLLOW_46_in_procedureVars516); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal36);

            	    pushFollow(FOLLOW_procedureVar_in_procedureVars518);
            	    procedureVar37=procedureVar();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureVar.add(procedureVar37.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            char_literal38=(Token)match(input,52,FOLLOW_52_in_procedureVars522); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal38);



            // AST REWRITE
            // elements: procedureVar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:2: -> ^( INPUTVARS ( procedureVar )* )
            {
                // D:\\Projects UVA\\Oberon.g:102:5: ^( INPUTVARS ( procedureVar )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTVARS, "INPUTVARS"), root_1);

                // D:\\Projects UVA\\Oberon.g:102:17: ( procedureVar )*
                while ( stream_procedureVar.hasNext() ) {
                    adaptor.addChild(root_1, stream_procedureVar.nextTree());

                }
                stream_procedureVar.reset();

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
        }
        return retval;
    }
    // $ANTLR end "procedureVars"

    public static class procedureVar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureVar"
    // D:\\Projects UVA\\Oberon.g:104:1: procedureVar : ( procedureVarRef | procedureVarNonRef );
    public final OberonParser.procedureVar_return procedureVar() throws RecognitionException {
        OberonParser.procedureVar_return retval = new OberonParser.procedureVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OberonParser.procedureVarRef_return procedureVarRef39 = null;

        OberonParser.procedureVarNonRef_return procedureVarNonRef40 = null;



        try {
            // D:\\Projects UVA\\Oberon.g:105:2: ( procedureVarRef | procedureVarNonRef )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==VAR) ) {
                alt6=1;
            }
            else if ( (LA6_0==ID) ) {
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
                    // D:\\Projects UVA\\Oberon.g:105:4: procedureVarRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_procedureVarRef_in_procedureVar544);
                    procedureVarRef39=procedureVarRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureVarRef39.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:105:20: procedureVarNonRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_procedureVarNonRef_in_procedureVar546);
                    procedureVarNonRef40=procedureVarNonRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureVarNonRef40.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "procedureVar"

    public static class procedureVarRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureVarRef"
    // D:\\Projects UVA\\Oberon.g:106:1: procedureVarRef : 'VAR' idList ':' type -> ^( VARREF idList type ) ;
    public final OberonParser.procedureVarRef_return procedureVarRef() throws RecognitionException {
        OberonParser.procedureVarRef_return retval = new OberonParser.procedureVarRef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal41=null;
        Token char_literal43=null;
        OberonParser.idList_return idList42 = null;

        OberonParser.type_return type44 = null;


        Object string_literal41_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Projects UVA\\Oberon.g:107:2: ( 'VAR' idList ':' type -> ^( VARREF idList type ) )
            // D:\\Projects UVA\\Oberon.g:107:4: 'VAR' idList ':' type
            {
            string_literal41=(Token)match(input,VAR,FOLLOW_VAR_in_procedureVarRef554); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(string_literal41);

            pushFollow(FOLLOW_idList_in_procedureVarRef556);
            idList42=idList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idList.add(idList42.getTree());
            char_literal43=(Token)match(input,49,FOLLOW_49_in_procedureVarRef558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal43);

            pushFollow(FOLLOW_type_in_procedureVarRef560);
            type44=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type44.getTree());


            // AST REWRITE
            // elements: idList, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 107:26: -> ^( VARREF idList type )
            {
                // D:\\Projects UVA\\Oberon.g:107:29: ^( VARREF idList type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARREF, "VARREF"), root_1);

                adaptor.addChild(root_1, stream_idList.nextTree());
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
        }
        return retval;
    }
    // $ANTLR end "procedureVarRef"

    public static class procedureVarNonRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureVarNonRef"
    // D:\\Projects UVA\\Oberon.g:108:1: procedureVarNonRef : idList ':' type -> ^( VAR idList type ) ;
    public final OberonParser.procedureVarNonRef_return procedureVarNonRef() throws RecognitionException {
        OberonParser.procedureVarNonRef_return retval = new OberonParser.procedureVarNonRef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal46=null;
        OberonParser.idList_return idList45 = null;

        OberonParser.type_return type47 = null;


        Object char_literal46_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_idList=new RewriteRuleSubtreeStream(adaptor,"rule idList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Projects UVA\\Oberon.g:109:2: ( idList ':' type -> ^( VAR idList type ) )
            // D:\\Projects UVA\\Oberon.g:109:4: idList ':' type
            {
            pushFollow(FOLLOW_idList_in_procedureVarNonRef578);
            idList45=idList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_idList.add(idList45.getTree());
            char_literal46=(Token)match(input,49,FOLLOW_49_in_procedureVarNonRef580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal46);

            pushFollow(FOLLOW_type_in_procedureVarNonRef582);
            type47=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type47.getTree());


            // AST REWRITE
            // elements: idList, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:20: -> ^( VAR idList type )
            {
                // D:\\Projects UVA\\Oberon.g:109:23: ^( VAR idList type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_idList.nextTree());
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
        }
        return retval;
    }
    // $ANTLR end "procedureVarNonRef"

    public static class procedureCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // D:\\Projects UVA\\Oberon.g:111:1: procedureCall : ( CALL_READ | CALL_WRITE | CALL_WRITELN | id ) ( '(' ( expression ( ',' expression )* )? ')' )? -> ^( CALL ( CALL_READ )? ( CALL_WRITE )? ( CALL_WRITELN )? ( id )? ( ^( CALLVARS ( expression )* ) )? ) ;
    public final OberonParser.procedureCall_return procedureCall() throws RecognitionException {
        OberonParser.procedureCall_return retval = new OberonParser.procedureCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CALL_READ48=null;
        Token CALL_WRITE49=null;
        Token CALL_WRITELN50=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token char_literal56=null;
        OberonParser.id_return id51 = null;

        OberonParser.expression_return expression53 = null;

        OberonParser.expression_return expression55 = null;


        Object CALL_READ48_tree=null;
        Object CALL_WRITE49_tree=null;
        Object CALL_WRITELN50_tree=null;
        Object char_literal52_tree=null;
        Object char_literal54_tree=null;
        Object char_literal56_tree=null;
        RewriteRuleTokenStream stream_CALL_READ=new RewriteRuleTokenStream(adaptor,"token CALL_READ");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_CALL_WRITELN=new RewriteRuleTokenStream(adaptor,"token CALL_WRITELN");
        RewriteRuleTokenStream stream_CALL_WRITE=new RewriteRuleTokenStream(adaptor,"token CALL_WRITE");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Projects UVA\\Oberon.g:112:6: ( ( CALL_READ | CALL_WRITE | CALL_WRITELN | id ) ( '(' ( expression ( ',' expression )* )? ')' )? -> ^( CALL ( CALL_READ )? ( CALL_WRITE )? ( CALL_WRITELN )? ( id )? ( ^( CALLVARS ( expression )* ) )? ) )
            // D:\\Projects UVA\\Oberon.g:112:11: ( CALL_READ | CALL_WRITE | CALL_WRITELN | id ) ( '(' ( expression ( ',' expression )* )? ')' )?
            {
            // D:\\Projects UVA\\Oberon.g:112:11: ( CALL_READ | CALL_WRITE | CALL_WRITELN | id )
            int alt7=4;
            switch ( input.LA(1) ) {
            case CALL_READ:
                {
                alt7=1;
                }
                break;
            case CALL_WRITE:
                {
                alt7=2;
                }
                break;
            case CALL_WRITELN:
                {
                alt7=3;
                }
                break;
            case ID:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:112:12: CALL_READ
                    {
                    CALL_READ48=(Token)match(input,CALL_READ,FOLLOW_CALL_READ_in_procedureCall609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CALL_READ.add(CALL_READ48);


                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:112:22: CALL_WRITE
                    {
                    CALL_WRITE49=(Token)match(input,CALL_WRITE,FOLLOW_CALL_WRITE_in_procedureCall611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CALL_WRITE.add(CALL_WRITE49);


                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:112:33: CALL_WRITELN
                    {
                    CALL_WRITELN50=(Token)match(input,CALL_WRITELN,FOLLOW_CALL_WRITELN_in_procedureCall613); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CALL_WRITELN.add(CALL_WRITELN50);


                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:112:46: id
                    {
                    pushFollow(FOLLOW_id_in_procedureCall615);
                    id51=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id51.getTree());

                    }
                    break;

            }

            // D:\\Projects UVA\\Oberon.g:112:50: ( '(' ( expression ( ',' expression )* )? ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:112:51: '(' ( expression ( ',' expression )* )? ')'
                    {
                    char_literal52=(Token)match(input,51,FOLLOW_51_in_procedureCall619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal52);

                    // D:\\Projects UVA\\Oberon.g:112:55: ( expression ( ',' expression )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=MIN && LA9_0<=PLUS)||LA9_0==NOT||(LA9_0>=ID && LA9_0<=INT)||LA9_0==51) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon.g:112:56: expression ( ',' expression )*
                            {
                            pushFollow(FOLLOW_expression_in_procedureCall622);
                            expression53=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());
                            // D:\\Projects UVA\\Oberon.g:112:67: ( ',' expression )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==53) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // D:\\Projects UVA\\Oberon.g:112:68: ',' expression
                            	    {
                            	    char_literal54=(Token)match(input,53,FOLLOW_53_in_procedureCall625); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_53.add(char_literal54);

                            	    pushFollow(FOLLOW_expression_in_procedureCall627);
                            	    expression55=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_expression.add(expression55.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal56=(Token)match(input,52,FOLLOW_52_in_procedureCall634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal56);


                    }
                    break;

            }



            // AST REWRITE
            // elements: CALL_READ, id, expression, CALL_WRITELN, CALL_WRITE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:6: -> ^( CALL ( CALL_READ )? ( CALL_WRITE )? ( CALL_WRITELN )? ( id )? ( ^( CALLVARS ( expression )* ) )? )
            {
                // D:\\Projects UVA\\Oberon.g:113:9: ^( CALL ( CALL_READ )? ( CALL_WRITE )? ( CALL_WRITELN )? ( id )? ( ^( CALLVARS ( expression )* ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                // D:\\Projects UVA\\Oberon.g:113:16: ( CALL_READ )?
                if ( stream_CALL_READ.hasNext() ) {
                    adaptor.addChild(root_1, stream_CALL_READ.nextNode());

                }
                stream_CALL_READ.reset();
                // D:\\Projects UVA\\Oberon.g:113:27: ( CALL_WRITE )?
                if ( stream_CALL_WRITE.hasNext() ) {
                    adaptor.addChild(root_1, stream_CALL_WRITE.nextNode());

                }
                stream_CALL_WRITE.reset();
                // D:\\Projects UVA\\Oberon.g:113:39: ( CALL_WRITELN )?
                if ( stream_CALL_WRITELN.hasNext() ) {
                    adaptor.addChild(root_1, stream_CALL_WRITELN.nextNode());

                }
                stream_CALL_WRITELN.reset();
                // D:\\Projects UVA\\Oberon.g:113:53: ( id )?
                if ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextTree());

                }
                stream_id.reset();
                // D:\\Projects UVA\\Oberon.g:113:57: ( ^( CALLVARS ( expression )* ) )?
                if ( stream_expression.hasNext() ) {
                    // D:\\Projects UVA\\Oberon.g:113:57: ^( CALLVARS ( expression )* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALLVARS, "CALLVARS"), root_2);

                    // D:\\Projects UVA\\Oberon.g:113:68: ( expression )*
                    while ( stream_expression.hasNext() ) {
                        adaptor.addChild(root_2, stream_expression.nextTree());

                    }
                    stream_expression.reset();

                    adaptor.addChild(root_1, root_2);
                    }

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
        }
        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // D:\\Projects UVA\\Oberon.g:115:1: type : ( arrayType | INT_TYPE );
    public final OberonParser.type_return type() throws RecognitionException {
        OberonParser.type_return retval = new OberonParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT_TYPE58=null;
        OberonParser.arrayType_return arrayType57 = null;


        Object INT_TYPE58_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:115:6: ( arrayType | INT_TYPE )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ARRAY) ) {
                alt11=1;
            }
            else if ( (LA11_0==INT_TYPE) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:115:8: arrayType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type675);
                    arrayType57=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType57.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:115:18: INT_TYPE
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_TYPE58=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_type677); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT_TYPE58_tree = (Object)adaptor.create(INT_TYPE58);
                    adaptor.addChild(root_0, INT_TYPE58_tree);
                    }

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
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class arrayType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // D:\\Projects UVA\\Oberon.g:117:1: arrayType : ARRAY expression 'OF' type ;
    public final OberonParser.arrayType_return arrayType() throws RecognitionException {
        OberonParser.arrayType_return retval = new OberonParser.arrayType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ARRAY59=null;
        Token string_literal61=null;
        OberonParser.expression_return expression60 = null;

        OberonParser.type_return type62 = null;


        Object ARRAY59_tree=null;
        Object string_literal61_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:118:2: ( ARRAY expression 'OF' type )
            // D:\\Projects UVA\\Oberon.g:118:4: ARRAY expression 'OF' type
            {
            root_0 = (Object)adaptor.nil();

            ARRAY59=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType686); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARRAY59_tree = (Object)adaptor.create(ARRAY59);
            adaptor.addChild(root_0, ARRAY59_tree);
            }
            pushFollow(FOLLOW_expression_in_arrayType688);
            expression60=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression60.getTree());
            string_literal61=(Token)match(input,54,FOLLOW_54_in_arrayType690); if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_arrayType693);
            type62=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type62.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "arrayType"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // D:\\Projects UVA\\Oberon.g:120:1: number : INT ;
    public final OberonParser.number_return number() throws RecognitionException {
        OberonParser.number_return retval = new OberonParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT63=null;

        Object INT63_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:120:8: ( INT )
            // D:\\Projects UVA\\Oberon.g:120:10: INT
            {
            root_0 = (Object)adaptor.nil();

            INT63=(Token)match(input,INT,FOLLOW_INT_in_number701); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INT63_tree = (Object)adaptor.create(INT63);
            adaptor.addChild(root_0, INT63_tree);
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
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // D:\\Projects UVA\\Oberon.g:122:1: factor : ( id | number | ( '(' expression ')' ) | ( NOT factor ) );
    public final OberonParser.factor_return factor() throws RecognitionException {
        OberonParser.factor_return retval = new OberonParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal66=null;
        Token char_literal68=null;
        Token NOT69=null;
        OberonParser.id_return id64 = null;

        OberonParser.number_return number65 = null;

        OberonParser.expression_return expression67 = null;

        OberonParser.factor_return factor70 = null;


        Object char_literal66_tree=null;
        Object char_literal68_tree=null;
        Object NOT69_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:122:9: ( id | number | ( '(' expression ')' ) | ( NOT factor ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt12=1;
                }
                break;
            case INT:
                {
                alt12=2;
                }
                break;
            case 51:
                {
                alt12=3;
                }
                break;
            case NOT:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:122:14: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_factor717);
                    id64=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id64.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:122:19: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_factor721);
                    number65=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number65.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:122:28: ( '(' expression ')' )
                    {
                    root_0 = (Object)adaptor.nil();

                    // D:\\Projects UVA\\Oberon.g:122:28: ( '(' expression ')' )
                    // D:\\Projects UVA\\Oberon.g:122:29: '(' expression ')'
                    {
                    char_literal66=(Token)match(input,51,FOLLOW_51_in_factor726); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_factor729);
                    expression67=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression67.getTree());
                    char_literal68=(Token)match(input,52,FOLLOW_52_in_factor731); if (state.failed) return retval;

                    }


                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:122:53: ( NOT factor )
                    {
                    root_0 = (Object)adaptor.nil();

                    // D:\\Projects UVA\\Oberon.g:122:53: ( NOT factor )
                    // D:\\Projects UVA\\Oberon.g:122:54: NOT factor
                    {
                    NOT69=(Token)match(input,NOT,FOLLOW_NOT_in_factor738); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT69_tree = (Object)adaptor.create(NOT69);
                    root_0 = (Object)adaptor.becomeRoot(NOT69_tree, root_0);
                    }
                    pushFollow(FOLLOW_factor_in_factor741);
                    factor70=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor70.getTree());

                    }


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
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // D:\\Projects UVA\\Oberon.g:124:1: term : factor ( ( MUL | DIV | MOD | AND ) factor )* ;
    public final OberonParser.term_return term() throws RecognitionException {
        OberonParser.term_return retval = new OberonParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL72=null;
        Token DIV73=null;
        Token MOD74=null;
        Token AND75=null;
        OberonParser.factor_return factor71 = null;

        OberonParser.factor_return factor76 = null;


        Object MUL72_tree=null;
        Object DIV73_tree=null;
        Object MOD74_tree=null;
        Object AND75_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:124:9: ( factor ( ( MUL | DIV | MOD | AND ) factor )* )
            // D:\\Projects UVA\\Oberon.g:124:14: factor ( ( MUL | DIV | MOD | AND ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term756);
            factor71=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor71.getTree());
            // D:\\Projects UVA\\Oberon.g:124:21: ( ( MUL | DIV | MOD | AND ) factor )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=MUL && LA14_0<=AND)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:124:22: ( MUL | DIV | MOD | AND ) factor
            	    {
            	    // D:\\Projects UVA\\Oberon.g:124:22: ( MUL | DIV | MOD | AND )
            	    int alt13=4;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case AND:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // D:\\Projects UVA\\Oberon.g:124:23: MUL
            	            {
            	            MUL72=(Token)match(input,MUL,FOLLOW_MUL_in_term760); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MUL72_tree = (Object)adaptor.create(MUL72);
            	            root_0 = (Object)adaptor.becomeRoot(MUL72_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Projects UVA\\Oberon.g:124:28: DIV
            	            {
            	            DIV73=(Token)match(input,DIV,FOLLOW_DIV_in_term763); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIV73_tree = (Object)adaptor.create(DIV73);
            	            root_0 = (Object)adaptor.becomeRoot(DIV73_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\Projects UVA\\Oberon.g:124:33: MOD
            	            {
            	            MOD74=(Token)match(input,MOD,FOLLOW_MOD_in_term766); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MOD74_tree = (Object)adaptor.create(MOD74);
            	            root_0 = (Object)adaptor.becomeRoot(MOD74_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // D:\\Projects UVA\\Oberon.g:124:38: AND
            	            {
            	            AND75=(Token)match(input,AND,FOLLOW_AND_in_term769); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AND75_tree = (Object)adaptor.create(AND75);
            	            root_0 = (Object)adaptor.becomeRoot(AND75_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_factor_in_term773);
            	    factor76=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor76.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class base_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "base"
    // D:\\Projects UVA\\Oberon.g:126:1: base : ( MIN | PLUS )? term ( ( MIN | PLUS | OR )+ term )* ;
    public final OberonParser.base_return base() throws RecognitionException {
        OberonParser.base_return retval = new OberonParser.base_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MIN77=null;
        Token PLUS78=null;
        Token MIN80=null;
        Token PLUS81=null;
        Token OR82=null;
        OberonParser.term_return term79 = null;

        OberonParser.term_return term83 = null;


        Object MIN77_tree=null;
        Object PLUS78_tree=null;
        Object MIN80_tree=null;
        Object PLUS81_tree=null;
        Object OR82_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:127:6: ( ( MIN | PLUS )? term ( ( MIN | PLUS | OR )+ term )* )
            // D:\\Projects UVA\\Oberon.g:127:11: ( MIN | PLUS )? term ( ( MIN | PLUS | OR )+ term )*
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Projects UVA\\Oberon.g:127:11: ( MIN | PLUS )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==MIN) ) {
                alt15=1;
            }
            else if ( (LA15_0==PLUS) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:127:12: MIN
                    {
                    MIN77=(Token)match(input,MIN,FOLLOW_MIN_in_base794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MIN77_tree = (Object)adaptor.create(MIN77);
                    root_0 = (Object)adaptor.becomeRoot(MIN77_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:127:17: PLUS
                    {
                    PLUS78=(Token)match(input,PLUS,FOLLOW_PLUS_in_base797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS78_tree = (Object)adaptor.create(PLUS78);
                    root_0 = (Object)adaptor.becomeRoot(PLUS78_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_base802);
            term79=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term79.getTree());
            // D:\\Projects UVA\\Oberon.g:127:30: ( ( MIN | PLUS | OR )+ term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=MIN && LA17_0<=PLUS)||LA17_0==OR) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:127:31: ( MIN | PLUS | OR )+ term
            	    {
            	    // D:\\Projects UVA\\Oberon.g:127:31: ( MIN | PLUS | OR )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=4;
            	        switch ( input.LA(1) ) {
            	        case MIN:
            	            {
            	            alt16=1;
            	            }
            	            break;
            	        case PLUS:
            	            {
            	            alt16=2;
            	            }
            	            break;
            	        case OR:
            	            {
            	            alt16=3;
            	            }
            	            break;

            	        }

            	        switch (alt16) {
            	    	case 1 :
            	    	    // D:\\Projects UVA\\Oberon.g:127:32: MIN
            	    	    {
            	    	    MIN80=(Token)match(input,MIN,FOLLOW_MIN_in_base806); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    MIN80_tree = (Object)adaptor.create(MIN80);
            	    	    root_0 = (Object)adaptor.becomeRoot(MIN80_tree, root_0);
            	    	    }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // D:\\Projects UVA\\Oberon.g:127:37: PLUS
            	    	    {
            	    	    PLUS81=(Token)match(input,PLUS,FOLLOW_PLUS_in_base809); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    PLUS81_tree = (Object)adaptor.create(PLUS81);
            	    	    root_0 = (Object)adaptor.becomeRoot(PLUS81_tree, root_0);
            	    	    }

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // D:\\Projects UVA\\Oberon.g:127:43: OR
            	    	    {
            	    	    OR82=(Token)match(input,OR,FOLLOW_OR_in_base812); if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) {
            	    	    OR82_tree = (Object)adaptor.create(OR82);
            	    	    root_0 = (Object)adaptor.becomeRoot(OR82_tree, root_0);
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);

            	    pushFollow(FOLLOW_term_in_base817);
            	    term83=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term83.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
        }
        return retval;
    }
    // $ANTLR end "base"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // D:\\Projects UVA\\Oberon.g:129:1: expression : base ( ( EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL ) base )? ;
    public final OberonParser.expression_return expression() throws RecognitionException {
        OberonParser.expression_return retval = new OberonParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUAL85=null;
        Token UNEQUAL86=null;
        Token LESS87=null;
        Token LESS_EQUAL88=null;
        Token GREAT89=null;
        Token GREAT_EQUAL90=null;
        OberonParser.base_return base84 = null;

        OberonParser.base_return base91 = null;


        Object EQUAL85_tree=null;
        Object UNEQUAL86_tree=null;
        Object LESS87_tree=null;
        Object LESS_EQUAL88_tree=null;
        Object GREAT89_tree=null;
        Object GREAT_EQUAL90_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:130:6: ( base ( ( EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL ) base )? )
            // D:\\Projects UVA\\Oberon.g:130:11: base ( ( EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL ) base )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_base_in_expression836);
            base84=base();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, base84.getTree());
            // D:\\Projects UVA\\Oberon.g:130:16: ( ( EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL ) base )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=EQUAL && LA19_0<=GREAT_EQUAL)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:130:17: ( EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL ) base
                    {
                    // D:\\Projects UVA\\Oberon.g:130:17: ( EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL )
                    int alt18=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt18=1;
                        }
                        break;
                    case UNEQUAL:
                        {
                        alt18=2;
                        }
                        break;
                    case LESS:
                        {
                        alt18=3;
                        }
                        break;
                    case LESS_EQUAL:
                        {
                        alt18=4;
                        }
                        break;
                    case GREAT:
                        {
                        alt18=5;
                        }
                        break;
                    case GREAT_EQUAL:
                        {
                        alt18=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon.g:130:18: EQUAL
                            {
                            EQUAL85=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_expression840); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            EQUAL85_tree = (Object)adaptor.create(EQUAL85);
                            root_0 = (Object)adaptor.becomeRoot(EQUAL85_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // D:\\Projects UVA\\Oberon.g:130:25: UNEQUAL
                            {
                            UNEQUAL86=(Token)match(input,UNEQUAL,FOLLOW_UNEQUAL_in_expression843); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            UNEQUAL86_tree = (Object)adaptor.create(UNEQUAL86);
                            root_0 = (Object)adaptor.becomeRoot(UNEQUAL86_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // D:\\Projects UVA\\Oberon.g:130:34: LESS
                            {
                            LESS87=(Token)match(input,LESS,FOLLOW_LESS_in_expression846); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LESS87_tree = (Object)adaptor.create(LESS87);
                            root_0 = (Object)adaptor.becomeRoot(LESS87_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // D:\\Projects UVA\\Oberon.g:130:40: LESS_EQUAL
                            {
                            LESS_EQUAL88=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_expression849); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LESS_EQUAL88_tree = (Object)adaptor.create(LESS_EQUAL88);
                            root_0 = (Object)adaptor.becomeRoot(LESS_EQUAL88_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // D:\\Projects UVA\\Oberon.g:130:52: GREAT
                            {
                            GREAT89=(Token)match(input,GREAT,FOLLOW_GREAT_in_expression852); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            GREAT89_tree = (Object)adaptor.create(GREAT89);
                            root_0 = (Object)adaptor.becomeRoot(GREAT89_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // D:\\Projects UVA\\Oberon.g:130:59: GREAT_EQUAL
                            {
                            GREAT_EQUAL90=(Token)match(input,GREAT_EQUAL,FOLLOW_GREAT_EQUAL_in_expression855); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            GREAT_EQUAL90_tree = (Object)adaptor.create(GREAT_EQUAL90);
                            root_0 = (Object)adaptor.becomeRoot(GREAT_EQUAL90_tree, root_0);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_base_in_expression859);
                    base91=base();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, base91.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statements"
    // D:\\Projects UVA\\Oberon.g:132:1: statements : statement ( ';' statement )* ;
    public final OberonParser.statements_return statements() throws RecognitionException {
        OberonParser.statements_return retval = new OberonParser.statements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal93=null;
        OberonParser.statement_return statement92 = null;

        OberonParser.statement_return statement94 = null;


        Object char_literal93_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:133:2: ( statement ( ';' statement )* )
            // D:\\Projects UVA\\Oberon.g:133:4: statement ( ';' statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statements874);
            statement92=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement92.getTree());
            // D:\\Projects UVA\\Oberon.g:133:14: ( ';' statement )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==46) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:133:15: ';' statement
            	    {
            	    char_literal93=(Token)match(input,46,FOLLOW_46_in_statements877); if (state.failed) return retval;
            	    pushFollow(FOLLOW_statement_in_statements880);
            	    statement94=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement94.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
        }
        return retval;
    }
    // $ANTLR end "statements"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // D:\\Projects UVA\\Oberon.g:135:1: statement : ( ( ( id ASSIGN expression )=> assignment ) | procedureCall | ifStatement | whileStatement )? ;
    public final OberonParser.statement_return statement() throws RecognitionException {
        OberonParser.statement_return retval = new OberonParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OberonParser.assignment_return assignment95 = null;

        OberonParser.procedureCall_return procedureCall96 = null;

        OberonParser.ifStatement_return ifStatement97 = null;

        OberonParser.whileStatement_return whileStatement98 = null;



        try {
            // D:\\Projects UVA\\Oberon.g:136:5: ( ( ( ( id ASSIGN expression )=> assignment ) | procedureCall | ifStatement | whileStatement )? )
            // D:\\Projects UVA\\Oberon.g:136:7: ( ( ( id ASSIGN expression )=> assignment ) | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Projects UVA\\Oberon.g:136:7: ( ( ( id ASSIGN expression )=> assignment ) | procedureCall | ifStatement | whileStatement )?
            int alt21=5;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:136:8: ( ( id ASSIGN expression )=> assignment )
                    {
                    // D:\\Projects UVA\\Oberon.g:136:8: ( ( id ASSIGN expression )=> assignment )
                    // D:\\Projects UVA\\Oberon.g:136:9: ( id ASSIGN expression )=> assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement906);
                    assignment95=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment95.getTree());

                    }


                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:136:49: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement911);
                    procedureCall96=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall96.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:136:65: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement915);
                    ifStatement97=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement97.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:136:79: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement919);
                    whileStatement98=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement98.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // D:\\Projects UVA\\Oberon.g:138:1: assignment : id ASSIGN expression ;
    public final OberonParser.assignment_return assignment() throws RecognitionException {
        OberonParser.assignment_return retval = new OberonParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN100=null;
        OberonParser.id_return id99 = null;

        OberonParser.expression_return expression101 = null;


        Object ASSIGN100_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:139:2: ( id ASSIGN expression )
            // D:\\Projects UVA\\Oberon.g:139:4: id ASSIGN expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_assignment941);
            id99=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, id99.getTree());
            ASSIGN100=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment943); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN100_tree = (Object)adaptor.create(ASSIGN100);
            root_0 = (Object)adaptor.becomeRoot(ASSIGN100_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_assignment946);
            expression101=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression101.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // D:\\Projects UVA\\Oberon.g:141:1: ifStatement : IF expression ifThen ( ifElsIf )* ( ifElse )? END ;
    public final OberonParser.ifStatement_return ifStatement() throws RecognitionException {
        OberonParser.ifStatement_return retval = new OberonParser.ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF102=null;
        Token END107=null;
        OberonParser.expression_return expression103 = null;

        OberonParser.ifThen_return ifThen104 = null;

        OberonParser.ifElsIf_return ifElsIf105 = null;

        OberonParser.ifElse_return ifElse106 = null;


        Object IF102_tree=null;
        Object END107_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:142:6: ( IF expression ifThen ( ifElsIf )* ( ifElse )? END )
            // D:\\Projects UVA\\Oberon.g:142:11: IF expression ifThen ( ifElsIf )* ( ifElse )? END
            {
            root_0 = (Object)adaptor.nil();

            IF102=(Token)match(input,IF,FOLLOW_IF_in_ifStatement962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF102_tree = (Object)adaptor.create(IF102);
            root_0 = (Object)adaptor.becomeRoot(IF102_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_ifStatement965);
            expression103=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression103.getTree());
            pushFollow(FOLLOW_ifThen_in_ifStatement967);
            ifThen104=ifThen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifThen104.getTree());
            // D:\\Projects UVA\\Oberon.g:142:33: ( ifElsIf )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ELSIF) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:142:34: ifElsIf
            	    {
            	    pushFollow(FOLLOW_ifElsIf_in_ifStatement970);
            	    ifElsIf105=ifElsIf();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifElsIf105.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // D:\\Projects UVA\\Oberon.g:142:44: ( ifElse )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:142:45: ifElse
                    {
                    pushFollow(FOLLOW_ifElse_in_ifStatement975);
                    ifElse106=ifElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifElse106.getTree());

                    }
                    break;

            }

            END107=(Token)match(input,END,FOLLOW_END_in_ifStatement979); if (state.failed) return retval;

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
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class ifThen_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifThen"
    // D:\\Projects UVA\\Oberon.g:143:1: ifThen : 'THEN' statements -> ^( THEN statements ) ;
    public final OberonParser.ifThen_return ifThen() throws RecognitionException {
        OberonParser.ifThen_return retval = new OberonParser.ifThen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal108=null;
        OberonParser.statements_return statements109 = null;


        Object string_literal108_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // D:\\Projects UVA\\Oberon.g:143:8: ( 'THEN' statements -> ^( THEN statements ) )
            // D:\\Projects UVA\\Oberon.g:143:10: 'THEN' statements
            {
            string_literal108=(Token)match(input,THEN,FOLLOW_THEN_in_ifThen987); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(string_literal108);

            pushFollow(FOLLOW_statements_in_ifThen989);
            statements109=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements109.getTree());


            // AST REWRITE
            // elements: statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 144:2: -> ^( THEN statements )
            {
                // D:\\Projects UVA\\Oberon.g:144:6: ^( THEN statements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_1);

                adaptor.addChild(root_1, stream_statements.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "ifThen"

    public static class ifElsIf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifElsIf"
    // D:\\Projects UVA\\Oberon.g:145:1: ifElsIf : 'ELSIF' expression ifThen -> ^( ELSIF expression ifThen ) ;
    public final OberonParser.ifElsIf_return ifElsIf() throws RecognitionException {
        OberonParser.ifElsIf_return retval = new OberonParser.ifElsIf_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal110=null;
        OberonParser.expression_return expression111 = null;

        OberonParser.ifThen_return ifThen112 = null;


        Object string_literal110_tree=null;
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ifThen=new RewriteRuleSubtreeStream(adaptor,"rule ifThen");
        try {
            // D:\\Projects UVA\\Oberon.g:145:9: ( 'ELSIF' expression ifThen -> ^( ELSIF expression ifThen ) )
            // D:\\Projects UVA\\Oberon.g:145:11: 'ELSIF' expression ifThen
            {
            string_literal110=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifElsIf1006); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSIF.add(string_literal110);

            pushFollow(FOLLOW_expression_in_ifElsIf1008);
            expression111=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression111.getTree());
            pushFollow(FOLLOW_ifThen_in_ifElsIf1010);
            ifThen112=ifThen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifThen.add(ifThen112.getTree());


            // AST REWRITE
            // elements: expression, ifThen
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 146:2: -> ^( ELSIF expression ifThen )
            {
                // D:\\Projects UVA\\Oberon.g:146:5: ^( ELSIF expression ifThen )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSIF, "ELSIF"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_ifThen.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "ifElsIf"

    public static class ifElse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifElse"
    // D:\\Projects UVA\\Oberon.g:147:1: ifElse : 'ELSE' statements -> ^( ELSE statements ) ;
    public final OberonParser.ifElse_return ifElse() throws RecognitionException {
        OberonParser.ifElse_return retval = new OberonParser.ifElse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal113=null;
        OberonParser.statements_return statements114 = null;


        Object string_literal113_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // D:\\Projects UVA\\Oberon.g:147:8: ( 'ELSE' statements -> ^( ELSE statements ) )
            // D:\\Projects UVA\\Oberon.g:147:10: 'ELSE' statements
            {
            string_literal113=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifElse1028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(string_literal113);

            pushFollow(FOLLOW_statements_in_ifElse1030);
            statements114=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements114.getTree());


            // AST REWRITE
            // elements: statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 148:2: -> ^( ELSE statements )
            {
                // D:\\Projects UVA\\Oberon.g:148:5: ^( ELSE statements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);

                adaptor.addChild(root_1, stream_statements.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "ifElse"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // D:\\Projects UVA\\Oberon.g:150:1: whileStatement : 'WHILE' expression 'DO' statements 'END' -> ^( WHILE expression ^( BODY statements ) ) ;
    public final OberonParser.whileStatement_return whileStatement() throws RecognitionException {
        OberonParser.whileStatement_return retval = new OberonParser.whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal115=null;
        Token string_literal117=null;
        Token string_literal119=null;
        OberonParser.expression_return expression116 = null;

        OberonParser.statements_return statements118 = null;


        Object string_literal115_tree=null;
        Object string_literal117_tree=null;
        Object string_literal119_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // D:\\Projects UVA\\Oberon.g:151:2: ( 'WHILE' expression 'DO' statements 'END' -> ^( WHILE expression ^( BODY statements ) ) )
            // D:\\Projects UVA\\Oberon.g:151:4: 'WHILE' expression 'DO' statements 'END'
            {
            string_literal115=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1052); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal115);

            pushFollow(FOLLOW_expression_in_whileStatement1054);
            expression116=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression116.getTree());
            string_literal117=(Token)match(input,55,FOLLOW_55_in_whileStatement1056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(string_literal117);

            pushFollow(FOLLOW_statements_in_whileStatement1058);
            statements118=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements118.getTree());
            string_literal119=(Token)match(input,END,FOLLOW_END_in_whileStatement1060); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal119);



            // AST REWRITE
            // elements: statements, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 152:2: -> ^( WHILE expression ^( BODY statements ) )
            {
                // D:\\Projects UVA\\Oberon.g:152:5: ^( WHILE expression ^( BODY statements ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // D:\\Projects UVA\\Oberon.g:152:24: ^( BODY statements )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);

                adaptor.addChild(root_2, stream_statements.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class idList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idList"
    // D:\\Projects UVA\\Oberon.g:154:1: idList : ID ( ',' ID )* ;
    public final OberonParser.idList_return idList() throws RecognitionException {
        OberonParser.idList_return retval = new OberonParser.idList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID120=null;
        Token char_literal121=null;
        Token ID122=null;

        Object ID120_tree=null;
        Object char_literal121_tree=null;
        Object ID122_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:154:8: ( ID ( ',' ID )* )
            // D:\\Projects UVA\\Oberon.g:154:10: ID ( ',' ID )*
            {
            root_0 = (Object)adaptor.nil();

            ID120=(Token)match(input,ID,FOLLOW_ID_in_idList1083); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID120_tree = (Object)adaptor.create(ID120);
            adaptor.addChild(root_0, ID120_tree);
            }
            // D:\\Projects UVA\\Oberon.g:154:13: ( ',' ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:154:14: ',' ID
            	    {
            	    char_literal121=(Token)match(input,53,FOLLOW_53_in_idList1086); if (state.failed) return retval;
            	    ID122=(Token)match(input,ID,FOLLOW_ID_in_idList1089); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID122_tree = (Object)adaptor.create(ID122);
            	    adaptor.addChild(root_0, ID122_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop24;
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
        }
        return retval;
    }
    // $ANTLR end "idList"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // D:\\Projects UVA\\Oberon.g:155:1: id : ID idSelector ;
    public final OberonParser.id_return id() throws RecognitionException {
        OberonParser.id_return retval = new OberonParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID123=null;
        OberonParser.idSelector_return idSelector124 = null;


        Object ID123_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:155:4: ( ID idSelector )
            // D:\\Projects UVA\\Oberon.g:155:6: ID idSelector
            {
            root_0 = (Object)adaptor.nil();

            ID123=(Token)match(input,ID,FOLLOW_ID_in_id1098); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID123_tree = (Object)adaptor.create(ID123);
            root_0 = (Object)adaptor.becomeRoot(ID123_tree, root_0);
            }
            pushFollow(FOLLOW_idSelector_in_id1101);
            idSelector124=idSelector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, idSelector124.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class idSelector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idSelector"
    // D:\\Projects UVA\\Oberon.g:156:1: idSelector : ( ( '.' ID ) | ( '[' expression ']' ) )* ;
    public final OberonParser.idSelector_return idSelector() throws RecognitionException {
        OberonParser.idSelector_return retval = new OberonParser.idSelector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal125=null;
        Token ID126=null;
        Token char_literal127=null;
        Token char_literal129=null;
        OberonParser.expression_return expression128 = null;


        Object char_literal125_tree=null;
        Object ID126_tree=null;
        Object char_literal127_tree=null;
        Object char_literal129_tree=null;

        try {
            // D:\\Projects UVA\\Oberon.g:157:6: ( ( ( '.' ID ) | ( '[' expression ']' ) )* )
            // D:\\Projects UVA\\Oberon.g:157:11: ( ( '.' ID ) | ( '[' expression ']' ) )*
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Projects UVA\\Oberon.g:157:11: ( ( '.' ID ) | ( '[' expression ']' ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }
                else if ( (LA25_0==56) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:157:12: ( '.' ID )
            	    {
            	    // D:\\Projects UVA\\Oberon.g:157:12: ( '.' ID )
            	    // D:\\Projects UVA\\Oberon.g:157:13: '.' ID
            	    {
            	    char_literal125=(Token)match(input,48,FOLLOW_48_in_idSelector1118); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal125_tree = (Object)adaptor.create(char_literal125);
            	    adaptor.addChild(root_0, char_literal125_tree);
            	    }
            	    ID126=(Token)match(input,ID,FOLLOW_ID_in_idSelector1120); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID126_tree = (Object)adaptor.create(ID126);
            	    adaptor.addChild(root_0, ID126_tree);
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:157:23: ( '[' expression ']' )
            	    {
            	    // D:\\Projects UVA\\Oberon.g:157:23: ( '[' expression ']' )
            	    // D:\\Projects UVA\\Oberon.g:157:24: '[' expression ']'
            	    {
            	    char_literal127=(Token)match(input,56,FOLLOW_56_in_idSelector1126); if (state.failed) return retval;
            	    pushFollow(FOLLOW_expression_in_idSelector1129);
            	    expression128=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression128.getTree());
            	    char_literal129=(Token)match(input,57,FOLLOW_57_in_idSelector1131); if (state.failed) return retval;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
        }
        return retval;
    }
    // $ANTLR end "idSelector"

    // $ANTLR start synpred1_Oberon
    public final void synpred1_Oberon_fragment() throws RecognitionException {   
        // D:\\Projects UVA\\Oberon.g:136:9: ( id ASSIGN expression )
        // D:\\Projects UVA\\Oberon.g:136:10: id ASSIGN expression
        {
        pushFollow(FOLLOW_id_in_synpred1_Oberon897);
        id();

        state._fsp--;
        if (state.failed) return ;
        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred1_Oberon899); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred1_Oberon901);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Oberon

    // Delegated rules

    public final boolean synpred1_Oberon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Oberon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\14\uffff";
    static final String DFA21_eofS =
        "\14\uffff";
    static final String DFA21_minS =
        "\1\14\1\0\12\uffff";
    static final String DFA21_maxS =
        "\1\56\1\0\12\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\2\uffff\1\3\1\4\1\5\3\uffff\1\1";
    static final String DFA21_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\5\1\uffff\3\7\1\6\21\uffff\3\2\4\uffff\1\1\3\uffff\1\7",
            "\1\uffff",
            "",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "136:7: ( ( ( id ASSIGN expression )=> assignment ) | procedureCall | ifStatement | whileStatement )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Oberon()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_45_in_module302 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_module304 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_module306 = new BitSet(new long[]{0x0004800000000060L});
    public static final BitSet FOLLOW_declarations_in_module310 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_module314 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_module318 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_module322 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_module324 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_module326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations354 = new BitSet(new long[]{0x0004000000000062L});
    public static final BitSet FOLLOW_constDeclaration_in_declaration378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_declaration380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_declaration382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration393 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_constDeclaration396 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_constDeclaration398 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_constDeclaration400 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_constDeclaration402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclaration423 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_idList_in_varDeclaration426 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_varDeclaration428 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_varDeclaration430 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_varDeclaration432 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_50_in_procedure455 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_procedure457 = new BitSet(new long[]{0x0008400000000000L});
    public static final BitSet FOLLOW_procedureVars_in_procedure459 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedure462 = new BitSet(new long[]{0x0004800000000060L});
    public static final BitSet FOLLOW_declarations_in_procedure466 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_procedure470 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_procedure474 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_procedure478 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_procedure480 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedure482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_procedureVars511 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_procedureVar_in_procedureVars513 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_46_in_procedureVars516 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_procedureVar_in_procedureVars518 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_52_in_procedureVars522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureVarRef_in_procedureVar544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureVarNonRef_in_procedureVar546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_procedureVarRef554 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_idList_in_procedureVarRef556 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureVarRef558 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_procedureVarRef560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idList_in_procedureVarNonRef578 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureVarNonRef580 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_procedureVarNonRef582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_READ_in_procedureCall609 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_CALL_WRITE_in_procedureCall611 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_CALL_WRITELN_in_procedureCall613 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_id_in_procedureCall615 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_procedureCall619 = new BitSet(new long[]{0x00180C0083000000L});
    public static final BitSet FOLLOW_expression_in_procedureCall622 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_53_in_procedureCall625 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_procedureCall627 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_procedureCall634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_type677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType686 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_arrayType688 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_arrayType690 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_arrayType693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_factor717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_factor726 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_factor729 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_factor731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor738 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_factor741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term756 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MUL_in_term760 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_DIV_in_term763 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_MOD_in_term766 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_AND_in_term769 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term773 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MIN_in_base794 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_PLUS_in_base797 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base802 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_MIN_in_base806 = new BitSet(new long[]{0x00080C00C3000000L});
    public static final BitSet FOLLOW_PLUS_in_base809 = new BitSet(new long[]{0x00080C00C3000000L});
    public static final BitSet FOLLOW_OR_in_base812 = new BitSet(new long[]{0x00080C00C3000000L});
    public static final BitSet FOLLOW_term_in_base817 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_base_in_expression836 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_EQUAL_in_expression840 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_UNEQUAL_in_expression843 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_LESS_in_expression846 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_expression849 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_GREAT_in_expression852 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_GREAT_EQUAL_in_expression855 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements874 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_statements877 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statement_in_statements880 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_assignment_in_statement906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assignment941 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment943 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_assignment946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement962 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement965 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ifThen_in_ifStatement967 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ifElsIf_in_ifStatement970 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ifElse_in_ifStatement975 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_ifStatement979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_ifThen987 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_ifThen989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_ifElsIf1006 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_ifElsIf1008 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ifThen_in_ifElsIf1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_ifElse1028 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_ifElse1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1052 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1054 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_whileStatement1056 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_whileStatement1058 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_whileStatement1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idList1083 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_idList1086 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_idList1089 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ID_in_id1098 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_idSelector_in_id1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_idSelector1118 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_idSelector1120 = new BitSet(new long[]{0x0101000000000002L});
    public static final BitSet FOLLOW_56_in_idSelector1126 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_idSelector1129 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_idSelector1131 = new BitSet(new long[]{0x0101000000000002L});
    public static final BitSet FOLLOW_id_in_synpred1_Oberon897 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred1_Oberon899 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_synpred1_Oberon901 = new BitSet(new long[]{0x0000000000000002L});

}