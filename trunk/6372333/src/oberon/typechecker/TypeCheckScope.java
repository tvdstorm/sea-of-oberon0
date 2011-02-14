package oberon.typechecker;

import java.util.*;

import oberon.IDataType;
import oberon.IProcedure;

/**
 * The Class TypeCheckScope.
 */
public class TypeCheckScope {
	
	/** The variables. */
	private final Map<String, IDataType> variables = new HashMap<String, IDataType>();
	
	/** The procedures. */
	private final Map<String, IProcedure> procedures = new HashMap<String, IProcedure>();

	private final String name;
	
	protected TypeCheckScope(String scopeName){
		name = scopeName;
	}
	
	/**
	 * Adds the variables.
	 *
	 * @param variableList the variable list
	 */
	protected void addVariables(List<IDataType> variableList){
		for (IDataType variable : variableList){
			variables.put(variable.getName(), variable);
		}
	}
	
	/**
	 * Contains variable.
	 *
	 * @param variableName the variable name
	 * @return the boolean
	 */
	protected Boolean containsVariable(String variableName) {
		return variables.containsKey(variableName);
	}

	/**
	 * Adds the procedure declarations.
	 *
	 * @param procedureList the procedure list
	 */
	public void addProcedureDeclarations(List<IProcedure> procedureList) {
		for (IProcedure procedure : procedureList){
			procedures.put(procedure.getName(), procedure);
		}
	}
	
	/**
	 * Contains procedure.
	 *
	 * @param procedureName the procedure name
	 * @return the boolean
	 */
	protected Boolean containsProcedure(String procedureName){
		return procedures.containsKey(procedureName);
	}

	public String getName() {
		return name;
	}

	/**
	 * Gets the variable.
	 *
	 * @param identifierName the identifier name
	 * @return the variable
	 */
	public IDataType getVariable(String identifierName) {
		return variables.get(identifierName);
	}
}
