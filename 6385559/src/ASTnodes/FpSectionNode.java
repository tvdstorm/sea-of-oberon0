package ASTnodes;

import java.util.Vector;

import errorhandler.OberonException;
import management.MemoryManager;
import management.ParamContainer;
import management.TypeDefinitionManager;


public class FpSectionNode implements ASTnode {
  private final boolean callByRef;
  private final IdentListNode variables;
  private final ASTnode type;
  
  public FpSectionNode( String identifier, IdentListNode variables, ASTnode type )
  {
    this.type = type;
    this.variables = variables;
    this.callByRef = ( identifier != null && identifier.contentEquals("VAR") ) ? true : false ;
  }

  public void printNode(int depth) {
    if( this.callByRef == true )
    {
      System.out.print( "VAR " );
    }
    if( this.variables != null )
    {
      this.variables.printNode( 0 );
      System.out.print( " : " );
      if( this.type != null )
      {
        this.type.printNode( 0 );
      }
    }
  }
  
  public int eval( String scope ) throws OberonException
  {
    return 0;
  }
  
  public Vector<ParamContainer> eval( String scope, Vector<ParamContainer> params ) throws OberonException
  { // overload because of the need of the Vector with ParamContainers
    if( this.variables != null )
    {
      // the additions are needed for the array and record type
      Vector<String> additions = this.getAdditions();
      // Get the formal identifier list to get all the variables that need to be allocated
      Vector<String> toDeclare = variables.getFormalIdentList();
      
      String formal = null;
      String given = null;
      ParamContainer container = null;
      // loop through all the formal parameters and declare then by reference of value
      for( int i = toDeclare.size( )-1; i >= 0; i-- )
      {
        container = params.get( params.size()-1 );
        formal = toDeclare.get( i );
        given = container.varname;
        if( this.callByRef )
        { // create call by reference
          if( additions == null )
          { // if no additions than INTEGER OF BOOLEAN
            MemoryManager.allocate( formal, scope, 0, container.varname, false );
          }
          else
          { // if there are additions define all the different variables in the range of the data type
            for( int j = 0; j < additions.size(); j++ )
            {
              MemoryManager.allocate( formal + additions.get( j ), scope, 0, given + additions.get( j ), false );
            }
          }
        }
        else
        { // create call by value
          if( additions == null )
          {
            MemoryManager.allocate( formal, scope, container.value, null, false );
          }
          else
          {
            int correctValue = 0;
            for( int j = 0; j < additions.size(); j++ )
            {
              correctValue = MemoryManager.getFromOtherScope( container.varname + additions.get( j ), scope );
              MemoryManager.allocate( formal + additions.get( j ), scope, correctValue, null, false );
            }
          }
        }
        // remove the last element from the list and restart the loop to make sure that all parameters
        // are mapped at correct parameters
        params.removeElementAt( params.size()-1 );
      }
    }
    return params;
  }
  
  public Vector<String> getAdditions( ) throws OberonException
  { // get the additions to be able to support other data types then INTEGER AND BOOLEAN
    ASTnode currentType = this.type;
    if( currentType instanceof TypeNode )
    { // If the type is a custom type get the needed type definition from the type definition manager
      String currentTypeName = ((TypeNode) currentType).getIdentName();
      currentType = TypeDefinitionManager.getTypeDefinition( currentTypeName );
    }
  
    // next create all the possibilities that exist in this datatype
    Vector<String> additions = null;
    if( currentType instanceof ArrayNode )
    {
      additions = ( (ArrayNode) currentType).getArrayElementList( );
    }
    else if( currentType instanceof RecordNode )
    {
      additions = ( (RecordNode) currentType).getRecordElementList( );
    }
    return additions;
  }
}
