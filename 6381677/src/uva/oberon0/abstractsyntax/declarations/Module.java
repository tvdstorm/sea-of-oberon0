package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.statements.StatementList;
import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee This class represents the primairy Module Structure.
 */
public class Module {
	private final ID _id;
	private final DeclarationList _declarations;
	private final StatementList _statements;

	public Module(ID id, DeclarationList declarations, StatementList statements) {
		assert id != null : "No Identifier is available for the current Module!";
		assert declarations != null : "No Declarations are available for the current Module!";
		assert statements != null : "No Statements are available for the current Module!";

		_id = id;
		_declarations = declarations;
		_statements = statements;
	}

	/**
	 * Creates a new Execution Scope for this Module.
	 */
	public Scope createScope() {
		return new Scope(_declarations, null);
	}

	/**
	 * Performs interpreter evaluation for the current Module structure. Creates
	 * a new Execution Scope for this Module.
	 */
	public int eval() {
		return eval(createScope());
	}

	/**
	 * Performs interpreter evaluation for the current Module structure.
	 */
	public int eval(Scope scope) {
		if (!checkTypes(scope)) {
			return 0;
		}
		
		return _statements.eval(scope);
	}
	
	public boolean checkTypes()
	{
		return checkTypes(createScope());
	}
	public boolean checkTypes(Scope scope)
	{
		return _statements.checkTypes(scope);
	}
	
	public ID getID() {
		return _id;
	}
}
