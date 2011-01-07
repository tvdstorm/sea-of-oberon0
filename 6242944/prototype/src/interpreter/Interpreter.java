package interpreter;

import runtime.BooleanValue;
import runtime.BuiltinFunction;
import runtime.IntegerValue;
import runtime.Value;
import runtime.VoidValue;
import ast.AddExpression;
import ast.BinaryExpression;
import ast.ConstDeclaration;
import ast.Declarations;
import ast.Identifier;
import ast.IfStatement;
import ast.IntegerLiteral;
import ast.LtExpression;
import ast.Module;
import ast.ProcedureCall;
import ast.StatementSequence;
import ast.SubExpression;
import ast.VarDeclaration;
import ast.Visitor;
import ast.WhileStatement;

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
		m.getDeclarations().accept(this);
		m.getStatements().accept(this);
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

	@Override
	protected Value visit(StatementSequence sequence) {
		for (ast.Statement s : sequence.getStatements()) {
			Value v = s.accept(this);
		}
		return _context.getVoid();
	}
	
	@Override
	protected Value visit(IfStatement statement) {
		Value test = statement.getTest().accept(this);
		boolean execIf = false;
		
		if (test.isBoolean()) {
			execIf = test.toBoolean().getValue();
		} else {
			//FIXME
		}
		if (execIf) {
			statement.getThen().accept(this);
		} else if (statement.getElse() != null) {
			statement.getElse().accept(this);
		}
		return _context.getVoid();
	}

	@Override
	protected Value visit(WhileStatement statement) {
		boolean execLoop = false;
		
		while(true) {
			Value test = statement.getTest().accept(this);
			
			if (test.isBoolean()) {
				if (!test.toBoolean().getValue())
					break;
			} else {
			//FIXME
			}
			statement.getBody().accept(this);
		}
		return _context.getVoid();
	}

	@Override
	protected Value visit(ConstDeclaration declaration) {
		String name = declaration.getName();
		Value value = declaration.getValue().accept(this);
		_context.getScope().defineConstant(name, value);
		return _context.getVoid();
	}

	@Override
	protected Value visit(Identifier identifier) {
		String name = identifier.getName();
		return _context.getScope().lookupValue(name);
	}

	@Override
	protected Value visit(Declarations declarations) {
		for(ast.Declaration decl : declarations.getDeclarations()) {
			decl.accept(this);
		}
		return _context.getVoid();
	}

	@Override
	protected Value visit(VarDeclaration declaration) {
		String type = declaration.getType();
		for(String name : declaration.getNames()) {
			_context.getScope().defineVar(name, type);
		}
		return _context.getVoid();
	}
}
