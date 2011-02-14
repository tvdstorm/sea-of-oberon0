package memoryTest;

import java.util.ArrayList;
import java.util.List;

import datatype.BooleanValue;
import datatype.IntegerValue;
import datatype.Value;
import errorhandler.OberonException;

public class MemoryManager
{
  public MemoryManager()
  {
    this.mem = new Memory();
    this.nameToLocation = new ArrayList<Map>(0);
  }
  
  public void add( String name, Value value )
  {
    Map loc = new Map( name, this.mem.add( value ) );
    this.nameToLocation.add( loc );
  }
  
  public Value get( String name )
  {
    return this.mem.get( this.findLocation( name ) );
  }
  
  public void set( String name, Value value ) throws OberonException
  {
    this.mem.set( this.findLocation( name ), value );
  }
  
  public void printMemory()
  {
    Map container;
    Value toPrint;
    for( int i = 0; i < this.nameToLocation.size(); i++ )
    {
      container = this.nameToLocation.get( i );
      toPrint = this.mem.get( container.location );
      System.out.println( container.name + ": " + toPrint.get().toString() );
    }
  }
  
  private int findLocation( String name )
  {
    Map container = null;
    for( int i = 0; i < this.nameToLocation.size(); i++ )
    {
      container = this.nameToLocation.get( i );
      if( container.name.contentEquals( name ) )
      {
        return container.location;
      }
    }
    return -1;
  }
  
  private List<Map> nameToLocation;
  private Memory mem;
  
  private class Map
  {
    public Map( String name, int location )
    {
      this.name = name;
      this.location = location;
    }
    
    public final String name;
    public final int location;
  }
  private class Memory
  {
    public Memory()
    {
      this.mem = new ArrayList<Value>(0); 
    }
    
    public Value get( int location )
    {
      if( location >= 0 )
      {
        return this.mem.get( location );
      }
      return null;
    }
    
    public int add( Value value )
    {
      mem.add( value );
      return mem.size()-1;
    }
    
    public boolean set( int location, Value value ) throws OberonException
    {
      if( location >= 0 )
      {
        Value toSet = mem.get( location );
        if( value instanceof IntegerValue )
        {
          toSet.set( (Integer)value.get() );
        }
        else
        {
          toSet.set( (Boolean)value.get() );
        }
        return true;
      }
      return false;
    }
    
    public int getSize()
    {
      return mem.size();
    }
    
    private List<Value> mem;
  }
}
