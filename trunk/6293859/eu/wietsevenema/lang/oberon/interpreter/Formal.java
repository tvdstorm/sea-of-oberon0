package eu.wietsevenema.lang.oberon.interpreter;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.exceptions.IdentifierExpectedInParamList;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.VariableAlreadyDeclaredException;

public interface Formal {

	public abstract Identifier getIdentifier();

	public abstract void assignParameter(SymbolTable symbolTable,
			Expression param) throws TypeMismatchException,
			IdentifierExpectedInParamList, VariableAlreadyDeclaredException, ValueUndefinedException;

}