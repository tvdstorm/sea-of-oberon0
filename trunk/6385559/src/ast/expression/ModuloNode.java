package ast.expression;

import errorhandler.OberonException;

public class ModuloNode extends ExpressionNode
{
  public ModuloNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
  }
  
  public String ToString( int depth )
  {
    return this.getLeft( ).ToString( 0 ) + " MOD " + this.getRight( ).ToString( 0 );
  }
  
  public int eval( ) throws OberonException
  {
    return this.getLeft( ).eval( ) % this.getRight( ).eval( );
  }
}
