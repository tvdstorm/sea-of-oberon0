package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.generated.Oberon0Parser;

public abstract class OBodyDeclaration extends OASTNode
{
	public static OBodyDeclaration buildBodyDeclaration(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.VAR:
				return OVarDeclaration.buildVarDeclaration(tree);
			case Oberon0Parser.CONST:
				return OConstDeclaration.buildConstDeclaration(tree);
			case Oberon0Parser.PROCEDURE:
				return OProcedureDeclaration.buildProcedureDeclaration(tree);
			default:
				throw new Oberon0Exception("Unknown expression '" + tree.getType() + "'."); 
		}
	}
}
