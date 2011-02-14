package language;

public class AnSmtAssignment implements IStatement {

	private AnIdent lhs;
	private AnExpression expr;
	
	public AnSmtAssignment(AnIdent lhs, AnExpression expr){
		this.lhs = lhs;
		this.expr = expr;
	}
	
	@Override
	public IAstNode eval(AnEnvironment env) throws Exception {
		this.lhs.assign(expr.eval(env));
		return this;
	}

}
