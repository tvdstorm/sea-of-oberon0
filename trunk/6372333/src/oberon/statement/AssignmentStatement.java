package oberon.statement;

import oberon.IExpression;
import oberon.IStatement;
import oberon.data.AbstractDataType;
import oberon.data.AbstractIdentifier;

public class AssignmentStatement implements IStatement {
	private final AbstractIdentifier selectorToAssignTo;
	private final IExpression assignmentExpression;

	public AssignmentStatement(final AbstractIdentifier name, final IExpression value){		
		selectorToAssignTo = name;
		assignmentExpression = value;
	}
	
	@Override
	public void eval() {
		final AbstractDataType type = selectorToAssignTo.getDataTypeValue();
		type.setValue(assignmentExpression.evalAsInt());
	}

}
