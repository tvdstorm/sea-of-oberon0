package ast.expression.selector;
import errorhandler.OberonException;

public class SelectorRecordNode implements SelectorNode
{
  private final String ident;
  private final SelectorNode selector;
  
  public SelectorRecordNode( String ident, SelectorNode selector )
  {
    this.ident = ident;
    this.selector = selector;
  }
  
  public String toString( int depth ) 
  {
    String code = "";
    if( this.ident != null )
    {
      code += "." + this.ident;
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
    return "." + this.ident + ( this.selector != null ? this.selector.getSelectorString( ) : "" );
  }
}
