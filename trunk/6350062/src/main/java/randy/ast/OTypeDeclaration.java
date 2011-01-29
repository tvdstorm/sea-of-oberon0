package randy.ast;

import randy.ast.visitor.OASTNodeVisitor;
import randy.exception.*;
import randy.interpreter.preprocess.TypeRegistry;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.OValue;

public class OTypeDeclaration extends OAbstractTypeDeclaration
{
	private String name;
	private String resolvesTo;
	private boolean isPointerTo;
	
	public OTypeDeclaration(String _name, String _resolvesTo, boolean _isPointerTo)
	{
		name = _name;
		resolvesTo = _resolvesTo;
		isPointerTo = _isPointerTo;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
	}
}
