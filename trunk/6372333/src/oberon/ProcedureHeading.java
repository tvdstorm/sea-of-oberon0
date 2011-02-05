package oberon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import oberon.data.AbstractDataType;
import oberon.data.IntegerType;
import oberon.data.VariableManager;
import oberon.expressions.AbstractIntegerExpression;
import oberon.expressions.MathematicalExpression;
import oberon.expressions.SelectorExpression;


public class ProcedureHeading extends AbstractProcedure {
	public ProcedureHeading(final String name, final List<FormalParamSection> paramSections, 
			final ProcedureBody body) {
		super(name, paramSections, body);
	}

	@Override
	public void call(final Queue<IExpression> localQueue) throws IOException {
		final List<AbstractDataType> actualParameterList = new ArrayList<AbstractDataType>();
		
		for (FormalParamSection section : getParamSections()) {
			for (String name : section.getNames()) {
				if (localQueue.peek() == null){
					//TODO throw, less actualparams than formalparams are supplied
				}
						
				final IExpression actualParam = localQueue.poll();
				if (	actualParam instanceof MathematicalExpression ||
						actualParam instanceof AbstractIntegerExpression){
					actualParameterList.add(new IntegerType(name, actualParam.evalAsInt(), false));
				}
				else if (actualParam instanceof SelectorExpression){
					final SelectorExpression selectorExpression = ((SelectorExpression)actualParam);
					if (section.shouldBeCalledByRef()) {
						//Pass by value
						actualParameterList.add(selectorExpression.performShallowCopyOfValue(name));
					}
					else {
						//Pass by ref
						actualParameterList.add(selectorExpression.performDeepCopyOfValue(name));
					}
				}
			}
		}
		
		final VariableManager variableManager = VariableManager.getInstance();
		variableManager.enterNewScope(actualParameterList, this);
		
		getBody().eval();
		
		variableManager.leaveScope();
	}
}
