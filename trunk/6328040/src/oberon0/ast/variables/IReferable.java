package oberon0.ast.variables;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;
import oberon0.environment.Reference;

public interface IReferable extends IASTNode{
	public Reference refer(Context context, Reference firstref);
}
