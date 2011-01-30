package management;
import java.util.Vector;

/*
 * The memory manager has a list of variables that belong to a certain scope
 * and have a certain location in the memory 
 */

public class MemoryManager {
  public static void allocate( String varName, String scope, int value, String refName, boolean isConst )
  {
    // Check wheter var does not already exist in the scope
    int oldLocation = getLocationOf( varName, scope );
  
    if( oldLocation == -1 )
    {
      int location;
        if( refName != null )
        { // call by ref dus location moet niet zijn waar je hem put maar waar de oude staat
          String previousScope = previousScope( scope );
          // next get the location of the var location in previousScope
          location = getLocationOf( refName, previousScope );
        }
        else
        {
          location = Memory.put( value );
        }
      list.add( new MemoryMap( varName, scope, location, refName, isConst ) );
    }
  }
  
  public static int get( String varName )
  {
    int location = varLocation( varName );
    if( location != -1 )
    {
      MemoryMap varcontainer = list.get( location );
      while( varcontainer.isRef )
        {
          location = varcontainer.location;
          varcontainer = list.get( location );
        }
        return Memory.get( varcontainer.location );
    }
    return 0;
  }
  
  public static int getFromOtherScope( String varName, String scope )
  {
    int location = getLocationNotInScope( varName, scope );
    if( location != -1 )
    {
      MemoryMap varcontainer = list.get( location );
      while( varcontainer.isRef )
      {
        location = varcontainer.location;
        varcontainer = list.get( location );
      }
      return Memory.get( varcontainer.location );
    }
    return 0;
  }
 
  public static void set( String varName, int value )
  {
    int location = varLocation( varName );
    boolean isWriteable = isWriteable( varName );
    if( location != -1 && isWriteable )
    {
      MemoryMap var = list.get( location );
      while( var.isRef )
      {
        location = var.location;
        var = list.get( location );
      }
      Memory.set( var.location, value );
    }
  }
  
  public static void deallocateScope( String scope )
  {
    MemoryMap var = null;
    for( int i = list.size()-1; i >= 0; i-- )
    {
      var = list.get( i );
      if( var.scope.contentEquals( scope ) )
      {
        if( var.isRef == false )
        { // if reference node do not deallocate the memory
          Memory.remove( var.location );
        }
        list.removeElementAt( i );
      }
    }
  }
  
  public static void print()
  {
    System.out.println( "\n\n#\n" +
      "#\tMemoryManager dump\n" +
      "#\n" +
      "Varname:       Scope:              Location:   Is reference:    Read as:   Value:\n" );
    MemoryMap printBuffer = null;
    for( int i = 0; i < list.size(); i++ )
    {
      printBuffer = list.get( i );
      printBuffer.print();
    }
  }
  
  private static boolean isWriteable( String varName )
  {
    MemoryMap varContainer = null;
    boolean isWriteable = true;
    for( int i = list.size()-1; i >= 0; i-- )
    {
      varContainer = list.get( i );
      if( varContainer.varName.contentEquals( varName ) )
      {
        isWriteable = !varContainer.readOnly;
        break;
      }
    }
    return isWriteable;
  }
  
  private static int varLocation( String varName )
  {
    MemoryMap varContainer = null;
    int location = -1;
    for( int i = list.size()-1; i >= 0; i-- )
    {
      varContainer = list.get( i );
      if( varContainer.varName.contentEquals( varName ) )
      {
        location = i;
        break;
      }
    }
    return location;
  }
  
  private static int getLocationNotInScope( String varName, String scope )
  {
    MemoryMap var;
    int location = -1;
    for( int i = list.size()-1; i >= 0; i-- )
    {
      var = list.get( i );
      if( var.varName.contentEquals( varName ) && !var.scope.contentEquals( scope ) )
      {
        location = i;
        break;
      }
    }
    return location;
  }
  
  private static int getLocationOf( String varName, String scope )
  {
    MemoryMap var;
    int location = -1;
    for( int i = list.size()-1; i >= 0; i-- )
    {
      var = list.get( i );
      if( var.varName.contentEquals( varName ) && var.scope.contentEquals( scope ) )
      {
        location = i;
        break;
      }
    }
    return location;
  }
  
  private static String previousScope( final String currentScope )
  {
    String previousScope = "";
    MemoryMap var;
    for( int i = list.size()-1; i >= 0; i-- )
    {
      var = list.get( i );
      if( !var.scope.contentEquals( currentScope ) )
      {
        previousScope = var.scope;
        break;
      }
    }
    
    return previousScope;
  }
  
  private static Vector<MemoryMap> list = new Vector<MemoryMap>();
  
  private static class MemoryMap
  {
    public MemoryMap( String varName, String scope, int location, String refName, boolean readOnly )
    {
      this.varName = varName;
      this.scope = scope;
      this.location = location;
      this.isRef = ( refName != null ) ? true : false;
      this.readOnly = readOnly;
    }
    
    public void print()
    {
      this.printXWide( this.varName, 15 );
      this.printXWide( this.scope, 20 );
      this.printXWide( "" + this.location, 12 );
      this.printXWide( (this.isRef) ? "Yes" : "No", 17 );
      this.printXWide( (this.readOnly) ? "Const" : "Var", 11 );
      this.printXWide( "" + get( this.varName ), 20);
      System.out.println();
    }
    
    private void printXWide( String value, int X )
    {
      int length = value.length();
      System.out.print( value );
      for( int i = 0; i < X-length; i++ )
      {
        System.out.print( " " );
      }
    }
  
    public String varName;
    public String scope;
    public int location;
    public boolean isRef;
    public boolean readOnly;
  }
}