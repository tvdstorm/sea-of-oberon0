package ast;

import errorhandler.OberonException;

public class ExpressionOrNode extends ExpressionNode
{
  public ExpressionOrNode( ExpressionNode left, ExpressionNode right )
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
