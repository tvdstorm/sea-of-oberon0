package ar.oberon0.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Selector implements Interpretable, Settable {
	
	private Selector _nextNode;
	
	public Selector getNextNode()
	{
		return _nextNode;
	}
	
	public void setNextNode(Selector nextNode)
	{
		_nextNode = nextNode;
	}
	
	protected Selector()
	{
	}		
	
	@Override
	public Object Interpret() throws Exception {
		String result = "";
		
		return result;
	}

	@Override
	public void SetValueOfVariable(Object value) {
		System.out.println("in setter from VariableSelector");
		
	}
}
