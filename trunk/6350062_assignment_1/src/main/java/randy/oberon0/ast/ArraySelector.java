package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;
import randy.oberon0.value.Integer;

public class ArraySelector extends Selector
{
	private Selector selector;
	private Expression arrayIndex;
	
	public ArraySelector(Selector _selector, Expression _arrayIndex)
	{
		assert(_selector != null);
		assert(_arrayIndex != null);
		selector = _selector;
		arrayIndex = _arrayIndex;
	}
	@Override
	public Value evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the selector and convert it to an array
		final Array array = selector.evaluate(environment).dereference().castToArray();
		// Evaluate the array index and convert it to an integer
		final Integer index = arrayIndex.evaluate(environment).castToInteger();
		// Return the requested index of the array
		return new Reference(array.getIndexValue(index.getIntValue()));
	}
}
