package oberon0.ast;

import oberon0.environment.Context;

public interface IEvaluable extends IVisitable{
	public Object eval(Context context);
}
