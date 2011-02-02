package ast;

import errorhandler.OberonException;

public class ExpressionOrNode extends SimpleExpression
{
  public ExpressionOrNode( ASTnode left, SimpleExpression right )
  {
    super( "OR", left, right );
  }
  
  public String ToString( int depth )
  {
    return super.term.ToString( depth ) + " OR " + super.followup.toString();
  }
  
  public int eval( ) throws OberonException
  {
    return super.term.eval( ) | super.followup.eval( );
  }
}
