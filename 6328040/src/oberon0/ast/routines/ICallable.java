package oberon0.ast.routines;

import java.util.ArrayList;

import oberon0.ast.IASTNode;
import oberon0.environment.Context;

public interface ICallable extends IASTNode{
	public void call(Context context,  ArrayList<ActualParamNode> actualParameters);
}
