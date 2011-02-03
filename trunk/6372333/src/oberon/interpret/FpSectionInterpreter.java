package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.FormalParamSection;
import oberon.FormalParamType;
import oberon.node.AArrayType;
import oberon.node.AFpsection;
import oberon.node.AIdentifierType;
import oberon.node.PFpsection;
import oberon.node.PType;
import oberon.node.TIdentifier;

class FpSectionInterpreter extends AbstractBaseInterpreter<List<FormalParamSection>> {
	private final List<FormalParamSection> paramSectionList;

	public FpSectionInterpreter(final List<PFpsection> formalparams) {
		paramSectionList = new ArrayList<FormalParamSection>();
		
		for (PFpsection section : formalparams)
		{
			section.apply(this);
		}
	}

	public void caseAFpsection(final AFpsection node)
	{
		final PType type = node.getType();
		FormalParamType fpType = FormalParamType.Identifier;
		if (type instanceof AArrayType){
			fpType = FormalParamType.Array;
		}
		else if (type instanceof AIdentifierType) {
			fpType = FormalParamType.Identifier;
		}
		
		final Boolean callByRef = node.getCallbyref() != null;
		
		final List<String> nameList = new ArrayList<String>();
		for (TIdentifier paramName : node.getParamnames()) {
			nameList.add(paramName.toString().trim());
		}
		
		paramSectionList.add(new FormalParamSection(nameList, fpType, callByRef));
	}

	@Override
	public List<FormalParamSection> buildInterpreterResult() {
		return paramSectionList;
	}

}
