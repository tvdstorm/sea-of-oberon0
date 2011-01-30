package ar.oberon0.interpreter.Procedure;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;

/*
 * This node is used to call a procedure. 
 */
public class ProcedureCallNode implements Interpretable
{
	private String _procedureName;
	/*
	 * The parameters that get passed to the procedure.
	 */
	private List<Interpretable> _parameters;

	public ProcedureCallNode(String procedureName, List<Interpretable> parameters)
	{
		_procedureName = procedureName;
		_parameters = parameters;
	}

	@Override
	public Object Interpret(Context context) throws TechnicalException
	{
		// Get the procedure declaration to create a new procedure.
		ProcedureDeclaration procedureDeclaration = context.getProcedure(_procedureName);
		// Create a list with parameters to pass to the procedure.
		List<DataField> actualParameters = CreateParameterList(_parameters, context);
		// Create the procedure instance.
		Procedure procedureToInvoke = procedureDeclaration.CreateProcedure(context, actualParameters);
		return procedureToInvoke.Interpret(context);
	}

	/*
	 * Create a actual parameter list. This function converts all the parameters
	 * that are not of the DataField type into DataField types.
	 */
	private List<DataField> CreateParameterList(List<Interpretable> rawParameters, Context context) throws TechnicalException
	{
		List<DataField> resultParameters = new ArrayList<DataField>();
		if (rawParameters != null)
		{
			for (Interpretable rawParameter : rawParameters)
			{
				// Ensure that the parameter is of the DataField type.
				resultParameters.add(Helper.ConvertToDataField(rawParameter, context));
			}
		}
		return resultParameters;
	}

}
