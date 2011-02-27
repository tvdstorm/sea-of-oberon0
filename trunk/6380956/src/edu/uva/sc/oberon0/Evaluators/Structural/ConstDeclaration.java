package edu.uva.sc.oberon0.Evaluators.Structural;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;

public class ConstDeclaration implements IDeclaration {
	String name;
	IEvaluator value;
	IType type;
	
	public ConstDeclaration (String name, IEvaluator value){
		this.name = name;
		this.value = value;
		type = new ConstType();
	}
	
	@Override
	public Object evaluate(IScope scope) {
		Object result = value.evaluate(scope);
		scope.SetVarValue(this.name, result, null, scope);
		return result;
	}
	@Override
	public String toString() {
		return type.toString()+" "+name;
	}

	@Override
	public String GetType(IScope scope) {
		return type.toString();
	}

	@Override
	public String GetName(IScope scope) {
		return this.name;
	}
	@Override
	public void AddToScope(IScope scope) {
		scope.AddToScope(this.name, null);
		
	}
}
