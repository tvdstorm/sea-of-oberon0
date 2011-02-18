package org.elcid.oberon0.visitors;

import org.elcid.oberon0.ast.*;
import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.exceptions.UnknownTypeException;
import org.elcid.oberon0.values.*;

/**
 *
 * @author Pieter Brandwijk
 */
public class TypeVisitor {

	public Value init(ArrayTypeNode node, Environment env) {
		Array newArray = new Array(((Int)node.getArrayLength().eval(new ExpressionVisitor(), env)).getValue());
		return newArray;
		
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

	public Value init(IdentifierTypeNode node, Environment env) {
		String typeIdentifier = node.getIdentifier();
		if (typeIdentifier.equals(IdentifierTypeNode.INTEGER_TYPE)) {
			return new Int(0);
		}

		TypeNode typeNode = env.getType(typeIdentifier);
		if (typeNode != null) {
			return typeNode.init(this, env);
		}
		throw new UnknownTypeException("Type " + typeIdentifier + " is unknown");
	}

}
