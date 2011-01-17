package oberon0;
import oberon0.ParserOutput;
import oberon0.ParserInput;
import org.antlr.runtime.tree.CommonTree;

public class oberon0 {

  /**
   * @param args
   */
  public static void main( String[] args ) {
    ParserInput     pIn       = new ParserInput( );
    ParserOutput    Pout      = new ParserOutput( );
    CommonTree AST;
    
    // get the AST from the parser
    Pout.setFile( pIn.getInputFile( args ) );
    AST = Pout.getTree( );

    //System.out.println( AST.toStringTree() );
    return;
  }

}
