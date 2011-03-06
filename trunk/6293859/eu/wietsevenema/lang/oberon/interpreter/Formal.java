package eu.wietsevenema.lang.oberon.interpreter;

import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.exceptions.IdentifierExpectedInParamList;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;

//FIXME Deze interface wordt alleen geimplementeerd door FormalVar...
public interface Formal {

	public abstract Identifier getIdentifier();

	public abstract VarType getVarType();
	
	public abstract void assignParameter(InterpreterScope scope, Expression param) throws TypeMismatchException,
			IdentifierExpectedInParamList, SymbolAlreadyDeclaredException, ValueUndefinedException;

}