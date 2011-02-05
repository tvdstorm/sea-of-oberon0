package oberon.procedures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import oberon.IDataType;
import oberon.IExpression;
import oberon.VariableManager;


public class ProcedureHeading extends AbstractProcedure {
	public ProcedureHeading(final String name, final List<FormalParamSection> paramSections, 
			final ProcedureBody body) {
		super(name, paramSections, body);
	}

	@Override
	public void call(final Queue<IExpression> localQueue) throws IOException {
		final List<IDataType> actualParameterList = new ArrayList<IDataType>();
		
		for (FormalParamSection section : getParamSections()) {
			for (String name : section.getNames()) {
				if (localQueue.peek() == null){
					//TODO throw, less actualparams than formalparams are supplied
				}
						
				final IExpression actualParam = localQueue.poll();
				actualParameterList.add(actualParam.copy(name));
			}
		}
		
		final VariableManager variableManager = VariableManager.getInstance();
		variableManager.enterNewScope(actualParameterList, this);
		
		getBody().eval();
		
		variableManager.leaveScope();
	}
}
