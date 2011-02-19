package oberon0.statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import oberon0.declaration.VariableDeclaration;
import oberon0.environment.Environment;
import oberon0.expression.Expression;
import oberon0.selector.DotSelector;
import oberon0.value.RecordValue;
import oberon0.value.Value;

public class WithStatement  implements Statement {

	private final Expression variableExp;
	private final ArrayList<Statement>statements;
	
	public WithStatement(Expression variableExp) {
		this.variableExp = variableExp;
		statements = new ArrayList<Statement>();
	}
	
	public void addStatements(List<Statement>statements) {
		this.statements.addAll(statements);
	}
	
	@Override
	public void execute(Environment env){
		RecordValue record = getRecordValue(env);
		
		Environment innerEnv = createInnerEnvironment(record, env);
		for(Statement statement : statements) {
			statement.execute(innerEnv);
		}
		
		passValuesToRecord(record, innerEnv);
	}

	private RecordValue getRecordValue(Environment env) {
		Value<?> val = variableExp.evaluate(env);
		assert(val.getClass() == RecordValue.class):"Record value type expected";
		return (RecordValue) val;
	}
	
	private Environment createInnerEnvironment(RecordValue record, Environment env) {
		Environment innerEnv = new Environment(env);
		
		HashMap<String,Value<?>> fields = record.getTrueValue();
		for (String ident : fields.keySet()) {
			Value<?>value = fields.get(ident);
			innerEnv.declare(new VariableDeclaration(ident, value.getType()));
		}
		
		return innerEnv;
	}
	
	private void passValuesToRecord(RecordValue record, Environment env) {
		for (String ident : record.getTrueValue().keySet()) {
			Value<?>newVal = env.getValue(ident);
			record.setValue(new DotSelector(ident), env, newVal);
		}
	}
}
