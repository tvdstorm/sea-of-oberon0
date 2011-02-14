package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.IStatement;
import oberon.expressions.ComparisonExpression;
import oberon.statement.IfStatement;

public class IfStatementChecker implements IChecker {

	private final IfStatement statement;

	public IfStatementChecker(IfStatement statement) {
		this.statement = statement;
	}

	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		IExpression ifCondition = statement.getCondition();
		
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		if (
				!(ifCondition instanceof ComparisonExpression)
			){
			errorList.add(new InvalidConditionError(ifCondition.getText()));
		}
		else {
			IChecker checker = new ComparisonExpressionChecker((ComparisonExpression)ifCondition);
			errorList.addAll(checker.check(scope));
		}
		
		//check all elseifs
		for (IfStatement elseIf : statement.getElseIfs()){
			errorList.addAll(new IfStatementChecker(elseIf).check(scope));
		}
		
		//check the body of the else
		for (IStatement bodyStatement : statement.getElseStatements()){
			errorList.addAll(StatementCheckerFactory.GetChecker(bodyStatement).check(scope));
		}
		
		return errorList;
	}


}
