package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class ODotSelector extends OSelector
{
	private OSelector lhs;
	private String member;
	
	public ODotSelector(OSelector _lhs, String _member)
	{
		assert(_lhs != null);
		assert(_member != null);
		lhs = _lhs;
		member = _member;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		// Evaluate the left hand side and convert it to a record
		OValue valLhs = lhs.run(environment).dereference();
		if (valLhs.getType() != Type.RECORD)
			throw new Oberon0SelectorException("Trying to access a member of a '" + valLhs.getType() + "' variable, which is not a record.");
		ORecord record = (ORecord)valLhs.dereference();
		
		// Evaluate the member and return it
		return record.getMemberValue(member);
	}
}
