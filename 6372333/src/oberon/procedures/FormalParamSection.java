package oberon.procedures;

import java.util.Collections;
import java.util.List;

/**
 * The Class FormalParamSection, a section of formal parameters of a procedure.
 */
public class FormalParamSection {
	
	/** The param names. */
	private final List<String> paramNames;
	
	/** The param type. */
	private final FormalParamType paramType;

	private Boolean shouldBeCalledByRef;
	
	/**
	 * Instantiates a new formal param section.
	 *
	 * @param names the names of the parameters
	 * @param type the type of parameter
	 * @param callByRef determines if the variables should be called by ref or value
	 */
	public FormalParamSection(final List<String> names, final FormalParamType type, Boolean callByRef) {
		paramType = type;
		paramNames = names;
		shouldBeCalledByRef = callByRef;
	}
	
	/**
	 * Gets the names.
	 *
	 * @return the names
	 */
	public List<String> getNames() {
		return Collections.unmodifiableList(paramNames);
	}
	
	/**
	 * Gets the type of the parameter.
	 *
	 * @return the type
	 */
	public FormalParamType getType() {
		return paramType;
	}

	public boolean shouldBeCalledByRef() {
		return shouldBeCalledByRef;
	}
}
