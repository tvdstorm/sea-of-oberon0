package oberon0.environment;

public class Reference {
	String _name;
	Reference _parent;
	
	public Reference(String name){
		_name = name;
	}
	
	public Reference(String name, Reference parent){
		_name = name;
		_parent = parent;
	}
	
	public String getName(){
		return _name;
	}
	
	public Reference getParent(){
		return _parent;
	}
}
