package jdm.oberon0.builtins;

import jdm.oberon0.builtins.procedures.*;
import jdm.oberon0.interpreter.Context;
import jdm.oberon0.interpreter.Scope;
import jdm.oberon0.types.PrimitiveType;

public abstract class Builtins {
	
	public static void initBuiltins(Context context) {
		Scope scope = context.getScope();
		assert scope.isGlobalScope();
		
		// types
		scope.defineType("INTEGER", PrimitiveType.Integer);
		scope.defineType("BOOLEAN", PrimitiveType.Boolean);
		
		// constants
		scope.defineConstant("TRUE", context.wrapBoolean(true));
		scope.defineConstant("FALSE", context.wrapBoolean(false));
		
		// procedures
		scope.defineProcedure("Read", new ReadProcedure());
		scope.defineProcedure("Write", new WriteProcedure());
		scope.defineProcedure("WriteLn", new WriteLnProcedure());
		scope.defineProcedure("AssertEqInt", new AssertEqProcedure(PrimitiveType.Integer));
		scope.defineProcedure("AssertEqBool", new AssertEqProcedure(PrimitiveType.Boolean));
	}
}
