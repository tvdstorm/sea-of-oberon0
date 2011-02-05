package ar.oberon0.ast.statements;

import java.util.Scanner;

import junit.framework.Assert;
import ar.oberon0.ast.expression.VarSelectorNode;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.IntegerValue;

/*
 * With the readnode a user can input data interactively.
 */
public class ReadNode implements Interpretable {
	private VarSelectorNode selector;

	public ReadNode(final VarSelectorNode selector) {
		Assert.assertNotNull("The selector parameter can't be null", selector);
		this.selector = selector;
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		DataField variable = getDataFieldToSet(context);
		int inputFromConsole = getInputAsInteger();
		setValueOfDataField(context, variable, inputFromConsole);
		return 0;
	}

	private void setValueOfDataField(final Context context, final DataField variable, final int inputFromConsole) throws TechnicalException {
		variable.setValue(new IntegerValue(inputFromConsole), context);
	}

	private DataField getDataFieldToSet(final Context context) throws TechnicalException {
		return (DataField) this.selector.interpret(context);
	}

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
