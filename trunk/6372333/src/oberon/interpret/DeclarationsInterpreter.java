package oberon.interpret;

import java.util.ArrayList;
import java.util.List;

import oberon.Declaration;
import oberon.IDataType;
import oberon.IProcedure;
import oberon.node.ADeclarations;
import oberon.node.PConstdecl;
import oberon.node.PProceduredeclaration;
import oberon.node.PVardecl;

class DeclarationsInterpreter extends AbstractBaseInterpreter<Declaration> {
	private final List<IDataType> variables = new ArrayList<IDataType>();
	private final List<IProcedure> procedures = new ArrayList<IProcedure>();
	
	public void caseADeclarations(final ADeclarations node)
	{	
		final VarInterpreter varDeclInterpreter = new VarInterpreter();
		final PConstdecl constDecl = node.getConstdecl();
		if (constDecl != null)
		{
			node.getConstdecl().apply(varDeclInterpreter);
		}
		
		final PVardecl varDecl = node.getVardecl();
		if (varDecl != null)
		{
			varDecl.apply(varDeclInterpreter);
		}

		variables.addAll(varDeclInterpreter.buildInterpreterResult());
		
		final ProcedureHeadingInterpreter procInterpreter = new ProcedureHeadingInterpreter();
		for (PProceduredeclaration procDeclaration : node.getProceduredeclaration())
		{
			procDeclaration.apply(procInterpreter);
			procedures.add(procInterpreter.buildInterpreterResult());
		}
	}

	@Override
	public Declaration buildInterpreterResult() {
		return new Declaration(variables, procedures);
	}
}
