package ar.oberon0.interpreter.Memory;

import java.util.ArrayList;
import java.util.List;
import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;

public abstract class Selector implements Interpretable
{
	protected Selector _nextNode;
	
	public Selector getNextNode()
	{
		return _nextNode;
	}
	
	public void setNextNode(Selector nextNode)
	{
		_nextNode = nextNode;
	}	
}
