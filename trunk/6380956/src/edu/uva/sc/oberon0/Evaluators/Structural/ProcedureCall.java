package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class ProcedureCall implements IStatement, IScope {
	String procedureName;
	List<IEvaluator> parameters;
	IScope parentScope;
	Map<String, Object> refs = new HashMap<String, Object>();
	
	public ProcedureCall(String procName, List<IEvaluator> params){
		this.procedureName = procName;
		this.parameters = params;
	}
	
	@Override
	public Object evaluate(IScope scope) {
		SetParentScope(scope);
		ProcedureDeclaration proc = scope.GetProcedure(this.procedureName);
		int index = 0;
		for (FormalParametersSection fps : proc.heading.GetParameters()) {
			for (String formalParamName : fps.GetFormalParameters()) {
				Object actualParamValue = (fps.isByRef)?
						this.parameters.get(index): 
						this.parameters.get(index).evaluate(scope);
				AddToScope(formalParamName);
				SetVarValue(formalParamName, actualParamValue);
				
				index++;
			}
		}
		proc.body.evaluate(this);
		return null;
	}

	@Override
	public Object GetVarValue(String varName) {
		Object result = refs.get(varName);
		if(result == null) result = this.parentScope.GetVarValue(varName);
		return result;
	}

	@Override
	public void SetVarValue(String varName, Object value) {
		if(!refs.containsKey(varName)) {
			parentScope.SetVarValue(varName, value);
		} else {
			this.refs.put(varName, value);
		}	
	}

	@Override
	public void AddToScope(String varName) {
		if(!refs.containsKey(varName)) {
			this.refs.put(varName, null);
		}
	}
	@Override
	public IScope GetParentScope() {
		return this.parentScope;
	}

	@Override
	public void SetParentScope(IScope scope) {
		this.parentScope = scope;
	}

	@Override
	public ProcedureDeclaration GetProcedure(String procedureName) {
		return (ProcedureDeclaration)GetVarValue(procedureName);
	}
}
