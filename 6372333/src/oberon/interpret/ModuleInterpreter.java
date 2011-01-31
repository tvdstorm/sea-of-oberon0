package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.Declaration;
import oberon.FormalParamSection;
import oberon.FormalParamType;
import oberon.ProcedureBody;
import oberon.ProcedureHeading;
import oberon.StatementSequence;
import oberon.node.*;

public class ModuleInterpreter extends BaseInterpreter<ProcedureHeading> { 
	  
	private Declaration _declaration;
	private StatementSequence _statements;

	public void caseAModule(AModule node) {
		DeclarationsInterpreter declInterpreter = new DeclarationsInterpreter();
		node.getDecl().apply(declInterpreter);
		_declaration = declInterpreter.BuildInterpreterResult();
		
		
		_statements = StatementSequenceInterpreter.getStatementList(node.getStatements());
	}

	@Override
	public ProcedureHeading BuildInterpreterResult() {
		List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		List<String> paramNames = new ArrayList<String>();
		paramNames.add("i");
		params.add(new FormalParamSection(paramNames, FormalParamType.Identifier));
		
		ProcedureBody body = new ProcedureBody(_declaration, _statements);
		return new ProcedureHeading("Main", params, body);
	}
}