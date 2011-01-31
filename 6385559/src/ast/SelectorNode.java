package ast;
import errorhandler.OberonException;

public class SelectorNode implements ASTnode {
  private final ASTnode value;
  private final ASTnode next;
  
  public SelectorNode( ASTnode value, ASTnode next )
  {
    this.value = value;
    this.next = next;
  }
  
  public void printNode( int depth )
  {
    if( this.value != null )
    {
      this.value.printNode( depth );
    }
    
    if( this.next != null )
    {
      this.next.printNode( 0 );
    }
  }
  
  public int eval( String scope ) throws OberonException
  {
    if( this.value != null )
    {
      return this.value.eval( scope );
    }
    return 0;
  }
}
