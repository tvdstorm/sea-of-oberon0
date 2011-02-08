package oberon.convert;

import java.util.ArrayList;
import java.util.List;

import oberon.IDataType;
import oberon.IProcedure;
import oberon.node.ADeclarations;
import oberon.node.PConstdecl;
import oberon.node.PProceduredeclaration;
import oberon.node.PVardecl;
import oberon.procedures.Declaration;

/**
 * The Class DeclarationsConverter.
 */
class DeclarationsConverter extends AbstractConverter<Declaration> {
	
	/** The variables. */
	private final List<IDataType> variables = new ArrayList<IDataType>();
	
	/** The procedures. */
	private final List<IProcedure> procedures = new ArrayList<IProcedure>();

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseADeclarations(oberon.node.ADeclarations)
	 */
	@Override
	public void caseADeclarations(final ADeclarations node)
	{	
		final VariableConverter varDeclInterpreter = new VariableConverter();
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
		
		final ProcedureHeadingConverter procInterpreter = new ProcedureHeadingConverter();
		for (PProceduredeclaration procDeclaration : node.getProceduredeclaration())
		{
			procDeclaration.apply(procInterpreter);
			procedures.add(procInterpreter.buildInterpreterResult());
		}
	}

	/* (non-Javadoc)
	 * @see oberon.interpret.AbstractBaseInterpreter#buildInterpreterResult()
	 */
	@Override
	public Declaration buildInterpreterResult() {
		return new Declaration(variables, procedures);
	}
}
