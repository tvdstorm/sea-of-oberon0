package interpreter;

import java.util.Vector;
import java.util.Scanner;

public class system {
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
    ParamContainer input = null;
    int intInput = 0;
    for( int i = 0; i < params.size(); i++ )
    {
      input = params.get( i );
      intInput = x.nextInt();
      MemoryManager.set( input.varname, intInput );
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
