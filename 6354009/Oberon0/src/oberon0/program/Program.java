package oberon0.program;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import oberon0.exception.ExecutionException;
import oberon0.expression.Expression;
import oberon0.expression.IdentifierExpression;
import oberon0.expression.IntegerExpression;
import oberon0.identifier.Identifier;
import oberon0.module.Module;
import oberon0.type.IntegerType;

public class Program {
	
	private static String RESERVER_CALL_READ = "Read";
	private static String RESERVER_CALL_WRITE = "Write";
	private static String RESERVER_CALL_WRITE_LINE = "WriteLn";
	
	private Queue<Integer>argumentsStack;
	private Module module;
	
	public Program (Module module) {	
		this.module = module;
		module.setProgram(this);
		
		argumentsStack = new LinkedList<Integer>();
	}
	
	public Module getModule() {
		return module;
	}
	
	public void addArguments(String args[]) {
		if (args != null) {
			//Push arguments onto the arguments stack.
			for (String argument : args) {
				argumentsStack.offer(Integer.parseInt(argument));
			}
		}
		//TODO add invalid arguments exception.
	}
	
	public void start() throws ExecutionException {
		//Execute the module
		module.start();
	}
	
	//////////////////////////////////////////////////////////
	//RESERVER PROCERDURE CALLS (READ & WRITE(LN))
	//////////////////////////////////////////////////////////
	public static boolean isReservedProcedureCall(String identifier) {
		if ( (identifier.equals(RESERVER_CALL_READ)) ||
			 (identifier.equals(RESERVER_CALL_WRITE))|| 
			 (identifier.equals(RESERVER_CALL_WRITE_LINE)) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void executeReserverdProcedure(String identifier, ArrayList<Expression> expressions, Module module) {
		if ( identifier.equals(RESERVER_CALL_READ)) {
			read(expressions,module);
		}
		else if(identifier.equals(RESERVER_CALL_WRITE)) {
			write(expressions,module);
		}
		else if(identifier.equals(RESERVER_CALL_WRITE_LINE)) {
			writeLn(expressions,module);
		}
		else {
			//Do nothing
			//TODO give error.
		}
	}
	
	public void read(ArrayList<Expression> expressions, Module module) {
		//We only get the first expression.
		if (!expressions.isEmpty()) {
			Expression expression = expressions.get(0);
			if (expression.getType() == IdentifierExpression.TYPE) {
				//Get the identifier we need to assign.
				IdentifierExpression identExp = (IdentifierExpression)expression;
				Identifier identifier= identExp.getIdentifier();
				
				if (!argumentsStack.isEmpty()) {
					//Get the fist argument on the stack;
					int value = argumentsStack.remove();
					
					IntegerType intType = new IntegerType(value);
					module.assignExpressionToVariable(identifier, new IntegerExpression(intType));
				}
			}
		}
		else {
			//no expressions...do nothing.
			//TODO raise exception.
		}
	}

	
	private void write(ArrayList<Expression> expressions, Module module) {
		//We only get the first expression.
		if (!expressions.isEmpty()) {
			Expression evaluatedExp = expressions.get(0).evaluate(module);
			
			if (evaluatedExp.getType() == IntegerExpression.TYPE) {
				IntegerExpression intExp = (IntegerExpression)evaluatedExp;
				IntegerType intType = intExp.getIntegerType();
				System.out.print(""+intType.getValue());
			} 
			else {
				//TODO raise exception.				
			}
		}
		else {
			//no expressions...do nothing.
			//TODO raise exception.
		}
		
	}
	
	private void writeLn(ArrayList<Expression> expressions, Module module) {
		if (expressions != null) {
			write(expressions,module);
		}
		System.out.println();
	}

	
}

