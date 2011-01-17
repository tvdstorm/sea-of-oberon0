package ar.oberon0.interpreter;

public class NegationNode implements Interpretable {

	private Interpretable _nodeToNegate;
	
	public NegationNode(Interpretable nodeToNegate)
	{
		_nodeToNegate = nodeToNegate;
	}
	
	@Override
	public Object Interpret() throws Exception {
		return -((Integer)_nodeToNegate.Interpret());
	}

}
