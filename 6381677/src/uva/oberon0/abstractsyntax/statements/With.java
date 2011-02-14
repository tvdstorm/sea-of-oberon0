package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.RecordValue;

public class With extends Statement {

	private final ID _id;
	private final StatementList _statementList;
	
	public With(ID id, StatementList statementList) {
		_id = id;
		_statementList = statementList;
	}

	@Override
	public int eval(Scope scope) {
		RecordValue withRecord = (RecordValue)scope.getBindable(_id);
		Scope withScope = withRecord.createScopeForWith(scope);
		
		return _statementList.eval(withScope);
	}

}
