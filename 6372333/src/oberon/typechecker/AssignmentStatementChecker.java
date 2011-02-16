package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.IIdentifier;
import oberon.expressions.IdentifierExpression;
import oberon.expressions.MathematicalExpression;
import oberon.statement.AssignmentStatement;

/**
 * The Class AssignmentStatementChecker.
 */
public class AssignmentStatementChecker implements IChecker {

	/** The statement. */
	private final AssignmentStatement statement;

	/**
	 * Instantiates a new assignment statement checker.
	 *
	 * @param statement the statement
	 */
	public AssignmentStatementChecker(AssignmentStatement statement) {
		this.statement = statement;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.IChecker#check(oberon.typechecker.TypeCheckScope)
	 */
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
			
			errorList.addAll(identChecker.canEvalToInt(scope));
		}
		else if (expression instanceof MathematicalExpression){
			ExpressionChecker mathChecker = 
				new ExpressionChecker((MathematicalExpression)expression);
			
			errorList.addAll(mathChecker.canEvalToInt(scope));
		}
		
		return errorList;
	}

}
