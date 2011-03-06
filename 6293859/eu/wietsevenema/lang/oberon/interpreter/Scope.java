package eu.wietsevenema.lang.oberon.interpreter;

import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.TypeNotDeclaredException;

public interface Scope {

	public abstract Scope getParent();

	public abstract VarType lookupType(String symbol) throws TypeNotDeclaredException;

	public abstract void declareType(String symbol, VarType type);

	public abstract Procedure lookupProc(String symbol) throws SymbolNotDeclaredException;

	public abstract void declareProc(String symbol, Procedure proc) throws SymbolAlreadyDeclaredException;

}