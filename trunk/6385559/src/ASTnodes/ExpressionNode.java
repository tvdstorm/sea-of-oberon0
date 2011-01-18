package ASTnodes;

public class ExpressionNode implements ASTnode {
  public ExpressionNode( SimpleExpression left, String operator, SimpleExpression right )
  {
	this.left = left;
	this.operator = operator;
	this.right = right;
  }
  
  private String operator = null;
  private SimpleExpression left = null;
  private SimpleExpression right = null;
}
