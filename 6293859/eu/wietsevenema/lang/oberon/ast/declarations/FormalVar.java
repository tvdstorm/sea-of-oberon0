package eu.wietsevenema.lang.oberon.ast.declarations;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.ast.visitors.interpreter.ExpressionEvaluator;
import eu.wietsevenema.lang.oberon.exceptions.IdentifierExpectedInParamList;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.Formal;
import eu.wietsevenema.lang.oberon.interpreter.InterpreterScope;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class FormalVar extends Declaration implements Formal {

	private Identifier identifier;
	private VarType type;

	public FormalVar(Identifier identifier, VarType type) {
		this.identifier = identifier;
		this.type = type;
	}

	public FormalVar(String identifier, VarType type) {
		this.identifier = new Identifier(identifier);
		this.type = type;
	}

	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	public VarType getType() {
		return type;
	}

	@Override
	public void assignParameter(InterpreterScope scope, Expression param) throws TypeMismatchException,
			IdentifierExpectedInParamList, SymbolAlreadyDeclaredException, ValueUndefinedException {
		// This is a value parameter.
		// 1. Parameter is expression, evaluate
		// 3. Assign value in local scope.
		ExpressionEvaluator exprEval = new ExpressionEvaluator(scope);
		Value result = (Value) exprEval.dispatch(param);

		String symbol = this.getIdentifier().getName();
		scope.declareValue(symbol, (Value) result.clone()); // Deep copy
															// param.

	}

	@Override
	public VarType getVarType() {
		return type;
	}

}
