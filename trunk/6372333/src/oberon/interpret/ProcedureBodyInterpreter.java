package oberon.interpret;

import oberon.StatementSequence;
import oberon.node.AProcedurebody;
import oberon.procedures.Declaration;
import oberon.procedures.ProcedureBody;

/**
 * The Class ProcedureBodyInterpreter.
 */
class ProcedureBodyInterpreter extends AbstractBaseInterpreter<ProcedureBody> {
	
	/** The variable declaration. */
	private Declaration variableDeclaration;
	
	/** The body. */
	private StatementSequence body;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAProcedurebody(oberon.node.AProcedurebody)
	 */
	@Override
	public void caseAProcedurebody(final AProcedurebody node) {
		final DeclarationsInterpreter declarationsInterpreter = new DeclarationsInterpreter();
		node.apply(declarationsInterpreter);
		variableDeclaration = declarationsInterpreter.buildInterpreterResult();
		
		body = StatementSequenceInterpreter.getStatementList(node.getBody());
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public ProcedureBody buildInterpreterResult() {
		return new ProcedureBody(variableDeclaration, body);
	}

}
