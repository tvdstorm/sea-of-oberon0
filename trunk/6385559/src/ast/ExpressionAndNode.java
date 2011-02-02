package ast;

import errorhandler.OberonException;

public class ExpressionAndNode extends ExpressionTermNode
{
  public ExpressionAndNode( ASTnode factor, ExpressionTermNode follow )
  {
    super( factor, "&", follow );
  }
  
  public String ToString( int depth )
  {
    return super.factor.ToString( depth ) + " & " + super.follow.ToString( depth );
  }
  
  public int eval( ) throws OberonException
  {
    return super.factor.eval( ) & super.follow.eval( );
  }
}
