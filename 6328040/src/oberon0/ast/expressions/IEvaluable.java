package oberon0.ast.expressions;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;

public interface IEvaluable extends IASTNode{
	public Object eval(Context context);
}
