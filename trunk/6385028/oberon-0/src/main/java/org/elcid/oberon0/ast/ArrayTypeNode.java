package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.values.Value;
import org.elcid.oberon0.visitors.TypeVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class ArrayTypeNode extends TypeNode {

	private ExpressionNode arrayLength;
	private TypeNode type;

	public ArrayTypeNode(ExpressionNode arrayLength, TypeNode type) {
		this.arrayLength = arrayLength;
		this.type = type;
	}

	public ExpressionNode getArrayLength() {
		return arrayLength;
	}

	public TypeNode getType() {
		return type;
	}

	@Override
	public Value init(TypeVisitor visitor, Environment env) {
		return visitor.init(this, env);
	}

}
