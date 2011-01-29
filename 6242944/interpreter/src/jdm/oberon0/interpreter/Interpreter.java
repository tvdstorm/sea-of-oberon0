package jdm.oberon0.interpreter;

import java.util.HashMap;
import java.util.List;

import jdm.oberon0.ast.*;
import jdm.oberon0.exceptions.DivisionByZeroException;
import jdm.oberon0.exceptions.InvalidArgumentCountException;
import jdm.oberon0.exceptions.InvalidArgumentTypeException;
import jdm.oberon0.types.ArrayType;
import jdm.oberon0.types.RecordType;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.ArrayValue;
import jdm.oberon0.values.BooleanValue;
import jdm.oberon0.values.IntegerValue;
import jdm.oberon0.values.RecordValue;
import jdm.oberon0.values.Value;
import jdm.oberon0.values.ReferenceValue;


/**
 * Visitor for interpreting Oberon0 programs.
 */
public class Interpreter extends Visitor<Value> {

	private Context _context;
	
	public Interpreter(Context context) {
		_context = context;
	}

	/**
	 * Interpret an Oberon module.
	 */
	public void interpret(Module module) {
		module.accept(this);
	}
	
	/**
	 * Interpret an Oberon procedure.
	 */
	public void interpret(ScriptedProcedure proc, Value[] actualArguments) {
		// functions have their own scope to store arguments and locals
		_context.pushScope();
		
		Procedure node = proc.getNode();
		List<Parameter> formalArguments = node.getParameters();

		// argument count is checked at call site
		assert formalArguments.size() == actualArguments.length;
		
		// define arguments as locals
		for(int i=0; i<actualArguments.length; i++) {
			Parameter argument = formalArguments.get(i);
			String name = argument.getName();
			
			Value value = actualArguments[i];
			
			// make sure argument type is valid
			Type runtimeType = getRuntimeType(argument.getType());
			if (!runtimeType.equals(value.getType())) {
				throw new InvalidArgumentTypeException(i);
			}
			
			// Make sure we don't pass a (writable) reference if argument is
			// by-value. Also deep-copy arrays and records.
			if (!argument.isByRef()) {
				value = value.clone();
			}
			_context.getScope().defineVar(name, value);
		}
		
		// execute the procedure
		node.getDeclarations().accept(this);
		node.getStatements().accept(this);
		
		// restore caller scope
		_context.popScope();
	}

	/*
	 * Helper function to wrap booleans.
	 */
	protected BooleanValue wrapBoolean(boolean b) {
		return _context.wrapBoolean(b);
	}

	/*
	 * Helper function to wrap integers.
	 */
	protected IntegerValue wrapInteger(int i) {
		return _context.wrapInteger(i);
	}

	@Override
	protected void visitModule(Module m) {
		execute(m.getDeclarations());
		execute(m.getStatements());
	}
	
	@Override
	protected Value visitInteger(IntegerLiteral e) {
		return wrapInteger(e.getValue());
	}

	@Override
	protected void visitCall(ProcedureCall procedureCall) {		
		// get callable
		String name = procedureCall.getName();
		Callable callable = _context.getScope().lookupProcedure(name);

		// create arguments for procedure
		Expression[] argExprs = procedureCall.getArgs();

		// check argument count
		if (callable.getArgumentCount() != argExprs.length) {
			throw new InvalidArgumentCountException(argExprs.length, callable.getArgumentCount());
		}
		
		// evaluate actual arguments
		Value[] args = new Value[argExprs.length];
		
		for(int i=0; i<argExprs.length; i++) {
			args[i] = eval(argExprs[i]);
		}
		
		// execute the procedure
		callable.execute(_context, args);
	}

	@Override
	protected void visitStatements(StatementSequence sequence) {
		for (Statement s : sequence.getStatements()) {
			execute(s);
		}
	}
	
	@Override
	protected void visitIf(IfStatement statement) {
		if (evalBoolean(statement.getTest())) {
			execute(statement.getThen());
		} else if (statement.getElse() != null) {
			execute(statement.getElse());
		}
	}

	@Override
	protected void visitWhile(WhileStatement statement) {
		while(evalBoolean(statement.getTest())) {
			execute(statement.getBody());
		}
	}

	@Override
	protected void visitDeclarations(Declarations declarations) {
		for(Declaration decl : declarations.getDeclarations()) {
			decl.accept(this);
		}
	}

	@Override
	protected void visitConst(ConstDeclaration declaration) {
		String name = declaration.getName();
		Value value = declaration.getValue().accept(this);
		_context.getScope().defineConstant(name, value);
	}

	@Override
	protected void visitType(TypeDeclaration declaration) {
		String name = declaration.getName();
		Type t = getRuntimeType(declaration.getType());
		_context.getScope().defineType(name, t);
	}

	@Override
	protected void visitVar(VarDeclaration declaration) {
		for(String name : declaration.getNames()) {
			Type type = getRuntimeType(declaration.getType());
			_context.getScope().defineVar(name, Value.fromType(type));
		}
	}

	@Override
	protected Value visitIdentifier(Identifier identifier) {
		String name = identifier.getName();
		return _context.getScope().lookupVarOrConst(name);
	}

