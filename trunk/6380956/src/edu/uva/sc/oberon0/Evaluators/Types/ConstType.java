package edu.uva.sc.oberon0.Evaluators.Types;

import edu.uva.sc.oberon0.Evaluators.Structural.IScope;

public class ConstType implements IType {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConstType(){
		
	}
	@Override
	public Object evaluate(IScope scope) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetName(IScope scope) {
		return "CONST";
	}

}
