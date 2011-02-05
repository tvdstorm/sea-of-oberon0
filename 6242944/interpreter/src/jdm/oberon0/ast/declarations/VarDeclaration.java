package jdm.oberon0.ast.declarations;

import java.util.List;

import jdm.oberon0.ast.types.Type;

public class VarDeclaration extends Declaration {
	private List<String> _names;
	private Type _type;
	
	public VarDeclaration(List<String> names, Type type) {
		this._names = names;
		this._type = type;
	}
	
	public List<String> getNames() {
		return _names;
	}
	
	public Type getType() {
		return _type;
	}
	
	@Override
	public void accept(DeclarationVisitor visitor) {
		visitor.visitVarDeclaration(this);
	}

}
