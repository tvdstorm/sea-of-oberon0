package ar.oberon0.interpreter;

import java.util.Scanner;

import ar.oberon0.interpreter.DataTypes.IntegerNode;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;
import ar.oberon0.interpreter.Memory.IdentSelector;
import ar.oberon0.interpreter.Memory.Selector;

public class ReadNode implements Interpretable
{
	private IdentSelector _variableSelector;
	
	public ReadNode(IdentSelector selector) 
	{
		_variableSelector = selector;
	}

	@Override
	public Object Interpret(Context context) throws Exception 
	{
		DataField variable = (DataField)_variableSelector.Interpret(context);
		Scanner in = new Scanner(System.in);
		int rawValue = in.nextInt();
		variable.setValue(new IntegerNode(rawValue), context);
		return 0;
	}

}
