package oberon0.routines;

import java.util.HashMap;
import java.util.Map;


public class RoutineSpace {
	private String _name; // mainly for debugging purposes
    private Map<String, Routine> _routines;

	public RoutineSpace(String name){
		_name = name;
		_routines = new HashMap<String, Routine> ();		
	}
	
	public Routine getRoutine(String routineName) {
		return _routines.get(routineName);
	}
    
    public void add(String name, Routine routine){
    	_routines.put(name, routine);
    }

	public String getName() {
		return _name;
	}
}
