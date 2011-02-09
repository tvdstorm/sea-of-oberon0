package oberon.statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.IStatement;
import oberon.Scope;

public class ReadProcStatement implements IStatement {

	private IIdentifier identifier;

	public ReadProcStatement(IIdentifier inputIdentifier){
		identifier = inputIdentifier; 
	}
	
	@Override
	public void eval(Scope currentScope) throws IOException {
		IDataType dataTypeValue = identifier.getDataTypeValue(currentScope);
		dataTypeValue.setValue(readInputFromConsole());
	}
	
	/**
	 * Reads a single input from the console.
	 *
	 * @return the specified number
	 * @throws IOException When reading from the command line fails
	 */
	private int readInputFromConsole() throws IOException {
		final BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		
	    System.out.print ("Type number you want to sort: ");
	    System.out.flush(); 
	    
	    
	    final String input = stdin.readLine();
	    
	    return Integer.parseInt(input);
	}
}
