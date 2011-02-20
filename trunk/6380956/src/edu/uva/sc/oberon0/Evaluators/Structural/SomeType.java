package edu.uva.sc.oberon0.Evaluators.Structural;

public class SomeType implements IType {
	String name;
	public SomeType(String name){
		this.name = name;
	}
	@Override
	public Object evaluate(IScope scope) {
		// TODO Auto-generated method stub
		return null;
	}
	public String toString(){
		return this.name;
	}
	@Override
	public String GetName(IScope scope) {
		return this.name;
	}

}
