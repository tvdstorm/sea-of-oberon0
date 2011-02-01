package ast;

import errorhandler.OberonException;

public class ExpressionEqualNode extends ExpressionNode
{
  public ExpressionEqualNode( SimpleExpression left, SimpleExpression right )
  {
    super(left, right);
  }
  
  public String ToString( int depth )
  {
    return super.left.ToString( depth ) + " = " + super.right.ToString( depth );
  }
  
  public int eval( ) throws OberonException
  {
    if( super.left == null || super.right == null )
    {
      throw new OberonException( "Smaller then operation doesn't have a left or right operator." );
    }
    return ( super.left.eval( ) == super.right.eval( ) ) ? 1 : 0;
  }
}
