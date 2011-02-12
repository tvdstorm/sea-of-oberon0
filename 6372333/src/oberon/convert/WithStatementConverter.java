package oberon.convert;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.IIdentifier;
import oberon.IStatement;
import oberon.node.AStatwithStatement;
import oberon.node.AWithassignment;
import oberon.node.AWithstatement;
import oberon.node.PWithassignment;
import oberon.statement.WithAssignmentStatement;
import oberon.statement.WithStatement;

public class WithStatementConverter extends AbstractConverter<IStatement> {
	
	private IIdentifier identifier;
	private IExpression expression;
	private IIdentifier indexerIdentifier;
	private List<WithAssignmentStatement> body = new ArrayList<WithAssignmentStatement>();

	@Override
	public void caseAWithstatement(AWithstatement node) {
		final SelectorConverter interpreter = new SelectorConverter();
		node.getSelector().apply(interpreter);
		identifier = interpreter.buildInterpreterResult();
		
		for (PWithassignment assignement : node.getWithassignment()){
			assignement.apply(this);
		}
	}

	@Override
	public void caseAWithassignment(AWithassignment node) {
		final SelectorConverter interpreter = new SelectorConverter();
		node.getSelector().apply(interpreter);
		indexerIdentifier = interpreter.buildInterpreterResult();
		
		expression = ExpConverterFactory.getExpression(node.getExp());
		
		body.add(new WithAssignmentStatement(indexerIdentifier, expression));
	}

	@Override
	public void caseAStatwithStatement(AStatwithStatement node) {
		node.getWithstatement().apply(this);
	}

	@Override
	public IStatement buildInterpreterResult() {
		return new WithStatement(identifier, body);
	}

}
