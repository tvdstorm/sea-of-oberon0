package randy.ast;

public interface OASTNodeVisitor
{
	public void visitBefore(OASTNode astNode);
	public void visit(OASTNode astNode);
	public void visitAfter(OASTNode astNode);
}
