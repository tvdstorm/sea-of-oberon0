package oberon0.ast.statements;

import java.util.ArrayList;

import oberon0.environment.Context;

public class BodyNode implements IExecutable{
	private ArrayList<IExecutable> _statements;
	
	public BodyNode(ArrayList<IExecutable> statements) {
		_statements = statements;
	}

	@Override
	public void execute(Context context) {
		for (IExecutable statement : _statements){
			statement.execute(context);
		}
	}

}
