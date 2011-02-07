package memoryTest;

import java.util.Vector;
import datatype.*;
import ast.*;

public class memoryTest
{
  public static void main(String[] args)
  {
    try
    {
      Datatype x = new IntegerType();
      x.set( 4 );
      Datatype y = new IntegerType();
      y.set( 6 );
      Datatype z = x.gt( y );
      System.out.println( z.get().toString() );
    }
    catch( Exception e )
    {
      System.out.println( "Datatype exception found: " + e.getMessage() );
    }
    
  }

}
