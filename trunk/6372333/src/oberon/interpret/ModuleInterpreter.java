package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.Declaration;
import oberon.FormalParamSection;
import oberon.FormalParamType;
import oberon.ProcedureBody;
import oberon.ProcedureHeading;
import oberon.StatementSequence;
import oberon.node.AModule;

public class ModuleInterpreter extends AbstractBaseInterpreter<ProcedureHeading> { 
	  
	private Declaration declaration;
	private StatementSequence moduleBody;

	public void caseAModule(final AModule node) {
		final DeclarationsInterpreter declInterpreter = new DeclarationsInterpreter();
		node.getDecl().apply(declInterpreter);
		declaration = declInterpreter.buildInterpreterResult();
		
		
		moduleBody = StatementSequenceInterpreter.getStatementList(node.getStatements());
	}

	@Override
	public ProcedureHeading buildInterpreterResult() {
		final List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		final List<String> paramNames = new ArrayList<String>();
		params.add(new FormalParamSection(paramNames, FormalParamType.Identifier, false));
		
		final ProcedureBody body = new ProcedureBody(declaration, moduleBody);
		return new ProcedureHeading("Main", params, body);
	}
}