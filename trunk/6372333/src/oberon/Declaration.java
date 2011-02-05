package oberon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import oberon.data.AbstractDataType;
import oberon.procedures.ProcedureHeading;

public class Declaration {
	private final List<AbstractDataType> constAndVarDeclarations;
	private final List<ProcedureHeading> procDeclarations;

	public Declaration(final List<AbstractDataType> variables, final List<ProcedureHeading> procedures) {
		constAndVarDeclarations = variables;
		procDeclarations = procedures;
	}
	
	public List<AbstractDataType> getVariables() {
		final List<AbstractDataType> list = new ArrayList<AbstractDataType>();
		
		for (AbstractDataType declaration : constAndVarDeclarations) {
			list.add(declaration);
		}
		
		return Collections.unmodifiableList(list);
	}

	public List<ProcedureHeading> getProcedures() {
		return Collections.unmodifiableList(procDeclarations);
	}
}
