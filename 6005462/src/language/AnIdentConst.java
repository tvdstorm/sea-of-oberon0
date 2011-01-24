package language;

public class AnIdentConst extends AnIdent {

	private boolean hasBeenAssigned;
	
	public AnIdentConst(String name, ValueType valType) {
		super(name, valType);
		this.hasBeenAssigned = false;
	}
	
	@Override
	public void assign(AnValue value) throws Exception{
		if (!hasBeenAssigned){
		super.value = value;
		} else {
			throw new Exception("Cannot reassign to a const");
		}
	}

}
