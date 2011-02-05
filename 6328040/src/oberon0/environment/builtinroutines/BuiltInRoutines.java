package oberon0.environment.builtinroutines;

import oberon0.ast.declarations.IDeclarable;
import oberon0.environment.Context;

public class BuiltInRoutines implements IDeclarable{

	@Override
	public void declare(Context context) {
		context.declareProcedure("Read", new Read());
		context.declareProcedure("ReadRandom", new ReadRandom());
		context.declareProcedure("Write", new Write());
		context.declareProcedure("WriteLn", new WriteLn());
		context.declareProcedure("WriteHex", new WriteHex());
	}

}
