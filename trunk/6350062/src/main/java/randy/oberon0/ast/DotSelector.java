package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class DotSelector extends Selector
{
	private final Selector selector;
	private final String recordMemberName;
	
	public DotSelector(Selector _selector, String _recordMemberName)
	{
		assert(_selector != null);
		assert(_recordMemberName != null);
		assert(_recordMemberName.length() > 0);
		selector = _selector;
		recordMemberName = _recordMemberName;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the selector and convert it to a record
		final Record record = selector.run(environment).dereference().castToRecord();
		// Evaluate the member and return it
		return record.getMemberValue(recordMemberName);
	}
}
