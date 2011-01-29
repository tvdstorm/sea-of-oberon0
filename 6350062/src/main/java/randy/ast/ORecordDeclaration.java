package randy.ast;

import java.util.*;
import randy.ast.visitor.OASTNodeVisitor;
import randy.exception.*;
import randy.interpreter.preprocess.TypeRegistry;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.OValue;

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
		// Niets
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
