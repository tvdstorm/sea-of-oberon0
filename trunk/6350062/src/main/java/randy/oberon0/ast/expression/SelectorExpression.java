package randy.oberon0.ast.expression;

import randy.oberon0.ast.selector.Selector;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.TypeCheckException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;

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
	public ITypeCheckBindableValue typeCheck(TypeCheckEnvironment environment) throws TypeCheckException
	{
		return selector.typeCheck(environment);
	}
}
