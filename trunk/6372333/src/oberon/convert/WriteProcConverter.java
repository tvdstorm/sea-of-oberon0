package oberon.convert;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.IProcedure;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.node.AWriteproc;
import oberon.node.AWriteprocStatement;
import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.FormalParamType;
import oberon.procedures.ProcedureBody;
import oberon.procedures.SystemMethodCall;
import oberon.statement.WriteProcStatement;

public class WriteProcConverter extends AbstractConverter<IStatement> {

	private WriteProcStatement writeProcStatement;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAWriteproc(oberon.node.AWriteproc)
	 */
	@Override
	public void caseAWriteproc(AWriteproc node) {
		final SelectorConverter interpreter = new SelectorConverter();
		node.getSelector().apply(interpreter);
		final IIdentifier identifier = interpreter.buildInterpreterResult();
		
		final List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		List<String> paramNames = new ArrayList<String>();
		paramNames.add("input");
		params.add(new FormalParamSection(paramNames, FormalParamType.Array, false));
		
		final LinkedList<IStatement> statements = new LinkedList<IStatement>();
		writeProcStatement = new WriteProcStatement(identifier);
		statements.add(writeProcStatement);
		
		final List<IDataType> variables = new ArrayList<IDataType>();
		final List<IProcedure> procedures = new ArrayList<IProcedure>();
		final Declaration declaration = new Declaration(variables, procedures);
		
		final ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));		
		ModuleConverter.addSystemProcedures(new SystemMethodCall("WRITE", params, body));
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAWriteprocStatement(oberon.node.AWriteprocStatement)
	 */
	@Override
	public void caseAWriteprocStatement(AWriteprocStatement node) {
		node.getWriteproc().apply(this);
	}

	@Override
	public IStatement buildInterpreterResult() {
		return writeProcStatement;
	}

}
