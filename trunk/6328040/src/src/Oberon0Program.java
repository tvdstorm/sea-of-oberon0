package oberon0;

import java.io.IOException;

import oberon0.grammar.oberon0Lexer;
import oberon0.grammar.oberon0Parser;
import oberon0.routine.BaseRoutine;
import oberon0.routine.Module;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;

public class Program extends BaseRoutine{
	
	private Tree _oberon0AST;
	
	public Program(){
		super(null);
		_oberon0AST = null;
	}
	
	//adaptor source code from ANTLR documentation
	private static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			return new CommonTree(payload);
		}
	};
	
	public void loadFromFile(String filepath) throws RecognitionException, IOException{
		ANTLRFileStream fs = new ANTLRFileStream(filepath);
		oberon0Lexer lex = new oberon0Lexer(fs);
		TokenRewriteStream tokens = new TokenRewriteStream(lex);
		oberon0Parser grammar = new oberon0Parser(tokens);
		grammar.setTreeAdaptor(adaptor);
		oberon0Parser.module_return ret = null;
		ret = grammar.module();
		_oberon0AST = (CommonTree)ret.getTree();
	}
	
	public void printTree(){
		printSubTree(_oberon0AST, 0);
	}
	
	//source code example from ANTLR documentation
	private static void printSubTree(Tree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printSubTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}
	
	public void execute() {
		Module module = new Module(_oberon0AST);
		module.execute();
	}
}
