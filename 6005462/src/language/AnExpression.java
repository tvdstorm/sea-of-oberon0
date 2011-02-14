package language;

import language.parser.oberonLexer;

public class AnExpression implements IType {

	private IType lhs;
	private IType rhs;
	private int op;
	private int numVals;
	
	public AnExpression(int op, IType lhs, IType rhs){
		this.op = op;
		this.lhs = lhs;
		this.rhs = rhs;
		this.numVals = 3;
	}
	
	public AnExpression(int op, IType rhs){
		this.op = op;
		this.rhs = rhs;
		this.numVals = 2;
	}
	
	public AnExpression(IType rhs){
		this.rhs = rhs;
		this.numVals = 1;
	}
	
	@Override
	public AnValue eval(AnEnvironment env) throws Exception{
		checkForNullReference();
		if (this.numVals == 1) {
			return rhs.eval(env);
		} else {
			AnValue lhsValue;
			if (lhs == null) {
				lhsValue = null;
			} else {
				lhsValue = lhs.eval(env);
			}
			return rhs.eval(env).operate(op, lhsValue, env);
		}
	}
	
	
	private ValueType getOpType(){
		switch(this.op){
			//Numbers
			case oberonLexer.PLUS:
			case oberonLexer.MIN:
			case oberonLexer.MULT:
			case oberonLexer.DIV:
			case oberonLexer.MOD:
			case oberonLexer.AMP:
				return ValueType.NUMBER;
			//Booleans
			case oberonLexer.OR:
			case oberonLexer.EQ:
			case oberonLexer.HASH:
			case oberonLexer.LT:
			case oberonLexer.LTEQ:
			case oberonLexer.GT:
			case oberonLexer.GTEQ:
			case oberonLexer.TILDEFACTOR:
				return ValueType.BOOLEAN;
			default: throw new UnsupportedOperationException();
		}
	}

	@Override
	//Check wheter or not the types match. If they do then return the type. Else throw an exception
	public ValueType getType() throws Exception {
		ValueType opType;
		checkForNullReference();
		if (this.numVals == 1) {
			return this.rhs.getType();
		} else if (this.numVals == 2) {
			opType = getOpType();
			if (typesMatch(opType, rhs.getType()))
				return opType;
		} else {
			opType = getOpType();
			if (typesMatch(opType, lhs.getType(), rhs.getType()))
				return opType;
		}
		throw new Exception("Type mismatch");
	}
	
	
	private void checkForNullReference() throws Exception{
		assert (this.numVals == 1 || this.numVals == 2 || this.numVals == 3);
		
		if ((this.numVals == 1 || this.numVals == 2) && this.rhs == null) throw new Exception("Nullreference for parameter");
		if (this.numVals == 3 && ((this.rhs == null) || (this.lhs == null))) throw new Exception("Nullreference for parameters");
	}
	
	
	public static boolean typesMatch(ValueType a, ValueType b) throws Exception{
		return (a==b);
	}
	
	public static boolean typesMatch(ValueType a, ValueType b, ValueType c) throws Exception{
		return (a==b && b==c);
	}

	@Override
	public AnValue operate(int op, AnValue secondVal, AnEnvironment env) throws Exception {
		return this.eval(env).operate(op, secondVal, env);
	}
	
}
