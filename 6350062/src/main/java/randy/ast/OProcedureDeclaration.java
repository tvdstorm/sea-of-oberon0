package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.*;
import randy.value.OValue;

public class OProcedureDeclaration extends OBodyDeclaration implements OInvokableFunction
{
	private String name;
	private List<OVarDeclaration> parameters;
	private List<OBodyDeclaration> bodyDeclarations;
	private OBlock body;
	
	public OProcedureDeclaration(String _name, List<OVarDeclaration> _parameters, List<OBodyDeclaration> _bodyDeclarations, OBlock _body)
	{
		assert(name != null);
		assert(name.length() >= 1);
		assert(parameters != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		name = _name;
		parameters = _parameters;
		bodyDeclarations = _bodyDeclarations;
		body = _body;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		// Nothing to run in procedure declarations, they are taken care of during preprocessing...
		return null;
	}
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues) throws Oberon0RuntimeException
	{
		assert(callerVars != null);
		assert(parameterValues != null);
		assert(parameters != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		// Create a new variable scope for the invoked function
		Oberon0VariableStack functionVars = new Oberon0VariableStack(callerVars.getGlobalStack());
		// Loop through all parameters and declare them in the invoked functions variable scope
		for (OVarDeclaration p : parameters)
		{
			p.runForParameter(functionVars, parameterValues);
		}
		// If parameterValues has any values left, the number of arguments don't match
		if (parameterValues.size() > 0)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		// Loop through all body declarations
		for (OBodyDeclaration bodyDecl : bodyDeclarations)
		{
			bodyDecl.run(functionVars);
		}
		// Run the body of the function
		body.run(functionVars);
		return null;
	}
	public static OProcedureDeclaration buildProcedureDeclaration(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.PROCEDURE);
		assert(tree.getChildCount() >= 1);
		assert(tree.getChild(0).getType() == Oberon0Parser.IDENT);
		String name = tree.getChild(0).getText();
		List<OVarDeclaration> parameters = new Vector<OVarDeclaration>();
		List<OBodyDeclaration> bodyDeclarations = new Vector<OBodyDeclaration>();
		OBlock body = null;
		for (int i=1;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
				case Oberon0Parser.PARAMETERS:
					for (int j=0;j<child.getChildCount();j++)
					{
						parameters.add(OVarDeclaration.buildVarDeclaration(child.getChild(j)));
					}
					break;
				case Oberon0Parser.VAR:
				case Oberon0Parser.PROCEDURE:
					bodyDeclarations.add(OBodyDeclaration.buildBodyDeclaration(child));
					break;
				case Oberon0Parser.BODY:
					body = OBlock.buildBlock(child);
					break;
			}
		}
		
		return new OProcedureDeclaration(name, parameters, bodyDeclarations, body);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		for (OVarDeclaration p : parameters)
		{
			p.accept(visitor);
		}
		for (OBodyDeclaration bodyDecl : bodyDeclarations)
		{
			bodyDecl.accept(visitor);
		}
		body.accept(visitor);
		visitor.visitAfter(this);
	}
	@Override
	public String getName()
	{
		assert(name != null);
		return name;
	}
}
