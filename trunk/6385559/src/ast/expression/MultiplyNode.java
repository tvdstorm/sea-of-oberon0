package ast.expression;

import errorhandler.OberonException;

public class MultiplyNode extends ExpressionNode
{
  public MultiplyNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
  }
  
  public String ToString( int depth )
  {
    return super.getLeft( ).ToString( 0 ) + " * " + this.getRight( ).ToString( 0 );
  }
  
  public int eval( ) throws OberonException
  {
    return this.getLeft( ).eval( ) * this.getRight( ).eval( );
  }
}
