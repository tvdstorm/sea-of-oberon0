package randy.oberon0.ast.statement;

import randy.oberon0.ast.selector.Selector;
import randy.oberon0.exception.TypeMismatchException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
import randy.oberon0.value.*;

public class WithStatement extends Statement
{
	private final Selector selector;
	private final Block body;
	
	public WithStatement(Selector _selector, Block _body)
	{
		assert(_selector != null);
		assert(_body != null);
		selector = _selector;
		body = _body;
	}
	@Override
	public void run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the selector
		Record selectorValue = selector.evaluate(environment).getValue().castToRecord();
		// Create a new environment to use in the with block
		RuntimeEnvironment withEnvironment = new RuntimeEnvironment(environment);
		// Register all members of the record in the new environment
		for (String memberName : selectorValue.getMemberNames())
		{
			withEnvironment.registerVariableByReference(memberName, selectorValue.getMemberValue(memberName));
		}
		// Run the body of the with block
		body.run(withEnvironment);
	}
	@Override
	public void typeCheck(TypeCheckEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the selector
		ITypeCheckType type = selector.typeCheck(environment).getValue();
		if (!(type instanceof TypeCheckRecordType))
		{
			throw new TypeMismatchException(type.toString(), "RECORD");
		}
		TypeCheckRecordType record = (TypeCheckRecordType)type;
		// Create a new environment to use in the with block
		TypeCheckEnvironment withEnvironment = new TypeCheckEnvironment(environment);
		// Register all members of the record in the new environment
		for (String memberName : record.getMemberNames())
		{
			withEnvironment.registerVariableByReference(memberName, new TypeCheckReference(record.getMemberType(memberName, environment)));
		}
		// Run the body of the with block
		body.typeCheck(withEnvironment);
	}
}
