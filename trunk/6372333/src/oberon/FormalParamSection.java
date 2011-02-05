package oberon;

import java.util.Collections;
import java.util.List;

public class FormalParamSection {
	private final List<String> paramNames;
	private final FormalParamType paramType;
	private final Boolean hasVarTxtSpecified;
	
	public FormalParamSection(final List<String> names, final FormalParamType type, 
			final Boolean callByRef) {
		paramType = type;
		paramNames = names;
		hasVarTxtSpecified = callByRef;
	}
	
	public Boolean shouldBeCalledByRef() {
		return hasVarTxtSpecified;
	}
	
	public List<String> getNames() {
		return Collections.unmodifiableList(paramNames);
	}
	
	public FormalParamType getType() {
		return paramType;
	}
}