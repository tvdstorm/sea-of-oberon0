package ast.expression;

import errorhandler.OberonException;

public class OrNode extends ExpressionNode
{
  public OrNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
    assert ( left != null && right != null ); // both the left and right operand have to be set
  }
  
  public String toString( int depth )
  {
    return super.getLeft( ).toString( 0 ) + " OR " + super.getRight( ).toString( 0 );
  }
  
  public int eval( ) throws OberonException
  {
    return super.getLeft( ).eval( ) | super.getRight( ).eval( );
  }
}
