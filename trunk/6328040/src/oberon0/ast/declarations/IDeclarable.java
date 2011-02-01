package oberon0.ast.declarations;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;

public interface IDeclarable extends IASTNode{
	public void declare(Context context);
}
