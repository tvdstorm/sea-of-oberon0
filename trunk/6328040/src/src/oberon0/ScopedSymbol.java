package oberon0;

import java.util.Map;

public abstract class ScopedSymbol extends BaseSymbol implements IScope {
    IScope enclosingScope;

    public ScopedSymbol(String name, IScope enclosingScope) {
        super(name);
        this.enclosingScope = enclosingScope;
    }

    public BaseSymbol resolve(String name) {
    	BaseSymbol s = getMembers().get(name);
        if ( s!=null ) return s;
        // if not here, check any parent scope
        if ( getParentScope() != null ) {
            return getParentScope().resolve(name);
        }
        return null; // not found
    }

    public void define(BaseSymbol sym) {
        getMembers().put(sym.name, sym);
        sym.scope = this; // track the scope in each symbol
    }

    public IScope getParentScope() { return getEnclosingScope(); }
    public IScope getEnclosingScope() { return enclosingScope; }    

    public String getScopeName() { return name; }

    /** Indicate how subclasses store scope members. Allows us to
     *  factor out common code in this class.
     */
    public abstract Map<String, BaseSymbol> getMembers();
}
