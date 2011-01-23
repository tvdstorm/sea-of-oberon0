package ar.oberon0.interpreter.Memory;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;

public abstract class Selector
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
	
	protected abstract DataField getVar(DataField parent, Context context) throws Exception;
}
