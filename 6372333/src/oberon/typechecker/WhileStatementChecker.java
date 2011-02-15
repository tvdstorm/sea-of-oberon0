package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.expressions.ComparisonExpression;
import oberon.statement.WhileStatement;

public class WhileStatementChecker implements IChecker {

	private final WhileStatement statement;

	public WhileStatementChecker(WhileStatement statement) {
		this.statement = statement;
	}

	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		IExpression whileCondition = statement.getCondition();
		
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		if (
				!(whileCondition instanceof ComparisonExpression)
			){
			errorList.add(new InvalidConditionError(whileCondition.getText()));
		}
		
		return errorList;
	}
}
