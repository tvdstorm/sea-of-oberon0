package oberon0;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseScope implements IScope {
	IScope enclosingScope; 						// null if global (outermost) scope
	Map<String, BaseSymbol> symbols = new LinkedHashMap<String, BaseSymbol>();

    public BaseScope(IScope parent) { this.enclosingScope = parent;	}

    public BaseSymbol resolve(String name) {
    	BaseSymbol s = symbols.get(name);
        if ( s!=null ) return s;
		// if not here, check any enclosing scope
		if ( getParentScope() != null ) return getParentScope().resolve(name);
		return null; 							// not found
	}

	public void define(BaseSymbol sym) {
		symbols.put(sym.name, sym);
		sym.scope = this; 						// track the scope in each symbol
	}

    public IScope getParentScope() { return getEnclosingScope(); }
    public IScope getEnclosingScope() { return enclosingScope; }

	public String toString() { return symbols.keySet().toString(); }
}
