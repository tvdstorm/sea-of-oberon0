package randy.ast;

import java.util.Queue;
import randy.exception.Oberon0RuntimeException;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.interpreter.runtime.TypeRegistry;
import randy.value.OValue;

public interface OInvokableFunction
{
	public abstract String getName();
	public abstract OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues, TypeRegistry typeRegistry) throws Oberon0RuntimeException;
	public OValue runTypeDeclarations(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException;
}
