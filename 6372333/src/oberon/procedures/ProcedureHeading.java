package oberon.procedures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import oberon.IDataType;
import oberon.IExpression;
import oberon.VariableManager;
import oberon.exceptions.UnsupportedException;

/**
 * The Class ProcedureHeading, contains a concrete procedure.
 */
public class ProcedureHeading extends AbstractProcedure {
	
	/**
	 * Instantiates a new procedure heading.
	 *
	 * @param name the name of the procedure
	 * @param paramSections the param sections of the procedure
	 * @param body the body of the procedure
	 */
	public ProcedureHeading(final String name, final List<FormalParamSection> paramSections, 
			final ProcedureBody body) {
		super(name, paramSections, body);
	}

	/* (non-Javadoc)
	 * @see oberon.procedures.AbstractProcedure#call(java.util.Queue)
	 */
	@Override
	public void call(final Queue<IExpression> localQueue) throws IOException, UnsupportedException {
		final List<IDataType> actualParameterList = new ArrayList<IDataType>();
		
		for (FormalParamSection section : getParamSections()) {
			for (String name : section.getNames()) {						
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
