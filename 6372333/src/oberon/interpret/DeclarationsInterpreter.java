package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.Declaration;
import oberon.ProcedureHeading;
import oberon.data.DataType;
import oberon.node.ADeclarations;
import oberon.node.PConstdecl;
import oberon.node.PProceduredeclaration;
import oberon.node.PVardecl;

class DeclarationsInterpreter extends BaseInterpreter<Declaration> {
	private List<DataType> _variables;
	private List<ProcedureHeading> _procedures;
	
	public DeclarationsInterpreter()
	{
		_procedures = new ArrayList<ProcedureHeading>();
		_variables = new ArrayList<DataType>();
	}
	
	public void caseADeclarations(ADeclarations node)
	{
		VarInterpreter varDeclInterpreter = new VarInterpreter();
		PConstdecl constDecl = node.getConstdecl();
		if (constDecl != null)
		{
			node.getConstdecl().apply(varDeclInterpreter);
		}
		
		PVardecl varDecl = node.getVardecl();
		if (varDecl != null)
		{
			varDecl.apply(varDeclInterpreter);
		}

		_variables.addAll(varDeclInterpreter.BuildInterpreterResult());
		
		ProcedureHeadingInterpreter procInterpreter = new ProcedureHeadingInterpreter();
		for (PProceduredeclaration procDeclaration : node.getProceduredeclaration())
		{
			procDeclaration.apply(procInterpreter);
			_procedures.add(procInterpreter.BuildInterpreterResult());
		}
	}

	@Override
	public Declaration BuildInterpreterResult() {
		return new Declaration(_variables, _procedures);
	}
}
