package ar.oberon0.interpreter.Procedure;

import java.util.List;

import ar.oberon0.interpreter.ControlFlow.StatementSequence;
import ar.oberon0.interpreter.Lists.ConstantList;
import ar.oberon0.interpreter.Lists.DataFieldList;
import ar.oberon0.interpreter.Lists.FormalParameterList;
import ar.oberon0.interpreter.Lists.ProcedureList;
import ar.oberon0.interpreter.Lists.TypeIdentifierList;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;

/*
 * This class contains all the data of a procedure. It contains data about the parameters, 
 * the direction of the parameters, the statements to execute, the child procedures, etc.
 * A procedure decleration can create a procedure instance that is executable.
 */
public class ProcedureDeclaration
{
	private String _name;
	private Context _context;
	private StatementSequence _statementSequence;
	/*
	 * The formal parameters descripe the parameters of the procedure (direction
	 * and type).
	 */
	private FormalParameterList _formalParameters;

	public void setFormalParameters(FormalParameterList formalParameters)
	{
		_formalParameters = formalParameters;
	}

	public void setChildProcedures(ProcedureList procedures)
	{
		_context.setProcedures(procedures);
		_context.AddProcedure(_name, this);
	}

	public void setStatementSequence(StatementSequence statements)
	{
		_statementSequence = statements;
	}

	public void setVars(DataFieldList vars)
	{
		_context.AddVariables(vars);
	}

	public void setTypes(TypeIdentifierList typeIdentifiers)
	{
		_context.AddTypeIdentifiers(typeIdentifiers);
	}

	public void setConstants(ConstantList constants)
	{
		_context.AddConstants(constants);
	}

	public ProcedureDeclaration(String name)
	{
		_context = new Context();
		_name = name;
	}

	/*
	 * This function checks if the actual parameters are of the expected type
	 * and if so it adds the parameters to the context.
	 */
	private void CheckAndAddActualParametersToContext(List<DataField> actualParameters, Context context) throws Exception
	{
		if (CountainsFormalParameters())
		{
			if (!IsFormalAndActualParamaterCountSame(_formalParameters, actualParameters))
			{
				throw new Exception("The number of actual parameters did not match the number of formal parameters.");
			}
			for (int i = 0; i < _formalParameters.getCount(); i++)
			{
				DataField rawParameter = actualParameters.get(i);
				DataField parameterForContext = null;
				if (_formalParameters.getFormalParameter(i).getDirection() == FormalParameter.Direction.IN)
				{
					parameterForContext = rawParameter.Clone();
				} else
				{
					parameterForContext = rawParameter;
				}
				context.AddVariable(_formalParameters.getNameOfParameter(i), parameterForContext);
			}
		}
	}

	private boolean IsFormalAndActualParamaterCountSame(FormalParameterList formalParameters, List<DataField> actualParameters)
	{
		return formalParameters.getCount() == actualParameters.size();
	}

	private boolean CountainsFormalParameters()
	{
		return (_formalParameters != null && _formalParameters.getCount() > 0);
	}

	/*
	 * Create a procedure that can be interpreted (executed).
	 */
	protected Procedure CreateProcedure(Context context, List<DataField> actualParameters) throws Exception
	{
		Context procedureContext = _context.Clone();
		procedureContext.setParentContext(context);
		CheckAndAddActualParametersToContext(actualParameters, procedureContext);
		Procedure procedure = new Procedure(_statementSequence, procedureContext);
		return procedure;
	}

	public Object getStatementSequence()
	{
		return _statementSequence;
	}

}
