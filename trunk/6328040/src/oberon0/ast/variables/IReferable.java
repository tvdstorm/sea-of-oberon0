package oberon0.ast.variables;

import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.Reference;

/*
 * An interface for variables
 * makes sure their reference AND value can be found
 */
public interface IReferable extends IEvaluable {
	public Reference deref(Context context, Reference previousReference);
}
