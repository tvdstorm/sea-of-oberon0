package oberon0;

import java.util.Map;
import java.util.LinkedHashMap;

public class RoutineSymbol extends ScopedSymbol {
    Map<String, BaseSymbol> formalArgs = new LinkedHashMap<String, BaseSymbol>();
    OberonAST blockAST;

    public RoutineSymbol(String name, IScope parent) {
        super(name, parent);
    }

    public Map<String, BaseSymbol> getMembers() { return formalArgs; }

    public String getName() {
        return name+"("+ formalArgs.keySet().toString()+")";
    }
}
