package oberon.convert;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.IProcedure;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.node.AReadproc;
import oberon.node.AReadprocStatement;
import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.FormalParamType;
import oberon.procedures.ProcedureBody;
import oberon.procedures.SystemMethodCall;
import oberon.statement.ReadProcStatement;

/**
 * The Class ReadProcConverter, converts the read system procedure.
 */
public class ReadProcConverter extends AbstractConverter<IStatement> {

	/** The identifier. */
	private IIdentifier identifier;
	private ReadProcStatement readProcStatement;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAReadproc(oberon.node.AReadproc)
	 */
	@Override
	public void caseAReadproc(AReadproc node) {
		final SelectorConverter interpreter = new SelectorConverter();
		node.getSelector().apply(interpreter);
		identifier = interpreter.buildInterpreterResult();
		
		final List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		List<String> paramNames = new ArrayList<String>();
		paramNames.add("input");
		params.add(new FormalParamSection(paramNames, FormalParamType.Array, false));
		
		final LinkedList<IStatement> statements = new LinkedList<IStatement>();
		readProcStatement = new ReadProcStatement(identifier);
		statements.add(readProcStatement);
		
		final List<IDataType> variables = new ArrayList<IDataType>();
		final List<IProcedure> procedures = new ArrayList<IProcedure>();
		final Declaration declaration = new Declaration(variables, procedures);
		
		final ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));		
		ModuleConverter.addSystemProcedures(new SystemMethodCall("READ", params, body));
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAReadprocStatement(oberon.node.AReadprocStatement)
	 */
	@Override
	public void caseAReadprocStatement(AReadprocStatement node) {
		node.getReadproc().apply(this);
	}

	/* (non-Javadoc)
	 * @see oberon.convert.AbstractConverter#buildInterpreterResult()
	 */
	@Override
	public IStatement buildInterpreterResult() {
		return readProcStatement;
	}

}
