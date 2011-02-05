package oberon0.ast.declarations;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;

/*
 * An interface for declarations
 * let declarations be able to declare themselves into the given context
 */
public interface IDeclarable extends IASTNode{
	public void declare(Context context);
}
