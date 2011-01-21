package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OModule extends OASTNode
{
	private List<OBodyDeclaration> bodyDeclarations;
	private OASTNode body;
	
	public OModule(List<OBodyDeclaration> _bodyDeclarations, OASTNode _body)
	{
		assert(_body != null);
		assert(_bodyDeclarations != null);
		body = _body;
		bodyDeclarations = _bodyDeclarations;
	}
	public static OModule buildModule(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.MODULE);
		assert(tree.getChildCount() >= 1);
		assert(tree.getChild(0).getType() == Oberon0Parser.IDENT);
		OASTNode body = null;
		List<OBodyDeclaration> bodyDeclarations = new Vector<OBodyDeclaration>();
		for (int i=1;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
				case Oberon0Parser.BODY:
					body = OBlock.buildBlock(child);
					break;
				case Oberon0Parser.VAR:
				case Oberon0Parser.CONST:
				case Oberon0Parser.PROCEDURE:
					bodyDeclarations.add(OBodyDeclaration.buildBodyDeclaration(child));
					break;
				default:
					throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
			}
		}
		return new OModule(bodyDeclarations, body);
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		// Run all the body declarations
		for (OBodyDeclaration bd : bodyDeclarations)
		{
			bd.run(vars);
		}
		// TODO: rekening houden met body's die leeg (null) zijn, als dit mogelijk is
		// Run the body of the module
		return body.run(vars);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		body.accept(visitor);
		for (OBodyDeclaration bd : bodyDeclarations)
		{
			bd.accept(visitor);
		}
		visitor.visitAfter(this);
	}
}
