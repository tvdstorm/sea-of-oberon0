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

/*
 * Built in routine from oberon-0
 * when called, it reads a number from the console
 */
public class Read implements ICallable{

	@Override
	/*
	 * Reads a number from the console and returns it to the first reference in actual parameters
	 */
	public void call(Context context, ArrayList<IReferable> actualParameters) {
		//get the first parameter
		IReferable actualParam = actualParameters.get(0);
		//get the reference of the first paramter
		Reference ref= actualParam.refer(context, IReferable.noPreviousReference);
		
		//get input from user:
		String line = "";
		int val = 0;
		boolean validInputReceived = false;
		System.out.print("Give a number: ");
		//while no valid number is received, try to read it from the console
		while(!validInputReceived){
		    try {
		      BufferedReader is = new BufferedReader(
		        new InputStreamReader(System.in));
		      line = is.readLine();
		      val = Integer.parseInt(line);
		      validInputReceived = true;
		    } catch (NumberFormatException ex) {
		      System.err.print("Not a valid number " + line + " please try again: ");
		    } catch (IOException e) {
		      System.err.print("Unexpected IO ERROR: " + e + " please try again: ");
		    }
		}
		//wrap it into an IntegerValue
		IntegerValue value = new IntegerValue(val);
		//give given input back
		ref.setValue(value);
	}

}
