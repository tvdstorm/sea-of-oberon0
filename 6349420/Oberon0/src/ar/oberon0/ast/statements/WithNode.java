package ar.oberon0.ast.statements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import ar.oberon0.ast.dataTypes.RecordType;
import ar.oberon0.ast.expression.VarSelectorNode;
import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.RecordValue;

public class WithNode implements Interpretable {
	private VarSelectorNode selector;
	private StatementSequence statementsToExecute;

	public WithNode(Interpretable selector, StatementSequence statementsToExecute) {
		this.selector = (VarSelectorNode) selector;
		this.statementsToExecute = statementsToExecute;
	}

	@Override
	public Object interpret(Context context) throws TechnicalException {
		Context withContext = new Context();
		withContext.setParentContext(context);
		DataField field = (DataField) this.selector.interpret(context);
		if (field.getType().getClass() == RecordType.class) {
			RecordValue value = (RecordValue) field.getValue(context);
			Iterator<Entry<String, DataField>> iterator = value.getMembers();
			while (iterator.hasNext()) {
				Entry<String, DataField> entry = iterator.next();
				withContext.addVariable(entry.getKey(), entry.getValue());
			}
		}
		return this.statementsToExecute.interpret(withContext);
	}

	@Override
	public List<CheckViolation> check(Context context) {
		List<CheckViolation> violations = new ArrayList<CheckViolation>();
		violations.addAll(this.statementsToExecute.check(context));
		DataField field = (DataField) this.selector.interpret(context);
		if (field.getType().getClass() != RecordType.class) {
			violations.add(new CheckViolation("The selector of the With statement must contain a RecordSelector as leave node.", this.getClass()));
		}
		return violations;
	}
}
