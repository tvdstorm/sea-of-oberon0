package AbstractSyntax.Declarations;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author Chiel Labee
 * This class represents a Variable Declaration Node that is passed by Reference.
*/
public class VarRef extends Var {

	public VarRef(CommonTree parserTree) 
	{
		super(parserTree);
	}

}
