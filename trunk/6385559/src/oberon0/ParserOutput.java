package oberon0;
import org.antlr.runtime.*;
import org.antlr.runtime.TokenRewriteStream;

import parser.oberon0Lexer;
import parser.oberon0Parser;

import java.io.IOException;
import ASTnodes.*;

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
  public ModuleNode getAST()
  {
    ModuleNode parserOutput = null;
    
    try
    {
      CharStream input = new ANTLRFileStream( this.filename );
      oberon0Lexer lex = new oberon0Lexer(input);
      
      TokenRewriteStream tokens = new TokenRewriteStream(lex);
      //System.out.println("tokens="+tokens);
      oberon0Parser parser = new oberon0Parser(tokens);
      
      parserOutput = parser.module(); 
    }
    catch( RecognitionException e )
    {
      System.out.println( "Parse error: " + e.getMessage() );
    }
    catch( IOException e )
    {
      System.out.println( "Error on filereading:\n" + e.getMessage() );
    }
    
    return parserOutput; // if output null error on execution, stop
  }
  
  private String filename = null;
}
