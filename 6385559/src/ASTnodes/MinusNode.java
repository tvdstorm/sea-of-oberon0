package ASTnodes;
import parseErrorLog.OberonException;

public class MinusNode implements ASTnode {
  private final TermNode child;
  
  public MinusNode( TermNode child )
  {
    this.child = child;
  }
  
  public void printNode( int depth )
  {
    System.out.print( "(-" );
    this.child.printNode( 0 );
    System.out.print( ')' );
  }
  
  public int eval( String scope ) throws OberonException
  {
    return -1 * this.child.eval( scope );
  }
}
