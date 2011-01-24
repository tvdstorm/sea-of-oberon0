package oberon0;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseScope implements Scope {
	Scope enclosingScope; // null if global (outermost) scope
	Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

    public BaseScope(Scope parent) { this.enclosingScope = parent;	}

    public Symbol resolve(String name) {
		Symbol s = symbols.get(name);
        if ( s!=null ) return s;
		// if not here, check any enclosing scope
		if ( getParentScope() != null ) return getParentScope().resolve(name);
		return null; // not found
	}

	public void define(Symbol sym) {
		symbols.put(sym.name, sym);
		sym.scope = this; // track the scope in each symbol
	}

    public Scope getParentScope() { return getEnclosingScope(); }
    public Scope getEnclosingScope() { return enclosingScope; }

	public String toString() { return symbols.keySet().toString(); }
}
