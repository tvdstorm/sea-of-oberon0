package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.data.ArrayIndexerIdentifier;
import oberon.expressions.IdentifierExpression;

public class ArrayIndexerIdentifierChecker implements IChecker {

	private final ArrayIndexerIdentifier identifier;

	public ArrayIndexerIdentifierChecker(ArrayIndexerIdentifier identifier) {
		this.identifier = identifier;
	}

	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		IChecker identifierChecker = IdentifierCheckerFactory.getChecker(identifier.getParent());
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();
		errorList.addAll(identifierChecker.check(scope));
		
		IExpression indexerExpression = identifier.getIndexerExpression();
		if (indexerExpression instanceof IdentifierExpression){
			IdentifierExpression indexerExpressionAsIdentifierExpression = (IdentifierExpression)indexerExpression;
			errorList.addAll(
					new IdentifierExpressionChecker(indexerExpressionAsIdentifierExpression)
					.canEvalToInt());
		}
		
		return errorList;
	}

}
