package oberon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Declaration {
	private List<ConstVariable> _constVariables;
	private List<VarDeclaration> _varVariables;
	private List<ProcedureHeading> _procedures;

	public Declaration(List<ConstVariable> constVariables, List<VarDeclaration> varVariables, 
			List<ProcedureHeading> procedures)
	{
		_constVariables = constVariables;
		_varVariables = varVariables;
		_procedures = procedures;
	}
	
	public List<ConstVariable> getConstVariables()
	{
		return Collections.unmodifiableList(_constVariables);
	}
	
	public List<VarVariable> getVarVariables()
	{
		List<VarVariable> list = new ArrayList<VarVariable>();
		
		for (VarDeclaration declaration : _varVariables)
		{
			if (declaration.isIdentifierType())
			{
				list.add(new VarVariable(declaration.getName(), new IntegerExpression(0)));
			}
		}
		
		return Collections.unmodifiableList(list);
	}

	public List<ProcedureHeading> getProcedures() {
		return Collections.unmodifiableList(_procedures);
	}

	public List<ArrayVariable> getArrayVariables() {
		List<ArrayVariable> list = new ArrayList<ArrayVariable>();
		
		for (VarDeclaration declaration : _varVariables)
		{
			if (declaration.isArrayType())
			{
				list.add(new ArrayVariable(declaration.getName()));
			}
		}
		
		return Collections.unmodifiableList(list);		
	}
}
