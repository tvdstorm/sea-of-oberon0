package language;

import java.io.IOException;

import language.parser.*;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class Interpreter {

	public static void main(String[] args) {
				
		tests();
	}
	
	private static void tests(){
		
		try {
			/*testExpression("-2 + 4 * 4 = 14");
			testExpression("-2 + 4 * 4 # 13");
			testExpression("-2 + 4 * 4 > 10");
			testExpression("-2 + 4 * 4 = 14");
			
			testProc(
				  "PROCEDURE AssignIets;"
				+ "  VAR x: INTEGER; "
				+ "BEGIN "
				+ "  x := 1"
				+ "END Multiply;");
			*/
			testModule(
				"MODULE test;" + "\n"
				+ "VAR" + "\n"
				+ "  i: INTEGER;" + "\n"
				+ "  j: INTEGER;" + "\n"
				+ "PROCEDURE Swap(VAR x, y: INTEGER);" + "\n"
				+ "VAR" + "\n"
				+ "  temp: INTEGER;" + "\n"
				+ "BEGIN" + "\n"
				+ "  temp := x;" + "\n"
				+ "  x := y;" + "\n"
				+ "  y := temp" + "\n"
				+ "END Swap;" + "\n"
				+ "BEGIN" + "\n"
				+ "  i := 1;" + "\n"
				+ "  j := 2;" + "\n"
				+ "  Swap(i, j);" + "\n"
				+ "  ASSERT(j = 1);" + "\n"
				+ "END" + "\n"
				+ "END test.");	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void testProc(String input) throws Exception{
		CommonTree tree =  testProcDecl(input);
		CommonTree t = new CommonTree();
		t.addChild(tree);
		AnProcDecl proc = AstNodeFactory.createProcDecl(t);
		AnEnvironment env = new AnEnvironment();
		proc.typeCheck(env);
		proc.eval(env);
	}
	
	private static void testModule(String input) throws Exception{
		CommonTree tree =  testMod(input);
		CommonTree t = new CommonTree();
		t.addChild(tree);
		AnModule mod = AstNodeFactory.createModule(t);
		AnEnvironment env = new AnEnvironment();
		mod.typeCheck(env);
		mod.eval(env);
	}
	
	private static CommonTree testProcDecl(String input)throws Exception{
		CharStream cs = new ANTLRStringStream(input);
		CommonTree tree = parseProcedure(cs);
		return tree;
	}
	
	private static CommonTree testMod(String input)throws Exception{
		CharStream cs = new ANTLRStringStream(input);
		CommonTree tree = parseModule(cs);
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
	
	private static CommonTree parseModule(CharStream cs){
		oberonParser parser = getParser(cs);
		ParserRuleReturnScope ruleReturn = null;
		try {
			ruleReturn = parser.module();
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
