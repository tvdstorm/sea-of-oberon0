package nl.bve.uva.oberon.env.procedures;

import java.util.List;
import java.util.ListIterator;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Type;

public abstract class BuiltIn implements Procedure {
	@Override
	public void callProcedure(Environment env, List<IInterpretableNode> actualParameters) {
		List<TypedParameterList> formalParametersList = getFormalParameters();
		
		if (formalParametersList == null && actualParameters != null) {
			throw new RuntimeException("Too many actual values provided for procedure " +getName());
		}
		if (formalParametersList != null && actualParameters == null) {
			throw new RuntimeException("No actual values given for procedure " +getName()+ " (parameters needed: " +formalParametersList.size());
		}
		
		Environment subEnv = env.getNewSubSpace();
		
		if (formalParametersList != null && actualParameters != null) {
			ListIterator<IInterpretableNode> actuals = actualParameters.listIterator();
			
			for (TypedParameterList fpList : formalParametersList) {
				List<String> identList = fpList.getParametersList();
				
				for (String ident : identList) {
					if (!actuals.hasNext()) {
						throw new RuntimeException("Not enough actual values given for procedure " +getName()+ " (parameters needed: " +formalParametersList.size());
					}
					
					Type value = (Type)actuals.next().interpret(subEnv);
					value = fpList.processValue(value);
					subEnv.addVariable(ident, value);
				}
			}
			
			if (actuals.hasNext()) {
				throw new RuntimeException("Too many actual values given for procedure " +getName()+ " (parameters needed: " +formalParametersList.size());
			}
		}
		
		execute(subEnv);
	}
	
	public String getName() {
		return this.getClass().getCanonicalName();
	}
	
	public abstract List<TypedParameterList> getFormalParameters();
	public abstract void execute(Environment env);
}
