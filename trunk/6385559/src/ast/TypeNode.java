package ast;
import errorhandler.OberonException;

public class TypeNode implements ASTnode 
{
  private final String ident;
  
  public TypeNode( String ident )
  {
    this.ident = ident;
  }
  
  public String toString( int depth ) 
  {
    if( this.ident != null )
    {
      return this.ident;
    }
    return "";
  }
  
  public int eval( ) throws OberonException
  { // eval not needed because this will only contain an identifier name
    return 0;
  }
  
  public String getIdentName( )
  {
    return this.ident;
  }
}
