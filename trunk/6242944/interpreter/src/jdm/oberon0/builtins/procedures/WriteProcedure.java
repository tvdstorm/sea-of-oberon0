package jdm.oberon0.builtins.procedures;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.interpreter.InterpreterContext;
import jdm.oberon0.types.PrimitiveType;
import jdm.oberon0.types.ProcedureType;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.Value;

public class WriteProcedure extends BuiltinProcedure {

	@Override
	public void execute(InterpreterContext ctx, Value[] arguments) {
		System.out.print(arguments[0].toNativeString());
	}

	@Override
	public ProcedureType getType() {
		return new ProcedureType(
			new Type[] { PrimitiveType.Integer }
		);
	}
}
