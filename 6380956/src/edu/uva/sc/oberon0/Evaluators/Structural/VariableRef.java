package edu.uva.sc.oberon0.Evaluators.Structural;

import org.antlr.runtime.Token;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class VariableRef implements IEvaluator {
	String name;
	ISelector selector;
	IScope scope;
	
	public VariableRef(String name, ISelector selector)
	{
		this.name = name;
		this.selector = selector;
	}
	@Override
	public Object evaluate(IScope scope) {
		IScope currentScope;
		if(this.scope != null){
			currentScope = this.scope;	
		} else {
			currentScope = scope;
		}
		Object result = currentScope.GetVarValue(this.name);
		if(result.getClass().getName().equals(this.getClass().getName())){
			result = ((VariableRef)result).evaluate(scope);
		}
		return result;
	}
	public void SetScope(IScope scope) {
		this.scope = scope;
		
	}

}
