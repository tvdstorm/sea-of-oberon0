package oberon.typechecker;

import java.util.List;

import oberon.expressions.IdentifierExpression;

public class IdentifierExpressionChecker {

	private final String identifierString;

	public IdentifierExpressionChecker(IdentifierExpression expression) {
		identifierString = expression.getText();
	}

	public List<AbstractError> canEvalToInt() {
		// TODO Auto-generated method stub
		throw new NotImplementedException();
	}

}
