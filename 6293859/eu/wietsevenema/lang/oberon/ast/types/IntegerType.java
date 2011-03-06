package eu.wietsevenema.lang.oberon.ast.types;

public class IntegerType extends VarType {

	@Override
	public boolean equals(Object that) {
		if(that instanceof IntegerType){
			return true;
		}
		return false;
	}

}
