package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.statements.StatementList;
import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee This class represents a Procedure Structure.
 */
public class Procedure extends Declaration {
	private final VariableList _parameterList;
	private final DeclarationList _declarationList;
	private final StatementList _statementList;

	public Procedure(ID id, VariableList parameterList,
			DeclarationList declarationList, StatementList statementList) {
		super(id);

		assert parameterList != null : "No Parameters are available for the current Procedure!";
		assert declarationList != null : "No Declarations are available for the current Procedure!";
		assert statementList != null : "No Statements are available for the current Procedure!";

		_parameterList = parameterList;
		_declarationList = declarationList;
		_statementList = statementList;
	}

	/**
	 * Gets the number of formal Parameters.
	 */
	public int getParameterCount() {
		return _parameterList.size();
	}

	/**
	 * Gets a specific formal Parameter based on the index number value.
	 */
	public Declaration getParameter(int index) {
		return _parameterList.get(index);
	}

	public DeclarationList getDeclarations() {
		return _declarationList;
	}

	public int eval(Scope scope) {
		return _statementList.eval(scope);
	}
}
