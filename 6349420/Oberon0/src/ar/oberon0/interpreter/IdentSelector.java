package ar.oberon0.interpreter;

public class IdentSelector extends Selector {

	private String _identName;
	
	public IdentSelector(String identName)
	{
		_identName = identName;
	}

	@Override
	public Object Interpret() throws Exception {
		if(getNextNode() != null)
			return _identName + "." + getNextNode().Interpret();
		else
			return _identName;
	}
	
}
