package mains.testscripts;

import java.io.IOException;

import oberon0.Interpreter;
import oberon0.environment.ArrayValue;
import oberon0.environment.Context;
import oberon0.environment.IntegerValue;
import oberon0.environment.Reference;

import org.antlr.runtime.ANTLRFileStream;

public class TestArrayScript {
	public static void main(String [ ] args) throws IOException
	{
		//run script
		ANTLRFileStream inputfile = new ANTLRFileStream("oberonfiles/array.oberon0");
	    Context context = Interpreter.getOutputContextFromFile(inputfile);
	    
	    //test outcome
	  	//get me the input array from the context
	    Reference arrayRef = context.getReference("input");
	    ArrayValue array= (ArrayValue) arrayRef.getValue();
	    
	    int size = ((IntegerValue)context.getReference("INPUTLENGTH").getValue()).getValue();
	    
	    //we expect this to be input
	    int[] expected = new int[] {1,2,3,4,5};
	    
	    //test if expectations are correct
	    for(int i = 0; i < size; i++){
	    	int value = ((IntegerValue) array.getValue(i)).getValue();
	    	int currentExpected = expected[i];
	    	//value array[i] must be higher than value array[i-1]
	    	assert(value==currentExpected) :
	    		"Array testscript failed, at position "+ i +", expected "+ expected[i] + 
	    		" , but got: "+ value;
	    }
	    //test passed
	    System.out.print("Array test passed");
	}
}
