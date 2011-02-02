package oberon0.environment;

import java.util.ArrayList;

public class ArrayValue implements IValue{
private ArrayList<Reference>  _references;
	
	public ArrayValue(IValue type, int size){
		_references = new ArrayList<Reference>(size);
		while (_references.size() < size){
			_references.add(new Reference(type));
		}
	}
	
	public Reference getReference(int index){
		return _references.get(index);
	}
	
	public IValue getValue(int index){
		return _references.get(index).getValue();
	}
	
	@Override
	public String toString(){
		String buffer = "[ ";
		for (Reference currentRef: _references){
			buffer += currentRef.toString() + " ";
		}
		return buffer + " ] ";
	}
}
