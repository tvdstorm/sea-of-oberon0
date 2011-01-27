package ASTnodes;

public class NotNode implements ASTnode {
  public NotNode( ASTnode expression )
  {
	this.expression = expression;
  }
  
  public void printNode( int depth )
  {
	System.out.print( "(-" );
	this.expression.printNode( 0 );
	System.out.print( ")" );
  }
  
  public int eval( String scope )
  {
    return 0;
  }
  
  private ASTnode expression;
}
