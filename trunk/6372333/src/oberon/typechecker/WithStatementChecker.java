package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.data.RecordDataType;
import oberon.data.VariableIdentifier;
import oberon.statement.WithStatement;

/**
 * The Class WithStatementChecker.
 */
public class WithStatementChecker implements IChecker {

	/** The statement. */
	private final WithStatement statement;

	/**
	 * Instantiates a new with statement checker.
	 *
	 * @param statement the statement
	 */
	public WithStatementChecker(WithStatement statement) {
		this.statement = statement; 
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.IChecker#check(oberon.typechecker.TypeCheckScope)
	 */
	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		IIdentifier identifier = statement.getIdentifier();
		
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		if (identifier instanceof VariableIdentifier){
			VariableIdentifier variableIdentifier = (VariableIdentifier) identifier;
			VariableIdentifierIdentifierChecker checker = new VariableIdentifierIdentifierChecker(variableIdentifier);
			errorList.addAll(checker.check(scope));
			
			//only do subsequent checks when the variable is found etc.
			if (errorList.isEmpty()){
				IDataType variable = scope.getVariable(variableIdentifier.getText());
				
				if (!(variable instanceof RecordDataType)){
					errorList.add(new VariableIsNotARecordError(variableIdentifier.getText(), scope.getName()));
				}
			}
		}
		else{
			errorList.add(new InvalidVariableInWithStatementError(identifier.getText()));
		}
		
		return errorList;
	}

}
