package language;

public class AnSmtAssert implements IStatement {

	private AnExpression condition;
	private String stringRepresentation;
	
	public AnSmtAssert(AnExpression condition, String stringRepresentation){
		this.condition = condition;
		this.stringRepresentation = stringRepresentation;
	}
	
	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		AnBoolean result = condition.eval(env).getBoolean();
		if (!result.getValue()){
			throw new Exception("Failed assertion: " + this.toString());
		}
		return this;
	}

	@Override
	public void typeCheck(AnEnvironment env) throws Exception {
		if (this.condition.getType() != ValueType.BOOLEAN){
			throw new Exception("Condition for ifstatement doesn't resolve to a boolean type: " + condition.toString());
		}
		this.condition.typeCheck(env);
	}
	
	@Override
	public String toString(){
		return this.stringRepresentation;
	}
}
