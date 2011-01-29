package randy.oberon0.ast;

import randy.oberon0.ast.visitor.OASTNodeVisitor;
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
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		typeRegistry.addType(getName(), new OPointerToInstantiation(getPointsTo()));
		return null;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
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
