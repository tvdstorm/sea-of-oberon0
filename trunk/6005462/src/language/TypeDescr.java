package language;

import java.util.List;

public class TypeDescr {
	protected ValueType valueType;
	protected int size;
	protected List<String> fields;
	
	public TypeDescr(ValueType valueType){
		this.valueType = valueType;
	}
	
	public TypeDescr(ValueType valueType, int size){
		this.valueType = valueType;
	}
	
	public TypeDescr(ValueType valueType, List<String> fields){
		this.valueType = valueType;
		this.fields = fields;
	}
	
	public ValueType getValueType(){
		return this.valueType;
	}
	
	public int getSize(){
		if (this.fields != null){
			return this.fields.size();
		}{
			return this.size;
		}
	}
	
	public boolean typeEqualTo(TypeDescr other){
		return (this.valueType == other.valueType); 
	}
	
}
