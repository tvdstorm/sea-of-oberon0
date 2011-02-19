package nl.bve.uva.oberon.ast.declarations;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.TypeValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class TypeDeclarationNode extends DeclarationNode {
	private String ident;
	private IInterpretableNode type;
	
	public TypeDeclarationNode(String ident, IInterpretableNode type) {
		this.ident = ident;
		this.type = type;
	}
	
	@Override
	public void declare(Environment env) {
		OberonValue t = (OberonValue)type.interpret(env);
		TypeValue appType = new TypeValue(ident, t);
		env.addUserType(ident, appType);
	}
}
