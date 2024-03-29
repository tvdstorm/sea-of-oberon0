package ar.oberon0.ast.statements;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.Helper;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;

/*
 * Class that is used to write text to the console. It can print messages and the result of interpretable objects (expressions, datafields, etc).
 */
public class WriteNode implements Interpretable {
	/*
	 * The expression, datafield, etc. to write to the console. Can be null.
	 */
	private Interpretable message;
	private String stringMessage;
	private static PrintStream streamToWriteTo;

	public static void setStreamToWriteTo(final PrintStream stream) {
		streamToWriteTo = stream;
	}

	private PrintStream getStreamToWriteTo() {
		if (streamToWriteTo != null) {
			return streamToWriteTo;
		}
		return System.out;
	}

	public WriteNode(final Interpretable message) {
		assert message != null : "The message paramter can't be null.";
		this.message = message;
	}

	public WriteNode() {
		this.stringMessage = "";
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		if (this.message != null) {
			getStreamToWriteTo().print(Helper.getValue((Interpretable) this.message.interpret(context), context).toString());
		} else {
			getStreamToWriteTo().print(this.stringMessage);
		}
		return 0;
	}

	@Override
	public List<CheckViolation> check(final Context context) {
		return new ArrayList<CheckViolation>();
	}

	public final void addToMessage(final String text) {
		this.stringMessage = this.stringMessage + text;
	}

}
