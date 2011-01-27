package ASTnodes;

public class MinusNode implements ASTnode {
  public MinusNode( TermNode e )
  {
	this.child = e;
  }
  
  public void printNode( int depth )
  {
	System.out.print( "(-" );
	this.child.printNode( 0 );
	System.out.print( ')' );
  }
  
  public int eval( String scope )
  {
    return -1*this.child.eval( scope );
  }
  
  private TermNode child = null;
}
