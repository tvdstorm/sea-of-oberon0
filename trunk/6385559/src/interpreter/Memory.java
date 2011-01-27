package interpreter;
import java.util.Vector;

/*
 * 
 * The memory will be implemented as a static Vector
 * to allow any node to ask questions to the same 
 * memory
 * 
 */

public class Memory {
  
  public static int put( Integer input )
  {
	mem.add( input );
    return mem.size()-1;
  }
  
  public static Integer get( int location )
  {
    if( location >= mem.size() )
      return 0;
    else
      return mem.get( location );
  }
  
  public static void set( int location, int value )
  {
	mem.set( location, value );
  }
  
  public static void remove( Integer location )
  {
	if( location != mem.size()-1 )
	{
      System.out.print( "only the last element can be removed from the memory." );
	  return;
	}
	mem.removeElementAt( location );
  }
  
  public static void print()
  {
	for( int i = 0; i < mem.size(); i++ )
	{
      System.out.println( "Location " + i + ": " + get( i ) );
	}
  }
	
  private static Vector<Integer> mem = new Vector<Integer>();
}
