package oberon0.environment;

public class ConstantReference extends Reference{
	
	public ConstantReference(IValue value) {
		super(value);
	}
	
	@Override
	public void setValue(IValue value){
		throw new IllegalArgumentException("Not allowed to change constant reference value");
	}

}
