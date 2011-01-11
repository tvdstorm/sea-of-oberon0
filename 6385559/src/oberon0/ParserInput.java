package oberon0;
import java.io.File;
import java.util.Scanner;

/*
 * Validates the input given by the user to make
 * sure the source file does exist.
 */
public class ParserInput {
  /*
   * fetch input file
   */
  public String getInputFile( String[] args )
  {
    String filename = null;
    Scanner input = new Scanner( System.in );
    
    if( args.length != 0 )
    { // check for commandline file input
      filename = args[0];
    }
    
    while( filename == null || !this.file_exists( filename ) )
    { // as long as the filename is null and the file does not exist
      System.out.print( "Sourcefile: " );
      filename = input.nextLine();
    }
    
    return filename;
  }
  
  /*
   * Validates that the given file does exist in the file system
   */
  private boolean file_exists( String filename )
  {
    if( filename != null )
    { // if filename is null, file does not exist
      File f = new File( filename );
      return f.exists();
    }
    return false;
  }
};

