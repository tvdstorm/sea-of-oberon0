package ar.oberon0.interpreter;

import ar.oberon0.interpreter.Memory.Context;

public class PrintNode implements Interpretable {

	private Interpretable _message;
	private String _stringMessage;
	
	@Override
	public Object Interpret(Context context) throws Exception {
		if(_message != null)
			System.out.println(Helper.getDataType((Interpretable) _message.Interpret(context), context).toString());
		else
			System.out.println(_stringMessage);
		return 0;
	}

	public PrintNode(Interpretable message)
	{
		_message = message;
	}
	
	public void AddToMessage(String text)
	{
		_stringMessage = _stringMessage + text;
	}
	
	public PrintNode()
	{
		_stringMessage = "";
	}
}
