package oberon0.environment.builtinroutines;

import oberon0.ast.declarations.IDeclarable;
import oberon0.environment.Context;

/*
 * Declarable class that can declare all known builtin routines
 */
public class BuiltInRoutines implements IDeclarable{

	@Override
	/*
	 * declares all known builtin routines
	 */
	public void declare(Context context) {
		context.declareProcedure("Read", new Read());
		context.declareProcedure("ReadRandom", new ReadRandom());
		context.declareProcedure("Write", new Write());
		context.declareProcedure("WriteLn", new WriteLn());
		context.declareProcedure("WriteHex", new WriteHex());
	}

}
