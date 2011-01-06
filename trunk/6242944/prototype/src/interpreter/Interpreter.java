package interpreter;

import xtc.lang.javacc.syntaxtree.Expression;
import ast.AddExpression;
import ast.BinaryExpression;
import ast.IntegerLiteral;
import ast.Module;
import ast.SubExpression;
import ast.Visitor;

public class Interpreter extends Visitor<Value> {
	protected Value voidValue;
	
	public Interpreter() {
		this.voidValue = new VoidValue();
	}
	
	@Override
	public Value visit(Module m) {
		for (ast.Expression e : m.getStatements()) {
			Value v = e.accept(this);
			System.out.println(((IntegerValue)v).getValue());
		}
		return voidValue;
	}
	
	public void interpret(Module module) {
		module.accept(this);
	}
	
	@Override
	public Value visit(AddExpression e) {
		return doBinary(e);
	}
	private Value doBinary(BinaryExpression e) {
		Value lhs = e.getLhs().accept(this);
		Value rhs = e.getRhs().accept(this);
		
		if (lhs.isInteger() && rhs.isInteger()) {
			int l = lhs.toInteger().getValue();
			int r = rhs.toInteger().getValue();
			
			if (e instanceof ast.AddExpression)
				return new IntegerValue(l + r);
			else if (e instanceof ast.SubExpression)
				return new IntegerValue(l - r);
			else
				return null; //FIXME
		} else {
			//FIXME
			return null;
		}
	}

	@Override
	public Value visit(SubExpression m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value visit(IntegerLiteral e) {
		return new IntegerValue(e.getValue());
	}
}
