package jdm.oberon0.builtins.procedures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jdm.oberon0.builtins.BuiltinProcedure;
import jdm.oberon0.exceptions.InputException;
import jdm.oberon0.exceptions.InvalidInputException;
import jdm.oberon0.interpreter.Context;
import jdm.oberon0.values.Value;
import jdm.oberon0.values.ReferenceValue;




public class ReadProcedure extends BuiltinProcedure {
	
	@Override
	public void execute(Context context, Value[] arguments) {
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
	public int getArgumentCount() {
		return 1;
	}
}
