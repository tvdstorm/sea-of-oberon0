package language;

public class AnIdentParam extends AnIdent {

	private boolean isVar;
	
	public AnIdentParam(String name, ValueType valType, boolean isVar) {
		super(name, valType);
		this.setVar(isVar);
	}

	private void setVar(boolean isVar) {
		this.isVar = isVar;
	}

	public boolean isVar() {
		return isVar;
	}
	
	

}
