/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Represents an Record type definition (Not fully implemented yet!!)
 * 
 * @author arieveek
 * 
 */
public class RecordTypeNode implements ASTNode {

	List<ASTNode> recordElements;

	/**
	 * Constructor with all required fields
	 * 
	 * @param recordElements
	 *            the elements of the record
	 */
	public RecordTypeNode(List<ASTNode> recordElements) {
		this.recordElements = recordElements;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		return "Not Implemented";
	}
	/*
	 * StringBuilder sb = new StringBuilder(); sb.append("RECORD" + ident); for
	 * (Object key : recordElements.keySet().toArray()){ sb.append(ident);
	 * sb.append((String)key);
	 * sb.append(recordElements.get((String)key).toTreeString(ident));
	 * sb.append(ident); } return sb.toString(); }
	 */
}
