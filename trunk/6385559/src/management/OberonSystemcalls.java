package management;

import java.util.Vector;
import java.util.Scanner;

public class OberonSystemcalls {
  public static void doSystemCall( String systemcall, Vector<ParamContainer> params )
  {
    if( systemcall.contentEquals( "Read" ) )
    {
      read( params );
    }
    else if( systemcall.contentEquals( "Write" ) )
    {
      write( params, false );
    }
    else if( systemcall.contentEquals( "WriteLn" ) )
    {
      write( params, true );
    }
  }
  
  public static void read( Vector<ParamContainer> params )
  {
    Scanner x = new Scanner( System.in );
    ParamContainer inputTo = null;
    int intInput = 0;
    String checkType;
    for( int i = 0; i < params.size(); i++ )
    {
      inputTo = params.get( i );
      System.out.print( ": " );
      checkType = x.next();
      try
      { // check for integer input
        intInput = Integer.parseInt( checkType );
      } 
      catch( Exception e )
      { // if not set value to 0
        intInput = 0;
      }
      MemoryManager.set( inputTo.varname, intInput );
    }
  }
  
  public static void write( Vector<ParamContainer> params, boolean withNewline )
  {
    ParamContainer input = null;
    if( params != null )
    {
      for( int i = 0; i < params.size(); i++ )
      {
        input = params.get( i );
        System.out.print( input.value );
      }
    }
    if( withNewline )
    {
      System.out.println( );
    }
  }
}
