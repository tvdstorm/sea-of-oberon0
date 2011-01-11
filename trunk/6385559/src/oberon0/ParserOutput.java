package oberon0;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import parser.oberon0Lexer;
import parser.oberon0Parser;

import java.io.IOException;

/*
 * Reads the input file and returns a abstraction of the given
 * source in the form of a tree
 */
public class ParserOutput {
  public void setFile( String name )
  {
    this.filename = name;
  }
  
  /*
   * Parses the input file and returns an tree represetation of the
   * given source code
   */
  public Tree getTree()
  {
    Tree parserOutput = null;
    
    try
    {
      CharStream input = new ANTLRFileStream( this.filename );
      oberon0Lexer lex = new oberon0Lexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lex);
      //System.out.println("tokens="+tokens);
      oberon0Parser parser = new oberon0Parser(tokens);
      oberon0Parser.module_return r = parser.module();
      parserOutput = (Tree)r.getTree();
    }
    catch( IOException e )
    {
      System.out.println( "Error on filereading:\n" + e.getMessage() );
    }
    catch( RecognitionException e )
    {
      System.out.println( "Error on lex data read:\n" + e.getMessage() );
    }
    
    return parserOutput; // if output null error on execution, stop
  }
  
  private String filename = null;
}
