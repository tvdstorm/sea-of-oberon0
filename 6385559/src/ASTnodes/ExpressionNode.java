package ASTnodes;

public class ExpressionNode implements ASTnode {
  public ExpressionNode( SimpleExpression left, String operator, SimpleExpression right )
  {
	this.left = left;
	this.operator = operator;
	this.right = right;
  }
  
  public void printNode()
  {
	if( this.left != null )
      this.left.printNode();
	if( this.operator != null )
	  System.out.print( this.operator );
    if( this.right != null )
      this.right.printNode();
  }
  
  private String operator = null;
  private SimpleExpression left = null;
  private SimpleExpression right = null;
}
