package ast;
import errorhandler.OberonException;

public class ExpressionNode implements ASTnode 
{
  private final String operator;
  private final SimpleExpression left;
  private final SimpleExpression right;
  
  public ExpressionNode( SimpleExpression left, String operator, SimpleExpression right )
  {
    this.left = left;
    this.operator = operator;
    this.right = right;
  }
  
  public String ToString( int depth )
  {
    String code = "";
    if( this.left != null )
    {
      code += this.left.ToString( depth );
    }
    
    if( this.operator != null )
    {
      code += " " + this.operator + " ";
    }
    
    if( this.right != null )
    {
      code += this.right.ToString( depth );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    if( this.operator == null && this.right == null )
    {
      return left.eval( );
    }
    else if( this.operator != null && this.right != null )
    {
      int leftValue = this.left.eval( );
      int rightValue = this.right.eval( );
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
  
  public String getVariableName() throws OberonException
  { // detect whether it is only a variable not and not an complete expression needed for call be reference
    // ugly but efficient, go into depth to see whether it is only a variable node and return its name
    // if no name given return null
    if( this.operator != null && this.right != null )
    {
      return null;
    }
    return left.getVariableName();
  }
}
