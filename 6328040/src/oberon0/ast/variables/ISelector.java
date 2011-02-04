package oberon0.ast.variables;

import oberon0.environment.Context;
import oberon0.environment.Reference;

public interface ISelector {
	public final static Reference noPreviousReference = null;
	
	public Reference refer(Context context, Reference previousReference);
}
