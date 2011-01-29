package ASTnodes;

import parseErrorLog.*;

public class ProcedureDeclarationNode implements ASTnode {
  public ProcedureDeclarationNode( ProcedureHeadingNode heading, ProcedureBodyNode body )
  {
	this.heading = heading;
	this.body = body;
	
	String headerName = this.heading.getIdentifier( );
	String bodyName = this.body.getIdentifier( );
	if( !headerName.contentEquals( bodyName ) )
	{
	  parseErrorLog.addMessage( "Procedure declarations for procedure " + headerName + " ended with " + bodyName );
	}
  }
	
  public void printNode(int depth) {
    if( this.heading != null )
    {
      this.heading.printNode( depth );
    }
    if( this.body != null )
    {
      this.body.printNode( depth );
    }
  }
  
  public int eval( String scope )
  {
    return 0;
  }
  
  private ProcedureHeadingNode heading = null;
  private ProcedureBodyNode body = null;
}
