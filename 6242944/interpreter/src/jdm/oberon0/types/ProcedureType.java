package jdm.oberon0.types;

public class ProcedureType {
	protected Type[] _argumentTypes;
	
	public ProcedureType(Type[] argumentTypes) {
		_argumentTypes = argumentTypes;
	}
	
	public Type[] getArgumentTypes() {
		return _argumentTypes;
	}
}
