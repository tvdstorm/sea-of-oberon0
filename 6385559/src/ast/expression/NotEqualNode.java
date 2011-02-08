package ast.expression;

import errorhandler.OberonException;

public class NotEqualNode extends ExpressionNode
{
  public NotEqualNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
  }
  
  public String toString( int depth )
  {
    return super.getLeft( ).toString( 0 ) + " # " + super.getRight( ).toString( 0 );
  }
  
  public int eval( ) throws OberonException
  {
    if( super.getLeft( ) == null || super.getRight( ) == null ) 
    {
      throw new OberonException( "Smaller then operation doesn't have a left or right operator." );
    }
    return ( this.getLeft( ).eval( ) != this.getRight( ).eval( ) ) ? 1 : 0;
  }
}
