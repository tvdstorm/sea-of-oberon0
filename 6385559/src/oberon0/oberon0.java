package oberon0;
import oberon0.ParserOutput;
import interpreter.MemoryManager;
import interpreter.TypeDefinitionManager;
import oberon0.ParserInput;
import parseErrorLog.*;
import ASTnodes.*;

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
      AST.eval( null );
    	
      if( CommandLine.doPrint( ) )
      { // if printrequest print the sourcefile to the screen
    	AST.printNode( 0 );
      }
      
      if( CommandLine.doMemoryDump( ) )
      { // if memorydump request drump memorymanager to the screen
        MemoryManager.print();
      }
      
      if( CommandLine.doPrintTypeDefinitions( ) )
      {
        TypeDefinitionManager.printDefinitions();
      }
    }
    
    return;
  }

}
