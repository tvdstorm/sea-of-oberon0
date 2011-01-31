package management;

import ASTnodes.*;
import java.util.Vector;
import parseErrorLog.OberonException;

public class ProcedureManager {
  public static void addProcedure( String name, String scope, ProcedureDeclarationNode proc ) throws OberonException
  {
    if( !procedureDoesNotExistInScope( name, scope ) )
    { // if not exist add the procedure to the scope
      procedures.add( new ProcedureContainer( name, scope, proc ) );
    }
    else
    {
      throw new OberonException( "You cannot redeclare procedure: " + name + " in scope: " + scope );
    }
  }
  
  public static ProcedureDeclarationNode getProcedure( String name ) throws OberonException
  {
    ProcedureContainer container = null;
    for( int i = procedures.size( )-1; i >= 0; i-- )
    {
      container = procedures.get( i );
      if( container.getName().contentEquals( name ) )
      {
        return container.getProcedure();
      }
    }
    throw new OberonException( "The called procedure: " + name + " does not exist" );
  }
  
  public static void deleteScope( String scope )
  {
    ProcedureContainer container = null;
    for( int i = procedures.size( )-1; i >= 0; i-- )
    {
      container = procedures.get( i );
      if( container.getScope().contentEquals( scope ) )
      {
        procedures.removeElementAt( i );
      }
    }
  }
  
  public static void printProcedures( )
  {
    ProcedureContainer container = null;
    System.out.println( "" );
    System.out.println( "" );
    System.out.println( "#" );
    System.out.println( "# Procedure definitions" );
    System.out.print( "#" );
    for( int i = 0; i < procedures.size(); i++ )
    {
      container = procedures.get( i );
      System.out.println( "Procedure: " + container.getName() + "\tScope: " + container.getScope() );
      container.getProcedure().printNode( 0 );
    }
  }
  
  private static boolean procedureDoesNotExistInScope( String name, String scope )
  {
    ProcedureContainer container = null;
    for( int i = 0; i < procedures.size(); i++ )
    {
      container = procedures.get( i );
      if( container.getName( ).contentEquals( name ) && container.getScope( ).contentEquals( scope ) )
      {
        return true;
      }
    }
    return false;
  }

  private static Vector<ProcedureContainer> procedures = new Vector<ProcedureContainer>(0);
  
  private static class ProcedureContainer
  {
    public ProcedureContainer( String name, String scope, ProcedureDeclarationNode proc )
    {
      this.name = name;
      this.scope = scope;
      this.proc = proc;
    }
    
    public String getName( )
    {
      return this.name;
    }
  
    public String getScope( )
    {
      return this.scope;
    }
  
    public ProcedureDeclarationNode getProcedure( )
    {
      return this.proc;
    }
    private String name = null;
    private String scope = null;
    private ProcedureDeclarationNode proc = null;
  }
}
