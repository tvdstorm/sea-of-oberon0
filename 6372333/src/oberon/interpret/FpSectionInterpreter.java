package oberon.interpret;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.FormalParamSection;
import oberon.FormalParamType;
import oberon.node.AArrayType;
import oberon.node.AFpsection;
import oberon.node.AIdentifierType;
import oberon.node.PFpsection;
import oberon.node.PType;
import oberon.node.TIdentifier;

class FpSectionInterpreter extends BaseInterpreter<List<FormalParamSection>> {
	private ArrayList<FormalParamSection> _list;

	public FpSectionInterpreter(LinkedList<PFpsection> formalparams) {
		_list = new ArrayList<FormalParamSection>();
		
		for (PFpsection section : formalparams)
		{
			section.apply(this);
		}
	}

	public void caseAFpsection(AFpsection node)
	{
		PType type = node.getType();
		FormalParamType fpType = FormalParamType.Identifier;
		if (type instanceof AArrayType)
		{
			fpType = FormalParamType.Array;
		}
		else if (type instanceof AIdentifierType)
		{
			fpType = FormalParamType.Identifier;
		}
		
		List<String> nameList = new ArrayList<String>();
		for (TIdentifier name : node.getIdentifier())
		{
			nameList.add(name.toString().trim());
		}
		
		_list.add(new FormalParamSection(nameList, fpType));
	}

	@Override
	public List<FormalParamSection> BuildInterpreterResult() {
		return _list;
	}

}
