package ast;
import errorhandler.OberonException;

public class ExpressionMinusNode extends ExpressionNode 
{
  
  public ExpressionMinusNode( ExpressionNode left )
  {
    super( left, null );
  }
  
  public String ToString( int depth )
  {
    return "(-" + this.left.ToString( 0 ) + ")";
  }
  
  public int eval( ) throws OberonException
  {
    return -1 * this.left.eval( );
  }
}
