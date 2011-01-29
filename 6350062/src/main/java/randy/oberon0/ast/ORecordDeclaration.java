package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.OValue;

public class ORecordDeclaration extends OAbstractTypeDeclaration
{
	private String name;
	private Map<String, String> members;
	
	public ORecordDeclaration(String _name, Map<String, String> _members)
	{
		name = _name;
		members = _members;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		typeRegistry.addType(getName(), new ORecordInstantiation(getMembers()));
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
	public Map<String, String> getMembers()
	{
		return members;
	}
}
