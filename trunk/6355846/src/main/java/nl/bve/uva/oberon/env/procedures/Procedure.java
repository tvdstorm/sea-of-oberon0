package nl.bve.uva.oberon.env.procedures;

import java.util.Iterator;
import java.util.List;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonType;
import nl.bve.uva.oberon.shared.TypedParameterList;

public abstract class Procedure {
	public final void callProcedure(Environment env, List<IInterpretableNode> actualParameters) {
		List<TypedParameterList> formalParametersList = getFormalParameters();
		
		if (formalParametersList == null && actualParameters != null) {
			throw new RuntimeException("Too many actual values provided for procedure " +getName());
		}
		if (formalParametersList != null && actualParameters == null) {
			throw new RuntimeException("No actual values given for procedure " +getName()+ " (parameters needed: " +formalParametersList.size());
		}
		if (formalParametersList != null && actualParameters != null) {
			if (actualParameters.size() < formalParametersList.size()) {
				throw new RuntimeException("Not enough actual values given for procedure " +getName()+ " (parameters needed: " +formalParametersList.size());
			} else if (actualParameters.size() > formalParametersList.size()) {
				throw new RuntimeException("Too many actual values given for procedure " +getName()+ " (parameters needed: " +formalParametersList.size());
			}
		}
		
		Environment subEnv = env.getNewSubSpace();
		
		if (formalParametersList != null && actualParameters != null) {
			fillFormalsWithActuals(subEnv, actualParameters);
		}
		
		execute(subEnv);
	}
	
	private void fillFormalsWithActuals(Environment env, List<IInterpretableNode> actualParameters) {
		Iterator<IInterpretableNode> actualsIter = actualParameters.iterator();
		
		for (TypedParameterList fpList : getFormalParameters()) {
			List<String> identList = fpList.getParametersList();
			
			for (String ident : identList) {
				OberonType value = (OberonType)actualsIter.next().interpret(env);
				value = fpList.processValue(ident, value, env);
				env.addVariable(ident, value);
			}
		}
	}
	
	public String getName() {
		return this.getClass().getCanonicalName();
	}
	
	public abstract List<TypedParameterList> getFormalParameters();
	public abstract void execute(Environment env);
}
