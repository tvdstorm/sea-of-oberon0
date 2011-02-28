package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.List;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class ProcedureHeading implements IEvaluator {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String procedureName;
	List<FormalParametersSection> formalParametersSections;
	
	public ProcedureHeading(String name, List<FormalParametersSection> fps){
		this.procedureName = name;
		this.formalParametersSections = fps;
	}
	
	@Override
	public Object evaluate(IScope scope) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String GetName(){
		return this.procedureName;
	}
	public List<FormalParametersSection> GetParameters(){
		return this.formalParametersSections;
	}
	
	public String toString(){
		String result = "PROC: "+this.procedureName + " | PARAMS: ";
		if(formalParametersSections != null){
			for (FormalParametersSection fParamSection : formalParametersSections) {
				result += fParamSection.toString();
			}
		}
		return result;
	}
}
