package uva.oberon0.abstractsyntax.statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import uva.oberon0.abstractsyntax.types.ID;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents the build-in Read Method Call.
*/
public class CallRead extends Call 
{
	public CallRead(CallActualParameterList actualParameterList)
	{
		super(actualParameterList);
	}
	
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
		
		return scope.setValue(ID.get(getActualParameter(0)), result);
	}
}
