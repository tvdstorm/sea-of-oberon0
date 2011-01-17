package ar.oberon0.interpreter;

public class ArrayItemSelector implements Interpretable {

	private Interpretable _expression;
	
	public ArrayItemSelector(Interpretable expression)
	{
		_expression = expression;
		System.out.println("In constructor ArrayItemSelector");
	}

	@Override
	public Object Interpret() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
