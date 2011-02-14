package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.expressions.ComparisonExpression;
import oberon.expressions.IdentifierExpression;

public class ComparisonExpressionChecker implements IChecker {

	private final ComparisonExpression comparison;

	public ComparisonExpressionChecker(ComparisonExpression comparison) {
		this.comparison = comparison;
	}

	@Override
	public List<AbstractError> check(TypeCheckScope scope) {		
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		checkPossibleIdentifiers(comparison.getLefthandSide(), errorList);
		checkPossibleIdentifiers(comparison.getRighthandSide(), errorList);
		
		return errorList;
	}

	/**
	 * Check possible identifiers, as they might point to an invalid datatype.
	 *
	 * @param operand the operand
	 * @param errorList the error list
	 */
	private void checkPossibleIdentifiers(IExpression operand,
			ArrayList<AbstractError> errorList) {
		if (operand instanceof IdentifierExpression){
			IdentifierExpressionChecker checker = new IdentifierExpressionChecker((IdentifierExpression)operand);
			errorList.addAll(checker.canEvalToInt());
		}
	}

}
