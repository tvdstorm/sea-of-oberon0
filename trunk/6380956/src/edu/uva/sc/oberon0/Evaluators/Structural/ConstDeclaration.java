package edu.uva.sc.oberon0.Evaluators.Structural;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Types.ConstType;
import edu.uva.sc.oberon0.Evaluators.Types.IType;

public class ConstDeclaration implements IDeclaration {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
