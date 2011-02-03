package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.abstractsyntax.types.BaseType;

/**
 * @author Chiel Labee
 * This class represents a Variable Declaration that is passed by Reference.
*/
public class VariableByRef extends Variable {

	public VariableByRef(ID id, BaseType type) 
	{
		super(id, type);
	}
	
}
