package oberon0.environment;

public class ConstantReference extends Reference{
	
	public ConstantReference(IValue value) {
		super(value);
	}
	
	@Override
	public void setValue(IValue value){
		//TODO throw exception
	}

}
