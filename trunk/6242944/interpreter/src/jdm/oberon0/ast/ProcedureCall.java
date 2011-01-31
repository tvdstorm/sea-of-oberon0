package jdm.oberon0.ast;

import java.util.List;

public class ProcedureCall extends Statement {
	protected String _name;
	protected Expression[] _args;
	
	public ProcedureCall(String name, List<Expression> args) {
		this._name = name;
		
		if (args != null) {
			_args = new Expression[args.size()];
			args.toArray(_args);
		} else {
			_args = new Expression[0];
		}
	}
	
	public String getName() {
		return _name;
	}
	public Expression[] getArgs() {
		return _args;
	}
	
	@Override
	public <T> void accept(Visitor<T> visitor) {
		visitor.visitProcedureCall(this);
	}
}
