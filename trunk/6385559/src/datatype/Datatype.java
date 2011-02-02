package datatype;

import errorhandler.OberonException;

public class Datatype
{ 
  public void set( int x ) throws OberonException
  {
    if( !(this instanceof IntegerType) )
    {
      this.throwException( "INTEGER" );
    }
    ((IntegerType)this).setInt( x );
  }
  
  public void set( boolean x ) throws OberonException
  {
    if( !(this instanceof BooleanType) )
    {
      this.throwException( "BOOLEAN" );
    }
    ((BooleanType)this).setBoolean( x );
  }
  
  public Object get()
  {
    return new Object();
  }
  
  private void throwException( String givenType ) throws OberonException
  {
    String currentType = null;
    if( this instanceof IntegerType )
    {
      currentType = "INTEGER";
    }
    else if( this instanceof BooleanType )
    {
      currentType = "BOOLEAN";
    }
    throw new OberonException( "Invalid type, " + currentType + " needed " + givenType + " given." );
  }
}
