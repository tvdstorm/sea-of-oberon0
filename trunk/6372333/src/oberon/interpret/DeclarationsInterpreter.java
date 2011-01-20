package oberon.interpret;

import oberon.node.ADeclarations;
import oberon.node.PConstdecl;
import oberon.node.PDeclarations;

public class DeclarationsInterpreter extends BaseInterpreter<PDeclarations> {

	public DeclarationsInterpreter(PDeclarations node) {
		super(node);
	}

	public void caseADeclarations(ADeclarations node)
	{
		   @SuppressWarnings("unused")
			PConstdecl decl =  node.getConstdecl();		
	}
}
