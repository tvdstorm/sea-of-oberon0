package oberon.convert;

import java.util.ArrayList;
import java.util.List;

import oberon.StatementSequence;
import oberon.node.AModule;
import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.FormalParamType;
import oberon.procedures.ProcedureBody;
import oberon.procedures.ProcedureHeading;

/**
 * The Class ModuleConverter.
 */
public class ModuleConverter extends AbstractConverter<ProcedureHeading> { 
	  
	/** The declaration. */
	private Declaration declaration;
	
	/** The module body. */
	private StatementSequence moduleBody;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAModule(oberon.node.AModule)
	 */
	@Override
	public void caseAModule(final AModule node) {
		final DeclarationsConverter declInterpreter = new DeclarationsConverter();
		node.getDecl().apply(declInterpreter);
		declaration = declInterpreter.buildInterpreterResult();
		
		
		moduleBody = StatementSequenceConverter.getStatementList(node.getStatements());
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public ProcedureHeading buildInterpreterResult() {
		final List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		final List<String> paramNames = new ArrayList<String>();
		params.add(new FormalParamSection(paramNames, FormalParamType.Identifier, false));
		
		final ProcedureBody body = new ProcedureBody(declaration, moduleBody);
		return new ProcedureHeading("Main", params, body);
	}
}