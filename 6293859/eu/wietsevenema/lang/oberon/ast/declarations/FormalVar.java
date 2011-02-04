package eu.wietsevenema.lang.oberon.ast.declarations;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.ast.visitors.ExpressionEvaluator;
import eu.wietsevenema.lang.oberon.exceptions.IdentifierExpectedInParamList;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.VariableAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.Formal;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;
import eu.wietsevenema.lang.oberon.interpreter.values.Value;

public class FormalVar extends Declaration implements Formal {

	private Identifier identifier;
	private VarType type;
		
	public FormalVar(Identifier identifier, VarType type){
		this.identifier = identifier;
		this.type = type;
	}
	
	public FormalVar(String identifier, VarType type){
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
	public void assignParameter(SymbolTable symbolTable, Expression param) throws TypeMismatchException, IdentifierExpectedInParamList, VariableAlreadyDeclaredException, ValueUndefinedException {
		// This is a value parameter.
		// 1. Parameter is expression, evaluate
		// 3. Assign value in local scope.
		ExpressionEvaluator exprEval = new ExpressionEvaluator(symbolTable);
		Value result = (Value) exprEval.dispatch(param);
		
		String symbol = this.getIdentifier().getName();
		symbolTable.declareValue(symbol, (Value)result.clone()); //Deep copy param. 
		
	}
	
	
}
