package ASTnodes;

import management.TypeDefinitionManager;
import parseErrorLog.OberonException;

public class TypeDefNode implements ASTnode {
  private final String identifier;
  private final ASTnode type;
  private final TypeDefNode followup;
  
  public TypeDefNode( String identifier, ASTnode type, TypeDefNode followup )
  {
    this.identifier = identifier;
    this.type = type;
    this.followup = followup;
  }
  
  public void printNode(int depth) 
  {
    if( this.identifier != null )
    {
      System.out.print( this.identifier + " = " );
    }
    
    if( this.type != null )
    {
      this.type.printNode( 0 );
      System.out.print( "; " );
    }
    
    if( this.followup != null )
    {
      this.followup.printNode( 0 );
    }
  }

  public int eval( String scope ) throws OberonException
  {
    if( this.identifier != null && this.type != null )
    {
      TypeDefinitionManager.addTypeDefinition( this.identifier, type, scope );
    }
    if( this.followup != null )
    {
      this.followup.eval( scope );
    }
    return 0;
  }
}
