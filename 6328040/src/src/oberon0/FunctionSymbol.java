package oberon0;

import java.util.Map;
import java.util.LinkedHashMap;

public class FunctionSymbol extends ScopedSymbol {
    Map<String, Symbol> formalArgs = new LinkedHashMap<String, Symbol>();
    Oberon0AST blockAST;

    public FunctionSymbol(String name, Scope parent) {
        super(name, parent);
    }

    public Map<String, Symbol> getMembers() { return formalArgs; }

    public String getName() {
        return name+"("+ formalArgs.keySet().toString()+")";
    }
}
