package ar.oberon0.interpreter.Procedure;

import java.util.List;
import java.util.Map.Entry;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.ControlFlow.StatementSequence;
import ar.oberon0.interpreter.Lists.ConstantList;
import ar.oberon0.interpreter.Lists.FormalParameterList;
import ar.oberon0.interpreter.Lists.ProcedureList;
import ar.oberon0.interpreter.Lists.TypeIdentifierList;
import ar.oberon0.interpreter.Lists.DataFieldList;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;

public class Procedure implements Interpretable 
{
	private String _name;
	private Context _context;
	private StatementSequence _statementSequence;
	private FormalParameterList _formalParameterList;

	public void setActualParameters(List<DataField> actualParameters) throws Exception
	{
		if(CountainsFormalParameters())
		{
			if(!IsFormalAndActualParamaterCountSame(_formalParameterList,actualParameters))
			{
				throw new Exception("The number of actual parameters did not match the number of formal parameters.");
			}
			for(int i =0; i < _formalParameterList.getCount(); i++)
			{
				DataField rawParameter = actualParameters.get(i);
				DataField parameterForContext = null;
				if(_formalParameterList.getFormalParameter(i).getDirection() == FormalParameter.Direction.IN)
				{
					parameterForContext = rawParameter.Clone();
				} else
				{
					parameterForContext = rawParameter;
				}
				_context.AddVariable(_formalParameterList.getNameOfParameter(i),parameterForContext);
			}
		}
	}
	
	private boolean IsFormalAndActualParamaterCountSame(FormalParameterList formalParameters, List<DataField> actualParameters) 
	{	
		return formalParameters.getCount() == actualParameters.size();
	}

	private boolean CountainsFormalParameters() 
	{
		return (_formalParameterList != null && _formalParameterList.getCount() > 0);
	}

	public void setFormalParameters(FormalParameterList formalParameters) 
	{
		_formalParameterList = formalParameters;
	}

	public void setChildProcedures(ProcedureList procedures) 
	{
		_context.setProcedures(procedures);
		_context.AddProcedure(_name,this);
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
	
	
	public Procedure(String name) 
	{
		_context = new Context();
		_name = name;
	}

	@Override
	public Object Interpret(Context context) throws Exception 
	{
		// Set the parent context, this is needed otherwise the data and procedures of the parent construct aren't accessible.
		_context.setParentContext(context);
		_statementSequence.Interpret(_context);
		return 0;
	}

}
