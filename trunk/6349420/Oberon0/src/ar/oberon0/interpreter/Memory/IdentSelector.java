package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.DataTypes.DataType;


public class IdentSelector extends Selector implements Interpretable {

	private String _identName;
	
	public IdentSelector(String identName)
	{
		_identName = identName;
	}

	@Override
	public Object Interpret(Context context) throws Exception 
	{
		return getVar(null, context);
		//if(getNextNode() != null)
		//	return _identName + "." + getNextNode().Interpret(context);
		//else
		//	return context.getValueOf(_identName);
	}

	@Override
	protected DataField getVar(DataField parent, Context context) throws Exception 
	{
		if(parent == null)
		{
			DataField currentVar = context.getVarOrConstantAsVar(_identName);
			if(getNextNode() == null)
				return currentVar;
			else
				return getNextNode().getVar(currentVar, context);
		}
		else
		{
			throw new Exception("this feature is not supported in Oberon-0.");
		}
	}		
}
