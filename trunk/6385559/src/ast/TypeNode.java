package ast;
import errorhandler.OberonException;

public class TypeNode implements ASTnode {
  private final String ident;
  
  public TypeNode( String ident )
  {
    this.ident = ident;
  }
  
  public void printNode(int depth) {
    if( this.ident != null )
    {
      System.out.print( this.ident );
    }
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
