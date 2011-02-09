package randy.oberon0.ast.declaration;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.interpreter.typecheck.TypeCheckEnvironment;
import randy.oberon0.interpreter.typecheck.TypeCheckRecordType;

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
		newEnvironment.registerType(recordName, new RecordInstantiation(memberVariables));
	}
	@Override
	public void typeCheckRegister(TypeCheckEnvironment newEnvironment) throws RuntimeException
	{
		assert(newEnvironment != null);
		TypeCheckRecordType recordType = new TypeCheckRecordType(recordName, memberVariables);
		newEnvironment.registerType(recordName, recordType);
	}
}
