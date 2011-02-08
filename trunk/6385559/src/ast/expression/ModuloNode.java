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
    return super.left.ToString( depth ) + " MOD " + super.right.ToString( depth );
  }
  
  public int eval( ) throws OberonException
  {
    return super.left.eval( ) % super.right.eval( );
  }
}
