package oberon0.ast.expressions;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;
import oberon0.environment.IValue;

/*
 * An interface for expression nodes
 * makes sure they can be evaluated in the same way
 * evaluation always results in a IValue
 */
public interface IEvaluable extends IASTNode{
	public IValue eval(Context context);
}
