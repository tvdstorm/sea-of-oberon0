package oberon0.ast.statements;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;

public interface IExecutable extends IASTNode{
	public void execute (Context context);

}
