package edu.uva.sc.oberon0.Evaluators.Structural;

import org.antlr.runtime.Token;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class Assignment implements IStatement {
	String varName;
	ISelector selector;
	IEvaluator value;
	
	public Assignment(String varName, ISelector selecor, IEvaluator value)
	{
		this.varName = varName;
		this.selector = selecor;
		this.value = value;
	}
	public String toString(){
		return this.varName;
	}
	@Override
	public Object evaluate(IScope scope) {
		//selector.evaluate(scope);
		IScope destScope = scope;
		String leftName = this.varName;
		Object leftRef = scope.GetVarValue(this.varName);
		if(leftRef!=null && leftRef.getClass().getName().equals("edu.uva.sc.oberon0.Evaluators.Structural.VariableRef")){
			leftName = ((VariableRef)leftRef).name; 
			destScope = (((VariableRef)leftRef).scope != null)?((VariableRef)leftRef).scope : scope;
		}
		Object value = this.value.evaluate(scope);
		//if(value!=null && value.getClass().getName().equals("edu.uva.sc.oberon0.Evaluators.Structural.VariableRef")){
		//	value = ((VariableRef)value).evaluate(scope); 
		//}
		destScope.SetVarValue(leftName, value);
		return null;
	}
}
