package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.StatementSequence;
import oberon.node.AModule;
import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.FormalParamType;
import oberon.procedures.ProcedureBody;
import oberon.procedures.ProcedureHeading;

public class ModuleInterpreter extends AbstractBaseInterpreter<ProcedureHeading> { 
	  
	private Declaration declaration;
	private StatementSequence moduleBody;

	@Override
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
		params.add(new FormalParamSection(paramNames, FormalParamType.Identifier));
		
		final ProcedureBody body = new ProcedureBody(declaration, moduleBody);
		return new ProcedureHeading("Main", params, body);
	}
}