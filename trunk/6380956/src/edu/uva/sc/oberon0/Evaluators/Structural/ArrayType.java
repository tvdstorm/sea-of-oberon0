package edu.uva.sc.oberon0.Evaluators.Structural;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Numerical.Integ;

public class ArrayType implements IType {
	IEvaluator length;
	IType type;
	ArraySelector selector;
	
	public ArrayType(IEvaluator expr, IType type){
		this.length = expr;
		this.type = type;
	}
	
	@Override
	public Object evaluate(IScope scope) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String GetName(IScope scope) {
		return "ARRAY of " + type.GetName(scope) + " length=" + GetLength(scope);
	}
	public Integer GetLength(IScope scope){
		return (Integer)length.evaluate(scope);
	}
	
}
