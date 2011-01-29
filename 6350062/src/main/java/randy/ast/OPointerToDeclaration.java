package randy.ast;

import randy.ast.visitor.OASTNodeVisitor;
import randy.exception.Oberon0Exception;
import randy.exception.Oberon0RuntimeException;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.interpreter.runtime.TypeRegistry;
import randy.value.OValue;

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
