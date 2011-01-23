package ar.oberon0.interpreter.Memory;


public class IdentSelector extends Selector {

	private String _identName;
	
	public IdentSelector(String identName)
	{
		_identName = identName;
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		if(getNextNode() != null)
			return _identName + "." + getNextNode().Interpret(context);
		else
			return context.getValueOf(_identName);
	}		
}
