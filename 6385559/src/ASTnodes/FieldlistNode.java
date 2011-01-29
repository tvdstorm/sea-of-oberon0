package ASTnodes;
import interpreter.TypeDefinitionManager;

import java.util.Vector;

public class FieldlistNode implements ASTnode {
  public FieldlistNode( IdentListNode identlist, ASTnode type )
  {
	this.identlist = identlist;
	this.type = type;
  }
	
  public void printNode(int depth) 
  {
    if( this.identlist != null )
    {
      this.identlist.printNode( 0 );
      System.out.print( " : " );
    }
    if( this.type != null )
    {
      this.type.printNode( 0 );
      System.out.print( "; " );
    } 
  }
  
  public int eval( String scope )
  {
    if( this.type != null )
    { // to remove type definitions
      this.correctType( );
    }
		
	if( this.identlist != null )
	{
	  // this call is to test the generations of all possible array elements
	  Vector<String> elements = null; // for if the array and record types
	  if( this.type != null && this.type instanceof ArrayNode )
	  {
		elements = ((ArrayNode) this.type).getArrayElementList();
	  }
	  else if( this.type != null && this.type instanceof RecordNode )
	  {
		elements = ((RecordNode) this.type).getRecordElementList();
	  }
		
	  this.identlist.allocateIdentifiers( scope, elements );
	}
    return 0;
  }
  
  public Vector<String> getVariableList()
  {
	if( this.type != null )
    { // to remove type definitions
      this.correctType( );
    }	
	  
    Vector<String> returnList = new Vector<String>(0);
    if( this.identlist != null )
    {
      Vector<String> identlist = this.identlist.getIdentList(); // fetch the identifierlist
    	
      Vector<String> elements = null; // for if the array and record types
  	  if( this.type != null && this.type instanceof ArrayNode )
  	  {
  		elements = ((ArrayNode) this.type).getArrayElementList();
  	  }
  	  if( this.type != null && this.type instanceof RecordNode )
  	  {
  		elements = ((RecordNode) this.type).getRecordElementList();
  	  }
  	  
  	  if( elements != null )
  	  {
        for( int i = 0; i < identlist.size(); i++ )
        {
          for( int j = 0; j < elements.size(); j++ )
          {
            returnList.add( identlist.get( i ) + elements.get( j ) );
          }
        }
  	  }
  	  else
  	  {
  	    returnList = identlist;
  	  }
    }
    return returnList;
  }
  
  private void correctType( )
  {
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
  
  private IdentListNode identlist = null;
  private ASTnode type = null;
}
