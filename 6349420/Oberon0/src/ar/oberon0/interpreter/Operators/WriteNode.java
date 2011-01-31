package ar.oberon0.interpreter.Operators;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

/*
 * Class that is used to write text to the console. It can print messages and the result of interpretable objects (expressions, datafields, etc).
 */
public class WriteNode implements Interpretable
{
	/*
	 * The expression, datafield, etc. to write to the console. Can be null.
	 */
	private Interpretable _message;
	/*
	 * The message to print if _message doesn't contain a value. This field is
	 * used to print text directly from the source code.
	 */
	private String _stringMessage;

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
		if (_message != null)
			System.out.println(Helper.getDataType((Interpretable) _message.Interpret(context), context).toString());
		else
			System.out.println(_stringMessage);
		return 0;
	}

	/*
	 * Constructor with a interpretable message, the message can be an
	 * expression, datafield, etc.
	 */
	public WriteNode(Interpretable message)
	{
		_message = message;
	}

	/*
	 * Add text to the message to write.
	 */
	public void AddToMessage(String text)
	{
		_stringMessage = _stringMessage + text;
	}

	/*
	 * Constructor
	 */
	public WriteNode()
	{
		_stringMessage = "";
	}
}
