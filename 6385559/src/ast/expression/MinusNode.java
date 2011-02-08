package ast.expression;
import errorhandler.OberonException;

public class MinusNode extends ExpressionNode 
{
  
  public MinusNode( ExpressionNode expression )
  {
    super( expression, null );
    assert ( expression != null ); // the expression has to be set if not assert
  }
  
  public String toString( int depth )
  {
    return "(-" + this.getLeft( ).toString( 0 ) + ")";
  }
  
  public int eval( ) throws OberonException
  {
    return -1 * this.getLeft( ).eval( );
  }
}
