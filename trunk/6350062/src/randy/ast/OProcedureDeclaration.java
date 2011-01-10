package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OProcedureDeclaration extends OBodyDeclaration
{

	@Override
	public void print(String indent)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		// TODO Auto-generated method stub
		return null;
	}
	public static OProcedureDeclaration buildProcedureDeclaration(Tree tree) throws Oberon0Exception
	{
		throw new Oberon0Exception("buildProcedureDeclaration implementeren!");
		// TODO: implementeren!
	}
}
