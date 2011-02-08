package oberon.convert;

import oberon.StatementSequence;
import oberon.node.AProcedurebody;
import oberon.procedures.Declaration;
import oberon.procedures.ProcedureBody;

/**
 * The Class ProcedureBodyConverter.
 */
class ProcedureBodyConverter extends AbstractConverter<ProcedureBody> {
	
	/** The variable declaration. */
	private Declaration variableDeclaration;
	
	/** The body. */
	private StatementSequence body;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAProcedurebody(oberon.node.AProcedurebody)
	 */
	@Override
	public void caseAProcedurebody(final AProcedurebody node) {
		final DeclarationsConverter declarationsInterpreter = new DeclarationsConverter();
		node.apply(declarationsInterpreter);
		variableDeclaration = declarationsInterpreter.buildInterpreterResult();
		
		body = StatementSequenceConverter.getStatementList(node.getBody());
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public ProcedureBody buildInterpreterResult() {
		return new ProcedureBody(variableDeclaration, body);
	}

}
