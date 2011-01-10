package interpreter;

import java.util.List;

import runtime.ArrayValue;
import runtime.BooleanValue;
import runtime.BuiltinFunction;
import runtime.Callable;
import runtime.IntegerValue;
import runtime.ScriptedProcedure;
import runtime.Value;
import runtime.ValueRef;
import runtime.VoidValue;
import ast.AddExpression;
import ast.AndExpression;
import ast.ArrayType;
import ast.Assignment;
import ast.BinaryExpression;
import ast.ConstDeclaration;
import ast.Declarations;
import ast.DivExpression;
import ast.EqExpression;
import ast.GeExpression;
import ast.GtExpression;
import ast.Identifier;
import ast.IdentifierType;
import ast.IfStatement;
import ast.IntegerLiteral;
import ast.LeExpression;
import ast.LtExpression;
import ast.ModExpression;
import ast.Module;
import ast.MulExpression;
import ast.NeExpression;
import ast.Parameter;
import ast.Procedure;
import ast.ProcedureCall;
import ast.Selector;
import ast.StatementSequence;
import ast.SubExpression;
import ast.Type;
import ast.VarDeclaration;
import ast.Visitor;
import ast.WhileStatement;

public class Interpreter extends Visitor<Value> {

	private Context _context;
	
	public Interpreter(Context context) {
		_context = context;
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
			if (e instanceof ast.MulExpression)
				return new IntegerValue(l * r);
			if (e instanceof ast.DivExpression)
				return new IntegerValue(l / r);
			if (e instanceof ast.ModExpression)
				return new IntegerValue(l % r);
			else if (e instanceof ast.LtExpression)
				return new BooleanValue(l < r);
			else if (e instanceof ast.LeExpression)
				return new BooleanValue(l <= r);
			else if (e instanceof ast.GtExpression)
				return new BooleanValue(l > r);
			else if (e instanceof ast.GeExpression)
				return new BooleanValue(l >= r);
			else if (e instanceof ast.EqExpression)
				return new BooleanValue(l == r);
			else if (e instanceof ast.NeExpression)
				return new BooleanValue(l != r);
			else {
				assert false;
				return null; //FIXME
			}
		} else if (lhs.isBoolean() && rhs.isBoolean()) {
			boolean l = lhs.toBoolean().getValue();
			boolean r = rhs.toBoolean().getValue();

			if (e instanceof ast.AndExpression)
				return new BooleanValue(l && r);
			assert false;
			return null;
		}
		
		else {
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
		
		Callable c = _context.getScope().lookupProcedure(name);
		c.execute(_context, args);		
		return _context.getVoid();
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
		for(String name : declaration.getNames()) {
			Value value = declaration.getType().accept(this);
			_context.getScope().defineVar(name, value);
		}
		return _context.getVoid();
	}

	@Override
	protected Value visit(Assignment assignment) {
		ValueRef ref = (ValueRef)assignment.getLhs().accept(this); //FIXME
		Value value = assignment.getRhs().accept(this);
		ref.setValue(value);
		return _context.getVoid();
	}

	@Override
	protected Value visit(IdentifierType type) {
		String name = type.getName();
		//FIXME: move somewhere else?
		if ("INTEGER".equals(name)) {
			return new IntegerValue(0);
		} else {
			//XXX
			return null;
		}
	}

	@Override
	protected Value visit(ArrayType type) {
		Value sizeValue = type.getSize().accept(this);
		
		if (sizeValue.isInteger()) {
			int size = sizeValue.toInteger().getValue();
			ValueRef[] values = new ValueRef[size];
			
			for (int i=0; i<size; i++) {
				Value element = type.getElementType().accept(this);
				values[i] = new ValueRef(element);
			}
			return new ArrayValue(values);
		} else {
			return null;
		}
	}

	@Override
	protected Value visit(Selector selector) {
		Value base = selector.getBase().accept(this);
		Value index = selector.getIndex().accept(this);

		if (base.isArray() && index.isInteger()) {
			ArrayValue arr = base.toArray();
			return arr.getValueAt(index.toInteger().getValue());
		} else {
			//XXX
			return null;
		}
	}

	@Override
	protected Value visit(Procedure procedure) {
		
		ScriptedProcedure proc = new ScriptedProcedure(procedure);
		_context.getScope().defineProcedure(procedure.getName(), proc);
		return null;
	}

	public void initBuiltins() {
		_context.registerBuiltin("Read", new runtime.builtins.Read());
		_context.registerBuiltin("Write", new runtime.builtins.Write());
		_context.registerBuiltin("WriteLn", new runtime.builtins.WriteLn());
		_context.registerBuiltin("AssertEq", new runtime.builtins.AssertEq());
		
		_context.getScope().defineConstant("TRUE", new BooleanValue(true));
		_context.getScope().defineConstant("FALSE", new BooleanValue(false));
	}

	public void interpret(ScriptedProcedure proc, Value[] arguments) {
		_context.pushScope();
		Procedure node = proc.getNode();
		
		List<Parameter> params = node.getParameters();
		
		for(int i=0; i<arguments.length; i++) {
			Parameter param = params.get(i);
			String name = param.getName();
			
			Value val = arguments[i];
			if (!param.isByRef()) {
				if (val instanceof ValueRef) { //XXX
					val = ((ValueRef)val).getValue();
				}
			}
			_context.getScope().defineVar(name, val);
		}
		
		node.getDeclarations().accept(this);
		node.getStatements().accept(this);
		_context.popScope();
	}

	@Override
	protected Value visit(GtExpression e) {
		return doBinary(e);
	}

	@Override
	protected Value visit(MulExpression e) {
		return doBinary(e);
	}

	@Override
	protected Value visit(DivExpression e) {
		return doBinary(e);
	}

	@Override
	protected Value visit(ModExpression e) {
		return doBinary(e);
	}

	@Override
	protected Value visit(AndExpression e) {
		return doBinary(e);
	}

	@Override
	protected Value visit(LeExpression e) {
		return doBinary(e);
	}

	@Override
	protected Value visit(GeExpression e) {
		return doBinary(e);
	}

	@Override
	protected Value visit(EqExpression e) {
		return doBinary(e);
	}

	@Override
	protected Value visit(NeExpression e) {
		return doBinary(e);
	}
}
