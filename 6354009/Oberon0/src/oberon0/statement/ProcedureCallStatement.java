package oberon0.statement;

import java.util.ArrayList;

import oberon0.exception.ExecutionException;
import oberon0.exception.ProcedureNotFoundException;
import oberon0.expression.Expression;
import oberon0.module.Module;
import oberon0.procedure.Procedure;
import oberon0.program.Program;

public class ProcedureCallStatement  implements Statement {

	private String identifier;
	private ArrayList<Expression> expressions;
	
	public ProcedureCallStatement(String identifier, ArrayList<Expression> expressions) {
		this.identifier = identifier;
		this.expressions = expressions;
	}
	
	
	@Override
	public void execute(Module module){
		//Is this a reserverd procedure call? (Read or Write(Ln))
		if (Program.isReservedProcedureCall(identifier)) {
			module.getProgram().executeReserverdProcedure(identifier,expressions,module);
		}
		else {
			try {
				Procedure procedure = module.getProcedure(identifier);
			
				//The procedure must exist.
				assert (procedure != null);
			
				//Add the module that called the procedure as higher module.
				procedure.setHigherModule(module);
				procedure.setParamerterExpressions(expressions);
				procedure.start();
			} 
			catch (ProcedureNotFoundException e) {
				throw new ExecutionException();
			}
		}
	}
}
