package randy.ast;

import randy.exception.Oberon0Exception;

public interface OASTNodeVisitor
{
	public void visitBefore(OASTNode astNode) throws Oberon0Exception;
	public void visit(OASTNode astNode) throws Oberon0Exception;
	public void visitAfter(OASTNode astNode) throws Oberon0Exception;
}
