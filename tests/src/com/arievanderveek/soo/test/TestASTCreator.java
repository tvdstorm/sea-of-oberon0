/**
 * 
 */
package com.arievanderveek.soo.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

import com.arievanderveek.soo.ast.codeblocks.ModuleNode;
import com.arievanderveek.soo.parser.antlrimpl.generated.Oberon0Lexer;
import com.arievanderveek.soo.parser.antlrimpl.generated.Oberon0Parser;
import com.arievanderveek.soo.parser.antlrimpl.generated.Oberon0Parser.module_return;

/**
 * Class that generates AST's for testing.
 * 
 * @author arieveek
 *
 */
public class TestASTCreator {
	
	public static ModuleNode createASTNode(String content) throws Exception{
		InputStream inputStream = new ByteArrayInputStream(content.getBytes());
		CharStream stream = new ANTLRInputStream(inputStream);
		// Parse the input stream with the lexer and parser to create a tree
		Oberon0Lexer lexer = new Oberon0Lexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		Oberon0Parser parser = new Oberon0Parser(tokenStream);
		module_return parseTree = parser.module();
		// Return the AST node from the parsing result
		// TODO: no regocnitionexception is thrown by the parser tree
		return parseTree.node;		
	}
	
	public static ModuleNode createSimpleMathAST() throws Exception{
		return createASTNode(simpleMath);
	}
	
	public static ModuleNode createProcAndVariablesAST() throws Exception{
		return createASTNode(procsConstAndVariables);
	}
	
	// AST Texts are below, to not obfuscate the actual code.
	private static final String simpleMath  = 	"MODULE SimpleMaths;\n"+
							"CONST\n"+
							"  i = 10;\n"+
							"  j = 15;\n"+
							"VAR\n"+
							"temp: INTEGER;\n"+
							"input: ARRAY 5 OF INTEGER;\n"+
							"BEGIN\n"+
							"temp := -1 + 3 * 4;\n"+
							"Write(temp);\n"+
							"WriteLn;\n"+
							"temp := (i+j) DIV 2;\n"+
							"Write(temp);\n"+
							"WriteLn;\n"+
							"temp := ( 1 + 7 ) * ( 3 + 1 );\n"+
							"Write(temp);\n"+
							"WriteLn\n"+
							"END SimpleMaths.\n";
	
	private static final String procsConstAndVariables  = "MODULE QuickSort;\n"+
								"CONST\n"+
								"INPUTLENGTH = 5;\n"+
								"VAR\n"+
								"input: ARRAY INPUTLENGTH OF INTEGER;\n"+
								"i: INTEGER;\n"+
								"PROCEDURE Swap(VAR x, y: INTEGER);\n"+
								"VAR\n"+
								"temp: INTEGER;\n"+
								"BEGIN\n"+
								"temp := x;\n"+
								"x := y;\n"+
								"y := temp\n"+
								"END Swap;\n"+
								"BEGIN\n"+
								"i := 0;\n"+
								"WHILE i < INPUTLENGTH DO\n"+
								"input[i] := i;\n"+
								"i := i + 1\n"+
								"END;\n"+
								"Swap(input[0],input[1]);\n"+
								"Swap(input[4],input[3]);\n"+
								"i := 0;\n"+
								"WHILE i < INPUTLENGTH DO\n"+
								"Write(input[i]);\n"+
								"WriteLn;\n"+
								"i := i + 1\n"+
								"END\n"+
								"END QuickSort.";
}