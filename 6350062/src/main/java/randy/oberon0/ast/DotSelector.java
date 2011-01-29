package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class DotSelector extends Selector
{
	private Selector lhs;
	private String member;
	
	public DotSelector(Selector _lhs, String _member)
	{
		assert(_lhs != null);
		assert(_member != null);
		lhs = _lhs;
		member = _member;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the left hand side and convert it to a record
		Value valLhs = lhs.run(environment).dereference();
		if (valLhs.getType() != Type.RECORD)
			throw new SelectorException("Trying to access a member of a '" + valLhs.getType() + "' variable, which is not a record.");
		Record record = (Record)valLhs.dereference();
		
		// Evaluate the member and return it
		return record.getMemberValue(member);
	}
}
