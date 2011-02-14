/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.ast.expr.IdentifierNode;
import com.arievanderveek.soo.runtime.RecordSymbol;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;
import com.arievanderveek.soo.util.Constants;

/**
 * Represents a while loop
 * 
 * @author arieveek
 * 
 */
public class WithDoNode implements ASTNode, StatementNode {

	private final IdentifierNode identifier;
	private final List<StatementNode> statementSequence;

	/**
	 * @param condition
	 *            The condition that should be true for the loop to continue
	 * @param statementSequence
	 *            A sequence of statements that should be executed while the
	 *            condition is true
	 */
	public WithDoNode(IdentifierNode identifier, List<StatementNode> statementSequence) {
		this.identifier = identifier;
		this.statementSequence = statementSequence;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public void interpret(Scope scope) throws SeaOfOberonException {
		// Lookup the symbol and resolve the selectors.
		Symbol record = identifier.getSelectors().resolveSelectors(scope.lookupSymbol(identifier.getName()), scope);
		// The identifier MUST be a record symbob for a "WITH xxx DO"
		if (record instanceof RecordSymbol){
			// Create a new scope for the record, so values can be used as ref
			Scope withDoScope = new Scope(scope, (RecordSymbol)record);
			// Execute the statemens with the new scope.
			for (StatementNode statementNode : statementSequence) {
				statementNode.interpret(withDoScope);
			}
		}else{
			throw new SeaOfOberonException(identifier.getName() + " is not of type RecordSymbol, but of type " + record.getClass().getSimpleName());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("WITH" + ident);
		sb.append(Constants.LINE_SEPARATOR);
		sb.append(identifier.toTreeString(ident));
		sb.append(Constants.LINE_SEPARATOR);
		sb.append("DO");
		sb.append(Constants.LINE_SEPARATOR);
		for (ASTNode node : statementSequence) {
			sb.append(ident + ident + node.toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		sb.append("END");
		sb.append(Constants.LINE_SEPARATOR);
		return sb.toString();
	}

}
