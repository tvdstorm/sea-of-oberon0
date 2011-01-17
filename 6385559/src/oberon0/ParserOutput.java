package oberon0;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.TokenRewriteStream;

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
  public CommonTree getTree()
  {
    CommonTree parserOutput = null;
    
    try
    {
      CharStream input = new ANTLRFileStream( this.filename );
      oberon0Lexer lex = new oberon0Lexer(input);
      
      TokenRewriteStream tokens = new TokenRewriteStream(lex);
      //System.out.println("tokens="+tokens);
      oberon0Parser parser = new oberon0Parser(tokens);
      
      final TreeAdaptor adaptor = new CommonTreeAdaptor() {
        public Object create(Token payload) {
          return new CommonTree(payload);
        }
      };
      
    }
    catch( IOException e )
    {
      System.out.println( "Error on filereading:\n" + e.getMessage() );
    }
    
    return parserOutput; // if output null error on execution, stop
  }
  
  private String filename = null;
}
