package jdm.oberon0.ast.statements;

import java.util.List;

import jdm.oberon0.ast.expressions.Expression;

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
	public void accept(StatementVisitor visitor) {
		visitor.visitProcedureCall(this);
	}
}
