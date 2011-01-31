package ASTnodes;

import java.util.Vector;

import errorhandler.OberonException;

import management.MemoryManager;
import management.ParamContainer;
import management.ProcedureManager;
import management.TypeDefinitionManager;

public class ProcedureCallNode implements StatementNode {
  private final String identifier;
  private final ParamNode params;
  
  public ProcedureCallNode( String identifier, ParamNode params )
  {
    this.identifier = identifier;
    this.params = params;
  }
  
  public void printNode( int depth )
  {
    for( int i = 0; i < depth; i++ )
    { // print the correct depth
      System.out.print( " " );
    }
  
    if( this.identifier != null )
    {
      System.out.print( this.identifier );
    }
  
    if( this.params != null )
    {
      System.out.print( "( " );
      params.printNode( 0 );
      System.out.print( " )" );
    }
  
    System.out.println( ";" );
  }
  
  public int eval( String scope ) throws OberonException
  {
    String newScope = this.identifier + "_" + scope;
    ProcedureDeclarationNode declaration = ProcedureManager.getProcedure( this.identifier );
    // build the parameter list
    Vector<ParamContainer> params = null;
    if( this.params != null )
    {
      params = this.params.getVarValueList( scope );
      // first parameter is the last in the vector list
    }
    
    if( declaration != null )
    {
      declaration.eval( newScope, params );
    }
  
    ProcedureManager.deleteScope( newScope );
    TypeDefinitionManager.deleteScope( newScope );
    MemoryManager.deallocateScope( newScope );
    return 0;
  }
}
