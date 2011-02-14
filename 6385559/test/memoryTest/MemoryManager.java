package memoryTest;

import java.util.HashMap;
import java.util.Map;
import datatype.Value;
import errorhandler.OberonException;


public class MemoryManager
{
  private Map<String, Value> mem;
  
  public MemoryManager()
  {
    this.mem = new HashMap<String, Value>(0);
  }
  
  public void add( String key, Value value ) throws OberonException
  {
    if( mem.containsKey( key ) )
    {
      throw new OberonException( "Redeclaration of the variable: " + key );
    }
    mem.put(key, value);
  }
  
  public boolean set( String key, Value value )
  {
    if( mem.containsKey( key ) )
    {
      mem.put( key, value );
      return true;
    }
    return false;
  }
  
  public Value get( String key )
  {
    if( this.mem.containsKey(key) )
    {
      return this.mem.get( key );
    }
    return null;
  }
  
  public void printMemory()
  {
    Object[] k = this.mem.keySet().toArray();
    String currentKey;
    for( int i = 0; i < k.length; i++ )
    {
      currentKey = k[i].toString();
      System.out.println( currentKey +": " + this.mem.get(currentKey).get().toString());
    }
  }
}