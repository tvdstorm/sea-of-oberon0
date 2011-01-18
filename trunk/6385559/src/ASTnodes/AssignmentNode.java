package ASTnodes;

public class AssignmentNode implements StatementNode {
  public AssignmentNode( String ident, String expression )
  {
	this.ident = ident;
	
  }
  
  private String ident = null;
}
