package ast.expression;

import errorhandler.OberonException;

public class MultiplyNode extends ExpressionNode
{
  public MultiplyNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
  }
  
  public String toString( int depth )
  {
    return super.getLeft( ).toString( 0 ) + " * " + this.getRight( ).toString( 0 );
  }
  
  public int eval( ) throws OberonException
  {
    return this.getLeft( ).eval( ) * this.getRight( ).eval( );
  }
}
