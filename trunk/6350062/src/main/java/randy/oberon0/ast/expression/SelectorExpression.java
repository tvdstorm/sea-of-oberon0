package randy.oberon0.ast.expression;

import randy.oberon0.ast.selector.Selector;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.IBindableValue;
import randy.oberon0.interpreter.typecheck.*;

public class SelectorExpression extends Expression
{
	private final Selector selector;
	
	public SelectorExpression(Selector _selector)
	{
		assert(_selector != null);
		selector = _selector;
	}
	@Override
	public IBindableValue evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		return selector.evaluate(environment);
	}
	@Override
	public ITypeCheckType typeCheck(TypeCheckEnvironment environment) throws RuntimeException
	{
		return selector.typeCheck(environment);
	}
}
