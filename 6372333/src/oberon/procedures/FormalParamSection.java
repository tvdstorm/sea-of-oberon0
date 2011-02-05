package oberon.procedures;

import java.util.Collections;
import java.util.List;

public class FormalParamSection {
	private final List<String> paramNames;
	private final FormalParamType paramType;
	
	public FormalParamSection(final List<String> names, final FormalParamType type) {
		paramType = type;
		paramNames = names;
	}
	
	public List<String> getNames() {
		return Collections.unmodifiableList(paramNames);
	}
	
	public FormalParamType getType() {
		return paramType;
	}
}
