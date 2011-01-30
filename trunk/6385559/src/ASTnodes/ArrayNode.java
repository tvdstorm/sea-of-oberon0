package ASTnodes;
import java.util.Vector;
import management.TypeDefinitionManager;

public class ArrayNode implements ASTnode {
  public ArrayNode( ExpressionNode expression, ASTnode type )
  {
    this.expression = expression;
    this.type = type; // can contain an TypeNode/ArrayTypeNode/RecordTypeNode
  }
  
  public void printNode(int depth) {
    if( this.expression != null )
    {
      System.out.print( "ARRAY " );
      this.expression.printNode( 0 );
      System.out.print( " OF " );
    }
    if( this.type != null )
    {
      this.type.printNode( 0 );
    }
  }
  
  public int eval( String scope )
  {
    return this.expression.eval( scope );
  }
  
  public Vector<String> getArrayElementList()
  { // fetch the list of all array elements
    ASTnode correctedType = this.type;
    if( correctedType != null )
    { // get the correct type definition
      correctedType = TypeDefinitionManager.correctType( correctedType );
    }
  
    int numberOfElements = this.eval( null ); // get the number of current elements to add
    Vector<String> nextList = null;
    Vector<String> returnList = new Vector<String>(0);
    if( correctedType != null && correctedType instanceof ArrayNode )
    { // get the netList from the array list
      nextList = ((ArrayNode)correctedType).getArrayElementList();
    }
    else if( correctedType != null && correctedType instanceof RecordNode )
    { // get the nextList from the record list
      nextList = ((RecordNode) correctedType).getRecordElementList();
    }
    
    if( nextList != null )
    {
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
