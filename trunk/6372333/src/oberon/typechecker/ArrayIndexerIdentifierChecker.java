package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.data.ArrayIndexerIdentifier;
import oberon.expressions.IdentifierExpression;

/**
 * The Class ArrayIndexerIdentifierChecker.
 */
public class ArrayIndexerIdentifierChecker implements IChecker {

	/** The identifier. */
	private final ArrayIndexerIdentifier identifier;

	/**
	 * Instantiates a new array indexer identifier checker.
	 *
	 * @param identifier the identifier
	 */
	public ArrayIndexerIdentifierChecker(ArrayIndexerIdentifier identifier) {
		this.identifier = identifier;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.IChecker#check(oberon.typechecker.TypeCheckScope)
	 */
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
					.canEvalToInt(scope));
		}
		
		return errorList;
	}

}
