package uva.oberon0.abstractsyntax.types;

import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.values.Value;

public class IDType extends BaseType {
	private final ID _id;
	
	public IDType(String id)
	{
		assert id != null : "No Identifier is available for the current ID Type!";
		
		_id = new ID(id);
	}
	
	@Override
	public Value instantiate(Scope scope) {
		return ((BaseType)scope.getBindable(_id)).instantiate(scope);
	}
}
