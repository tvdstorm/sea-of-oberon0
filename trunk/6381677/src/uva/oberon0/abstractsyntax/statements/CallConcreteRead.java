package uva.oberon0.abstractsyntax.statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import uva.oberon0.abstractsyntax.ID;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents the build-in Read Method Call.
*/
public class CallConcreteRead extends CallConcrete 
{
	@Override
	public int eval(Scope scope)
	{
		int result;
		
		try 
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			result = Integer.parseInt(reader.readLine());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			return 0;
		}
		
		return scope.setValue((ID)getCallVar(0), result);
	}
}
