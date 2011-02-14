package memoryTest;

import datatype.*;
import ast.*;

public class memoryTest
{
  
  public static void main(String[] args)
  { 
    MemoryManager manager = new MemoryManager();
    try
    {
      Value x = new IntegerValue(); x.set( 5 );
      manager.add( "a", x );
      x = new IntegerValue(); x.set( 9 );
      manager.add( "b", x );
      x = new IntegerValue(); x.set( 1 );
      manager.add( "c", x );
      x = new IntegerValue(); x.set( -10 );
      manager.add( "d", x );
      
      manager.printMemory();
      
      x = new IntegerValue(); x.set( 59 );
      manager.set( "a", x );
      
      manager.printMemory();
      
    } catch( Exception e ){ System.err.println(e.getMessage()); }
  }
}
