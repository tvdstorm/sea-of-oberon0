package org.elcid.oberon0.ast.visitors;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.*;

/**
 *
 * @author Pieter Brandwijk
 */
public class TypeVisitor {

	public Value init(ArrayTypeNode node, Environment env) {
		Array newArray = new Array(((Int)node.getArrayLength().eval(new ExpressionVisitor(), env)).getValue());
		return newArray;
		
	}

	public Value init(IntTypeNode node, Environment env) {
		return new Int(0);
	}

	public Value init(RecordTypeNode node, Environment env) {
		Record newRecord = new Record();
		for (RecordFieldListNode fieldList: node.getFieldList()) {
			for (String identifier: fieldList.getIdentifiers()) {
				newRecord.put(identifier, fieldList.getType().init(this, env));
			}
		}
		return newRecord;
	}

}
