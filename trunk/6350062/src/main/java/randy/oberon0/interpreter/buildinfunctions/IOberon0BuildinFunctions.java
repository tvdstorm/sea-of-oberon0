package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.Oberon0Exception;
import randy.oberon0.interpreter.preprocess.FunctionTreeBuilder;

public interface IOberon0BuildinFunctions
{
	public void register(FunctionTreeBuilder ftb) throws Oberon0Exception;
}
