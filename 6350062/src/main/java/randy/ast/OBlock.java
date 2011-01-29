package randy.ast;

import java.util.*;
import randy.ast.visitor.OASTNodeVisitor;
import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.interpreter.runtime.TypeRegistry;
import randy.value.OValue;

public class OBlock extends OStatement
{
	private List<OStatement> statements;
	
	public OBlock(List<OStatement> _statements)
	{
		assert(_statements != null);
		statements = _statements;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Loop through all statements and run them
		for (OStatement st : statements)
		{
			st.run(vars, typeRegistry);
		}
		return null;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		for (OStatement st : statements)
		{
			st.accept(visitor);
		}
		visitor.visitAfter(this);
	}
}
