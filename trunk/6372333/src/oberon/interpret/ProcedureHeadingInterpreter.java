package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.node.AProceduredeclaration;
import oberon.node.AProcedureheading;
import oberon.procedures.FormalParamSection;
import oberon.procedures.ProcedureBody;
import oberon.procedures.ProcedureHeading;

/**
 * The Class ProcedureHeadingInterpreter.
 */
class ProcedureHeadingInterpreter extends AbstractBaseInterpreter<ProcedureHeading> {
	
	/** The body. */
	private ProcedureBody body;
	
	/** The name. */
	private String name;
	
	/** The param sections. */
	private final List<FormalParamSection> paramSections = new ArrayList<FormalParamSection>();

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAProceduredeclaration(oberon.node.AProceduredeclaration)
	 */
	@Override
	public void caseAProceduredeclaration(final AProceduredeclaration node){
		final ProcedureBodyInterpreter bodyInterpreter = new ProcedureBodyInterpreter();
		node.getProcedurebody().apply(bodyInterpreter);
		body = bodyInterpreter.buildInterpreterResult();
		
		node.getProcedureheading().apply(this);
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAProcedureheading(oberon.node.AProcedureheading)
	 */
	@Override
	public void caseAProcedureheading(final AProcedureheading node)	{
		name = node.getIdentifier().toString().trim();
		
		final FpSectionInterpreter interpreter = new FpSectionInterpreter(node.getFormalparams());
		paramSections.addAll(interpreter.buildInterpreterResult());		
	}
	
	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public ProcedureHeading buildInterpreterResult() {
		return new ProcedureHeading(name, paramSections, body);
	}

}
