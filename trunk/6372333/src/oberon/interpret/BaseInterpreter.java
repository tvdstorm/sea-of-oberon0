package oberon.interpret;

import oberon.analysis.DepthFirstAdapter;
import oberon.node.Node;

public abstract class BaseInterpreter<TNode extends Node> extends DepthFirstAdapter {
	private TNode _node;
	public BaseInterpreter(TNode node)
	{
		_node = node;
	}
	
	public void Apply()
	{
		_node.apply(this);
	}
}
