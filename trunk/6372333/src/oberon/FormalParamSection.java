package oberon;

import java.util.Collections;
import java.util.List;

public class FormalParamSection {
	private List<String> _names;
	private FormalParamType _type;
	private Boolean _callByRef;
	
	public FormalParamSection(List<String> names, FormalParamType type, Boolean callByRef){
		_type = type;
		_names = names;
		_callByRef = callByRef;
	}
	
	public Boolean shouldBeCalledByRef(){
		return _callByRef;
	}
	
	public List<String> getNames(){
		return Collections.unmodifiableList(_names);
	}
	
	public FormalParamType getType(){
		return _type;
	}
}
