/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.runtime.ArraySymbol;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;

/**
 * Represents an array type definition
 * 
 * @author arieveek
 * 
 */
public class ArrayTypeNode extends TypeNode {

	private final ExpressionNode sizeExpression;
	private final TypeNode type;

	/**
	 * Constructor with all required fields
	 * 
	 * @param sizeExpression
	 *            the expression that is the size of the array
	 * @param type
	 *            the type of the array
	 */
	public ArrayTypeNode(ExpressionNode sizeExpression, TypeNode type) {
		// Expression will be evaluated later to create a size.
		this.sizeExpression = sizeExpression;
		this.type = type;
	}

	@Override
	public void registerVariable(String identifier, Scope scope) throws SeaOfOberonException {
		ArraySymbol arraySymbol = createArraySymbol(scope);
		scope.addSymbolToTable(identifier, arraySymbol);
	}

	@Override
	public Symbol createSymbolFromType(Scope scope) throws SeaOfOberonException {
		return createArraySymbol(scope);
	}

	private ArraySymbol createArraySymbol(Scope scope)
			throws SeaOfOberonException {
		boolean mutable = true;
		Integer resolvedSizeExpression = sizeExpression.interpret(scope);
		Symbol[] addressList = new Symbol[resolvedSizeExpression];
		for (int sizeCounter = 0; sizeCounter < resolvedSizeExpression; sizeCounter++) {
			addressList[sizeCounter] = this.type.createSymbolFromType(scope);
		}
		return new ArraySymbol(mutable, addressList);
	}

	/**
	 * @return the sizeExpression
	 */
	public ExpressionNode getSizeExpression() {
		return sizeExpression;
	}

	/**
	 * @return the type
	 */
	public TypeNode getType() {
		return type;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("ARRAY" + ident);
		sb.append(sizeExpression.toTreeString(ident));
		sb.append(ident + "OF" + ident);
		sb.append(type.toTreeString(ident));
		return sb.toString();
	}	
	
}
