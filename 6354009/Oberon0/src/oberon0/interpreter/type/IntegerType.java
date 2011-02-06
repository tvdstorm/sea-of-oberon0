package oberon0.interpreter.type;

import oberon0.interpreter.expression.Expression;
import oberon0.interpreter.expression.IntegerExpression;
import oberon0.interpreter.identifier.Selector;
import oberon0.interpreter.module.Module;


public class IntegerType extends Type {
	
	private int value;
	
	public IntegerType() {
		super(INTEGER_TYPE);
		value = 0;
	}
	
	public IntegerType(int value) {
		super(INTEGER_TYPE);
		this.value = value;
	}
	
	//Overloaded Constructor (as string)
	public IntegerType(String value) {
		super(INTEGER_TYPE);
		this.value = Integer.parseInt(value);
	}
	
	
	//COPYING
	@Override
	public Type getCopy(Module module) {
		// TODO Auto-generated method stub
		return new IntegerType(value);
	}

	@Override
	public Expression getExpression(Selector selector, Module module) {
		return new IntegerExpression(new IntegerType(value));
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public void assignExpression(Expression expression, Selector selector, Module module) {
		//Flatten the expression when assigned.
		Expression evalExp = expression.evaluate(module);
		if (evalExp.getType() == IntegerExpression.TYPE) {
			IntegerExpression intExp = (IntegerExpression)evalExp;
			IntegerType intType = intExp.getIntegerType();
			
			this.value = intType.getValue();
		}
		else {
			//TODO raise exception
		}
	}
	
	@Override
	public Type getNew() {
		return new IntegerType();
	}

}
