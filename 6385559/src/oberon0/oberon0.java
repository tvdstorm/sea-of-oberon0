/*
 * 
 * TODO 
 * - memory datatypes change
 * - if elseif else -> create elseif node instead of transforming elseif into else if
 * - Java doc toevoegen aan code
 * - kijken of we de grammar kunnen herschrijven voor bijvoorbeeld operators naar het eind herschrijven
 * 
 * 
 */
package oberon0;

import ast.*;
import errorhandler.*;
import management.MemoryManager;
import management.ProcedureManager;
import management.TypeDefinitionManager;
import oberon0.ParserOutput;
import oberon0.ParserInput;
import systemcalls.*;

public class oberon0 
{
  public static void main( String[] args ) 
  {
    CommandLineOptions CommandLine = new CommandLineOptions( args );
    ParserInput pIn = new ParserInput( );
    ParserOutput Pout = new ParserOutput( );
    ModuleNode AST;
    
    // get the AST from the parser
    Pout.setFile( pIn.getInputFile( CommandLine.sourceFile() ) );
    AST = Pout.getAST( );
    
    if( Errorlog.hasErrors() > 0 )
    {
      Errorlog.printMessages();
    }
    else
    {
      try
      {
        // first add the system calls to the Procedurelist
        ProcedureManager.addProcedure( "Write", "System", new Write() );
        ProcedureManager.addProcedure( "WriteLn", "System", new WriteLn() );
        ProcedureManager.addProcedure( "Read", "System", new Read() );
        
        AST.eval( ); // interpret the Abstract Syntax Tree
        
        if( CommandLine.doPrint( ) )
        { // if print request print the source to the screen
          System.out.println( AST.toString( 0 ) );
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
        Errorlog.addMessage( e.getMessage() );
        Errorlog.printMessages( );
      }
    }
    
    return;
  }

}
