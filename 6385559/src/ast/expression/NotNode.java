package ast.expression;
import errorhandler.OberonException;

public class NotNode extends ExpressionNode
{ 
  public NotNode( ExpressionNode expression )
  {
    super( expression, null );
  }
  
  public String ToString( int depth )
  {
    if( super.left != null )
    {
      return "(-" + super.left.ToString( 0 ) + ")";
    }
    return "";
  }
  
  public int eval( ) throws OberonException
  {
    if( super.left != null )
    {
      return ~(super.left.eval( ));
    }
    return 0;
  }
}
