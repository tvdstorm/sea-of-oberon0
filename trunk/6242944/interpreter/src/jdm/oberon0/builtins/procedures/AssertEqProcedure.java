package jdm.oberon0.builtins.procedures;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.exceptions.AssertionFailureException;
import jdm.oberon0.interpreter.InterpreterContext;
import jdm.oberon0.types.ProcedureType;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.Value;

public class AssertEqProcedure extends BuiltinProcedure {
	protected Type _type;
	
	public AssertEqProcedure(Type type) {
		_type = type;
	}
	
	@Override
	public void execute(InterpreterContext ctx, Value[] arguments) {
		Value v1 = arguments[0];
		Value v2 = arguments[1];
		
		if (!v1.valueEquals(v2)) {
			throw new AssertionFailureException(v1.toNativeString(), v2.toNativeString());
		}
	}
	
	@Override
	public ProcedureType getType() {
		return new ProcedureType(
			new Type[] { _type, _type }
		);
	}
}
