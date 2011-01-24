package randy.main;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.StringTemplate;
import randy.generated.antlr.*;
import randy.generated.antlr.Oberon0Parser.module_return;
import randy.interpreter.Oberon0BuildinFunctions;
import randy.interpreter.Oberon0Program;

public class Main
{
	public static void main(String args[]) throws Exception
	{
		Oberon0Program p = new Oberon0Program();
		//p.loadProgram("test/simpletest.oberon0");
		p.loadProgram("test/quicksort.oberon0", new Oberon0BuildinFunctions());
		p.run();
		
		//processAndRender("test/sample.oberon0", "test/sample.dot", "test/sample.png");
		//processAndRender("test/quicksort.oberon0", "test/quicksort.dot", "test/quicksort.png");
	}
	public static void processAndRender(String filename, String dotFilename, String pngFilename) throws Exception
	{
		Oberon0Lexer lexer = new Oberon0Lexer(new ANTLRFileStream(filename));
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		Oberon0Parser parser = new Oberon0Parser(tokens);
		module_return ret = parser.module();
		
		Tree ast = (Tree)ret.getTree();
		//printTree(ast, "");
		DOTTreeGenerator dot = new DOTTreeGenerator();
		StringTemplate outp = dot.toDOT(ast);
		BufferedWriter out = new BufferedWriter(new FileWriter(dotFilename));
		out.write(outp.toString());
		out.close();
		Process process = Runtime.getRuntime().exec("dot.exe -Tpng:gd " + dotFilename + " -o " + pngFilename);
		try
		{
			process.waitFor();
		}
		catch (Exception e)
		{
			
		}
	}
	public static void printTree(Tree tree, String indent)
	{
		System.out.println(indent + tree.getText() + " (" + tree.getType() + ")");
		for (int i=0;i<tree.getChildCount();i++)
		{
			Tree ch = tree.getChild(i);
			System.out.println(indent + "\t" + ch.toString());
			printTree(ch, indent + "\t");
		}
	}
}
