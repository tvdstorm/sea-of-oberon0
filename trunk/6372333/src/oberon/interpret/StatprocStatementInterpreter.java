package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.IExpression;
import oberon.IStatement;
import oberon.node.AProcedurecall;
import oberon.node.AStatprocStatement;
import oberon.node.PExp;
import oberon.statement.ProcedurecallStatement;

/**
 * The Class StatprocStatementInterpreter.
 */
public class StatprocStatementInterpreter extends AbstractBaseInterpreter<IStatement> {
	
	/** The name. */
	private String name;
	
	/** The expressions. */
	private final List<IExpression> expressions = new ArrayList<IExpression>();

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAStatprocStatement(oberon.node.AStatprocStatement)
	 */
	@Override
	public void caseAStatprocStatement(final AStatprocStatement node)
	{
		node.getProcedurecall().apply(this);
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAProcedurecall(oberon.node.AProcedurecall)
	 */
	@Override
	public void caseAProcedurecall(final AProcedurecall node)
	{
		name = node.getIdentifier().toString().trim();
		
		for (PExp exp : node.getExp())
		{
			expressions.add(ExpInterpreterFactory.getExpression(exp));
		}
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public IStatement buildInterpreterResult() {
		return new ProcedurecallStatement(name, expressions);
	}

}
