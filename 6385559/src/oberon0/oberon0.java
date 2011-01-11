package oberon0;
import oberon0.ParserOutput;
import oberon0.ParserInput;
import org.antlr.runtime.tree.CommonTree;
import parsetreeReduction.singletonReduce;

public class oberon0 {

  /**
   * @param args
   */
  public static void main( String[] args ) {
    ParserInput     pIn       = new ParserInput( );
    ParserOutput    Pout      = new ParserOutput( );
    singletonReduce reduction = new singletonReduce( );
    CommonTree AST;
    
    // get the AST from the parser
    Pout.setFile( pIn.getInputFile( args ) );
    AST = Pout.getTree( );
    // reduce the AST, remove all singletons
    reduction.setAST( AST );
    AST = reduction.reduce( );

    //System.out.println( AST.toStringTree() );
    return;
  }

}
