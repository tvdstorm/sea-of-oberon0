package ar.oberon0.ast.statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import ar.oberon0.ast.expression.VarSelectorNode;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.IntegerValue;

/*
 * With the readnode a user can input data interactively.
 */
public class ReadNode implements Interpretable {
	private VarSelectorNode selector;
	private static BufferedReader streamToReadFrom;

	public static void setStreamToReadFrom(InputStream stream) {
		streamToReadFrom = new BufferedReader(new InputStreamReader(stream));
	}

	private BufferedReader getStreamToReadFrom() {
		if (streamToReadFrom != null) {
			return streamToReadFrom;
		}
		return new BufferedReader(new InputStreamReader(System.in));
	}

	public ReadNode(final VarSelectorNode selector) {
		assert selector != null : "The selector parameter can't be null";
		this.selector = selector;
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		DataField variable = getDataFieldToSet(context);
		int inputFromConsole = getInputAsInteger();
		setValueOfDataField(context, variable, inputFromConsole);
		return 0;
	}

	@Override
	public List<CheckViolation> check(Context context) {
		return new ArrayList<CheckViolation>();
	}

	private void setValueOfDataField(final Context context, final DataField variable, final int inputFromConsole) throws TechnicalException {
		variable.setValue(new IntegerValue(inputFromConsole), context);
	}

	private DataField getDataFieldToSet(final Context context) throws TechnicalException {
		return (DataField) this.selector.interpret(context);
	}

	private int getInputAsInteger() {
		while (true) {
			String rawConsoleValue = null;
			try {
				rawConsoleValue = getStreamToReadFrom().readLine();
			} catch (IOException e1) {
				System.out.println("Error while reading from the input stream.");
			}
			try {
				return Integer.parseInt(rawConsoleValue);
			} catch (NumberFormatException e) {
				System.out.println("The input could not be converted into an integer.");
			}
		}
	}

}
