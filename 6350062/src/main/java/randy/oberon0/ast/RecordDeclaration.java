package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Value;

public class RecordDeclaration extends AbstractTypeDeclaration
{
	private String name;
	private Map<String, String> members;
	
	public RecordDeclaration(String _name, Map<String, String> _members)
	{
		name = _name;
		members = _members;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		environment.addType(name, new RecordInstantiation(members));
		return null;
	}
}
