package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.node.AProceduredeclaration;
import oberon.node.AProcedureheading;
import oberon.procedures.FormalParamSection;
import oberon.procedures.ProcedureBody;
import oberon.procedures.ProcedureHeading;

class ProcedureHeadingInterpreter extends AbstractBaseInterpreter<ProcedureHeading> {
	private ProcedureBody body;
	private String name;
	private final List<FormalParamSection> paramSections = new ArrayList<FormalParamSection>();

	@Override
	public void caseAProceduredeclaration(final AProceduredeclaration node){
		final ProcedureBodyInterpreter bodyInterpreter = new ProcedureBodyInterpreter();
		node.getProcedurebody().apply(bodyInterpreter);
		body = bodyInterpreter.buildInterpreterResult();
		
		node.getProcedureheading().apply(this);
	}

	@Override
	public void caseAProcedureheading(final AProcedureheading node)	{
		name = node.getIdentifier().toString().trim();
		
		final FpSectionInterpreter interpreter = new FpSectionInterpreter(node.getFormalparams());
		paramSections.addAll(interpreter.buildInterpreterResult());		
	}
	
	@Override
	public ProcedureHeading buildInterpreterResult() {
		return new ProcedureHeading(name, paramSections, body);
	}

}
