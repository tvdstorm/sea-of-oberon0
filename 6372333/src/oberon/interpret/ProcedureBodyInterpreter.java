package oberon.interpret;

import oberon.Declaration;
import oberon.ProcedureBody;
import oberon.StatementSequence;
import oberon.node.AProcedurebody;

class ProcedureBodyInterpreter extends AbstractBaseInterpreter<ProcedureBody> {
	private Declaration variableDeclaration;
	private StatementSequence body;

	public void caseAProcedurebody(final AProcedurebody node) {
		final DeclarationsInterpreter declarationsInterpreter = new DeclarationsInterpreter();
		node.apply(declarationsInterpreter);
		variableDeclaration = declarationsInterpreter.buildInterpreterResult();
		
		body = StatementSequenceInterpreter.getStatementList(node.getBody());
	}

	@Override
	public ProcedureBody buildInterpreterResult() {
		return new ProcedureBody(variableDeclaration, body);
	}

}
