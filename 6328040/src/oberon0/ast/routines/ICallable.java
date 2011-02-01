package oberon0.ast.routines;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;

public interface ICallable extends IASTNode{
	public void run(Context context);
}
