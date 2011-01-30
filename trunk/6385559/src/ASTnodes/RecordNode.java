package ASTnodes;

import java.util.Vector;

public class RecordNode implements ASTnode {
  public RecordNode( FieldsNode fields )
  {
    this.fields = fields;
  }
  
  public void printNode(int depth) {
    System.out.print( "RECORD " );
    if( this.fields != null )
    {
      this.fields.printNode( 0 );
    }
    System.out.print( " END" );
  }
  
  public int eval( String scope )
  {
    return 0;
  }
  
  public Vector<String> getRecordElementList()
  { // fetches the variables of which the RECORD is based
    Vector<String> returnList = null;
    returnList = this.fields.getVariableList();

    return returnList;
  }
  
  private FieldsNode fields = null;
}
