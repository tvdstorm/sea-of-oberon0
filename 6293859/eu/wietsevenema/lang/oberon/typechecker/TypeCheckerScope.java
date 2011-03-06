package eu.wietsevenema.lang.oberon.typechecker;

import java.util.HashMap;
import java.util.Map;

import eu.wietsevenema.lang.oberon.ast.types.VarType;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.TypeNotDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.Procedure;
import eu.wietsevenema.lang.oberon.interpreter.Scope;

public class TypeCheckerScope implements Scope {

	TypeCheckerScope parent;
	
	/* procs and values share scope */
	private Map<String, Procedure> procs = new HashMap<String, Procedure>();
	private Map<String, VarType> symbols = new HashMap<String, VarType>();
	private Map<String, VarType> types = new HashMap<String, VarType>();

	public TypeCheckerScope() {
	}

	public TypeCheckerScope(TypeCheckerScope parent) {
		this.parent = parent;
	}

	@Override
	public TypeCheckerScope getParent() {
		return parent;
	}

	@Override
	public VarType lookupType(String symbol) throws TypeNotDeclaredException {		
		VarType result = types.get(symbol);
		if (result == null && this.parent != null) {
			result = parent.lookupType(symbol);
		}
		if (result == null) {
			throw new TypeNotDeclaredException("Type '" + symbol + "' is not a builtin type nor declared.");
		}
		return result;
	}
	
	@Override
	public void declareType(String symbol, VarType type) {
		assert type != null;
		types.put(symbol, type);
	}

	
	public VarType lookupValueType(String symbol)  {
		VarType result = symbols.get(symbol);
		if (result == null && this.parent != null) {
			result = parent.lookupValueType(symbol);
		}
		return result;
	}

	@Override
	public Procedure lookupProc(String symbol)  {
		Procedure result = procs.get(symbol);
		if (result == null && this.parent != null) {
			result = this.parent.lookupProc(symbol);
		}
		return result;
	}

	public void declareValueType(String symbol, VarType type) throws SymbolAlreadyDeclaredException {
		assert type != null;
		if (!symbols.containsKey(symbol) && !procs.containsKey(symbol)) {
			symbols.put(symbol, type);
		} else {
			throw new SymbolAlreadyDeclaredException();
		}
	}

	@Override
	public void declareProc(String symbol, Procedure proc) throws SymbolAlreadyDeclaredException {
		assert proc != null;
		if (!symbols.containsKey(symbol) && !procs.containsKey(symbol)) {
			procs.put(symbol, proc);
		} else {
			throw new SymbolAlreadyDeclaredException();
		}
	}

	

}
