package ast;

import java.util.Vector;

import errorhandler.OberonException;
import management.TypeDefinitionManager;

public class FieldlistNode implements ASTnode 
{
  private final IdentListNode identlist;
  private final ASTnode type;
  
  public FieldlistNode( IdentListNode identlist, ASTnode type )
  {
    this.identlist = identlist;
    this.type = type;
  }
  
  public String ToString( int depth ) 
  {
    String code = "";
    if( this.identlist != null )
    {
      code += this.identlist.ToString( 0 ) + " : ";
    }
    
    if( this.type != null )
    {
      code += this.type.ToString( 0 ) + "; ";
    } 
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    ASTnode correctedType = this.type;
    if( this.type != null )
    { // to remove type definitions, correct the type
      correctedType = TypeDefinitionManager.correctType( correctedType );
    }
    
    if( this.identlist != null )
    {
      // this call is to test the generations of all possible array elements
      Vector<String> elements = null; // for if the array and record types
      if( correctedType != null && correctedType instanceof ArrayNode )
      {
        elements = ((ArrayNode) correctedType).getArrayElementList();
      }
      else if( correctedType != null && correctedType instanceof RecordNode )
      {
        elements = ((RecordNode) correctedType).getRecordElementList();
      }
    
      this.identlist.allocateIdentifiers( elements );
    }
    return 0;
  }
  
  public Vector<String> getVariableList() throws OberonException
  {
    ASTnode correctedType = this.type;
    if( correctedType != null )
    { // to remove type definitions
      correctedType = TypeDefinitionManager.correctType( correctedType );
    }  
    
    Vector<String> returnList = new Vector<String>(0);
    if( this.identlist != null )
    {
      Vector<String> identlist = this.identlist.getIdentList(); // fetch the identifierlist
      Vector<String> elements = null; // for if the array and record types
      
      if( correctedType != null && correctedType instanceof ArrayNode )
      {
        elements = ((ArrayNode) correctedType).getArrayElementList();
      }
      if( correctedType != null && correctedType instanceof RecordNode )
      {
        elements = ((RecordNode) correctedType).getRecordElementList();
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
}
