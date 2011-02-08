package ast;

import java.util.Vector;

import errorhandler.*;

import management.ParamContainer;
import management.ProcedureManager;
import management.ScopeManager;

public class ProcedureDeclarationNode implements ASTnode 
{
  private final ProcedureHeadingNode heading;
  private final ProcedureBodyNode body;
  
  public ProcedureDeclarationNode( ProcedureHeadingNode heading, ProcedureBodyNode body )
  {
    this.heading = heading;
    this.body = body;
  
    if( this.heading == null || this.body == null )
    {
      errorhandler.Errorlog.addMessage( "Invalid procedure declaration found." );
      return;
    }
    String headerName = this.heading.getIdentifier( );
    String bodyName = this.body.getIdentifier( );
    if( !headerName.contentEquals( bodyName ) )
    { // make sure that the identifier in the header and the body are the same if not no execution because
      // removing the scope would be difficult
      Errorlog.addMessage( "Procedure declarations for procedure " + headerName + " ended with " + bodyName );
    }
  }
  
  public String toString( int depth ) 
  {
    String code = "";
    if( this.heading != null )
    {
      code += this.heading.toString( depth );
    }
    if( this.body != null )
    {
      code += this.body.toString( depth );
    }
    return code;
  }
  
  public int eval( ) throws OberonException
  {
    ProcedureManager.addProcedure( this.heading.getIdentifier(), ScopeManager.currentScope( ), this);
    return 0;
  }
  
  public void eval( Vector<ParamContainer> variables ) throws OberonException
  {
    if( this.heading != null )
    {
      heading.eval( variables );
    }
  
    if( this.body != null )
    {
      this.body.eval( );
    }
  }
}
