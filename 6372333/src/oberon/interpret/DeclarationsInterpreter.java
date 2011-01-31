package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.ConstVariable;
import oberon.Declaration;
import oberon.ProcedureHeading;
import oberon.VarDeclaration;
import oberon.node.ADeclarations;
import oberon.node.PConstdecl;
import oberon.node.PProceduredeclaration;
import oberon.node.PVardecl;

class DeclarationsInterpreter extends BaseInterpreter<Declaration> {
	private List<ConstVariable> _constVariables;
	private List<VarDeclaration> _varVariables;
	private List<ProcedureHeading> _procedures;
	
	public DeclarationsInterpreter()
	{
		_procedures = new ArrayList<ProcedureHeading>();
		_constVariables = new ArrayList<ConstVariable>();
		_varVariables = new ArrayList<VarDeclaration>();
	}
	
	public void caseADeclarations(ADeclarations node)
	{
		PConstdecl constDecl = node.getConstdecl();
		if (constDecl != null)
		{
			ConstDeclInterpreter constDeclInterpreter = new ConstDeclInterpreter();
			node.getConstdecl().apply(constDeclInterpreter);
			_constVariables.addAll(constDeclInterpreter.getInterpreterResult());
		}
		
		PVardecl varDecl = node.getVardecl();
		if (varDecl != null)
		{
			VarDeclInterpreter varDeclInterpreter = new VarDeclInterpreter();
			varDecl.apply(varDeclInterpreter);
			_varVariables = varDeclInterpreter.BuildInterpreterResult();
		}
		
		ProcedureHeadingInterpreter procInterpreter = new ProcedureHeadingInterpreter();
		for (PProceduredeclaration procDeclaration : node.getProceduredeclaration())
		{
			procDeclaration.apply(procInterpreter);
			_procedures.add(procInterpreter.BuildInterpreterResult());
		}
	}

	@Override
	public Declaration BuildInterpreterResult() {
		return new Declaration(_constVariables, _varVariables, _procedures);
	}
}
