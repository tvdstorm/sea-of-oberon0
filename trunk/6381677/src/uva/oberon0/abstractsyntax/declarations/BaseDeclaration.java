package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.BaseNodeWithID;
import uva.oberon0.abstractsyntax.ID;


/**
 * @author Chiel Labee
 * This class represents a Declaration Node.
 * This class is abstract.
*/
public abstract class BaseDeclaration extends BaseNodeWithID
{
	protected BaseDeclaration(ID id) 
	{
		super(id);
	}
}
