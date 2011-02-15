package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.data.IntegerArrayDataType;
import oberon.data.RecordDataType;
import oberon.data.VariableIdentifier;
import oberon.expressions.IdentifierExpression;

public class IdentifierExpressionChecker {

	private final IIdentifier identifier;

	public IdentifierExpressionChecker(IdentifierExpression expression) {
		identifier = expression.getIdentifier();
	}

	public List<AbstractError> canEvalToInt(TypeCheckScope scope) {
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		
		//all types other than variableidentifier can always be evaluated to int
		if (identifier instanceof VariableIdentifier){
			VariableIdentifier variableIdentifier = (VariableIdentifier) identifier;
			VariableIdentifierIdentifierChecker checker = new VariableIdentifierIdentifierChecker(variableIdentifier);
			errorList.addAll(checker.check(scope));
			
			//only do subsequent checking if no errors have been added yet
			if (errorList.isEmpty()){
				IDataType variable = scope.getVariable(identifier.getText());
				
				if (	variable instanceof RecordDataType ||
						variable instanceof IntegerArrayDataType){
					errorList.add(new VariableCannotBeEvaluatedToIntError(identifier.getText(), scope.getName()));
				}
			}
		}
		
		return errorList;
	}

}
