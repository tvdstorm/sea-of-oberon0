package oberon0.environment.builtinroutines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import oberon0.ast.routines.ICallable;
import oberon0.ast.variables.IReferable;
import oberon0.environment.Context;
import oberon0.environment.IntegerValue;
import oberon0.environment.Reference;

public class Read implements ICallable{

	@Override
	public void call(Context context, ArrayList<IReferable> actualParameters) {
		IReferable actualParam = actualParameters.get(0);
		
		Reference ref= actualParam.refer(context, IReferable.noPreviousReference);
		
		String line = "";
		int val = 0;
		boolean validInputReceived = false;
		System.out.print("Give a number: ");
		while(!validInputReceived){
		    try {
		      BufferedReader is = new BufferedReader(
		        new InputStreamReader(System.in));
		      line = is.readLine();
		      val = Integer.parseInt(line);
		      validInputReceived = true;
		    } catch (NumberFormatException ex) {
		      System.err.println("Not a valid number " + line + " please try again: ");
		    } catch (IOException e) {
		      System.err.println("Unexpected IO ERROR: " + e + " please try again: ");
		    }
		}
		IntegerValue value = new IntegerValue(val);
		
		ref.setValue(value);
	}

}
