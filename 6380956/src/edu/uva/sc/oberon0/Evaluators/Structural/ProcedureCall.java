package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.uva.sc.oberon0.ObjectCloner;
import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Selectors.ISelectable;
import edu.uva.sc.oberon0.Evaluators.Selectors.ISelector;
import edu.uva.sc.oberon0.Evaluators.Types.IType;

public class ProcedureCall implements IStatement, IScope {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
				
				Object actualParamValue = this.parameters.get(index);
				ISelector selector = null;
				
				if(!fps.isByRef){
					actualParamValue = this.parameters.get(index).evaluate(scope);
				} else{
					((VariableRef)actualParamValue).SetScope(scope);
					selector = ((VariableRef)actualParamValue).selector;
				}
						
				AddToScope(formalParamName, fps.formalParametersSectionType);
				SetVarValue(formalParamName, actualParamValue, selector, scope);
				
				index++;
			}
		}

		ProcedureBody procBody = null;
		try {
			procBody = (ProcedureBody)ObjectCloner.deepCopy(proc.body);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		procBody.evaluate(this);
		return null;
	}

	@Override
	public Object GetVarValue(String varName, ISelector selector, IScope scope) {
		Object result = refs.get(varName);
		
		if(result == null){
			
			result = this.parentScope.GetVarValue(varName, selector, scope);
			
		} else if(selector != null && result != null && !VariableRef.IsMyType(result)) {
			
			result = ((ISelectable)result).get(selector, this);
			
		}
		if(VariableRef.IsMyType(result) && selector != null) {
			((VariableRef)result).selector = selector;
		}
		return result;
		
	}

	@Override
	public void SetVarValue(String varName, Object value, ISelector selector, IScope scope) {
		
		if(!refs.containsKey(varName)) {
			parentScope.SetVarValue(varName, value, selector, scope);
		} else {
			
			this.refs.put(varName, value);
		}	
	}

	@Override
	public void AddToScope(String varName, IType type) {
		if(!refs.containsKey(varName)) {
			this.refs.put(varName, type);
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
		return (ProcedureDeclaration)GetVarValue(procedureName, null, null);
	}
}
