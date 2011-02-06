package oberon0.interpreter.statement;

import java.util.ArrayList;

import oberon0.interpreter.exceptions.ExecutionException;
import oberon0.interpreter.expression.Expression;
import oberon0.interpreter.expression.IntegerExpression;
import oberon0.interpreter.module.Module;

public class WhileStatement implements Statement {

	Expression expression;
	ArrayList<Statement>statements;
	
	//Constructor
	public WhileStatement(Expression expression, ArrayList<Statement>statements) {
		this.expression = expression;
		this.statements = statements;
	}
	
	@Override
	public void execute(Module module) throws ExecutionException {
		Expression evaluatedExp = expression.evaluate(module);
		
		assert(evaluatedExp.getType() == IntegerExpression.TYPE);
		
		IntegerExpression intExp = (IntegerExpression)evaluatedExp;
		
		//While the expression is true.
		while (intExp.getIntegerTypeValue() == 1) {
			//Execute all statements in the while clause.
			for(Statement statement : statements) {
				statement.execute(module);
			}
			//Re-evaluate the while expression statement
			Expression reEvaluatedExp =expression.evaluate(module);
			intExp = (IntegerExpression)reEvaluatedExp;
		}
	}

}
