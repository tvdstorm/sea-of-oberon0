package management;
import java.util.Vector;

import ast.*;

import errorhandler.OberonException;

public class TypeDefinitionManager {
  public static void addTypeDefinition( String name, ASTnode x, String scope ) throws OberonException
  {
    if( !typeExists( name, scope ) )
    {
      DefinitionContainer addition = new DefinitionContainer( name, x, scope );
      definitions.add( addition );
    }
    else
    {
      throw new OberonException( "Type " + name + " has already been defined in the current scope." );
    }
  }
  
  public static ASTnode getTypeDefinition( String name ) throws OberonException
  {
    DefinitionContainer container = null;
    for( int i = 0; i < definitions.size(); i++ )
    {
      container = definitions.get( i );
      if( container.getName().contentEquals( name ) )
      {
        return container.getDefinition();
      }
    }
    if( !( name.contentEquals( "INTEGER" ) || name.contentEquals( "BOOLEAN" ) ) )
    {
      throw new OberonException( "Type definition: " + name + " does not exist." );
    }
    return null;
  }
  
  public static void printDefinitions()
  {
    DefinitionContainer container = null;
    ASTnode astContainer = null;
    
    System.out.println( "" );
    System.out.println( "" );
    System.out.println( "#" );
    System.out.println( "# Type definitions" );
    System.out.print( "#" );
    for( int i = 0; i < definitions.size(); i++ )
    {
      container = definitions.get( i );
      astContainer = container.getDefinition();
      System.out.println( "\nType: " + container.getName() + "\tScope: " + container.getScope() );
      System.out.println( astContainer.toString( 0 ) );
    }
  }

  public static void deleteScope( String scope )
  {
    DefinitionContainer container = null;
    for( int i = definitions.size()-1; i >= 0; i-- )
    {
      container = definitions.get( i );
      if( container.getScope().contentEquals( scope ) )
      {
        definitions.removeElementAt( i );
      }
    }
  }
  
  private static boolean typeExists( String name, String Scope )
  {
    DefinitionContainer container = null;
    for( int i = definitions.size()-1; i >= 0; i-- )
    {
      container = definitions.get( i );
      if( container.getName( ).contentEquals( name ) && container.getScope( ).contentEquals( Scope ) )
      {
        return true;
      }
    }
    return false;
  }
  
  private static class DefinitionContainer
  {
    public DefinitionContainer( String name, ASTnode definition, String scope )
    {
      this.name = name;
      this.definition = definition;
      this.scope = scope;
    }
    
    public String getName( )
    {
      return this.name;
    }
    
    public ASTnode getDefinition( )
    {
      return this.definition;
    }
    
    public String getScope()
    {
      return this.scope;
    }
    
    private String name = null;
    private ASTnode definition = null;
    private String scope = null;
  }
  
  public static ASTnode correctType( ASTnode type ) throws OberonException
  {
    String identName = "";
    while( type != null && type instanceof TypeNode && !identName.contentEquals( "INTEGER" ) && !identName.contentEquals( "BOOLEAN" ) )
    {
      identName = ((TypeNode) type ).getIdentName();
      if( !identName.contentEquals( "INTEGER" ) && !identName.contentEquals( "BOOLEAN" ) )
      {
        type = TypeDefinitionManager.getTypeDefinition( identName );
      }
    }
    return type;
  }
  
  private static Vector<DefinitionContainer> definitions = new Vector<DefinitionContainer>(0); 
}
