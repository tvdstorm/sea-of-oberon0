package oberon0;

import java.util.Map;
import java.util.HashMap;

import oberon0.variables.IVariable;

/** A scope of variable:value pairs */
public class VariableSpace {
	
    private String name; // mainly for debugging purposes
    Map<String, IVariable> members = new HashMap<String, IVariable>();

    public VariableSpace(String spacename) { 
    	setName(spacename); 
    }

    public IVariable get(String id) { 
    	return members.get(id); 
    }

    public void put(String id, IVariable type) { 
    	members.put(id, type); 
    }

    public String toString() { 
    	return getName() + ":" + members; 
    }

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

