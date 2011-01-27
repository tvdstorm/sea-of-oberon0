package ASTnodes;

public interface ASTnode {
  public void printNode( int depth );
  public int eval( String Scope );
}
