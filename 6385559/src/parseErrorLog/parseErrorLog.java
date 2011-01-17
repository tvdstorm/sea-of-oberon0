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
	for( int i = 0; i < log.size(); i++ )
	{
	  System.out.println( log.get( i ) );
	}
  }
  
  static ArrayList<String> log = new ArrayList<String>();
}