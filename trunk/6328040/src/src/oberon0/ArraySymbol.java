package oberon0;

import java.util.Map;
import java.util.LinkedHashMap;

//TODO Fix it, Array used to be called Struct
public class ArraySymbol extends ScopedSymbol implements IScope {
	
    Map<String, BaseSymbol> fields = new LinkedHashMap<String, BaseSymbol>();
    
    public ArraySymbol(String name,IScope parent) {
    	super(name, parent);
    }
    
    /** For a.b, only look in a only to resolve b, not up scope tree */
    
    public BaseSymbol resolveMember(String name) { 
    	return fields.get(name); 
    }
    
    public Map<String, BaseSymbol> getMembers() { 
    	return fields; 
    }
    
    public String toString() {
        return "struct "+name+":{"+fields.keySet().toString()+"}";
    }
}
