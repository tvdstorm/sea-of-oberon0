package systemcalls;

import java.util.Vector;

import ast.*;

import errorhandler.OberonException;

import management.ParamContainer;

public class WriteLn extends ProcedureDeclarationNode {
  public WriteLn( )
  {
    super( new ProcedureHeadingNode( "WriteLn", null ), new ProcedureBodyNode(null, null, "WriteLn" ) );
  }
  
  public void printNode()
  {
    System.out.println( "Systemcall" );
  }
  
  public void eval( Vector<ParamContainer> variables ) throws OberonException
  {
    System.out.println();
  } 
}
