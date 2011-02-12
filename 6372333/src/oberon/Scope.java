package oberon;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

import oberon.data.RecordDataType;
import oberon.exceptions.BadWithStatementField;
import oberon.exceptions.ProcedureNotFoundInScopeException;
import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class Scope.
 */
public class Scope {		
		
	/** The variables. */
	private final AbstractMap<String, IDataType> variables;
	
	/** The procedures. */
	private final AbstractMap<String, IProcedure> procedures;
	
	/** The system procedures. */
	private final AbstractMap<String, IProcedure> systemProcedures;
	
	/**
	 * Instantiates a new scope.
	 */
	public Scope(){
		variables = new HashMap<String, IDataType>();
		procedures = new HashMap<String, IProcedure>();
		systemProcedures = new HashMap<String, IProcedure>();
	}

	/**
	 * Instantiates a new scope.
	 *
	 * @param inputVariables the variables
	 * @param inputPprocedures the procedures
	 * @param inputSysProcedures the sys procedures
	 */
	Scope(final AbstractMap<String, IDataType> inputVariables, 
			final AbstractMap<String,IProcedure> inputPprocedures, 
			final AbstractMap<String, IProcedure> inputSysProcedures){
		variables = inputVariables;
		systemProcedures = inputSysProcedures;
		procedures = inputPprocedures;
	}
	
	/**
	 * Adds the system procedure.
	 *
	 * @param procedure the procedure
	 */
	public void addSystemProcedure(final IProcedure procedure) {
		systemProcedures.put(procedure.getName(), procedure);
	}

	/**
	 * Creates the new scope.
	 *
	 * @param actualProcedureParameters the actual procedure parameters
	 * @param currentProcedure the current procedure
	 * @return the scope
	 */
	public Scope createNewScope(final List<IDataType> actualProcedureParameters, 
			final IProcedure currentProcedure) {
		final HashMap<String, IDataType> variables = new HashMap<String, IDataType>();
		
		for (IDataType actualParam : actualProcedureParameters){
			variables.put(actualParam.getName(), actualParam);
		}
		
		final HashMap<String, IProcedure> procedures = new HashMap<String, IProcedure>();
		procedures.put(currentProcedure.getName(), currentProcedure);
		
		return new Scope(variables, procedures, systemProcedures);
	}
	
	/**
	 * Adds the new declaration.
	 *
	 * @param declaration the declaration
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public void addNewDeclaration(final IDeclaration declaration) throws ProcedureParamaterCountMismatchException, VariableNotFoundInScopeException
	{
		for (IDataType actualParam : declaration.getVariables()){
			variables.put(actualParam.getName(), actualParam);	
			
			actualParam.initialize(this);
		}
		
		for (IProcedure heading : declaration.getProcedures()){
			addProcedure(heading);
		}
	}
	
	/**
	 * Adds the procedure.
	 *
	 * @param procedure the procedure
	 */
	protected void addProcedure(final IProcedure procedure) {
		procedures.put(procedure.getName(), procedure);
	}

	/**
	 * Gets the procedure.
	 *
	 * @param name the name of the procedure to get
	 * @return the procedure
	 */
	public IProcedure getProcedure(final String name) {
		IProcedure procedure = null;
		if (procedures.containsKey(name)){
			procedure = procedures.get(name);
		}
		if (systemProcedures.containsKey(name)){
			procedure = systemProcedures.get(name);
		}
		
		if (procedure == null) {
			throw new ProcedureNotFoundInScopeException("Procedure not found in scope, name: " + name);
		}
		return procedure;
	}

	/**
	 * Gets the variable.
	 *
	 * @param variableName the name of the variable
	 * @return the variable
	 * @throws VariableNotFoundInScopeException 
	 */
	public IDataType getVariable(final String variableName) {
		if (variables.containsKey(variableName)){
				return variables.get(variableName);
		}
		
		throw new VariableNotFoundInScopeException(variableName);
	}

	/**
	 * Creates the new scope.
	 *
	 * @param identifierToWith the identifier to with
	 * @return the scope
	 */
	public Scope createNewScope(IIdentifier identifierToWith) {
		IDataType dataType = identifierToWith.getDataTypeValue(this);
		if (dataType instanceof RecordDataType){
			RecordDataType record = (RecordDataType)dataType;
			
			return new Scope((AbstractMap<String, IDataType>) record.getFields(), null, null);
		}
		
		throw new BadWithStatementField("Field \"" + dataType.getName() + "\" is not a record and cannot be used in a with statement");
	}
}
