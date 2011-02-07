package jdm.oberon0.interpreter.eval;

import java.util.List;

import jdm.oberon0.ast.Module;
import jdm.oberon0.ast.declarations.Parameter;
import jdm.oberon0.ast.declarations.Procedure;
import jdm.oberon0.exceptions.InvalidArgumentTypeException;
import jdm.oberon0.interpreter.Context;
import jdm.oberon0.interpreter.ScriptedProcedure;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.Value;

/**
 * Evaluator for Oberon0 modules and procedures.
 */
public class Evaluator {
	private Context _context;
	private DeclarationEvaluator _declEval;
	private StatementEvaluator _statEval;
	
	public Evaluator(Context context) {
		_context = context;
		_statEval = new StatementEvaluator(context);
		_declEval = new DeclarationEvaluator(context);
	}
	
	public void evaluate(Module module) {
		module.getDeclarations().accept(_declEval);
		module.getStatements().accept(_statEval);
	}

	/**
	 * Interpret an Oberon procedure.
	 */
	public void evaluate(ScriptedProcedure proc, Value[] actualArguments) {
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
			TypeEvaluator typeEval = new TypeEvaluator(_context);
			Type runtimeType = argument.getType().accept(typeEval);
			
			if (!runtimeType.equals(value.getType())) {
				throw new InvalidArgumentTypeException(i);
			}
			
			if (argument.isByRef()) {
				// make sure argument is writable
				value = value.toReference();
			} else {
				// Make sure we don't pass a (writable) reference if argument is
				// by-value. Also deep-copy arrays and records.
				value = value.clone();
			}
			_context.getScope().defineVar(name, value);
		}
		
		// execute the procedure
		node.getDeclarations().accept(_declEval);
		node.getStatements().accept(_statEval);
		
		// restore caller scope
		_context.popScope();
	}
}
