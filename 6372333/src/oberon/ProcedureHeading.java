package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ProcedureHeading implements INamedClass, IDeepCopyable<ProcedureHeading>{
	private String _name;
	private List<FormalParamSection> _paramSections;
	private ProcedureBody _body;
	
	public ProcedureHeading(String name, List<FormalParamSection> paramSections, ProcedureBody body)
	{
		_name = name;
		_paramSections = paramSections;
		_body = body;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public void Call(Queue<Expression> actualParameters) throws IOException
	{
		List<VarVariable> actualParameterList = new ArrayList<VarVariable>();
		List<ArrayVariable> actualArrayList = new ArrayList<ArrayVariable>();
		
		for (FormalParamSection section : _paramSections)
		{
			for (String name : section.getNames())
			{
				Expression expression = actualParameters.poll();
				if (section.getType() == FormalParamType.Identifier)
				{
					actualParameterList.add(new VarVariable(name, expression));
//					if (expression instanceof IdentifierExpression)
//					{
//						String varNameToCopy = ((IdentifierExpression)expression).getName();
//						VarVariable variableToCopy = VariableManager.getInstance().getVariable(varNameToCopy);
//						
//						if (variableToCopy != null)
//							actualParameterList.add(variableToCopy.ShallowCopy(name));
//						else
//							actualParameterList.add(new VarVariable(name, expression));
//					}
//					else
//					{
//						actualParameterList.add(new VarVariable(name, expression));
//					}
				}
				else if (section.getType() == FormalParamType.Array)
				{
					String arrayNameToCopy = ((IdentifierExpression)expression).getName();
					
					ArrayVariable arrayToCopy = VariableManager.getInstance().getArray(arrayNameToCopy);
					actualArrayList.add(arrayToCopy.ShallowCopy(name));	
				}
			}
		}
		
		VariableManager variableManager = VariableManager.getInstance();
		variableManager.EnterNewScope(actualParameterList, actualArrayList);
		
		_body.Eval();
		
		variableManager.LeaveScope();
	}

	@Override
	public ProcedureHeading DeepCopy() {
		return new ProcedureHeading(_name, _paramSections, _body);
	}
}
