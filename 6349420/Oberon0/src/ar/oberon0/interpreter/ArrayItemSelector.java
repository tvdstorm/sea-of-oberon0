package ar.oberon0.interpreter;

public class ArrayItemSelector extends Selector {

	private Interpretable _expression;
	
	public ArrayItemSelector(Interpretable expression)
	{
		_expression = expression;
	}

	@Override
	public Object Interpret() throws Exception {
		if(getNextNode() != null)
			return "[" + _expression.Interpret() + "]" + "." + getNextNode().Interpret();
		else
			return "[" + _expression.Interpret() + "]";
	}

	
	
}
