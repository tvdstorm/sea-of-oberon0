package ASTnodes;

import java.util.Vector;

import errorhandler.OberonException;

public class FieldsNode implements ASTnode {
  private final FieldlistNode fieldlist;
  private final FieldsNode fieldsnode;
  
  public FieldsNode( FieldlistNode fieldlist, FieldsNode fieldsnode )
  {
    this.fieldlist = fieldlist;
    this.fieldsnode = fieldsnode;
  }
  
  public void printNode(int depth) {
    if( this.fieldlist != null )
    {
      this.fieldlist.printNode( 0 );
    }
    
    if( this.fieldsnode != null)
    {
      this.fieldsnode.printNode( 0 );
    }
  }
  
  public int eval( String scope ) throws OberonException
  {
    if( this.fieldlist != null )
    {
      this.fieldlist.eval( scope );
    }
    if( this.fieldsnode != null )
    {
      this.fieldsnode.eval( scope );
    }
    return 0;
  }
  
  public Vector<String> getVariableList() throws OberonException
  { // fetches the variable list from the Fieldsnode, needed for other types then INTEGER & BOOLEAN
    Vector<String> returnList = null;
    Vector<String> additionList = null;
    if( this.fieldlist != null )
    {
      returnList = this.fieldlist.getVariableList();
      if( fieldsnode != null )
      {
        additionList = fieldsnode.getVariableList();
        for( int i = 0; i < additionList.size(); i++ )
        {
          returnList.add( additionList.get( i ) );
        }
      }
    }
    return returnList;
  }
}
