package eu.wietsevenema.lang.oberon.interpreter;

import java.util.List;

import eu.wietsevenema.lang.oberon.exceptions.ImmutableException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.TypeMismatchException;

public interface Procedure extends Bindable {

	public abstract List<Formal> getFormals();

	public abstract void execute(InterpreterScope scope) throws TypeMismatchException, ImmutableException, SymbolNotDeclaredException;

}