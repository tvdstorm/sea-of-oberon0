package ar.oberon0.interpreter.Lists;

import ar.oberon0.interpreter.IdentList;
import ar.oberon0.interpreter.DataTypes.Type;
import ar.oberon0.interpreter.Memory.*;

public class VarList extends BaseList<Var> 
{	
	public VarList()
	{
		super();
	}
	
	public void AddVariables(IdentList identifiers, Type type) 
	{
		for(String identifier : identifiers)
		{
			AddItem(identifier, new Var(type));
		}
	}
		
}
