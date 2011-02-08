package ast.expression;

import errorhandler.OberonException;

public class PlusNode extends ExpressionNode
{
  public PlusNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
  }
  
  public String ToString( int depth )
  {
    return super.left.ToString( depth ) + " OR " + super.right.toString();
  }
  
  public int eval( ) throws OberonException
  {
    return super.left.eval( ) + super.right.eval( );
  }
}
