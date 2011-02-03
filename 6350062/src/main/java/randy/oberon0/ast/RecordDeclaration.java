package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;

public class RecordDeclaration extends AbstractTypeDeclaration
{
	private final String recordName;
	private final Map<String, String> memberVariables; // <variableName, variableType>
	
	public RecordDeclaration(String _recordName, Map<String, String> _memberVariables)
	{
		assert(_recordName != null);
		assert(_recordName.length() > 0);
		assert(_memberVariables != null);
		recordName = _recordName;
		memberVariables = _memberVariables;
	}
	@Override
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		assert(newEnvironment != null);
		newEnvironment.addType(recordName, new RecordInstantiation(memberVariables));
	}
}
