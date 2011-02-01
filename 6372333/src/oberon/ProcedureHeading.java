package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import oberon.data.DataType;
import oberon.data.IntegerType;
import oberon.data.VariableManager;

public class ProcedureHeading {
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
	
	public void Call(Queue<Expression> localQueue) throws IOException
	{
		List<DataType> actualParameterList = new ArrayList<DataType>();
		
		for (FormalParamSection section : _paramSections)
		{
			for (String name : section.getNames())
			{
				if (localQueue.peek() == null){
					//TODO throw, less actualparams than formalparams are supplied
					System.out.println("less actualparams than formalparams are supplied");
				}
						
				Expression actualParam = localQueue.poll();
				if (	actualParam instanceof MathematicalExpression ||
						actualParam instanceof IntegerExpression){
					actualParameterList.add(new IntegerType(name, actualParam.EvalAsInt(), false));
				}
				else if (actualParam instanceof SelectorExpression){
					((SelectorExpression)actualParam).getSelector().getSelectorValue();
					actualParameterList.add(new )
				}
			}
		}
		
		VariableManager variableManager = VariableManager.getInstance();
		variableManager.EnterNewScope(actualParameterList);
		
		_body.Eval();
		
		variableManager.LeaveScope();
	}

	public ProcedureHeading DeepCopy() {
		return new ProcedureHeading(_name, _paramSections, _body);
	}
}
