package randy.oberon0.ast.selector;

import randy.oberon0.ast.expression.Expression;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
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
		final Array array = (Array)selector.evaluate(environment).getValue();
		// Evaluate the array index and convert it to an integer
		final Integer index = (Integer)arrayIndex.evaluate(environment).getValue();
		// Return the requested index of the array
		return array.getIndexValue(index.getIntValue());
	}
	@Override
	public TypeCheckReference typeCheck(TypeCheckEnvironment environment) throws TypeCheckException
	{
		assert(environment != null);
		// Evaluate the selector and convert it to an array
		final ITypeCheckType type = selector.typeCheck(environment).getValue();
		if (!(type instanceof TypeCheckArrayType))
		{
			throw new TypeMismatchException(type.toString(), "ARRAY");
		}
		final TypeCheckArrayType array = (TypeCheckArrayType)type;
		// Evaluate the array index and convert it to an integer
		arrayIndex.typeCheck(environment).mustBe(TypeCheckType.INTEGER);
		// Return the inner type of the array
		return new TypeCheckReference(array.getInnerType());
	}
}
