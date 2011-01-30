package oberon0.variables;

import generated.Oberon0Parser;

public class Evaluator {
	public static IReadableVar evaluateExpression(int expressionType, 
			IReadableVar lhsVar, IReadableVar rhsVar){
		Object lhsVal = lhsVar.getValue();
		Object rhsVal = rhsVar.getValue();
		switch (expressionType) {
		    //Arithmetic operators
			case Oberon0Parser.MOD 			: return new IntegerVar("temp", (Integer) lhsVal % (Integer) rhsVal);
			case Oberon0Parser.ADD 			: return new IntegerVar("temp", (Integer) lhsVal + (Integer) rhsVal);
		    case Oberon0Parser.SUBTRACT 	: return new IntegerVar("temp", (Integer) lhsVal - (Integer) rhsVal);
		    case Oberon0Parser.MULTIPLY		: return new IntegerVar("temp", (Integer) lhsVal * (Integer) rhsVal);
		    case Oberon0Parser.DIVIDE		: return new IntegerVar("temp", (Integer) lhsVal / (Integer) rhsVal);
		    //Relations
		    case Oberon0Parser.HASH 		: return new BooleanVar("temp", lhsVal != rhsVal);
		    case Oberon0Parser.EQUALS 		: return new BooleanVar("temp", lhsVal == rhsVal);
		    case Oberon0Parser.SMALLERTHEN	: return new BooleanVar("temp", (Integer) lhsVal < (Integer) rhsVal);
		    case Oberon0Parser.SMALLEREQUAL	: return new BooleanVar("temp", (Integer) lhsVal <= (Integer) rhsVal);
		    case Oberon0Parser.GREATERTHEN	: return new BooleanVar("temp", (Integer) lhsVal > (Integer) rhsVal);
		    case Oberon0Parser.GREATEREQUAL	: return new BooleanVar("temp", (Integer) lhsVal >= (Integer) rhsVal);
		    //Logical Operators
		    case Oberon0Parser.AMPERSAND	: return new BooleanVar("temp", (Boolean) lhsVal && (Boolean) rhsVal);
		    case Oberon0Parser.OR			: return new BooleanVar("temp", (Boolean) lhsVal || (Boolean) rhsVal);
		    case Oberon0Parser.TILDE		: return new BooleanVar("temp", !(Boolean) lhsVal);
		    default: throw new UnsupportedOperationException("Failed to process "+
		    		expressionType + " (on "+ lhsVar.getValue() + " and " + rhsVar.getValue()  + ")\n");
		}
	}
}
