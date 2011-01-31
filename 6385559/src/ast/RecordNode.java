package ast;

import java.util.Vector;

import errorhandler.OberonException;

public class RecordNode implements ASTnode {
  private final FieldsNode fields;
  
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
  
  public int eval( ) throws OberonException
  {
    return 0;
  }
  
  public Vector<String> getRecordElementList() throws OberonException
  { // fetches the variables of which the RECORD is based
    Vector<String> returnList = null;
    returnList = this.fields.getVariableList();

    return returnList;
  }
}
