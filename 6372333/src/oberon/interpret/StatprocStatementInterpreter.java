package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.AbstractExpression;
import oberon.ProcedurecallStatement;
import oberon.AbstractStatement;
import oberon.node.AProcedurecall;
import oberon.node.AStatprocStatement;
import oberon.node.PExp;

public class StatprocStatementInterpreter extends AbstractBaseInterpreter<AbstractStatement> {
	private String name;
	private final List<AbstractExpression> expressions = new ArrayList<AbstractExpression>();

	public void caseAStatprocStatement(final AStatprocStatement node)
	{
		node.getProcedurecall().apply(this);
	}
	
	public void caseAProcedurecall(final AProcedurecall node)
	{
		name = node.getIdentifier().toString().trim();
		
		for (PExp exp : node.getExp())
		{
			expressions.add(ExpInterpreterFactory.getExpression(exp));
		}
	}

	@Override
	public AbstractStatement buildInterpreterResult() {
		return new ProcedurecallStatement(name, expressions);
	}

}
