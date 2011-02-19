package jdm.oberon0.builtins.procedures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.exceptions.InputException;
import jdm.oberon0.exceptions.InvalidInputException;
import jdm.oberon0.interpreter.InterpreterContext;
import jdm.oberon0.types.PrimitiveType;
import jdm.oberon0.types.ProcedureType;
import jdm.oberon0.types.ReferenceType;
import jdm.oberon0.types.Type;
import jdm.oberon0.values.Value;
import jdm.oberon0.values.ReferenceValue;

public class ReadProcedure extends BuiltinProcedure {
	
	@Override
	public void execute(InterpreterContext context, Value[] arguments) {
		ReferenceValue ref = arguments[0].toReference();
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int value = 0;
		
		String line = "";
		
		try {
			line = reader.readLine();
		} catch (IOException e) {
			throw new InputException(e);
		}
		
		try {
			value = Integer.parseInt(line);
		} catch (NumberFormatException e) {
			throw new InvalidInputException(line);
		}
		
		ref.setValue(context.wrapInteger(value));
	}

	@Override
	public ProcedureType getType() {
		return new ProcedureType(
			new Type[] { ReferenceType.getRef(PrimitiveType.Integer) }
		);
	}
}
