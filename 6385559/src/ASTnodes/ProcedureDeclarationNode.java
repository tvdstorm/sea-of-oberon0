package ASTnodes;

import parseErrorLog.*;
import java.util.Vector;

import management.ParamContainer;
import management.ProcedureManager;

public class ProcedureDeclarationNode implements ASTnode {
  public ProcedureDeclarationNode( ProcedureHeadingNode heading, ProcedureBodyNode body )
  {
    this.heading = heading;
    this.body = body;
  
    String headerName = this.heading.getIdentifier( );
    String bodyName = this.body.getIdentifier( );
    if( !headerName.contentEquals( bodyName ) )
    { // make sure that the identifier in the header and the body are the same if not no execution because
      // removing the scope would be difficult
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
    ProcedureManager.addProcedure( this.heading.getIdentifier(), scope, this);
    return 0;
  }
  
  public void eval( String scope, Vector<ParamContainer> variables )
  {
    if( this.heading != null )
    {
      heading.eval( scope, variables );
    }
  
    if( this.body != null )
    {
      this.body.eval( scope );
    }
  }
  
  private ProcedureHeadingNode heading = null;
  private ProcedureBodyNode body = null;
}
