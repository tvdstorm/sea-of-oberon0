package org.elcid.oberon0.ast;

import java.util.ArrayList;
import java.util.List;
import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.values.Value;
import org.elcid.oberon0.visitors.TypeVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class RecordTypeNode extends TypeNode {

	private List<RecordFieldListNode> fieldLists;

	public RecordTypeNode() {
		fieldLists = new ArrayList<RecordFieldListNode>();
	}

	public List<RecordFieldListNode> getFieldList() {
		return fieldLists;
	}

	public void add(RecordFieldListNode fieldList) {
		this.fieldLists.add(fieldList);
	}

	@Override
	public Value init(TypeVisitor visitor, Environment env) {
		return visitor.init(this, env);
	}

}
