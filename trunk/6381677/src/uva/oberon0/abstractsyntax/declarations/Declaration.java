package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.BaseNodeWithID;
import uva.oberon0.abstractsyntax.types.ID;


/**
 * @author Chiel Labee
 * This class represents a Declaration.
 * This class is abstract.
*/
public abstract class Declaration extends BaseNodeWithID
{
	protected Declaration(ID id) 
	{
		super(id);
	}
}
