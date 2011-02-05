package oberon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Declaration {
	private final List<IDataType> constAndVarDeclarations;
	private final List<IProcedure> procDeclarations;

	public Declaration(final List<IDataType> variables, final List<IProcedure> procedures) {
		constAndVarDeclarations = variables;
		procDeclarations = procedures;
	}
	
	public List<IDataType> getVariables() {
		final List<IDataType> list = new ArrayList<IDataType>();
		
		for (IDataType declaration : constAndVarDeclarations) {
			list.add(declaration);
		}
		
		return Collections.unmodifiableList(list);
	}

	public List<IProcedure> getProcedures() {
		return Collections.unmodifiableList(procDeclarations);
	}
}
