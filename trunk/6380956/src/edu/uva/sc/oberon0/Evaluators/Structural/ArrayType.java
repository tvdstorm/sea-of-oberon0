package edu.uva.sc.oberon0.Evaluators.Structural;

import java.util.ArrayList;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Numerical.Integ;

public class ArrayType implements IType, ISelectable {
	Integer length;
	IEvaluator expr;
	IType type;
	ArrayList<Object> array;
	
	public ArrayType(IEvaluator expr, IType type){
		this.expr = expr;
		this.type = type;
		
	}
	
	@Override
	public Object evaluate(IScope scope) {
		this.length = (Integer)expr.evaluate(scope);
		array = InitArrayList(this.length);
		return null;
	}
	@Override
	public String GetName(IScope scope) {
		return "ARRAY of " + type.GetName(scope) + " length=" + GetLength(scope);
	}
	public Integer GetLength(IScope scope){
		return length;
	}

	@Override
	public void put(ISelector selector, Object value, IScope scope) {
		Integer index = (Integer)((ArraySelector)selector).evaluate(scope);
		this.array.set(index, value);
	}

	@Override
	public Object get(ISelector selector, IScope scope) {
		Integer index = (Integer)((ArraySelector)selector).evaluate(scope);
		return this.array.get(index);
	}
	private ArrayList InitArrayList(Integer size){
		ArrayList result = new ArrayList<Object>(size);
		for (int i = 0; i < size; i++){
			result.add(null);
		}
		return result;
	}
	
}
