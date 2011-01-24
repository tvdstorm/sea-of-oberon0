package ar.oberon0.interpreter.Procedure;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Lists.DataFieldList;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;

public class ProcedureCallNode implements Interpretable {

	private String _procedureName;
	private List<Interpretable> _parameters;
	
	public ProcedureCallNode(String procedureName, List<Interpretable> parameters)
	{
		_procedureName = procedureName;
		_parameters = parameters;
	}
	
	@Override
	public Object Interpret(Context context) throws Exception 
	{
		Procedure procedureToInvoke = context.getProcedure(_procedureName);
		List<DataField> actualParameters = CreateParameterList(_parameters,context);
		procedureToInvoke.setActualParameters(actualParameters);
		return procedureToInvoke.Interpret(context);
	}
	
	private List<DataField> CreateParameterList(List<Interpretable> rawParameters, Context context) throws Exception
	{
		List<DataField> resultParameters = new ArrayList<DataField>();
		if(rawParameters != null)
		{
			for(Interpretable rawParameter : rawParameters)
			{
				if(rawParameter instanceof DataField)
				{
					resultParameters.add((DataField)rawParameter);
				}
				else
				{
					resultParameters.add(Helper.ConvertToDataField(rawParameter, context));
				}
			}
		}
		return resultParameters;
	}

}
