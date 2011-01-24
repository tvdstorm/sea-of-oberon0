package ASTnodes;

public class FieldlistNode implements ASTnode {
  public FieldlistNode( IdentListNode identlist, ASTnode type )
  {
	this.identlist = identlist;
	this.type = type;
  }
	
  public void printNode(int depth) 
  {
    if( this.identlist != null )
      this.identlist.printNode( 0 );
    if( this.type != null )
      this.type.printNode( 0 );
  }
  
  private IdentListNode identlist = null;
  private ASTnode type = null;
}
