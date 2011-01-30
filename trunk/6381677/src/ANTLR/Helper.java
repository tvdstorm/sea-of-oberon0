package ANTLR;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.Structure.Module;

/**
 * @author Chiel Labee
 * This is a Helper class containing common features to support the ANTLR generated classes.
*/
public class Helper 
{
	public static Module createModuleFromFile(String filePath)
	{
		try 
		{
			return createModuleFromStream(new ANTLRFileStream(filePath));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
	public static Module createModuleFromText(String text)
	{
		return createModuleFromStream(new ANTLRStringStream(text));
	}
	
	public static Module createModuleFromStream(CharStream stream)
	{
		OberonLexer oberonLexer = new OberonLexer(stream);
		CommonTokenStream oberonTokens = new CommonTokenStream(oberonLexer);
	    OberonParser oberonParser = new OberonParser(oberonTokens);
	    
	    try {
	    	OberonParser.module_return r = oberonParser.module();
	    	CommonTree parserTree = (CommonTree)r.getTree();
	    	
	    	return (Module)AbstractSyntax.BaseNode.implodeParserTree(parserTree);
	    } 
	    catch (RecognitionException e) 
	    {
	        e.printStackTrace();
	    }
	    
	    return null;
	}
}
