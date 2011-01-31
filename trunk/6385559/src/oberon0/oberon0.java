/*
 * 
 * TODO 
 * - Delete management.OberonSystemCalls from the project
 * - Delete oberon0.1.g grammar file from the project
 * - Create new classes for all operations
 * - memory datatypes change
 * - PrintNode moet ToString worden
 * - Rename ASTnodes to ast
 * 
 */
package oberon0;

import management.MemoryManager;
import management.ProcedureManager;
import management.TypeDefinitionManager;
import oberon0.ParserOutput;
import oberon0.ParserInput;
import parseErrorLog.*;
import ASTnodes.*;
import systemcalls.*;

public class oberon0 
{
  public static void main( String[] args ) 
  {
    CommandLineOptions CommandLine = new CommandLineOptions( args );
    ParserInput        pIn         = new ParserInput( );
    ParserOutput       Pout        = new ParserOutput( );
    ModuleNode         AST;
    
    // get the AST from the parser
    Pout.setFile( pIn.getInputFile( CommandLine.sourceFile() ) );
    AST = Pout.getAST( );
    
    if( parseErrorLog.hasErrors() > 0 )
    {
      parseErrorLog.printMessages();
    }
    else
    {
      try
      {
        // first add the system calls to the Procedurelist
        ProcedureManager.addProcedure( "Write", "System", new Write() );
        ProcedureManager.addProcedure( "WriteLn", "System", new WriteLn() );
        ProcedureManager.addProcedure( "Read", "System", new Read() );
        
        AST.eval( null ); // interpret the Abstract Syntax Tree
        
        if( CommandLine.doPrint( ) )
        { // if print request print the source to the screen
          AST.printNode( 0 );
        }
        
        if( CommandLine.doMemoryDump( ) )
        { // if memory dump request dump memory manager to the screen
          MemoryManager.print();
        }
        
        if( CommandLine.doPrintTypeDefinitions( ) )
        { // if type definitions dump requested dump the type definitions to the screen
          TypeDefinitionManager.printDefinitions();
        }
        
        if( CommandLine.doPrintProcedureDefinitions( ) )
        { // if the procedure dump requested dump the procedures to the screen
          ProcedureManager.printProcedures();
        }
      }
      catch( OberonException e )
      {
        parseErrorLog.addMessage( e.getMessage() );
        parseErrorLog.printMessages( );
      }
    }
    
    return;
  }

}
