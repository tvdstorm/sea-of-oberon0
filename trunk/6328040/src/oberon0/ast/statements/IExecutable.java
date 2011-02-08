package oberon0.ast.statements;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;

/*
 * An interface for Statements
 * makes sure they implement the execute-method in a general way
 */
public interface IExecutable extends IASTNode {
	public void execute(Context context);

}
