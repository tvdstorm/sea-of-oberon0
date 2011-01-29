package randy.oberon0.ast;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Value;

public class PointerToDeclaration extends AbstractTypeDeclaration
{
	private String name;
	private String pointsTo;
	
	public PointerToDeclaration(String _name, String _pointsTo)
	{
		name = _name;
		pointsTo = _pointsTo;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		environment.addType(getName(), new PointerToInstantiation(getPointsTo()));
		return null;
	}
	public String getName()
	{
		return name;
	}
	public String getPointsTo()
	{
		return pointsTo;
	}
}
