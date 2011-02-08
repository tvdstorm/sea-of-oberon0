package ast.expression;

import errorhandler.OberonException;

public class OrNode extends ExpressionNode
{
  public OrNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
  }
  
  public String ToString( int depth )
  {
    return super.left.ToString( depth ) + " OR " + super.right.toString();
  }
  
  public int eval( ) throws OberonException
  {
    return super.left.eval( ) | super.right.eval( );
  }
}
