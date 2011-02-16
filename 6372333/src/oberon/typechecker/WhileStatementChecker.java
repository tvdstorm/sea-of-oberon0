package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.expressions.ComparisonExpression;
import oberon.statement.WhileStatement;

/**
 * The Class WhileStatementChecker.
 */
public class WhileStatementChecker implements IChecker {

	/** The statement. */
	private final WhileStatement statement;

	/**
	 * Instantiates a new while statement checker.
	 *
	 * @param statement the statement
	 */
	public WhileStatementChecker(WhileStatement statement) {
		this.statement = statement;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.IChecker#check(oberon.typechecker.TypeCheckScope)
	 */
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
