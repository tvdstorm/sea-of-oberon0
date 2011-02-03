package oberon0.ast.routines;

import java.util.ArrayList;

import oberon0.ast.IASTNode;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;

public interface ICallable extends IASTNode{
	public final static ArrayList<IReferable> noActualParameters = null;
	
	public void call(Context context,  ArrayList<IReferable> actualParameters);
}
