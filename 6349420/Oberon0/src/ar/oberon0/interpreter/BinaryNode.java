package ar.oberon0.interpreter;

public abstract class BinaryNode extends BaseNode
{
	private Interpretable _leftNode;
	private Interpretable _rightNode;
	
	protected Interpretable getLeftExpression()
	{
		return _leftNode;
	}
	
	protected Interpretable getRightExpression()
	{
		return _rightNode;
	}
	
	protected BinaryNode(Interpretable leftNode, Interpretable rightNode)
	{
		_leftNode = leftNode;
		_rightNode = rightNode;
	}
}
