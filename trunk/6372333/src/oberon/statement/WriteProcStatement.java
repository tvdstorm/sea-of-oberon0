package oberon.statement;

import java.io.IOException;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.IStatement;
import oberon.Scope;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

public class WriteProcStatement implements IStatement {

	private IIdentifier identifier;

	public WriteProcStatement(IIdentifier inputIdentifier){
		identifier = inputIdentifier; 
	}
	
	@Override
	public void eval(Scope currentScope) throws IOException,
			UnsupportedException, VariableNotFoundInScopeException {
		IDataType dataTypeValue = identifier.getDataTypeValue(currentScope);
		System.out.print(dataTypeValue.getValue(currentScope));
	}

}
