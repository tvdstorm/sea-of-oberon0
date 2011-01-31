package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

/*
 * Class that is used to write text to the console. It can print messages and the result of interpretable objects (expressions, datafields, etc).
 */
public class WriteNode implements Interpretable {
	/*
	 * The expression, datafield, etc. to write to the console. Can be null.
	 */
	private Interpretable message;
	/*
	 * The message to print if _message doesn't contain a value. This field is
	 * used to print text directly from the source code.
	 */
	private String stringMessage;

	/*
	 * Constructor with a interpretable message, the message can be an
	 * expression, datafield, etc.
	 */
	public WriteNode(final Interpretable message) {
		this.message = message;
	}

	/*
	 * Constructor
	 */
	public WriteNode() {
		this.stringMessage = "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Interpretable#Interpret(ar.oberon0.interpreter
	 * .Memory.Context)
	 */
	@Override
	public final Object interpret(final Context context)
			throws TechnicalException {
		if (this.message != null) {
			System.out.println(Helper.getValue(
					(Interpretable) this.message.interpret(context), context)
					.toString());
		} else {
			System.out.println(this.stringMessage);
		}
		return 0;
	}

	/*
	 * Add text to the message to write.
	 */
	public final void addToMessage(final String text) {
		this.stringMessage = this.stringMessage + text;
	}

}
