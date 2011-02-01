package ast;
import errorhandler.OberonException;

public class NotNode implements ASTnode 
{
  private final ASTnode expression;
  
  public NotNode( ASTnode expression )
  {
    this.expression = expression;
  }
  
  public String ToString( int depth )
  {
    if( this.expression != null )
    {
      return "(-" + this.expression.ToString( 0 ) + ")";
    }
    return "";
  }
  
  public int eval( ) throws OberonException
  {
    if( this.expression != null )
    {
      return ~(this.expression.eval( ));
    }
    return 0;
  }
}
