package ast;

import java.util.List;

public class VarDeclaration extends Declaration {
	private List<String> _names;
	private String _type;
	
	public VarDeclaration(List<String> names, String type) {
		this._names = names;
		this._type = type;
	}
	
	public List<String> getNames() {
		return _names;
	}
	
	public String getType() {
		return _type;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

}
