package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IDataType;
import oberon.data.IntegerArrayDataType;
import oberon.data.RecordDataType;
import oberon.data.VariableIdentifier;

public class VariableIdentifierIdentifierChecker implements IChecker {

	private final VariableIdentifier identifier;

	public VariableIdentifierIdentifierChecker(VariableIdentifier identifier) {
		this.identifier = identifier;
	}

	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		if (!scope.containsVariable(identifier.getText())){
			errorList.add(new VariableNotFoundError(identifier.getText(), scope.getName()));
		}
		return errorList; 
	}

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
