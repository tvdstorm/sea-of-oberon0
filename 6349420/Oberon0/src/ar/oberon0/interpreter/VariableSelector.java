package ar.oberon0.interpreter;

import java.util.ArrayList;
import java.util.List;

public class VariableSelector implements Interpretable, Settable {
	
	List<Interpretable> _selectors;
	
	public VariableSelector()
	{
		_selectors = new ArrayList<Interpretable>();
		System.out.println("In constructor VariableSelector");
	}
	
	public void AddSelector(Interpretable selector)
	{
		_selectors.add(selector);
	}
	
	public void SetRootVariable(Interpretable rootVariable)
	{
		_selectors.add(0, rootVariable);
	}

	@Override
	public Object Interpret() throws Exception {
		String result = "";
		for(Interpretable i : _selectors)
		{
			result = result + i.Interpret().toString();
		}
		return result;
	}

	@Override
	public void SetValueOfVariable(Object value) {
		System.out.println("in setter from VariableSelector");
		
	}
}
