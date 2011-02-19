package oberon0.declaration;

import oberon0.type.Type;

public class FormParamDeclaration extends VariableDeclaration {

	private final boolean isByReffernce;
	
	public FormParamDeclaration(String identifier, Type type, boolean isByReference) {
		super(identifier,type);
		this.isByReffernce = isByReference;
	}
	
	public boolean isByRefference() {
		return isByReffernce;
	}
	

}
