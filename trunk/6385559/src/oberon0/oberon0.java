package oberon0;
import oberon0.ParserOutput;
import oberon0.ParserInput;
import org.antlr.runtime.tree.CommonTree;
import parseErrorLog.*;
import ASTnodes.*;

public class oberon0 {

  /**
   * @param args
   */
  public static void main( String[] args ) {
    ParserInput     pIn       = new ParserInput( );
    ParserOutput    Pout      = new ParserOutput( );
    ModuleNode AST;
    
    System.out.println( "Start execution\n" );
    
    // get the AST from the parser
    Pout.setFile( pIn.getInputFile( args ) );
    AST = Pout.getAST( );
    
    if( parseErrorLog.hasErrors() > 0 )
    {
      parseErrorLog.printMessages();
    }
    else
    {
      System.out.println( "\nExit execution OK." );
    }
    return;
  }

}
