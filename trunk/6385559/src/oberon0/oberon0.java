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
    ASTnode AST;
    
    // get the AST from the parser
    Pout.setFile( pIn.getInputFile( args ) );
    AST = Pout.getTree( );
    
    
    if( parseErrorLog.hasErrors() > 0 )
    {
      parseErrorLog.printMessages();
    }
    //System.out.println( AST.toStringTree() );
    return;
  }

}
