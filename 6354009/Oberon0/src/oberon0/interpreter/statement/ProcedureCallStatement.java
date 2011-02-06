package oberon0.interpreter.statement;

import java.util.ArrayList;

import oberon0.interpreter.exceptions.ExecutionException;
import oberon0.interpreter.expression.Expression;
import oberon0.interpreter.module.Module;
import oberon0.interpreter.procedure.Procedure;
import oberon0.interpreter.program.Program;

public class ProcedureCallStatement  implements Statement {

	private String identifier;
	private ArrayList<Expression> expressions;
	
	public ProcedureCallStatement(String identifier, ArrayList<Expression> expressions) {
		this.identifier = identifier;
		this.expressions = expressions;
	}
	
	
	@Override
	public void execute(Module module) throws ExecutionException {
		//Is this a reserverd procedure call? (Read or Write)
		if (Program.isReservedProcedureCall(identifier)) {
			module.getProgram().executeReserverdProcedure(identifier,expressions,module);
		}
		else {
			Procedure procedure = module.getProcedure(identifier);
			
			//The procedure must exist.
			assert (procedure != null);
			
			//Add the module that called the procedure as higher module.
			procedure.setHigherModule(module);
			procedure.setParamerterExpressions(expressions);
			procedure.start();
		}
	}
}
