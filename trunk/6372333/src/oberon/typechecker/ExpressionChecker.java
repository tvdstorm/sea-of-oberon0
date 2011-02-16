package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.expressions.AbstractLeftAndRightExpression;
import oberon.expressions.ComparisonExpression;
import oberon.expressions.IdentifierExpression;
import oberon.expressions.MathematicalExpression;

/**
 * The Class ExpressionChecker.
 */
public class ExpressionChecker {

	/** The expression. */
	private final IExpression expression;

	/**
	 * Instantiates a new expression checker.
	 *
	 * @param expression the expression
	 */
	public ExpressionChecker(IExpression expression){
		this.expression = expression;
	}

	/**
	 * Can eval to boolean.
	 *
	 * @param scope the scope
	 * @return the list
	 */
	public List<AbstractError> canEvalToBoolean(TypeCheckScope scope){
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		
		if (!(expression instanceof ComparisonExpression)){
			errorList.add(new InvalidConditionError(expression.getText()));
		}
		else{
			checkIdentifier(expression, errorList, scope);
		}
		
		return errorList;
	}
	
	/**
	 * Can eval to int.
	 *
	 * @param scope the scope
	 * @return the list
	 */
	public List<AbstractError> canEvalToInt(TypeCheckScope scope){
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		checkIdentifier(expression, errorList, scope);
		
		return errorList;
	}

	/**
	 * Check identifier.
	 *
	 * @param expressionToCheck the expression to check
	 * @param errorList the error list
	 * @param scope the scope
	 */
	private void checkIdentifier(IExpression expressionToCheck, 
			ArrayList<AbstractError> errorList, TypeCheckScope scope) {
		if (expressionToCheck instanceof IdentifierExpression){
			IdentifierExpressionChecker checker = 
				new IdentifierExpressionChecker((IdentifierExpression)expressionToCheck);
			
			errorList.addAll(checker.canEvalToInt(scope));
		}
		else if (	expressionToCheck instanceof MathematicalExpression ||
					expressionToCheck instanceof ComparisonExpression){
			checkIdentifier(((AbstractLeftAndRightExpression)expressionToCheck).getRighthandSide(), 
					errorList, scope);
			checkIdentifier(((AbstractLeftAndRightExpression)expressionToCheck).getLefthandSide(), 
					errorList, scope);
		}		
	}
}
