package ar.oberon0.interpreter.Lists;

import java.util.Map.Entry;

import ar.oberon0.interpreter.DataTypes.DataType;
import ar.oberon0.interpreter.DataTypes.CreatableType;
import ar.oberon0.interpreter.Memory.*;

public class DataFieldList extends BaseMap<DataField> 
{	
	public DataFieldList()
	{
		super();
	}
	
	/*
	 * This function makes a clone of every item in the list that is passed as a parameter and add it to the list.
	 */
	public void CloneAndAdd(DataFieldList variables)
	{	
		for(Entry<String, DataField> item : variables)
		{
			DataField tempField = item.getValue().Clone();
			this.AddItem(item.getKey(), tempField);
		}
		
	}
	
	/*
	 * Add a item to the list for each identifier in the list. 
	 * The type specified is used to create the instance. For example a variable named i of type IntegerNode.
	 */
	public void AddVariables(IdentList identifiers, CreatableType type) 
	{
		for(String identifier : identifiers)
		{
			AddItem(identifier, new DataField(type));
		}
	}
		
}
