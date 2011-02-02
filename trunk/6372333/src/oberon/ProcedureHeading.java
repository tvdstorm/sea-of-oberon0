package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import oberon.data.DataType;
import oberon.data.IntegerType;
import oberon.data.VariableManager;


public class ProcedureHeading extends Procedure {
	public ProcedureHeading(String name, List<FormalParamSection> paramSections, ProcedureBody body)
	{
		super(name, paramSections, body);
	}

	@Override
	public void Call(Queue<Expression> localQueue) throws IOException {
		List<DataType> actualParameterList = new ArrayList<DataType>();
		
		for (FormalParamSection section : getParamSections())
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
					SelectorExpression selectorExpression = ((SelectorExpression)actualParam);
					if (section.shouldBeCalledByRef())
					{
						//Pass by value
						actualParameterList.add(selectorExpression.performShallowCopyOfValue(name));
					}
					else
					{
						//Pass by ref
						actualParameterList.add(selectorExpression.performDeepCopyOfValue(name));
					}
				}
			}
		}
		
		VariableManager variableManager = VariableManager.getInstance();
		variableManager.EnterNewScope(actualParameterList, this);
		
		getBody().Eval();
		
		variableManager.LeaveScope();
	}
}
