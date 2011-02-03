package oberon;

import oberon.data.AbstractDataType;
import oberon.data.AbstractSelector;

public class AssignmentStatement extends AbstractStatement {
	private final AbstractSelector selectorToAssignTo;
	private final AbstractExpression assignmentExpression;

	public AssignmentStatement(final AbstractSelector name, final AbstractExpression value){		
		selectorToAssignTo = name;
		assignmentExpression = value;
	}
	
	@Override
	public void eval() {
		final AbstractDataType type = selectorToAssignTo.getDataTypeValue();
		type.setValue(assignmentExpression.evalAsInt());
	}

}
