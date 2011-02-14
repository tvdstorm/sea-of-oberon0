package oberon.procedures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import oberon.IDataType;
import oberon.IExpression;
import oberon.Scope;

/**
 * The Class ProcedureHeading, contains a concrete procedure.
 */
public class ProcedureHeading extends AbstractProcedure {
	
	private Scope newScope;

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
	public void call(final Scope currentScope, final List<IExpression> localQueue) throws IOException {
		final List<IDataType> actualParameterList = new ArrayList<IDataType>();
		Iterator<IExpression> actualParamIterator = localQueue.iterator();
		
		for (FormalParamSection section : getParamSections()) {
			for (String name : section.getNames()) {		
				
				if (actualParameterList.isEmpty()){
					//todo: throw exception te weinig formal params
				}
				
				final IExpression actualParam = actualParamIterator.next();
				
				actualParameterList.add(actualParam.copy(currentScope, name, section.shouldBeCalledByRef()));
			}
		}
		
		//store the scope in a field for testing purposes
		newScope = currentScope.createNewScope(actualParameterList, this);
		
		getBody().eval(newScope);
	}
	
	/**
	 * Gets the scope, used for testing purposes.
	 *
	 * @return the scope
	 */
	public Scope getScope(){
		return newScope;
	}

	public List<FormalParamSection> getActualParams() {
		return Collections.unmodifiableList(getParamSections());		
	}
}
