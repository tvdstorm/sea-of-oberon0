package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.IIdentifier;
import oberon.data.VariableIdentifier;
import oberon.expressions.IdentifierExpression;
import oberon.statement.AssignmentStatement;

public class AssignmentStatementChecker implements IChecker {

	private final AssignmentStatement statement;

	public AssignmentStatementChecker(AssignmentStatement statement) {
		this.statement = statement;
	}

	@Override
	public List<AbstractError> check(TypeCheckScope scope) {		
		IIdentifier identifier = statement.getIdentifier();
		IChecker checker = IdentifierCheckerFactory.getChecker(identifier);
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		errorList.addAll(checker.check(scope));
		
		if (checker instanceof VariableIdentifierIdentifierChecker){
			errorList.addAll(((VariableIdentifierIdentifierChecker)checker).checkAbilityToAssignTo(scope));
		}
		
		IExpression expression = statement.getExpression();
		if (expression instanceof IdentifierExpression){
			IdentifierExpressionChecker identChecker = 
				new IdentifierExpressionChecker((IdentifierExpression)expression);
			
			errorList.addAll(identChecker.canEvalToInt());
		}
		
		return errorList;
	}

}
