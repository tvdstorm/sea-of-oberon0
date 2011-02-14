package memoryTest;

import datatype.Value;
import errorhandler.OberonException;

public class Scope 
{
  private MemoryManager currentMemory;
  private Scope previousScope;
  
  public Scope( Scope previous )
  {
    this.currentMemory = new MemoryManager();
    this.previousScope = previous;
  }
  
  public Value getValue( String name ) throws OberonException
  {
    Value v = this.currentMemory.get( name );
    if( v == null && this.previousScope != null )
    {
      v = this.previousScope.getValue( name );
    }
    
    if( v == null && this.previousScope == null )
    {
      throw new OberonException( "Variable not found in memory: " + name );
    }
    return v;
  }
  
  public void setValue( String name, Value v ) throws OberonException
  {
    if( !this.currentMemory.set( name, v ) )
    {
      if( this.previousScope != null )
      {
        this.previousScope.setValue( name, v );
      }
      else
      {
        throw new OberonException( "Variable not found: " + name );
      }
    }
  }
  
  public void addValue( String name, Value v ) throws OberonException
  {
    this.currentMemory.add( name, v );
  }
  
  public void printMemory()
  {
    this.currentMemory.printMemory();
    if( this.previousScope != null )
    {
      this.previousScope.printMemory();
    }
  }
}
