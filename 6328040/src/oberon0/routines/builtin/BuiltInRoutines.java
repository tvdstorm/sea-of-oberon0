package oberon0.routines.builtin;

import java.util.ArrayList;

import oberon0.exceptions.NotInScopeException;
import oberon0.variables.IReadableVar;

public class BuiltInRoutines {
	public enum BuiltInNames {
		Read,
		Write,
		WriteHex,
		WriteLn
	}

	public static void call(String procedureName, ArrayList<IReadableVar> actualParameters) throws NotInScopeException {
		String outputValue;
		if (actualParameters.size()==0){
			outputValue = "";
		}
		else{
			outputValue = actualParameters.get(0).getValue().toString();
		}
		switch (BuiltInNames.valueOf(procedureName)){
			case Read: 
				break;
			case Write: System.out.print(outputValue);
				break;
			case WriteHex: System.out.print(Integer.toHexString((Integer)actualParameters.get(0).getValue()));
				break;
			case WriteLn: System.out.print(outputValue + "\n");
				break;
			default: throw new NotInScopeException(procedureName, "BuiltInRoutines");
		}
	}
}
