package oberon0.expression;

import java.util.HashMap;

import java.lang.reflect.Constructor;

import oberon0.selector.Selector;

public class ExpressionFactory {

	private final static Class<?>[]binExpParamDef = new Class[]{Expression.class,Expression.class};
	private final static Class<?>[]unaExpParamDef = new Class[]{Expression.class};
	
	private final static HashMap<String,Class<?>> binaryExpressions = new HashMap<String,Class<?>>();
	static {
		binaryExpressions.put("=", EqualsToExpression.class);
		binaryExpressions.put("#", NotEqualsToExpression.class);
		binaryExpressions.put(">", GreaterThanExpression.class);
		binaryExpressions.put(">=", GreaterOrEqualsToExpression.class);
		binaryExpressions.put("<", SmallerThanExpression.class);
		binaryExpressions.put("<=", SmallerOrEqualsToExpression.class);
		binaryExpressions.put("OR", OrExpression.class);
		binaryExpressions.put("&", LogicalAndExpression.class);
		binaryExpressions.put("*", TimesExpression.class);
		binaryExpressions.put("-", MinusExpression.class);
		binaryExpressions.put("+", PlusExpression.class);
		binaryExpressions.put("DIV", DevideExpression.class);
		binaryExpressions.put("MOD", ModulusExpression.class);
	}

	private final static HashMap<String,Class<?>> unaryExpressions = new HashMap<String,Class<?>>();
	static {
		unaryExpressions.put("-", NegationExpression.class);
		unaryExpressions.put("~", LogicalNotExpression.class);
	}

	
	public static Expression getBinaryExpression(String operation, Expression leftExpression, Expression rightExpression) {
		Expression exp;
		
		try {
			Class<?> expClass = binaryExpressions.get(operation);
			Constructor<?> exprConstr = expClass.getConstructor(binExpParamDef);
			Object[]parameters = {leftExpression,rightExpression};
			exp = (Expression)exprConstr.newInstance(parameters);
		} 
		catch (Exception e) {
			//Operation is null or unknown.
			return leftExpression;
		}
		
		return exp;
	}
	
	public static Expression getUnaryExpression(String operation, Expression expression) {
		Expression exp;
		
		try {
			Class<?> expClass = unaryExpressions.get(operation);
			Constructor<?> exprConstr = expClass.getConstructor(unaExpParamDef);
			Object[]parameters = {expression};
			exp = (Expression)exprConstr.newInstance(parameters);
		} 
		catch (Exception e) {
			//Operation is null or unknown.
			return expression;
		}
		
		return exp;
	}
	
	public static Expression getVariableExpression(String identifier, Selector selector) {
		return new VariableExpression(identifier,selector);
	}
	
	public static Expression getConstantExpression(int value) {
		return new ConstantExpression(value);
	}
	
}
