package randy.oberon0.ast.expression;

import randy.oberon0.ast.selector.Selector;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.IValue;
import randy.oberon0.value.Value;

public class SelectorExpression extends Expression
{
	private final Selector selector;
	
	public SelectorExpression(Selector _selector)
	{
		assert(_selector != null);
		selector = _selector;
	}
	@Override
	public IValue evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		return selector.evaluate(environment);
	}
	@Override
	public Value typeCheck(RuntimeEnvironment environment) throws RuntimeException
	{
		return selector.typeCheck(environment);
	}
}
