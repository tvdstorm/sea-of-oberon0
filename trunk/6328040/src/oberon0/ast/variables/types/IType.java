package oberon0.ast.variables.types;

import oberon0.environment.Context;
import oberon0.environment.IValue;

public interface IType {
	public enum TypeNames {
	    INTEGER, BOOLEAN, ARRAY, RECORD
	}
	
	public TypeNames getTypeName(Context context);
	
	public IValue getDefaultValue(Context context);
}
