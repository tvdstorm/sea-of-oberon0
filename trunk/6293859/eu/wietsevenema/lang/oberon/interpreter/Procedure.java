package eu.wietsevenema.lang.oberon.interpreter;

import java.util.List;

import eu.wietsevenema.lang.oberon.exceptions.ImmutableException;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;

public interface Procedure {

	public abstract List<Formal> getFormals();

	public abstract void execute(SymbolTable symbolTable) throws TypeMismatchException, ImmutableException;

}