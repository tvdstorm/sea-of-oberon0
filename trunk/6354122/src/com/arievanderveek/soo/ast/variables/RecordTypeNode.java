/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.runtime.Scope;
import com.arievanderveek.soo.runtime.Symbol;

/**
 * Represents an Record type definition (Not fully implemented yet!!)
 * 
 * @author arieveek
 * 
 */
public class RecordTypeNode extends TypeNode {

	List<FieldNode> recordMembers;

	/**
	 * Constructor with all required fields
	 * 
	 * @param recordElements
	 *            the elements of the record
	 */
	public RecordTypeNode(List<FieldNode> recordMembers) {
		this.recordMembers = recordMembers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("RECORD" + ident);
		for (FieldNode fieldNode : recordMembers) {
			sb.append(fieldNode.getName());
			sb.append(" = ");
			sb.append(fieldNode.getType().toTreeString(ident));
			sb.append(ident);
		}
		return sb.toString();
	}

	@Override
	public void registerVariable(String identifier, Scope scope) throws SeaOfOberonException {
		scope.addRecordSymbolToTable(identifier, recordMembers);
	}

	@Override
	public Symbol createSymbolFromType(Scope scope) throws SeaOfOberonException {
		return scope.generateRecordSymbol(recordMembers);
	}

}
