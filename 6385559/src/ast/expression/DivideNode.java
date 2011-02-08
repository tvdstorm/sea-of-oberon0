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
    return super.left.ToString( depth ) + " DIV " + super.right.ToString( depth );
  }
  
  public int eval( ) throws OberonException
  {
    return super.left.eval( ) / super.right.eval( );
  }
}
