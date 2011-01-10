import java.io.IOException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class interpreter {

	static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			return new CommonTree(payload);
		}
	};
	
	public static void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}
	
	public static void main(String[] args) throws IOException, RecognitionException {
		ANTLRFileStream fs = new ANTLRFileStream("oberonfiles/sample.ob0");
		oberon0Lexer lex = new oberon0Lexer(fs);
		TokenRewriteStream tokens = new TokenRewriteStream(lex);
		oberon0Parser grammar = new oberon0Parser(tokens);
		grammar.setTreeAdaptor(adaptor);
		oberon0Parser.module_return ret = grammar.module();
		CommonTree tree = (CommonTree)ret.getTree();
		printTree(tree,0);
	}

}
