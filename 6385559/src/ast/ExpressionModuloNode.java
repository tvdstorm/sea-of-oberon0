package ast;

import errorhandler.OberonException;

public class ExpressionModuloNode extends ExpressionTermNode
{
  public ExpressionModuloNode( ASTnode factor, ExpressionTermNode follow )
  {
    super( factor, "MOD", follow );
  }
  
  public String ToString( int depth )
  {
    return super.factor.ToString( depth ) + " MOD " + super.follow.ToString( depth );
  }
  
  public int eval( ) throws OberonException
  {
    return super.factor.eval( ) % super.follow.eval( );
  }
}
