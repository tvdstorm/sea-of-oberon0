package interpreter;
import java.util.Vector;
import ASTnodes.*;

public class TypeDefinitionManager {
  public static void addTypeDefinition( String name, ASTnode x, String scope )
  {
    DefinitionContainer addition = new DefinitionContainer( name, x, scope );
    definitions.add( addition );
  }
  
  public static ASTnode getTypeDefinition( String name )
  {
	DefinitionContainer container = null;
	ASTnode returnASTnode = null;
    for( int i = 0; i < definitions.size(); i++ )
    {
      container = definitions.get( i );
      if( container.getName().contentEquals( name ) )
      {
        returnASTnode = container.getDefinition();
      }
    }
    return returnASTnode;
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
      astContainer.printNode( 0 );
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
	
  private static Vector<DefinitionContainer> definitions = new Vector<DefinitionContainer>(0);
  
}
