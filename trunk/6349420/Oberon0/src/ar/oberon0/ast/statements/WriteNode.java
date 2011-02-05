package ar.oberon0.ast.statements;

import junit.framework.Assert;
import ar.oberon0.runtime.Context;
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

	public WriteNode(final Interpretable message) {
		Assert.assertNotNull("The message paramter can't be null.", message);
		this.message = message;
	}

	public WriteNode() {
		this.stringMessage = "";
	}

	@Override
	public final Object interpret(final Context context) throws TechnicalException {
		if (this.message != null) {
			System.out.println(Helper.getValue((Interpretable) this.message.interpret(context), context).toString());
		} else {
			System.out.println(this.stringMessage);
		}
		return 0;
	}

	public final void addToMessage(final String text) {
		this.stringMessage = this.stringMessage + text;
	}

}