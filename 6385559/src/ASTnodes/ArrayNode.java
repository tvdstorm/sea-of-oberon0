package ASTnodes;
import java.util.Vector;

public class ArrayNode implements ASTnode {
  public ArrayNode( ExpressionNode expression, ASTnode type )
  {
	this.expression = expression;
	this.type = type;
  }
	
  public void printNode(int depth) {
    if( this.expression != null )
    {
      System.out.print( "ARRAY " );
      this.expression.printNode( 0 );
      System.out.print( " OF " );
    }
    if( this.type != null )
      this.type.printNode( 0 );
  }
  
  public int eval( String scope )
  {
    return this.expression.eval( scope );
  }
  
  public Vector<String> getArrayElementList()
  { // fetch the list of all array elements
    int numberOfElements = this.eval( null ); // get the number of current elements to add
    Vector<String> nextList;
    Vector<String> returnList = new Vector<String>(0);
    if( this.type != null && this.type instanceof ArrayNode )
    { // add the next dimension to the record
      nextList = ((ArrayNode) this.type).getArrayElementList();
      for( int i = 0; i< numberOfElements; i++ )
      {
        for( int j = 0; j < nextList.size(); j++ )
        {
          returnList.add( "[" + i + "]" + nextList.get(j) );
        }
      }
    }
    else if( this.type != null && this.type instanceof RecordNode )
    { // add the record types to the list
      nextList = ((RecordNode) this.type).getRecordElementList();
      for( int i = 0; i< numberOfElements; i++ )
      {
        for( int j = 0; j < nextList.size(); j++ )
        {
          returnList.add( "[" + i + "]" + nextList.get(j) );
        }
      }
    }
    else
    { // just return the first dimension of the array
      for( int i = 0; i < numberOfElements; i++ )
      {
        returnList.add( "[" + i + "]" );
      }
    }
    return returnList;
  }

  private ExpressionNode expression = null;
  private ASTnode type = null;
}
