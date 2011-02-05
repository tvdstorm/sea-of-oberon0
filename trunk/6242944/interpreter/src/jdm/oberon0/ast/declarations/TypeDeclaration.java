package jdm.oberon0.ast.declarations;

import jdm.oberon0.ast.types.Type;

public class TypeDeclaration extends Declaration {
	private String _name;
	private Type _type;
	
	public TypeDeclaration(String name, Type type) {
		this._name = name;
		this._type = type;
	}
	
	public String getName() {
		return _name;
	}
	
	public Type getType() {
		return _type;
	}
	
	@Override
	public void accept(DeclarationVisitor visitor) {
		visitor.visitTypeDeclaration(this);
	}
}
