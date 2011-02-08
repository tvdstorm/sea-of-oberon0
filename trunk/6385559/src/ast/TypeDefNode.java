package ast;

import errorhandler.OberonException;
import management.ScopeManager;
import management.TypeDefinitionManager;

public class TypeDefNode implements ASTnode 
{
  private final String identifier;
  private final ASTnode type;
  private final TypeDefNode followup;
  
  public TypeDefNode( String identifier, ASTnode type, TypeDefNode followup )
  {
    this.identifier = identifier;
    this.type = type;
    this.followup = followup;
  }
  
  public String toString( int depth ) 
  {
    String code = "";
    if( this.identifier != null )
    {
      code += this.identifier + " = ";
    }
    
    if( this.type != null )
    {
      code += this.type.toString( 0 ) + "; ";
    }
    
    if( this.followup != null )
    {
      code += this.followup.toString( 0 );
    }
    return code;
  }

  public int eval( ) throws OberonException
  {
    if( this.identifier != null && this.type != null )
    {
      TypeDefinitionManager.addTypeDefinition( this.identifier, type, ScopeManager.currentScope( ) );
    }
    if( this.followup != null )
    {
      this.followup.eval( );
    }
    return 0;
  }
}
