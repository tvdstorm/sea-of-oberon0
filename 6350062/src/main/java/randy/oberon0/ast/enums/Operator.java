package randy.oberon0.ast.enums;

import java.util.*;

public enum Operator
{
	PLUS("+"),
	MINUS("-"),
	DIV("DIV"),
	TIMES("*"),
	SMALLERTHAN("<"),
	GREATERTHAN(">"),
	SMALLEREQUALS("<="),
	GREATEREQUALS(">="),
	EQUALS("="),
	NOTEQUALS("#"),
	AND("&"),
	OR("OR"),
	NOT("~");
	
	private static final Map<String, Operator> lookup = new HashMap<String, Operator>();
	
	static
	{
		for (Operator s : EnumSet.allOf(Operator.class))
			lookup.put(s.getOperatorText(), s);
	}
	private String operatorText;
	private Operator(String _operatorText)
	{
		operatorText = _operatorText;
	}
	public String getOperatorText()
	{
		return operatorText;
	}
	public static Operator get(String operatorText)
	{
		return lookup.get(operatorText);
	}
};