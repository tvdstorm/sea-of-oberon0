package ASTnodes;

public class RecordNode implements ASTnode {
  public RecordNode( FieldsNode fields )
  {
	this.fields = fields;
  }
	
  public void printNode(int depth) {
    System.out.print( "RECORD " );
    if( this.fields != null )
      this.fields.printNode( 0 );
    System.out.print( " END" );
  }
  
  private FieldsNode fields = null;
}
