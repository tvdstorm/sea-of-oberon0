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
		ISelector selector = this.selector;
		Object leftRef = scope.GetVarValue(this.varName, null, scope);
		if(leftRef!=null && leftRef.getClass().getName().equals("edu.uva.sc.oberon0.Evaluators.Structural.VariableRef")){
			VariableRef rootLeftRef = ((VariableRef)leftRef).GetRootRef(scope);
			rootLeftRef.selector = ((VariableRef)leftRef).selector;
			leftRef = (rootLeftRef != null)? rootLeftRef : leftRef;
			leftName = ((VariableRef)leftRef).name; 
			destScope = (((VariableRef)leftRef).scope != null)?((VariableRef)leftRef).scope : scope;
			selector = (((VariableRef)leftRef).selector != null)?((VariableRef)leftRef).selector : selector;
		}

		Object value = this.value.evaluate(scope);

		destScope.SetVarValue(leftName, value, selector, scope);
		return null;
	}
}
