package oberon0;

/*
 * This class read the commandline options given and can be questioned what to do
 * 
 * 
 */
public class CommandLineOptions {
  public CommandLineOptions( String[] args )
  { 
    int numberOfParams = args.length;
    
    // -print print the source back to the screen
    // -memory memory dump will be done after the execution of the source file
    for( int i = 0; i < numberOfParams; i++ )
    {
      if( args[i].contentEquals( "-print" ) )
      {
    	this.print = true;
      }
      else if( args[i].contentEquals( "-memory" ) )
      {
    	this.memoryDump = true;
      }
      else
      {
        this.sourcefile = args[i];
      }
    }
  }
  
  public boolean doPrint()
  {
    return this.print;
  }
  
  public boolean doMemoryDump()
  {
    return this.memoryDump;
  }
  
  public String sourceFile()
  {
    return this.sourcefile;
  }
	
  private boolean print = false;
  private boolean memoryDump = false;
  private String sourcefile = "";
}
