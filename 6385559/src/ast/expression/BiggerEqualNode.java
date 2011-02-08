package ast.expression;

import errorhandler.OberonException;

public class BiggerEqualNode extends ExpressionNode
{
  public BiggerEqualNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
  }
  
  public String toString( int depth )
  {
    return this.getLeft( ).toString( 0 ) + " >= " + this.getRight( ).toString( 0 );
  }
  
  public int eval( ) throws OberonException
  {
    return ( this.getLeft( ).eval( ) >= this.getRight( ).eval( ) ) ? 1 : 0;
  }
}
