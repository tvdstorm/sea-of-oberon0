package randy.interpreter.preprocess;

import randy.ast.*;
import randy.ast.visitor.OASTNodeNullVisitor;

public class TypeRegistryRegistrator extends OASTNodeNullVisitor
{
	private TypeRegistry typeRegistry;
	
	public TypeRegistryRegistrator(TypeRegistry _typeRegistry)
	{
		typeRegistry = _typeRegistry;
	}
	public void visit(ORecordDeclaration recordDeclaration)
	{
		typeRegistry.addType(recordDeclaration.getName(), new ORecordInstantiation(recordDeclaration.getMembers()));
	}
	public void visit(OPointerToDeclaration pointerToDeclaration)
	{
		typeRegistry.addType(pointerToDeclaration.getName(), new OPointerToInstantiation(pointerToDeclaration.getPointsTo()));
	}
}
