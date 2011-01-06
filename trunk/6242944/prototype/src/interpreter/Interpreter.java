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

	public void interpret(Module module) {
		module.accept(this);
	}
	
	@Override
	protected Value visit(Module m) {
		for (ast.Expression e : m.getStatements()) {
			Value v = e.accept(this);
			System.out.println(((IntegerValue)v).getValue());
		}
		return voidValue;
	}
		
	@Override
	protected Value visit(AddExpression e) {
		return doBinary(e);
	}

	@Override
	protected Value visit(SubExpression e) {
		return doBinary(e);
	}
	
	protected Value doBinary(BinaryExpression e) {
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
	protected Value visit(IntegerLiteral e) {
		return new IntegerValue(e.getValue());
	}
}
