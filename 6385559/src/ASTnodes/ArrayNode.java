package ASTnodes;
import interpreter.TypeDefinitionManager;
import java.util.Vector;

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
    if( this.type != null )
    { // to remove type definitions
      this.correctType( );
    }
  
    int numberOfElements = this.eval( null ); // get the number of current elements to add
    Vector<String> nextList = null;
    Vector<String> returnList = new Vector<String>(0);
    if( this.type != null && this.type instanceof ArrayNode )
    { // get the netList from the array list
      nextList = ((ArrayNode) this.type).getArrayElementList();
    }
    else if( this.type != null && this.type instanceof RecordNode )
    { // get the nextList from the record list
      nextList = ((RecordNode) this.type).getRecordElementList();
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
  
  private void correctType( )
  { // this function gets the correct type from the typedefinition list, this to correct the type in the code
    String identName = "";
    while( this.type != null && this.type instanceof TypeNode && !identName.contentEquals( "INTEGER" ) && !identName.contentEquals( "BOOLEAN" ) )
    {
      identName = ((TypeNode) this.type ).getIdentName();
      if( !identName.contentEquals( "INTEGER" ) && !identName.contentEquals( "BOOLEAN" ) )
      {
        this.type = TypeDefinitionManager.getTypeDefinition( identName );
      }
    }
  }

  private ExpressionNode expression = null;
  private ASTnode type = null;
}
