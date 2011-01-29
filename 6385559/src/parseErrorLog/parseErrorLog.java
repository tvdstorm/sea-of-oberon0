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
  {
    System.out.println( "#" );
    System.out.println( "# Error log" );
    System.out.println( "# These errors have to be fixed before the code can be interpreted." );
    System.out.println( "#" );
    String buffer;
	for( int i = 0; i < log.size(); i++ )
	{
	  System.out.print( "# " );
	  buffer = "" + i;
	  for( int j = buffer.length(); j < 5; j++ )
	    System.out.print( " " );
	  System.out.print( i + ": " );
	  System.out.println( log.get( i ) );
	}
  }
  
  static ArrayList<String> log = new ArrayList<String>();
}