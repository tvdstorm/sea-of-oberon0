package nl.bve.uva.oberon.env.procedures;

import java.util.List;
import java.util.ListIterator;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.ast.ParametersNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.Type;

public class ApplicationProcedure implements Procedure {
	private String name;
	private List<IInterpretableNode> formalParametersList;
	private IInterpretableNode body;	
	
	public ApplicationProcedure(String name, List<IInterpretableNode> fpList, IInterpretableNode body) {
		this.name = name;
		this.formalParametersList = fpList;
		this.body = body;
	}
	
	@Override
	public void callProcedure(Environment env, List<IInterpretableNode> actualParameters) {
		if (formalParametersList == null && actualParameters != null) {
			throw new RuntimeException("Too many actual values provided for procedure " +name);
		}
		if (formalParametersList != null && actualParameters == null) {
			throw new RuntimeException("No actual values given for procedure " +name+ " (parameters needed: " +formalParametersList.size());
		}
		
		Environment subEnv = env.getNewSubSpace();
		
		if (formalParametersList != null && actualParameters != null) {
			ListIterator<IInterpretableNode> actuals = actualParameters.listIterator();
			
			for (IInterpretableNode fpList : formalParametersList) {
				ParametersNode fpSection = (ParametersNode) fpList;
				List<String> identList = fpSection.interpret(subEnv);
				
				for (String ident : identList) {
					if (!actuals.hasNext()) {
						throw new RuntimeException("Not enough actual values given for procedure " +name+ " (parameters needed: " +formalParametersList.size());
					}
					
					Type value = (Type)actuals.next().interpret(subEnv);
					value = fpSection.processValue(ident, value);
					subEnv.addVariable(ident, value);
				}
			}
			
			if (actuals.hasNext()) {
				throw new RuntimeException("Too many actual values given for procedure " +name+ " (parameters needed: " +formalParametersList.size());
			}
		}
		
		body.interpret(subEnv);
	}
}
