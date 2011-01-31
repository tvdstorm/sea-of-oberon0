package systemcalls;

import java.util.Vector;

import management.ParamContainer;
import parseErrorLog.OberonException;
import ASTnodes.*;

public class Write extends ProcedureDeclarationNode {
  public Write( )
  {
    super( new ProcedureHeadingNode( "Write", null ), new ProcedureBodyNode(null, null, "Write" ) );
  }
  
  public void printNode()
  {
    System.out.println( "Systemcall" );
  }
  
  public void eval( String scope, Vector<ParamContainer> variables ) throws OberonException
  {
    ParamContainer container = null;
    for( int i = variables.size()-1; i >= 0; i -- )
    {
      container = variables.get( i );
      System.out.print( container.value );
    }
  } 
}