	/**
	 * Convert an AST type description to a runtime type. 
	 * We need this to resolve type declarations.
	 */
	private Type getRuntimeType(AbstractType type) {
		if (type instanceof Array) {
			Array arrType = (Array)type;
			Type elementType = getRuntimeType(arrType.getElementType());
			int size = evalInteger(arrType.getSize());
			return new ArrayType(elementType, size);
		}
		if (type instanceof Record) {
			Record rt = (Record)type;
			HashMap<String, AbstractType> fields = rt.getFields();
			HashMap<String, Type> typeFields = new HashMap<String, Type>();
			
			for(String name : fields.keySet()) {
				Type t = getRuntimeType(fields.get(name));
				typeFields.put(name, t);
			}
			return new RecordType(typeFields);
		}
		assert (type instanceof IdentifierType);
		String name = ((IdentifierType)type).getName();
		return _context.getScope().lookupType(name);
	}
		
	@Override
	protected void visitAssignment(Assignment assignment) {
		// Note: setValue will check types
		evalRef(assignment.getLhs()).setValue(eval(assignment.getRhs()));
	}

	@Override
	protected Value visit(ArraySelector selector) {
		ArrayValue base = evalArray(selector.getBase());
		int index = evalInteger(selector.getIndex());
		return base.getValueAt(index);
	}
	
	@Override
	protected Value visit(RecordSelector selector) {
		RecordValue base = evalRecord(selector.getBase());
		return base.getFieldValue(selector.getName());
	}

	@Override
	protected void visitProcedure(Procedure procedure) {
		ScriptedProcedure proc = new ScriptedProcedure(procedure);
		_context.getScope().defineProcedure(procedure.getName(), proc);
	}

	protected Value eval(Expression e) {
		return e.accept(this);
	}

	/**
	 * Evaluate an expression and return as boolean.
	 */
	protected boolean evalBoolean(Expression e) {
		return e.accept(this).toBoolean().getValue();
	}
	
	/**
	 * Evaluate an expression and return an integer.
	 */
	protected int evalInteger(Expression e) {
		return e.accept(this).toInteger().getValue();
	}
	
	/**
	 * Evaluate an expression and return a reference.
	 */
	protected ReferenceValue evalRef(Expression e) {
		return ReferenceValue.getRef(e.accept(this));
	}
	
	/**
	 * Evaluate an expression and return an array.
	 */
	protected ArrayValue evalArray(Expression e) {
		return e.accept(this).toArray();
	}
	
	/**
	 * Evaluate an expression and return a record.
	 */
	protected RecordValue evalRecord(Expression e) {
		return e.accept(this).toRecord();
	}
	
	protected void execute(Statement s) {
		s.accept(this);
	}
	
	protected void execute(Declarations d) {
		d.accept(this);
	}
	
	@Override
	protected Value visit(GtExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) > evalInteger(e.getRhs()));
	}
	
	@Override
	protected Value visit(GeExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) >= evalInteger(e.getRhs()));
	}

	@Override
	protected Value visit(LtExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) < evalInteger(e.getRhs()));
	}

	@Override
	protected Value visit(LeExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) <= evalInteger(e.getRhs()));
	}

	@Override
	protected Value visit(EqExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) == evalInteger(e.getRhs()));
	}

	@Override
	protected Value visit(NeExpression e) {
		return wrapBoolean(evalInteger(e.getLhs()) != evalInteger(e.getRhs()));
	}
	
	@Override
	protected Value visit(AddExpression e) {
		return wrapInteger(evalInteger(e.getLhs()) + evalInteger(e.getRhs()));
	}

	@Override
	protected Value visit(SubExpression e) {
		return wrapInteger(evalInteger(e.getLhs()) - evalInteger(e.getRhs()));
	}
	
	@Override
	protected Value visit(MulExpression e) {
		return wrapInteger(evalInteger(e.getLhs()) * evalInteger(e.getRhs()));
	}

	@Override
	protected Value visit(DivExpression e) {
		int lhs = evalInteger(e.getLhs());
		int rhs = evalInteger(e.getRhs());
		
		if (rhs == 0) {
			throw new DivisionByZeroException();
		}
		return wrapInteger(lhs / rhs);
	}

	@Override
	protected Value visit(ModExpression e) {
		int lhs = evalInteger(e.getLhs());
		int rhs = evalInteger(e.getRhs());
		
		if (rhs == 0) {
			throw new DivisionByZeroException();
		}
		return wrapInteger(lhs % rhs);
	}

	@Override
	protected Value visit(AndExpression e) {
		return wrapBoolean(evalBoolean(e.getLhs()) && evalBoolean(e.getRhs()));
	}

	@Override
	protected Value visit(OrExpression e) {
		return wrapBoolean(evalBoolean(e.getLhs()) || evalBoolean(e.getRhs()));
	}
		
	@Override
	protected Value visit(NegExpression e) {
		return wrapInteger(-evalInteger(e.getArgument()));
	}

	@Override
	protected Value visit(PosExpression e) {
		return wrapInteger(+evalInteger(e.getArgument()));
	}

	@Override
	protected Value visit(NotExpression e) {
		return wrapBoolean(!evalBoolean(e.getArgument()));
	}
}
