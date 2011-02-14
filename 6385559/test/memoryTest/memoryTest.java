package memoryTest;

import datatype.*;
import errorhandler.OberonException;

public class memoryTest
{
  public static void newScopeTest( Scope prev ) throws OberonException
  {
    Scope s = new Scope( prev );
    s.addValue( "c", new IntegerValue(10) );
    s.addValue( "d", new IntegerValue(11) );
    s.printMemory();
    Value v = new IntegerValue( 10 );
    s.setValue( "a", v );
    System.out.println( v.get().toString() );
    System.out.println("\n\n");
  }
  
  public static void main(String[] args)
  { 
    Scope s = new Scope( null );
    try
    {
      s.addValue( "a", new IntegerValue(5) );
      s.addValue( "b", new IntegerValue(1) );
      newScopeTest(s);
      Value v = s.getValue( "a" );
      if( v != null )
      {
        System.out.println( v.get().toString() );
      }
      s.printMemory();
    } catch( Exception e ){ System.err.println("Error: " + e.getMessage() ); }
  }
}
