package oberon0.ast.variables;

import oberon0.ast.IASTNode;
import oberon0.ast.expressions.IEvaluable;
import oberon0.environment.Context;
import oberon0.environment.Reference;

public interface IReferable extends IEvaluable{
	public final static Reference noPreviousReference = null;
	
	public Reference refer(Context context, Reference previousReference);
}
