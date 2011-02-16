package oberon.typechecker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oberon.IDataType;
import oberon.IExpression;
import oberon.IIdentifier;
import oberon.data.IntegerArrayDataType;
import oberon.data.RecordDataType;
import oberon.data.VariableIdentifier;
import oberon.expressions.IdentifierExpression;
import oberon.procedures.FormalParamSection;
import oberon.procedures.FormalParamType;
import oberon.procedures.ProcedureHeading;
import oberon.statement.ProcedurecallStatement;

/**
 * The Class ProcedurecallStatementStatementChecker.
 */
public class ProcedurecallStatementStatementChecker implements IChecker {

	/** The statement. */
	private final ProcedurecallStatement statement;

	/**
	 * Instantiates a new procedurecall statement statement checker.
	 *
	 * @param statement the statement
	 */
	public ProcedurecallStatementStatementChecker(
			ProcedurecallStatement statement) {
				this.statement = statement;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.IChecker#check(oberon.typechecker.TypeCheckScope)
	 */
	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		String procedureName = statement.getProcedureName();
		
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		if (!scope.containsProcedure(procedureName)){
			errorList.add(new ProcedureNotFoundError(procedureName, scope.getName()));
			
			//no additional checking needed if proc is not found
			return errorList;
		}
			
		ProcedureHeading procedure = (ProcedureHeading) scope.getProcedure(procedureName);
		
		List<FormalParamSection> formalParameters = procedure.getFormalParameters();
		List<IExpression> actualParameters = statement.GetActualParameters();
		
		return checkParameters(formalParameters, actualParameters, scope);
	}

	/**
	 * Check parameters.
	 *
	 * @param formalParameters the formal parameters
	 * @param actualParameters the actual parameters
	 * @param scope the scope
	 * @return the list
	 */
	private List<AbstractError> checkParameters(
			List<FormalParamSection> formalParameters,
			List<IExpression> actualParameters, TypeCheckScope scope) {
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		Iterator<IExpression> actualIterator = actualParameters.iterator();
		
		for (FormalParamSection section : formalParameters){
			
			for (String name : section.getNames()){
				
				if (!actualIterator.hasNext()){
					errorList.add(new ParameterMismatchException(
							"Too few actual paramaters specified for procedure" + statement.getProcedureName()));
					return errorList;
				}
				
				IExpression actualParam = actualIterator.next();
				
				
				if (section.getType() == FormalParamType.Array &&
					!checkForArrayType(actualParam, scope)){
					errorList.add(new ParameterMismatchException(
							"Error when calling: " + statement.getProcedureName() + ", parameter " + name + " was expected to be an array"));
				}
				else if (section.getType() == FormalParamType.Identifier &&
						!checkForIdentifierType(actualParam, scope)){
					errorList.add(new ParameterMismatchException(
							"Error when calling: " + statement.getProcedureName() + ", parameter " + name + " was expected to be an int"));
				}
				else if (section.getType() == FormalParamType.Record &&
						!checkForRecordType(actualParam, scope)){
					errorList.add(new ParameterMismatchException(
							"Error when calling: " + statement.getProcedureName() + ", parameter " + name + " was expected to be a record"));
				}
			}
		}
		
		if (actualIterator.hasNext()){
			errorList.add(new ParameterMismatchException(
					"Too many actual paramaters specified for procedure" + statement.getProcedureName()));
			return errorList;
		}
	
		return errorList;
	}

	/**
	 * Check for identifier type.
	 *
	 * @param actualParam the actual param
	 * @param scope the scope
	 * @return true, if successful
	 */
	private boolean checkForIdentifierType(IExpression actualParam,
			TypeCheckScope scope) {
		ExpressionChecker checker = new ExpressionChecker(actualParam);
		return checker.canEvalToInt(scope).isEmpty();		
	}

	/**
	 * Check for record type.
	 *
	 * @param actualParam the actual param
	 * @param scope the scope
	 * @return the boolean
	 */
	private Boolean checkForRecordType(IExpression actualParam,
			TypeCheckScope scope) {
		IDataType variable = getVariable(actualParam, scope);
		
		if (variable == null){
			return null;
		}
		
		if (variable instanceof RecordDataType){
			return true;
		}
		
		return false;
	}

	/**
	 * Check for array type.
	 *
	 * @param actualParam the actual param
	 * @param scope the scope
	 * @return the boolean
	 */
	private Boolean checkForArrayType(IExpression actualParam,
			TypeCheckScope scope) {
		IDataType variable = getVariable(actualParam, scope);
		
		if (variable == null){
			return null;
		}
		
		if (variable instanceof IntegerArrayDataType){
			return true;
		}
		
		return false;
	}
	
	/**
	 * Gets the variable.
	 *
	 * @param actualParam the actual param
	 * @param scope the scope
	 * @return the variable
	 */
	private IDataType getVariable(IExpression actualParam, TypeCheckScope scope){
		if (!(actualParam instanceof IdentifierExpression)){
			return null;
		}
		
		IdentifierExpression identifierExpression = (IdentifierExpression)actualParam;
		IIdentifier identifier = identifierExpression.getIdentifier();
		
		if (!(identifier instanceof VariableIdentifier)){
			return null;
		}
		
		VariableIdentifier variableIdentifier = (VariableIdentifier)identifier;
		if (!scope.containsVariable(variableIdentifier.getText())){
			return null;
		}
		
		return scope.getVariable(variableIdentifier.getText());
	}


}
