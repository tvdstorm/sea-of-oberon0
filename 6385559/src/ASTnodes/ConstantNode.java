package ASTnodes;

public class ConstantNode implements ASTnode {
  public ConstantNode( String identifier, ExpressionNode expression, ConstantNode constant )
  {
	this.identifier = identifier;
	this.expression = expression;
	this.constant = constant;
  }
	
  public void printNode(int depth) {
    if( this.identifier != null )
      System.out.print( this.identifier + " = " );
    if( this.expression != null )
      this.expression.printNode( 0 );
    System.out.print( "; " );
    if( this.constant != null )
      this.constant.printNode( 0 );
  }
  
  public int eval( String scope )
  {
    return 0;
  }

  private String identifier = null;
  private ExpressionNode expression = null;
  private ConstantNode constant = null;
}
