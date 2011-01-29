package jdm.oberon0.ast;

import java.util.List;

public class VarDeclaration extends Declaration {
	private List<String> _names;
	private AbstractType _type;
	
	public VarDeclaration(List<String> names, AbstractType type) {
		this._names = names;
		this._type = type;
	}
	
	public List<String> getNames() {
		return _names;
	}
	
	public AbstractType getType() {
		return _type;
	}
	
	@Override
	public <T> void accept(Visitor<T> visitor) {
		visitor.visitVar(this);
	}

}
