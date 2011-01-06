package ast;

import java.util.List;

public class ProcedureCall extends Statement {
	protected String _name;
	protected Expression[] _args;
	
	public ProcedureCall(String name, List<Expression> args) {
		this._name = name;
		
		_args = new Expression[args.size()];
		args.toArray(_args);
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public String getName() {
		return _name;
	}
	public ast.Expression[] getArgs() {
		return _args;
	}
}
