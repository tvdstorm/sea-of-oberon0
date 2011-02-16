package oberon.typechecker;

import oberon.IStatement;
import oberon.statement.AssignmentStatement;
import oberon.statement.IfStatement;
import oberon.statement.ProcedurecallStatement;
import oberon.statement.WhileStatement;
import oberon.statement.WithStatement;

/**
 * A factory for creating StatementChecker objects.
 */
public class StatementCheckerFactory {

	/**
	 * Gets the checker.
	 *
	 * @param statement the statement
	 * @return the i checker
	 */
	public static IChecker GetChecker(IStatement statement) {
		if (statement instanceof AssignmentStatement){
			return new AssignmentStatementChecker((AssignmentStatement)statement);
		}
		else if (statement instanceof IfStatement){
			return new IfStatementChecker((IfStatement)statement);
		}
		else if (statement instanceof ProcedurecallStatement){
			return new ProcedurecallStatementStatementChecker((ProcedurecallStatement)statement);
		}
		else if (statement instanceof WhileStatement){
			return new WhileStatementChecker((WhileStatement)statement);
		}
		else if (statement instanceof WithStatement){
			return new WithStatementChecker((WithStatement)statement);
		}
		return new DefaultStatementChecker();
	}
	
}
