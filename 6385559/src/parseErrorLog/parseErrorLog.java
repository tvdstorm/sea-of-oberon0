package parseErrorLog;

import java.util.ArrayList;

public class parseErrorLog {
  public static void addMessage( String Message )
  {
    log.add( Message );
  }
  
  public static int hasErrors()
  {
    return log.size();
  }
  
  public static void printMessages()
  { // print to System.err to make clear that they are errors
    System.err.println( "#" );
    System.err.println( "# Error log" );
    System.err.println( "# These errors have to be fixed before the code can be interpreted." );
    System.err.println( "#" );
    String buffer;
    for( int i = 0; i < log.size(); i++ )
    {
      System.err.print( "# " );
      buffer = "" + i;
      for( int j = buffer.length(); j < 5; j++ )
      {
        System.err.print( " " );
      }
      System.err.print( i + ": " );
      System.err.println( log.get( i ) );
    }
  }
  
  static ArrayList<String> log = new ArrayList<String>();
}