package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0Program;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OProcedureDeclaration extends OBodyDeclaration
{
	private String name;
	private List<OVarDeclaration> parameters;
	private List<OBodyDeclaration> bodyDeclarations;
	private OBlock body;
	
	public OProcedureDeclaration(String _name, List<OVarDeclaration> _parameters, List<OBodyDeclaration> _bodyDeclarations, OBlock _body)
	{
		name = _name;
		parameters = _parameters;
		bodyDeclarations = _bodyDeclarations;
		body = _body;
	}
	@Override
	public void print(String indent)
	{
		System.out.println(indent + "PROCEDURE");
		System.out.println(indent + "\t" + name);
		System.out.println(indent + "\tPARAMETERS");
		for (OVarDeclaration param : parameters)
		{
			param.print(indent + "\t\t");
		}
		for (OBodyDeclaration bodyDecl : bodyDeclarations)
		{
			bodyDecl.print(indent + "\t");
		}
		System.out.println(indent + "\tBODY");
		body.print(indent + "\t\t");
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		return null;
	}
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues) throws Oberon0Exception
	{
		System.out.println("Invoking " + name);
		Oberon0VariableStack functionVars = new Oberon0VariableStack(callerVars.getGlobalStack());
		for (OVarDeclaration p : parameters)
		{
			p.runForParameter(functionVars, parameterValues);
		}
		for (OBodyDeclaration bodyDecl : bodyDeclarations)
		{
			bodyDecl.run(functionVars);
		}
		body.run(functionVars);
		return null;
	}
	public static OProcedureDeclaration buildProcedureDeclaration(Tree tree) throws Oberon0Exception
	{
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
		
		OProcedureDeclaration procDecl = new OProcedureDeclaration(name, parameters, bodyDeclarations, body);
		// TODO: netter maken
		Oberon0Program.getProgram().procedures.put(name, procDecl);
		return procDecl;
	}
}
