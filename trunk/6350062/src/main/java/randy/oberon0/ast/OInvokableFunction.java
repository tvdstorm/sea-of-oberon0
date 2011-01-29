package randy.oberon0.ast;

import java.util.Queue;
import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.OValue;

public interface OInvokableFunction
{
	public abstract String getName();
	public abstract OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues, TypeRegistry typeRegistry) throws Oberon0RuntimeException;
	public OValue runTypeDeclarations(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException;
}
