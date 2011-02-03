package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.types.BaseType;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ScopeValueBase;

/**
 * @author Chiel Labee
 * This class represents a Variable Declaration that is passed by Reference.
*/
public class VarRef extends Var {

	public VarRef(ID id, BaseType type) 
	{
		super(id, type);
	}
	
	@Override
	public ScopeValueBase instantiate(Scope scope) {
		return scope.getValueReference(getID());
	}

}
