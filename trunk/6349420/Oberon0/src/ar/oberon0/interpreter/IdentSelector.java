package ar.oberon0.interpreter;

public class IdentSelector implements Interpretable {

	private String _identName;
	
	public IdentSelector(String identName)
	{
		_identName = identName;
		System.out.println("In constructor IdentSelector");
	}

	@Override
	public Object Interpret() throws Exception {
		return _identName;
	}
	
}
