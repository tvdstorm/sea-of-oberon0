package ar.oberon0.interpreter;

import java.util.Scanner;

import ar.oberon0.interpreter.DataTypes.IntegerNode;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;
import ar.oberon0.interpreter.Memory.IdentSelector;

/*
 * With the readnode a user can input data interactively.
 */
public class ReadNode implements Interpretable
{
	private IdentSelector _selector;

	/*
	 * Constructor for readnode. A Identselector is needed to store the value
	 * that is read at runtime.
	 */
	public ReadNode(IdentSelector selector)
	{
		_selector = selector;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Interpretable#Interpret(ar.oberon0.interpreter
	 * .Memory.Context)
	 */
	@Override
	public Object Interpret(Context context) throws TechnicalException
	{
		DataField variable = getDataFieldToSet(context);
		int inputFromConsole = GetInputAsInteger();
		setValueOfDataField(context, variable, inputFromConsole);
		return 0;
	}

	/*
	 * Set the value of the datafield with the read value.
	 */
	private void setValueOfDataField(Context context, DataField variable, int inputFromConsole) throws TechnicalException
	{
		variable.setValue(new IntegerNode(inputFromConsole), context);
	}

	/*
	 * Get the datafield to store the read value.
	 */
	private DataField getDataFieldToSet(Context context) throws TechnicalException
	{
		return (DataField) _selector.Interpret(context);
	}

	/*
	 * read a integer from the console.
	 */
	private int GetInputAsInteger()
	{
		Scanner in = new Scanner(System.in);
		while (true)
		{
			String rawConsoleValue = in.next();
			try
			{
				return Integer.parseInt(rawConsoleValue);
			} catch (NumberFormatException e)
			{
				System.out.println("The input could not be converted into an integer.");
			}
		}
	}

}
