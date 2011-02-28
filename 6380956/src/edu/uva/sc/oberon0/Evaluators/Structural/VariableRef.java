package edu.uva.sc.oberon0.Evaluators.Structural;


import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Selectors.ISelector;
import edu.uva.sc.oberon0.Evaluators.Types.ArrayType;

public class VariableRef implements IEvaluator {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		Object result = currentScope.GetVarValue(this.name, this.selector, scope);
		if(result.getClass().getName().equals(this.getClass().getName())){
			((VariableRef)result).selector = (((VariableRef)result).selector ==null)?this.selector:((VariableRef)result).selector;
			result = ((VariableRef)result).evaluate(scope);
			
		} else if(ArrayType.IsMyType(result)){
			result = ((ArrayType)result).get(this.selector, scope);
		}
		return result;
	}
	public void SetScope(IScope scope) {
		this.scope = scope;
		
	}
	public VariableRef GetRootRef(IScope scope2) {
		if(this.scope != null){
			IScope currentScope = (scope2 != null)?scope2:this.scope;
			Object varValue = this.scope.GetVarValue(this.name, this.selector, currentScope);
			if(!varValue.getClass().getName().equals(this.getClass().getName())){
				return this;
			}
			else {
				return ((VariableRef)varValue).GetRootRef(this.scope);
			}
		}
		return null;
	}
	
	public static Boolean IsMyType(Object toCheck) {
		return toCheck.getClass().getName().equals(VariableRef.class.getName());
	}

}
