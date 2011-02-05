package oberon.statement;

import oberon.IDataType;
import oberon.IExpression;
import oberon.IIdentifier;
import oberon.IStatement;

public class AssignmentStatement implements IStatement {
	private final IIdentifier selectorToAssignTo;
	private final IExpression assignmentExpression;

	public AssignmentStatement(final IIdentifier name, final IExpression value){		
		selectorToAssignTo = name;
		assignmentExpression = value;
	}
	
	@Override
	public void eval() {
		final IDataType type = selectorToAssignTo.getDataTypeValue();
		type.setValue(assignmentExpression.evalAsInt());
	}

}
