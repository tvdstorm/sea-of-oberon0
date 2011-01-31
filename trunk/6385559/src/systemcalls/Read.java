package systemcalls;

import java.util.Scanner;
import java.util.Vector;

import errorhandler.OberonException;

import management.MemoryManager;
import management.ParamContainer;
import ASTnodes.*;

public class Read extends ProcedureDeclarationNode {
  public Read( )
  {
    super( new ProcedureHeadingNode( "Read", null ), new ProcedureBodyNode(null, null, "Read" ) );
  }
  
  public void printNode()
  {
    System.out.println( "Systemcall" );
  }
  
  public void eval( String scope, Vector<ParamContainer> variables ) throws OberonException
  {
    Scanner x = new Scanner( System.in );
    ParamContainer inputTo = null;
    int intInput = 0;
    String checkType;
    for( int i = 0; i < variables.size(); i++ )
    {
      inputTo = variables.get( i );
      System.out.print( ": " );
      checkType = x.next();
      try
      { // check for integer input
        intInput = Integer.parseInt( checkType );
      } 
      catch( Exception e )
      { // if not set value to 0
        intInput = 0;
      }
      MemoryManager.set( inputTo.varname, intInput );
    }
  } 
}
