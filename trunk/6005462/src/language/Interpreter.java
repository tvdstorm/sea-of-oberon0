package language;

import java.io.IOException;

import language.parser.*;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class Interpreter {

	public static void main(String[] args) {
		CommonTree tree;
		//tree = stringToTree("1 + 2 * 3");
		//tree = stringToTree("i + 3 * 4");
		tree =  stringToTree("+ 3 + 4");
		//tree = stringToTree("i := 1");
		
		//tree = fileToTree("C:\\SE\\oberon\\quicksort.oberon0");
		AnExpression x = AstNodeFactory.createExpression(tree);
		try {
			AnValue a = x.eval();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static CommonTree fileToTree(String fileName){
		CharStream cs = null;
		try {
			cs = new ANTLRFileStream(fileName);
		} catch (IOException e) {
			System.out.println("Unable to open file");
			return null;
		}
		
		return parse(cs);
	}
	
	private static CommonTree parse(CharStream cs){
		oberonLexer lexer = new oberonLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		oberonParser parser = new oberonParser(tokens);
		CommonTreeAdaptor adaptor = new CommonTreeAdaptor();
		parser.setTreeAdaptor(adaptor);
		
		ParserRuleReturnScope ruleReturn = null;
		try {
			ruleReturn = parser.expression();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		
		if (ruleReturn == null) return null;
		
		CommonTree tree = (CommonTree) ruleReturn.getTree();
		return tree;
	}
	
	private static CommonTree stringToTree(String input){
		CharStream cs = new ANTLRStringStream(input);
		return parse(cs);
	}
}
