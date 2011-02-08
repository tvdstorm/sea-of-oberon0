package ast.expression;

import errorhandler.OberonException;

public class SmallerEqualNode extends ExpressionNode
{
  public SmallerEqualNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
  }
  
  public String ToString( int depth )
  {
    return super.getLeft( ).ToString( 0 ) + " <= " + super.getRight( ).ToString( 0 );
  }
  
  public int eval( ) throws OberonException
  {
    return ( super.getLeft( ).eval( ) <= super.getRight( ).eval( ) ) ? 1 : 0;
  }
}
