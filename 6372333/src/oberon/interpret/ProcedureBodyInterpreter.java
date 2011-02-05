package oberon.interpret;

import oberon.StatementSequence;
import oberon.node.AProcedurebody;
import oberon.procedures.Declaration;
import oberon.procedures.ProcedureBody;

class ProcedureBodyInterpreter extends AbstractBaseInterpreter<ProcedureBody> {
	private Declaration variableDeclaration;
	private StatementSequence body;

	@Override
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
