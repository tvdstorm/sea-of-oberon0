package edu.uva.sc.oberon0.Evaluators.Types;

import java.util.ArrayList;

import edu.uva.sc.oberon0.Evaluators.IEvaluator;
import edu.uva.sc.oberon0.Evaluators.Selectors.ArraySelector;
import edu.uva.sc.oberon0.Evaluators.Selectors.ISelectable;
import edu.uva.sc.oberon0.Evaluators.Selectors.ISelector;
import edu.uva.sc.oberon0.Evaluators.Structural.IScope;
import edu.uva.sc.oberon0.Evaluators.Structural.VariableRef;

public class ArrayType implements IType, ISelectable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private ArrayList<Object> InitArrayList(Integer size){
		ArrayList<Object> result = new ArrayList<Object>(size);
		for (int i = 0; i < size; i++){
			result.add(null);
		}
		return result;
	}
	public static Boolean IsMyType(Object toCheck) {
		return toCheck.getClass().getName().equals(VariableRef.class.getName());
	}
}
