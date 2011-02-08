package ast.expression;
import errorhandler.OberonException;

public class MinusNode extends ExpressionNode 
{
  
  public MinusNode( ExpressionNode left )
  {
    super( left, null );
  }
  
  public String ToString( int depth )
  {
    return "(-" + this.getLeft( ).ToString( 0 ) + ")";
  }
  
  public int eval( ) throws OberonException
  {
    return -1 * this.getLeft( ).eval( );
  }
}
