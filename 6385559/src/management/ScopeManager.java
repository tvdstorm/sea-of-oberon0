package management;
import java.util.Vector;
import errorhandler.OberonException;

public class ScopeManager {
  public static void setScope( String scopename )
  {
    scope.add( scopename );
  }
  
  public static String currentScope( )
  {
    return scope.get( scope.size()-1 );
  }
  
  public static void removeLastScope() throws OberonException
  {
    ProcedureManager.deleteScope( scope.get( scope.size( )-1 ) );
    TypeDefinitionManager.deleteScope( scope.get( scope.size( )-1 ) );
    MemoryManager.deallocateScope( scope.get( scope.size( )-1 ) );
    scope.removeElementAt( scope.size()-1 );
  }
  
  public static Vector<String> scope = new Vector<String>(0);
}

