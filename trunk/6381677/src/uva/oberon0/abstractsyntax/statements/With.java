package uva.oberon0.abstractsyntax.statements;

import java.util.Map;

import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.Value;
import uva.oberon0.runtime.ValueRecord;

public class With extends Statement {

	private final ID _id;
	private final StatementList _statementList;
	
	public With(ID id, StatementList statementList) {
		_id = id;
		_statementList = statementList;
	}

	@Override
	public int eval(Scope scope) {
		ValueRecord value = (ValueRecord)scope.getBindable(_id);

		Scope scopeSub = new Scope(scope);
		
		for (Map.Entry<ID, Value> mapEntry : value.getValueSet())
		{
			scopeSub.putBindable(mapEntry.getKey(), mapEntry.getValue());
		}
		
		return _statementList.eval(scopeSub);
	}

}
