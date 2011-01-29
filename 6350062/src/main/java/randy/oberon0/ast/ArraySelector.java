package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;
import randy.oberon0.value.Integer;

public class ArraySelector extends Selector
{
	private Selector lhs;
	private Expression arrayIndex;
	
	public ArraySelector(Selector _lhs, Expression _arrayIndex)
	{
		assert(_lhs != null);
		assert(_arrayIndex != null);
		lhs = _lhs;
		arrayIndex = _arrayIndex;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the left hand side and convert it to an array
		Value valLhs = lhs.run(environment);
		if (valLhs.getType() != Type.ARRAY)
			throw new SelectorException("Trying to access the index of a '" + valLhs.getType() + "' variable, which is not an array.");
		Array array = (Array)valLhs.dereference();
		
		// Evaluate the array index and convert it to an integer
		Value valIndex = arrayIndex.run(environment);
		if (valIndex.getType() != Type.INTEGER)
			throw new SelectorException("Cannot cast the index of an array access from " + valIndex.getType() + " to " + Type.INTEGER + ".");
		Integer index = (Integer)valIndex;
		
		// Return the requested index of the array
		return array.getIndexValue(index.getIntValue());
	}
}
