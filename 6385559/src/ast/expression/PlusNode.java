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
    return super.getLeft( ).ToString( 0 ) + " OR " + super.getRight( ).ToString( 0 );
  }
  
  public int eval( ) throws OberonException
  {
    return super.getLeft( ).eval( ) + super.getRight( ).eval( );
  }
}
