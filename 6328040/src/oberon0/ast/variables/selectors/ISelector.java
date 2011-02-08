package oberon0.ast.variables.selectors;

import oberon0.environment.Context;
import oberon0.environment.Reference;

/*
 * An interface for selectors,
 * makes sure their reference can be found
 */
public interface ISelector {
	public final static Reference noPreviousReference = null;

	public Reference refer(Context context, Reference previousReference);
}
