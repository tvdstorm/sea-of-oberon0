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
    {
      this.left.printNode( depth );
    }
    
    if( this.operator != null )
    {
      System.out.print( " " + this.operator + " " );
    }
    
    if( this.right != null )
    {
      this.right.printNode( depth );
    }
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
      // might be ugly but is efficient. Do a task depending on the operator
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
      return ( x ) ? 1 : 0 ; // because the interpreter doesn't use booleans return 1 if true else 0
    }
    
    return 1; // exceptional condition, should not be possible
  }
  
  public String getVariableName()
  { // detect whether it is only a variable not and not an complete expression needed for call be reference
    // ugly but efficient, go into depth to see whether it is only a variable node and return its name
    // if no name given return null
    if( this.operator != null && this.right != null )
    {
      return null;
    }
    return left.getVariableName();
  }
  
  private String operator = null;
  private SimpleExpression left = null;
  private SimpleExpression right = null;
}
