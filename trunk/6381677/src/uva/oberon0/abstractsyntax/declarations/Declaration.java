package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.types.ID;

/**
 * @author Chiel Labee This class represents a Declaration. This class is
 *         abstract.
 */
public abstract class Declaration {
	private final ID _id;

	protected Declaration(ID id) {
		_id = id;
	}

	public ID getID() {
		return _id;
	}
}
