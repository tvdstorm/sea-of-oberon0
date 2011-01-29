package ASTnodes;

import interpreter.ProcedureManager;
import interpreter.TypeDefinitionManager;
import interpreter.MemoryManager;
import java.util.Vector;
import interpreter.ParamContainer;
import interpreter.system;

public class ProcedureCallNode implements StatementNode {
  public ProcedureCallNode( String identifier, ParamNode params )
  {
	this.identifier = identifier;
	this.params = params;
  }
  
  public void printNode( int depth )
  {
	for( int i = 0; i < depth; i++ )
	  System.out.print( " " );
	if( this.identifier != null )
	  System.out.print( this.identifier );
	
	if( this.params != null )
	{
	  System.out.print( "( " );
	  params.printNode( 0 );
	  System.out.print( " )" );
	}
	System.out.println( ";" );
  }
  
  public int eval( String scope )
  {
	String newScope = this.identifier + "_" + scope;
	ProcedureDeclarationNode declaration = ProcedureManager.getProcedure( this.identifier );
	// build the param list
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
	else
	{ // not an declaration done by yourself... check for system declarations
      system.doSystemCall( this.identifier, params );
	}
	
	ProcedureManager.deleteScope( newScope );
	TypeDefinitionManager.deleteScope( newScope );
	MemoryManager.deallocateScope( newScope );
    return 0;
  }
  
  private String identifier = null;
  private ParamNode params = null;
}
