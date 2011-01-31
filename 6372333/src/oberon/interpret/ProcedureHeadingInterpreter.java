package oberon.interpret;

import java.util.List;

import oberon.FormalParamSection;
import oberon.ProcedureBody;
import oberon.ProcedureHeading;
import oberon.node.AProceduredeclaration;
import oberon.node.AProcedureheading;

class ProcedureHeadingInterpreter extends BaseInterpreter<ProcedureHeading> {
	private ProcedureBody _body;
	private String _name;
	private List<FormalParamSection> _paramSections;
	
	public void caseAProceduredeclaration(AProceduredeclaration node)
	{
		ProcedureBodyInterpreter bodyInterpreter = new ProcedureBodyInterpreter();
		node.getProcedurebody().apply(bodyInterpreter);
		_body = bodyInterpreter.BuildInterpreterResult();
		
		node.getProcedureheading().apply(this);
	}

	public void caseAProcedureheading(AProcedureheading node)
	{
		_name = node.getIdentifier().toString().trim();
		
		FpSectionInterpreter interpreter = new FpSectionInterpreter(node.getFormalparams());
		_paramSections = interpreter.BuildInterpreterResult();		
	}
	
	@Override
	public ProcedureHeading BuildInterpreterResult() {
		return new ProcedureHeading(_name, _paramSections, _body);
	}

}
