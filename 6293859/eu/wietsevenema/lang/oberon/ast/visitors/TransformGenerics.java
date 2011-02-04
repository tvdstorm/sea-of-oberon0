package eu.wietsevenema.lang.oberon.ast.visitors;

import java.lang.reflect.InvocationTargetException;

import xtc.tree.GNode;
import xtc.tree.Node;
import xtc.tree.Visitor;
import eu.wietsevenema.lang.oberon.ast.expressions.ArraySelector;
import eu.wietsevenema.lang.oberon.ast.expressions.BinaryExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Selector;
import eu.wietsevenema.lang.oberon.exceptions.ExpressionNotFoundException;
import eu.wietsevenema.lang.oberon.exceptions.TransformedException;

public class TransformGenerics extends Visitor {

	public Node visit(Node n) throws TransformedException {
		if(n instanceof Expression){
			return n;
		} else {
			throw new TransformedException("Expected expression but got " + n.getName());
		}
	}
	
	public Selector visitArraySelector(GNode n){
		/* <Array> Selector void:"[":Symbol EqualityExpression void:"]":Symbol  
		  /	<Record> Selector void:".":Symbol Identifier 
		  / <Base> yyValue:Identifier
		   * 
		   */
		
		Expression left, right;
		left   = (Expression)dispatch(n.getNode(0));
		right  = (Expression)dispatch(n.getNode(1));
		return new ArraySelector( left, right );
		
	}
	
	/**
	 * Some magic to transform a generic expression node to it's static typed equivalent. 
	 * @param n
	 * @return
	 * @throws ExpressionNotFoundException 
	 */
	private BinaryExpression createBinaryExpression(GNode n) throws ExpressionNotFoundException {
		Expression left, right;
		String token;
		left = (Expression)dispatch(n.getNode(0));
		token = n.getString(1); 
		right = (Expression)dispatch(n.getNode(2)); 
		
		try {
			@SuppressWarnings("unchecked")
			Class<BinaryExpression> expression = (Class<BinaryExpression>) Class.forName("eu.wietsevenema.lang.oberon.ast.expressions."+n.getName());
			Class<?>[] args={ 	Class.forName("eu.wietsevenema.lang.oberon.ast.expressions.Expression"), 
								Class.forName("eu.wietsevenema.lang.oberon.ast.expressions.Expression"),
								Class.forName("java.lang.String")
								};
			BinaryExpression result = (BinaryExpression)expression.getConstructor(args).newInstance(left, right, token);
			return result;
		} catch (ClassNotFoundException e){
			throw new ExpressionNotFoundException("Binary expression '" + n.getName() + "' has no corresponding class definition.");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public BinaryExpression visitEqualityExpression(GNode n) throws ExpressionNotFoundException {
		return createBinaryExpression(n);
	}

	public BinaryExpression visitAdditiveExpression(GNode n) throws ExpressionNotFoundException {
		return createBinaryExpression(n);
	}

	public BinaryExpression visitMultiplicativeExpression(GNode n) throws ExpressionNotFoundException {
		return createBinaryExpression(n);
	}
	
	public BinaryExpression visitLogicalConjunctiveExpression(GNode n) throws ExpressionNotFoundException {
		return createBinaryExpression(n);
	}
	
	public BinaryExpression visitLogicalDisjunctiveExpression(GNode n) throws ExpressionNotFoundException {
		return createBinaryExpression(n);
	}
	
	
}