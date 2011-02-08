package ast.expression;
import errorhandler.OberonException;

public class NotNode extends ExpressionNode
{ 
  public NotNode( ExpressionNode expression )
  {
    super( expression, null );
    assert ( expression != null ); // the expression has to be set
  }
  
  public String toString( int depth )
  {
    return "(-" + super.getLeft( ).toString( 0 ) + ")";
  }
  
  public int eval( ) throws OberonException
  {
    return ~( super.getLeft( ).eval( ) );
  }
}
