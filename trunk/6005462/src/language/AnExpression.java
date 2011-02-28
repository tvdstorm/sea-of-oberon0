package language;

import language.parser.oberonLexer;

public class AnExpression implements IType {

	private IType lhs;
	private IType rhs;
	private int op;
	private int numVals;
	private String stringRepresentation; 
	
	public AnExpression(int op, IType lhs, IType rhs, String stringRep){
		this.op = op;
		this.lhs = lhs;
		this.rhs = rhs;
		this.numVals = 3;
		this.stringRepresentation = stringRep;
	}
	
	public AnExpression(int op, IType lhs, String stringRep){
		this.op = op;
		this.lhs = lhs;
		this.numVals = 2;
		this.stringRepresentation = stringRep;
	}
	
	public AnExpression(IType lhs, String stringRep){
		this.lhs = lhs;
		this.numVals = 1;
		this.stringRepresentation = stringRep;
	}
	
	@Override
	public AnValue eval(AnEnvironment env) throws Exception{
		checkForNullReference();
		if (this.numVals == 1) {
			return lhs.eval(env);
		} else {
			AnValue rhsValue;
			if (rhs == null) {
				rhsValue = null;
			} else {
				rhsValue = rhs.eval(env);
			}
			return lhs.eval(env).operate(op, rhsValue, env);
		}
	}
	
	@Override
	public String toString(){
		return this.stringRepresentation;
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
		if (this.numVals == 1) {
			return this.lhs.getType();
		} else {
			return getOpType();
		}
	}
	
	
	private void checkForNullReference() throws Exception{
		assert (this.numVals == 1 || this.numVals == 2 || this.numVals == 3);
		
		if ((this.numVals == 1 || this.numVals == 2) && this.lhs == null) throw new Exception("Nullreference for parameter");
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
	
	public AnIdent getIdent(AnEnvironment env) throws Exception{
		assert(this.numVals == 1);
		if (this.lhs.getClass() == AnIdent.class){
			return (AnIdent) this.lhs;
		} else {
			return null;
		}
	}

	@Override
	public void typeCheck(AnEnvironment env) throws Exception {
		checkForNullReference();
		ValueType opType;
		lhs.typeCheck(env);
		
		if (this.numVals == 1) {
			this.lhs.typeCheck(env);
		} else if (this.numVals == 2) {
			opType = getOpType();
			typesMatch(opType, lhs.getType());
		} else {
			opType = getOpType();
			typesMatch(opType, lhs.getType(), rhs.getType());
			rhs.typeCheck(env);
		}
	}
	

}
