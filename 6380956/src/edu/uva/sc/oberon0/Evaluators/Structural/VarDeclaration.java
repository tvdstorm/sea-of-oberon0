package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.List;

import edu.uva.sc.oberon0.Evaluators.Types.IType;

public class VarDeclaration implements IDeclaration {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> names;
	private IType type;

	public VarDeclaration (List<String> names, IType type){
		this.names = names;
		this.type = type;
	}
	@Override
	public Object evaluate(IScope scope) {
		return type.evaluate(scope);
	}

	@Override
	public String GetType(IScope scope) {
		return "VAR - " + type.GetName(scope) ;
	}

	@Override
	public String GetName(IScope scope) {
		return this.names.toString();
	}
	public String toString(){
		return names.toString() +" "+ type.toString();
	}
	@Override
	public void AddToScope(IScope scope) {
		for (String name : names) {
			scope.AddToScope(name, type);
		}
		
	}
}
