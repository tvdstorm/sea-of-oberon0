package interpreter;

import runtime.BooleanValue;
import runtime.BuiltinFunction;
import runtime.IntegerValue;
import runtime.Value;
import runtime.VoidValue;
import xtc.lang.javacc.syntaxtree.Expression;
import ast.AddExpression;
import ast.BinaryExpression;
import ast.IntegerLiteral;
import ast.LtExpression;
import ast.Module;
import ast.ProcedureCall;
import ast.SubExpression;
import ast.Visitor;

public class Interpreter extends Visitor<Value> {

	private Context _context;
	
	public Interpreter() {
		_context = new Context();
		_context.registerBuiltin("Read", new runtime.Read());
		_context.registerBuiltin("Write", new runtime.Write());
	}

	public void interpret(Module module) {
		module.accept(this);
	}
	
	@Override
	protected Value visit(Module m) {
		for (ast.Statement s : m.getStatements()) {
			Value v = s.accept(this);
		}
		return _context.getVoid();
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
			else if (e instanceof ast.LtExpression)
				return new BooleanValue(l < r);
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

	@Override
	protected Value visit(ProcedureCall procedureCall) {
		String name = procedureCall.getName();
		
		ast.Expression[] argExprs = procedureCall.getArgs();
		Value[] args = new Value[argExprs.length];

		for(int i=0; i<argExprs.length; i++) {
			args[i] = argExprs[i].accept(this);
		}
		
		BuiltinFunction fun = _context.lookupFunction(name);
		return fun.execute(_context, args);		
	}

	@Override
	protected Value visit(LtExpression e) {
		return doBinary(e);
	}
}
