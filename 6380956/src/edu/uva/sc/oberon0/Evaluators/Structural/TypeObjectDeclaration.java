package edu.uva.sc.oberon0.Evaluators.Structural;

import edu.uva.sc.oberon0.Evaluators.Types.IType;

public class TypeObjectDeclaration implements IDeclaration {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private IType type;

	public TypeObjectDeclaration (String name, IType type){
		this.name = name;
		this.type = type;
	}
	@Override
	public Object evaluate(IScope scope) {
		return type.evaluate(scope);
	}

	@Override
	public String GetType(IScope scope) {
		return type.toString();
	}

	@Override
	public String GetName(IScope scope) {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public void AddToScope(IScope scope) {
		scope.AddToScope(this.name, this.type);
		
	}
}
