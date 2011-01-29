package randy.oberon0.ast;

import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.OValue;

public class OPointerToDeclaration extends OAbstractTypeDeclaration
{
	private String name;
	private String pointsTo;
	
	public OPointerToDeclaration(String _name, String _pointsTo)
	{
		name = _name;
		pointsTo = _pointsTo;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		environment.addType(getName(), new OPointerToInstantiation(getPointsTo()));
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
