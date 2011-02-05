package oberon0.ast.routines.parameters;

import java.util.ArrayList;

import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.variables.IReferable;

public abstract class BaseFormalParameterNode implements IFormalParameter{
	protected ArrayList<String> _names;
	protected IEvaluable _type;
	
	protected BaseFormalParameterNode(ArrayList<String> names, IEvaluable type) {
		_names = names;
		_type = type;
	}
	
	/*
	 * throws illegal argument exception when actual parameter list is empty
	 * returns true when actual parameter is non-empty
	 */
	public boolean checkNonEmptyActualParameters(ArrayList<IReferable> actualParams){
		if (actualParams == null || actualParams.size()< 1){
			throw new IllegalArgumentException("Missing actual parameter");
		}
		return true;
	}
}
