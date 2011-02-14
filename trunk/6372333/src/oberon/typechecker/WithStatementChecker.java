package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IIdentifier;
import oberon.data.VariableIdentifier;
import oberon.statement.WithStatement;

public class WithStatementChecker implements IChecker {

	private final WithStatement statement;

	public WithStatementChecker(WithStatement statement) {
		this.statement = statement; 
	}

	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		IIdentifier identifier = statement.getIdentifier();
		
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		if (identifier instanceof VariableIdentifier){
			//TODO: check of identifier een record is
			throw new NotImplementedException();
		}
		else{
			errorList.add(new InvalidVariableInWithStatementError(identifier.getText()));
		}
		
		return errorList;
	}

}
