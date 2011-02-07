package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.node.AArrayType;
import oberon.node.AFpsection;
import oberon.node.AIdentifierType;
import oberon.node.PFpsection;
import oberon.node.PType;
import oberon.node.TIdentifier;
import oberon.procedures.FormalParamSection;
import oberon.procedures.FormalParamType;

/**
 * The Class FpSectionInterpreter.
 */
class FpSectionInterpreter extends AbstractBaseInterpreter<List<FormalParamSection>> {
	
	/** The param section list. */
	private final List<FormalParamSection> paramSectionList;

	/**
	 * Instantiates a new fp section interpreter.
	 *
	 * @param formalparams the formalparams
	 */
	public FpSectionInterpreter(final List<PFpsection> formalparams) {
		paramSectionList = new ArrayList<FormalParamSection>();
		
		for (PFpsection section : formalparams)
		{
			section.apply(this);
		}
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAFpsection(oberon.node.AFpsection)
	 */
	@Override
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

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public List<FormalParamSection> buildInterpreterResult() {
		return paramSectionList;
	}

}
