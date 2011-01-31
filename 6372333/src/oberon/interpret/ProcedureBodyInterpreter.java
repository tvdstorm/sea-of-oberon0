package oberon.interpret;

import oberon.Declaration;
import oberon.ProcedureBody;
import oberon.StatementSequence;
import oberon.node.AProcedurebody;

class ProcedureBodyInterpreter extends BaseInterpreter<ProcedureBody> {
	private Declaration _declaration;
	private StatementSequence _body;

	public void caseAProcedurebody(AProcedurebody node)
	{
		DeclarationsInterpreter declarationsInterpreter = new DeclarationsInterpreter();
		node.apply(declarationsInterpreter);
		_declaration = declarationsInterpreter.BuildInterpreterResult();
		
		_body = StatementSequenceInterpreter.getStatementList(node.getStatement());
	}

	@Override
	public ProcedureBody BuildInterpreterResult() {
		return new ProcedureBody(_declaration, _body);
	}

}
