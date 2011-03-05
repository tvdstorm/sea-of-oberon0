package language;

import language.parser.*;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class Interpreter {

	public static IAstNode run(String input, IParseFunc func) throws Exception{
		CharStream cs = new ANTLRStringStream(input);

		oberonParser parser = getParser(cs);
		ParserRuleReturnScope ruleReturn = null;
		try {
			ruleReturn = func.parse(parser);
		} catch (RecognitionException e) {
			new Exception("Could not parse input: " + e.toString());
		}
		
		if (ruleReturn == null) throw new Exception("Could not parse input");
		CommonTree tree = (CommonTree) ruleReturn.getTree();
		CommonTree parentTree = new CommonTree();
		parentTree.addChild(tree);
		IAstNode astTree = func.buildAst(parentTree);
		AnEnvironment env = new AnEnvironment();
		astTree.typeCheck(env);
		return astTree.eval(env);
	}
	
	private static oberonParser getParser(CharStream cs){
		oberonLexer lexer = new oberonLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		oberonParser parser = new oberonParser(tokens);
		CommonTreeAdaptor adaptor = new CommonTreeAdaptor();
		parser.setTreeAdaptor(adaptor);
		return parser;
	}
}
