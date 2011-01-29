package jdm.oberon0.ast;

public class IdentifierType extends AbstractType {
	private String _name;
	
	public IdentifierType(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
}
