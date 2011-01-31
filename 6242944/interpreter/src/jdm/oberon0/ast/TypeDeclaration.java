package jdm.oberon0.ast;

public class TypeDeclaration extends Declaration {
	private String _name;
	private AbstractType _type;
	
	public TypeDeclaration(String name, AbstractType type) {
		this._name = name;
		this._type = type;
	}
	
	public String getName() {
		return _name;
	}
	
	public AbstractType getType() {
		return _type;
	}
	
	@Override
	public <T> void accept(Visitor<T> visitor) {
		visitor.visitTypeDeclaration(this);
	}
}
