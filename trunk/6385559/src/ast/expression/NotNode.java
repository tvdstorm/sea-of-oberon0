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
    if( super.getLeft( ) != null )
    {
      return "(-" + super.getLeft( ).ToString( 0 ) + ")";
    }
    return "";
  }
  
  public int eval( ) throws OberonException
  {
    if( super.getLeft( ) != null )
    {
      return ~( super.getLeft( ).eval( ) );
    }
    return 0;
  }
}
