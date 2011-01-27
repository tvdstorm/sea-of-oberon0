package ASTnodes;

public class SelectorNode implements ASTnode {
  public SelectorNode( ASTnode value, ASTnode next )
  {
	this.value = value;
	this.next = next;
  }
	
  public void printNode( int depth )
  {
	if( this.value != null )
	  this.value.printNode( depth );
	if( this.next != null )
	  this.next.printNode( 0 );
  }
  
  private ASTnode value = null;
  private ASTnode next = null;
}