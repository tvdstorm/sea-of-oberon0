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
		try {
			CommonTree tree =  testProcDecl(
			  "PROCEDURE AssignIets;"
			+ "  VAR x: INTEGER; "
			+ "BEGIN "
			+ "  x := 1"
			+ "END Multiply;");
			int a = 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//tests();
	}
	
	private static void tests(){
		
		try {
			testExpression("-2 + 4 * 4 = 13");
			testExpression("-2 + 4 * 4 # 14");
			testExpression("-2 + 4 * 4 > 10");
			testExpression("-2 + 4 * 4 = 13");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static CommonTree testProcDecl(String input)throws Exception{
		CharStream cs = new ANTLRStringStream(input);
		CommonTree tree = parseProcedure(cs);
		return tree;
	}
	
	private static void testExpression(String input) throws Exception{
		CharStream cs = new ANTLRStringStream(input);
		CommonTree tree = parseExpression(cs);
		
		AnExpression exp = AstNodeFactory.createAnExpression(tree);
		AnValue a = exp.eval(new AnEnvironment());
		if (!a.getBoolean().getValue()) throw new Exception("WTF");
	}
	
	/*private static CommonTree fileToTree(String fileName){
		CharStream cs = null;
		try {
			cs = new ANTLRFileStream(fileName);
		} catch (IOException e) {
			System.out.println("Unable to open file");
			return null;
		}
		
		return parse(cs);
	}*/
	
	private static oberonParser getParser(CharStream cs){
		oberonLexer lexer = new oberonLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		oberonParser parser = new oberonParser(tokens);
		CommonTreeAdaptor adaptor = new CommonTreeAdaptor();
		parser.setTreeAdaptor(adaptor);
		return parser;
	}
	
	private static CommonTree parseExpression(CharStream cs){
		oberonParser parser = getParser(cs);
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
	
	private static CommonTree parseProcedure(CharStream cs){
		oberonParser parser = getParser(cs);
		ParserRuleReturnScope ruleReturn = null;
		try {
			ruleReturn = parser.procedureDeclaration();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		
		if (ruleReturn == null) return null;
		CommonTree tree = (CommonTree) ruleReturn.getTree();
		return tree;
	}
	
	/*private static CommonTree stringToTree(String input){
		CharStream cs = new ANTLRStringStream(input);
		return parse(cs);
	}*/
}
