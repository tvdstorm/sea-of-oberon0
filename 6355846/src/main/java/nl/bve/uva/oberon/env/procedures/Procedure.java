package nl.bve.uva.oberon.env.procedures;

import java.util.Iterator;
import java.util.List;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;
import nl.bve.uva.oberon.shared.TypedParameterList;

public abstract class Procedure {
	public final void callProcedure(Environment env, List<ExpressionNode> actualParameters) {
		List<TypedParameterList> formalParametersList = getFormalParameters();
		
		if (formalParametersList == null && actualParameters != null) {
			throw new RuntimeException("Too many actual values provided for procedure " +getName());
		}
		if (formalParametersList != null && actualParameters == null) {
			throw new RuntimeException("No actual values given for procedure " +getName()+ " (parameters needed: " +formalParametersList.size());
		}
		
		Environment subEnv = env.getNewSubSpace();
		
		if (formalParametersList != null && actualParameters != null) {
			Iterator<ExpressionNode> actuals = actualParameters.iterator();
			
			for (TypedParameterList fpList : formalParametersList) {
				List<String> identList = fpList.getParametersList();
				
				for (String ident : identList) {
					if (!actuals.hasNext()) {
						throw new RuntimeException("Not enough actual values given for procedure " +getName()+ " (parameters needed: " +formalParametersList.size());
					}
					
					OberonType value = actuals.next().eval(subEnv);
					value = fpList.processValue(ident, value, subEnv);
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
