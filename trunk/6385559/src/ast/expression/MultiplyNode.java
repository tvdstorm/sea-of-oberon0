package ast.expression;

import errorhandler.OberonException;

public class MultiplyNode extends ExpressionNode
{
  public MultiplyNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
    assert ( left != null && right != null ); // both the left and right operand have to be set
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
