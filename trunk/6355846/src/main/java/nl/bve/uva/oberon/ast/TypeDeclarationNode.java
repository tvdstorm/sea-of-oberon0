package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.ApplicationType;
import nl.bve.uva.oberon.env.types.OberonType;

public class TypeDeclarationNode implements IInterpretableNode {
	private String ident;
	private IInterpretableNode type;
	
	public TypeDeclarationNode(String ident, IInterpretableNode type) {
		this.ident = ident;
		this.type = type;
	}
	
	@Override
	public Object interpret(Environment env) {
		OberonType t = (OberonType)type.interpret(env);
		ApplicationType appType = new ApplicationType(ident, t);
		env.addUserType(ident, appType);
		
		return null;
	}
}
