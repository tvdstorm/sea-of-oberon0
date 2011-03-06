package eu.wietsevenema.lang.oberon.ast.types;

public class BooleanType extends VarType {

	@Override
	public boolean equals(Object that) {
		if(that instanceof BooleanType){
			return true;
		}
		return false;
	}


}
