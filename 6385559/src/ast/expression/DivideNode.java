package ast.expression;

import errorhandler.OberonException;

public class DivideNode extends ExpressionNode
{
  public DivideNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
  }
  
  public String ToString( int depth )
  {
    return this.getLeft( ).ToString( 0 ) + " DIV " + this.getRight( ).ToString( 0 );
  }
  
  public int eval( ) throws OberonException
  {
    return this.getLeft( ).eval( ) / this.getRight( ).eval( );
  }
}
