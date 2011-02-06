package oberon0.interpreter.statement;

import java.util.ArrayList;

import oberon0.interpreter.exceptions.ExecutionException;
import oberon0.interpreter.expression.Expression;
import oberon0.interpreter.expression.IntegerExpression;
import oberon0.interpreter.module.Module;

public class IfStatement implements Statement {

	Expression expression;
	ArrayList<Statement>statements;
	IfStatement followIfStament;
	
	//Constructor
	public IfStatement(Expression expression, ArrayList<Statement>statements) {
		this.expression = expression;
		this.statements = statements;
		followIfStament = null;
	}
	
	public void addFollowIfStatement(IfStatement ifStatement)
	{
		//Set the follow if statement if we dont have one.
		if (followIfStament == null) {
			this.followIfStament = ifStatement;
		}
		else {
			/* Give the "follow if statement" to our "follow if statement".
			 * This will pass it on till the last "follow if statement".
			 */ 	
			this.followIfStament.addFollowIfStatement(ifStatement);
		}

	}
	
	@Override
	public void execute(Module module) throws ExecutionException {
		Expression evaluatedExp = expression.evaluate(module);
		
		assert(evaluatedExp.getType() == IntegerExpression.TYPE);
		
		IntegerExpression intExp = (IntegerExpression)evaluatedExp;
		
		//Is the expression true?
		if (intExp.getIntegerTypeValue() == 1) {
			//Execute all statements in the if clause.
			for(Statement statement : statements) {
				statement.execute(module);
			}
		}
		else {
			if (followIfStament != null) {
				followIfStament.execute(module);
			}
		}
	}
}
