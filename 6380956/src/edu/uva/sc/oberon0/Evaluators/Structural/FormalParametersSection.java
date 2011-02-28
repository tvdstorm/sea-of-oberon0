package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.List;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Types.IType;

public class FormalParametersSection implements IEvaluator {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<String> formalParameters;
	IType formalParametersSectionType;
	Boolean isByRef=false;
	
	public FormalParametersSection(List<String> params, IType type, String byRef){
		this.formalParameters = params;
		this.formalParametersSectionType = type;
		if("VAR".equals(byRef)) this.isByRef = true;
	}
	public String toString(){
		String result = "\nFP_section: ";
		if(formalParameters != null){
			for (String param : formalParameters) {
				result += "\n" + param;
			}
			result += "\n"+ formalParametersSectionType.toString();
		}
		return result;
	}
	@Override
	public Object evaluate(IScope scope) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<String> GetFormalParameters(){
		return this.formalParameters;
	}
}
