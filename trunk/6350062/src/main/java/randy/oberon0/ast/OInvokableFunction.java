package randy.oberon0.ast;

import java.util.Queue;
import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.OValue;

public interface OInvokableFunction
{
	public abstract String getName();
	public abstract OValue invoke(RuntimeEnvironment environment, Queue<OValue> parameterValues) throws Oberon0RuntimeException;
	public OValue runTypeDeclarations(RuntimeEnvironment environment) throws Oberon0RuntimeException;
}
