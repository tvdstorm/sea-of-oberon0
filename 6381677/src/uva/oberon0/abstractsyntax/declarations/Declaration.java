package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.abstractsyntax.types.IIdentifiable;


/**
 * @author Chiel Labee
 * This class represents a Declaration.
 * This class is abstract.
*/
public abstract class Declaration implements IIdentifiable
{
	private final ID _id;
	
	protected Declaration(ID id) 
	{
		_id = id;
	}
	
	@Override
	public ID getID()
	{
		return _id;
	}
}
