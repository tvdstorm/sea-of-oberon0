package oberon.convert;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oberon.IDataType;
import oberon.IProcedure;
import oberon.IStatement;
import oberon.StatementSequence;
import oberon.node.AWritelnproc;
import oberon.node.AWritelnprocStatement;
import oberon.procedures.Declaration;
import oberon.procedures.FormalParamSection;
import oberon.procedures.ProcedureBody;
import oberon.procedures.SystemMethodCall;
import oberon.statement.WriteLnProcStatement;

public class WriteLnProcConverter extends AbstractConverter<IStatement> {

	private WriteLnProcStatement writeLnProcStatement;

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAWritelnproc(oberon.node.AWritelnproc)
	 */
	@Override
	public void caseAWritelnproc(AWritelnproc node) {
		final List<FormalParamSection> params = new ArrayList<FormalParamSection>();
		
		final LinkedList<IStatement> statements = new LinkedList<IStatement>();
		writeLnProcStatement = new WriteLnProcStatement();
		statements.add(writeLnProcStatement);
		
		final List<IDataType> variables = new ArrayList<IDataType>();
		final List<IProcedure> procedures = new ArrayList<IProcedure>();
		final Declaration declaration = new Declaration(variables, procedures);
		
		final ProcedureBody body = new ProcedureBody(declaration, new StatementSequence(statements));		
		ModuleConverter.addSystemProcedures(new SystemMethodCall("WriteLn", params, body));
	}

	/* (non-Javadoc)
	 * @see oberon.analysis.DepthFirstAdapter#caseAWritelnprocStatement(oberon.node.AWritelnprocStatement)
	 */
	@Override
	public void caseAWritelnprocStatement(AWritelnprocStatement node) {
		node.getWritelnproc().apply(this);
	}

	/* (non-Javadoc)
	 * @see oberon.convert.AbstractConverter#buildInterpreterResult()
	 */
	@Override
	public IStatement buildInterpreterResult() {
		return writeLnProcStatement;
	}

}
