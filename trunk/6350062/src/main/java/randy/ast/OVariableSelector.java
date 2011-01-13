package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

public class OVariableSelector extends OSelector
{
	private String name;
	
	public OVariableSelector(String _name)
	{
		name = _name;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		return vars.getVariable(name);
	}
	public static OVariableSelector buildVariableSelector(Tree tree) throws Oberon0Exception
	{
		String name = tree.getText();
		return new OVariableSelector(name);
	}
}
