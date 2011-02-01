package oberon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import oberon.data.DataType;

public class Declaration {
	private List<DataType> _variables;
	private List<ProcedureHeading> _procedures;

	public Declaration(List<DataType> variables, List<ProcedureHeading> procedures)
	{
		_variables = variables;
		_procedures = procedures;
	}
	
	public List<DataType> getVariables()
	{
		List<DataType> list = new ArrayList<DataType>();
		
		for (DataType declaration : _variables)
		{
			list.add(declaration);
		}
		
		return Collections.unmodifiableList(list);
	}

	public List<ProcedureHeading> getProcedures() {
		return Collections.unmodifiableList(_procedures);
	}
}
