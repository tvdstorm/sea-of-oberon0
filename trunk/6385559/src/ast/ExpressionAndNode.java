package ast;

import errorhandler.OberonException;

public class ExpressionAndNode extends ExpressionNode
{
  public ExpressionAndNode( ExpressionNode left, ExpressionNode right )
  {
    super( left, right );
  }
  
  public String ToString( int depth )
  {
    return super.left.ToString( depth ) + " & " + super.right.ToString( depth );
  }
  
  public int eval( ) throws OberonException
  {
    return super.left.eval( ) & super.right.eval( );
  }
}