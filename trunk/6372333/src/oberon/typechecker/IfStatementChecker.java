package oberon.typechecker;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.IStatement;
import oberon.statement.IfStatement;

/**
 * The Class IfStatementChecker.
 */
public class IfStatementChecker implements IChecker {

	/** The statement. */
	private final IfStatement statement;

	/**
	 * Instantiates a new if statement checker.
	 *
	 * @param statement the statement
	 */
	public IfStatementChecker(IfStatement statement) {
		this.statement = statement;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.IChecker#check(oberon.typechecker.TypeCheckScope)
	 */
	@Override
	public List<AbstractError> check(TypeCheckScope scope) {
		IExpression ifCondition = statement.getCondition();
		
		ArrayList<AbstractError> errorList = new ArrayList<AbstractError>();

		ExpressionChecker checker = new ExpressionChecker(ifCondition);
		errorList.addAll(checker.canEvalToBoolean(scope));
		
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
