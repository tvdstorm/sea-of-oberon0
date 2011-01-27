package randy.interpreter.buildinfunctions;

import randy.exception.Oberon0Exception;
import randy.interpreter.preprocess.FunctionTreeBuilder;

public interface IOberon0BuildinFunctions
{
	public void register(FunctionTreeBuilder ftb) throws Oberon0Exception;
}
