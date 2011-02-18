package randy.oberon0.ast.selector;

import randy.oberon0.ast.expression.Expression;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.value.*;
import randy.oberon0.value.Integer;

public class ArraySelector extends Selector
{
	private final Selector selector;
	private final Expression arrayIndex;
	
	public ArraySelector(Selector _selector, Expression _arrayIndex)
	{
		assert(_selector != null);
		assert(_arrayIndex != null);
		selector = _selector;
		arrayIndex = _arrayIndex;
	}
	@Override
	public Reference evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the selector and convert it to an array
		final Array array = selector.evaluate(environment).getValue().castToArray();
		// Evaluate the array index and convert it to an integer
		final Integer index = arrayIndex.evaluate(environment).getValue().castToInteger();
		// Return the requested index of the array
		return array.getIndexValue(index.getIntValue());
	}
}
