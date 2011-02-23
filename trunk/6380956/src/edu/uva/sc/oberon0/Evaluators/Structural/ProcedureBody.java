package edu.uva.sc.oberon0.Evaluators.Structural;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class ProcedureBody implements IEvaluator, IScope, Serializable {
	List<IDeclaration> declarations;
	List<IStatement> statements;
	IScope parentScope;
	public Map<String, Object> refs = new HashMap<String, Object>();
	
	public ProcedureBody(List<IDeclaration> declarations, List<IStatement> statements){
		this.declarations = declarations;
		this.statements = statements;
	}
	
	@Override
	public Object evaluate(IScope scope) {
		SetParentScope(scope);
		if(declarations != null){
			for (IDeclaration decl : declarations) {
				decl.evaluate(this);
			}
		}
		if(statements != null){
			for (IStatement stat : statements) {
				stat.evaluate(this);
			}
		}
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
	public String toString(){
		String result = "PROCBODY: ";
		if(declarations != null){
			result += "\ndeclars: ";
			for (IDeclaration decl : declarations) {
				result += "\n"+decl.toString();
			}
		}
		if(statements != null){
			result += "\nstatements: ";
			for (IStatement stat : statements) {
				result += "\n"+stat.toString();
			}
		}
		return result;
	}
}
