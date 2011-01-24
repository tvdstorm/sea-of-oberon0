package ASTnodes;

public class FieldsNode implements ASTnode {
  public FieldsNode( FieldlistNode fieldlist, FieldsNode fieldsnode )
  {
	this.fieldlist = fieldlist;
	this.fieldsnode = fieldsnode;
  }
	
  public void printNode(int depth) {
    if( this.fieldlist != null )
      this.fieldlist.printNode( 0 );
    if( this.fieldsnode != null)
      this.fieldsnode.printNode( 0 );
  }

  private FieldlistNode fieldlist = null;
  private FieldsNode fieldsnode = null;
}
