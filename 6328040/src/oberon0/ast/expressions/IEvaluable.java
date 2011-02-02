package oberon0.ast.expressions;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;
import oberon0.environment.IValue;

public interface IEvaluable extends IASTNode{
	public IValue eval(Context context);
}
