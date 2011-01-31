package systemcalls;

import java.util.Vector;

import management.ParamContainer;
import parseErrorLog.OberonException;
import ASTnodes.*;

public class WriteLn extends ProcedureDeclarationNode {
  public WriteLn( )
  {
    super( new ProcedureHeadingNode( "WriteLn", null ), new ProcedureBodyNode(null, null, "WriteLn" ) );
  }
  
  public void printNode()
  {
    System.out.println( "Systemcall" );
  }
  
  public void eval( String scope, Vector<ParamContainer> variables ) throws OberonException
  {
    System.out.println();
  } 
}
