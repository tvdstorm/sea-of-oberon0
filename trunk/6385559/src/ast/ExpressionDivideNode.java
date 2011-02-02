package ast;

import errorhandler.OberonException;

public class ExpressionDivideNode extends ExpressionTermNode
{
  public ExpressionDivideNode( ASTnode factor, ExpressionTermNode follow )
  {
    super( factor, "DIV", follow );
  }
  
  public String ToString( int depth )
  {
    return super.factor.ToString( depth ) + " DIV " + super.follow.ToString( depth );
  }
  
  public int eval( ) throws OberonException
  {
    return super.factor.eval( ) / super.follow.eval( );
  }
}
