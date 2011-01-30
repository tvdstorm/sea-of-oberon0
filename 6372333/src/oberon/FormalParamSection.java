package oberon;

import java.util.Collections;
import java.util.List;

public class FormalParamSection {
	private List<String> _names;
	private FormalParamType _type;
	
	public FormalParamSection(List<String> names, FormalParamType type)
	{
		_type = type;
		_names = names;
	}
	
	public List<String> getNames()
	{
		return Collections.unmodifiableList(_names);
	}
	
	public FormalParamType getType()
	{
		return _type;
	}
}
