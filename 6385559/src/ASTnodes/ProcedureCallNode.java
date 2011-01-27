package ASTnodes;

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
    return 0;
  }
  
  private String identifier = null;
  private ParamNode params = null;
}
