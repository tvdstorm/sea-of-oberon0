package ASTnodes;

public class AssignmentNode implements StatementNode {
  public AssignmentNode( String ident, ExpressionNode expression )
  {
	this.ident = ident;
	this.expression = expression;
  }
  
  private String ident = null;
  private ExpressionNode expression = null;
}
