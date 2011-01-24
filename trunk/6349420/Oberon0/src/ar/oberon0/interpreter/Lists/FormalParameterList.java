package ar.oberon0.interpreter.Lists;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.interpreter.DataTypes.CreatableType;
import ar.oberon0.interpreter.Procedure.FormalParameter;

public class FormalParameterList 
{
	private List<FormalParameterWithName> _parameters;
	
	public FormalParameterList()
	{
		_parameters = new ArrayList<FormalParameterWithName>();
	}
	
	public int getCount()
	{
		return _parameters.size();
	}
	
	/*
	 * Add a parameter to the list for each identifier in the list with the specified type. 
	 */
	public void AddParameters(IdentList identifiers, CreatableType type, FormalParameter.Direction direction) 
	{
		for(String identifier : identifiers)
		{			
			_parameters.add(new FormalParameterWithName(identifier, type, direction));
		}
	}
	
	public FormalParameter getFormalParameter(int index)
	{
		return _parameters.get(index);
	}
	
	public String getNameOfParameter(int index)
	{
		return _parameters.get(index).getName();
	}
	
	private class FormalParameterWithName extends FormalParameter
	{
		private String _name;
		
		public String getName()
		{
			return _name;
		}
		
		public FormalParameterWithName(String name, CreatableType type, Direction direction) 
		{
			super(type, direction);
			_name = name;
		}
		
	}
	
}
