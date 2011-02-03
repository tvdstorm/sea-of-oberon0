package uva.oberon0.abstractsyntax.declarations;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.IDs;
import uva.oberon0.abstractsyntax.types.BaseType;

/**
 * @author Chiel Labee
 * This class represents a Variable Declaration Node that is passed by Reference.
*/
public class VarRef extends Var {

	public VarRef(ID id, BaseType type) 
	{
		super(id, type);
	}
	public VarRef(IDs id, BaseType type)
	{
		super(id, type);
	}
}
