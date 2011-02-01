package ast;
import errorhandler.OberonException;

public class SelectorNode implements ASTnode 
{
  private final ASTnode value;
  private final ASTnode next;
  
  public SelectorNode( ASTnode value, ASTnode next )
  {
    this.value = value;
    this.next = next;
  }
  
  public String ToString( int depth )
  {
    String code = "";
    if( this.value != null )
    {
      code += this.value.ToString( depth );
    }
    
    if( this.next != null )
    {
      code += this.next.ToString( 0 );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    if( this.value != null )
    {
      return this.value.eval( );
    }
    return 0;
  }
}
