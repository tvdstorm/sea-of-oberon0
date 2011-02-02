package ast;
import errorhandler.OberonException;

public class ExpressionMinusNode extends ExpressionNode 
{
  private final ExpressionTermNode child;
  
  public ExpressionMinusNode( ExpressionTermNode child )
  {
    super( null, null );
    this.child = child;
  }
  
  public String ToString( int depth )
  {
    return "(-" + this.child.ToString( 0 ) + ")";
  }
  
  public int eval( ) throws OberonException
  {
    return -1 * this.child.eval( );
  }
}
