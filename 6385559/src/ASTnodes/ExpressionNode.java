package ASTnodes;

public class ExpressionNode implements ASTnode {
  public ExpressionNode( SimpleExpression left, String operator, SimpleExpression right )
  {
	this.left = left;
	this.operator = operator;
	this.right = right;
  }
  
  public void printNode( int depth )
  {
	if( this.left != null )
      this.left.printNode( depth );
	if( this.operator != null )
	  System.out.print( " " + this.operator + " " );
    if( this.right != null )
      this.right.printNode( depth );
  }
  
  public int eval( String scope )
  {
    if( this.operator == null && this.right == null )
    {
      return left.eval( scope );
    }
    else if( this.operator != null && this.right != null )
    {
      int leftValue = this.left.eval( scope );
      int rightValue = this.right.eval( scope );
      boolean x = false;
      if( this.operator.contentEquals( "=" ) )
      {
        x = leftValue == rightValue;
      }
      else if( this.operator.contentEquals( "#" ) )
      {
        x = leftValue != rightValue;
      }
      else if( this.operator.contentEquals( "<" ) )
      {
        x = leftValue < rightValue;
      }
      else if( this.operator.contentEquals( "<=" ) )
      {
        x = leftValue <= rightValue;
      }
      else if( this.operator.contentEquals( ">" ) )
      {
        x = leftValue > rightValue;
      }
      else if( this.operator.contentEquals( ">=" ) )
      {
        x = leftValue >= rightValue;
      }
      return ( x ) ? 1 : 0 ;
    }
    
    return 5;
  }
  
  private String operator = null;
  private SimpleExpression left = null;
  private SimpleExpression right = null;
}
