package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IDataType;
import oberon.data.IntegerArrayDataType;
import oberon.data.RecordDataType;
import oberon.data.VariableIdentifier;

/**
 * The Class VariableIdentifierIdentifierChecker.
 */
public class VariableIdentifierIdentifierChecker implements IChecker {

	/** The identifier. */
	private final VariableIdentifier identifier;

	/**
	 * Instantiates a new variable identifier identifier checker.
	 *
	 * @param identifier the identifier
	 */
	public VariableIdentifierIdentifierChecker(VariableIdentifier identifier) {
		this.identifier = identifier;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.IChecker#check(oberon.typechecker.TypeCheckScope)
	 */
	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		if (!scope.containsVariable(identifier.getText())){
			errorList.add(new VariableNotFoundError(identifier.getText(), scope.getName()));
		}
		return errorList; 
	}

	/**
	 * Check ability to assign to.
	 *
	 * @param scope the scope
	 * @return the list
	 */
	public List<AbstractError> checkAbilityToAssignTo(TypeCheckScope scope) {
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		
		if (scope.containsVariable(identifier.getText())){
			IDataType variable = scope.getVariable(identifier.getText());

			if (	variable instanceof IntegerArrayDataType ||
					variable instanceof RecordDataType){
				errorList.add(new VariableCannotBeAssignedToError(identifier.getText(), scope.getName()));
			}
		}
		
		return errorList;
	}

}
