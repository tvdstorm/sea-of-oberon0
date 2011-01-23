package ar.oberon0.interpreter.Lists;

import ar.oberon0.interpreter.IdentList;
import ar.oberon0.interpreter.DataTypes.Type;
import ar.oberon0.interpreter.Memory.*;

public class VarList extends BaseList<DataField> 
{	
	public VarList()
	{
		super();
	}
	
	public void AddVariables(IdentList identifiers, Type type) 
	{
		for(String identifier : identifiers)
		{
			try {
				AddItem(identifier, new DataField(type));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
}
