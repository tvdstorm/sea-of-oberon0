package language;

public class AnSmtAssignment implements IStatement {

	private String lhsName;
	private AnExpression expr;
	
	public AnSmtAssignment(String lhsName, AnExpression expr){
		this.lhsName = lhsName;
		this.expr = expr;
	}
	
	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		AnIdent lhsIdent = env.getIdent(lhsName);

		lhsIdent.assign(expr.eval(env));
		return this;
	}

	@Override
	public void typeCheck(AnEnvironment env) throws Exception {
		this.expr.typeCheck(env);
	}

}
