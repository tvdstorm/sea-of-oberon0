package ar.oberon0.ast.statements;

import java.util.Scanner;

import ar.oberon0.ast.expression.VarSelectorNode;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.IntegerNode;

/*
 * With the readnode a user can input data interactively.
 */
public class ReadNode implements Interpretable {
	private VarSelectorNode selector;

	/*
	 * Constructor for readnode. A Identselector is needed to store the value
	 * that is read at runtime.
	 */
	public ReadNode(final VarSelectorNode selector) {
		this.selector = selector;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Interpretable#Interpret(ar.oberon0.interpreter
	 * .Memory.Context)
	 */
	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		DataField variable = getDataFieldToSet(context);
		int inputFromConsole = getInputAsInteger();
		setValueOfDataField(context, variable, inputFromConsole);
		return 0;
	}

	/*
	 * Set the value of the datafield with the read value.
	 */
	private void setValueOfDataField(final Context context, final DataField variable, final int inputFromConsole) throws TechnicalException {
		variable.setValue(new IntegerNode(inputFromConsole), context);
	}

	/*
	 * Get the datafield to store the read value.
	 */
	private DataField getDataFieldToSet(final Context context) throws TechnicalException {
		return (DataField) this.selector.interpret(context);
	}

	/*
	 * read a integer from the console.
	 */
	private int getInputAsInteger() {
		Scanner in = new Scanner(System.in);
		while (true) {
			String rawConsoleValue = in.next();
			try {
				return Integer.parseInt(rawConsoleValue);
			} catch (NumberFormatException e) {
				System.out.println("The input could not be converted into an integer.");
			}
		}
	}

}