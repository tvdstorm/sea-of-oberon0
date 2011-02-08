package ast.expression.selector;
import ast.expression.ExpressionNode;
import errorhandler.OberonException;

public class SelectorArrayNode implements SelectorNode 
{
  private final ExpressionNode expression;
  private final SelectorNode selector;
  
  public SelectorArrayNode( ExpressionNode expression, SelectorNode selector )
  {
    this.expression = expression;
    this.selector = selector;
  }
  
  public String toString( int depth ) 
  {
    String code = "";
    if( this.expression != null )
    {
      code += "[" + this.expression.toString( 0 ) + "]";
    }
    
    if( this.selector != null )
    {
      code += this.selector.toString( 0 );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    return 0;
  }
  
  public String getSelectorString( ) throws OberonException
  {
    return "[" + this.expression.eval( ) + "]" + ( this.selector != null ? this.selector.getSelectorString( ) : "" );
  }
}
