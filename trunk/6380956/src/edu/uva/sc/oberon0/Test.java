package edu.uva.sc.oberon0;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import edu.uva.sc.oberon0.Evaluators.Structural.Module;

public class Test {

	public static void main(String[] args) throws RecognitionException {
		
		String quicksortStr = 
		"MODULE QuickSort;"+
		"\nCONST INPUTLENGTH = 5;"+
		"\nVAR input: ARRAY INPUTLENGTH OF INTEGER;"+
		"\ni: INTEGER;"+
		"\nPROCEDURE QuickSort(VAR array: ARRAY INPUTLENGTH OF INTEGER; left, right: INTEGER);"+
		
			"\nVAR\n pivot, leftIdx, rightIdx: INTEGER;"+
			
			"\nPROCEDURE Swap(VAR x, y: INTEGER);"+
			  "\nVAR"+
			  "\ntemp: INTEGER;"+
			"\nBEGIN"+
				  "\ntemp := x;"+
				  "\nx := y;"+
				  "\ny := temp;"+
			"\nEND Swap;"+
			
		"\nBEGIN"+
			"\nleftIdx := left;"+
		    "\nrightIdx := right;"+
		    "\nIF right - left > 0 THEN"+
			    "\npivot := (left + right) DIV 2;"+
			    "\nWHILE (leftIdx <= pivot) & (rightIdx >= pivot) DO"+
			    "\n  WHILE (array[leftIdx] < array[pivot]) & (leftIdx <= pivot) DO"+
			    "\n   leftIdx := leftIdx + 1"+
			    "\n  END;"+
			    "\n  WHILE (array[rightIdx] > array[pivot]) & (rightIdx >= pivot) DO"+
			    "\n   rightIdx := rightIdx - 1"+
			    "\n  END;"+
			    "\n  Swap(array[leftIdx], array[rightIdx]);"+
			    "\n  leftIdx := leftIdx + 1;"+
			    "\n  rightIdx := rightIdx - 1;"+
			    "\n  IF leftIdx - 1 = pivot THEN"+
			    "\n    rightIdx := rightIdx + 1;"+
			    "\n    pivot := rightIdx"+
			    "\n  ELSIF rightIdx + 1 = pivot THEN"+
			    "\n    leftIdx := leftIdx - 1;"+
			    "\n    pivot := leftIdx"+
			    "\n  END"+
			    "\nEND;"+
			    "\nQuickSort(array, left, pivot - 1);"+
			    "\nQuickSort(array, pivot + 1, right)"+
		    "\nEND"+
		"\nEND QuickSort;"+
		"\nBEGIN"+
			"\ni := 0;"+
			"\nWHILE i < INPUTLENGTH DO"+
				//"\ninput[i] := 4-i;"+ //TODO: !!!!!!READ funct
				"\nRead(input[i]);"+
				"\ni := i + 1"+
			"\nEND;"+
	//		"\ninput[0] :=4;"+
	//		"\ninput[1] :=13;"+
	//		"\ninput[2] :=0;"+
	//		"\ninput[3] :=35;"+
	//		"\ninput[4] :=22;"+
			"\nQuickSort(input, 0, INPUTLENGTH - 1);"+
			"\ni := 0;"+
			"\nWHILE i < INPUTLENGTH DO"+
				"\nWrite(input[i]);"+
				"\nWriteLn;"+
				"\ni := i + 1"+
			"\nEND"+
		"\nEND QuickSort."
		;
		
		String withStr = 
	        "\nMODULE TestWith;"+ 
	        "\nVAR accelerometer : RECORD x, y, z: INTEGER;ab : RECORD a, b:INTEGER END END;"+  
	        "\nBEGIN"+
	        	  "\naccelerometer.ab.a := 0;"+ 
	              "\naccelerometer.x := 1;"+    
	              "\naccelerometer.y := 2;"+    
	              "\naccelerometer.z := 3;"+    
	              "\nWITH accelerometer DO"+          
//	                    "\nx := 11;"+
//	                    "\ny := 12;"+     
//	                    "\nz := 13;"+
    		            "\nab.a := 20;"+
		                "\nab.b := 30;"+  
		                //"\na := 20;"+
		                //"\nb := 30;"+
	              "\nEND;"+
	              "\nWrite(accelerometer.x);"+
	              "\nWriteLn;"+
	              "\nWrite(accelerometer.y); "+
	              "\nWriteLn;"+
	              "\nWrite(accelerometer.z); "+
	              "\nWriteLn;"+
	              "\nWrite(accelerometer.ab.a); "+
	              "\nWriteLn;"+
	              "\nWrite(accelerometer.ab.b); "+
	        "\nEND TestWith."
	        ;
		
		String toParse = quicksortStr;
		//String toParse = withStr;
		CharStream charStream = new ANTLRStringStream(toParse);
		oberon0Lexer lexer = new oberon0Lexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		oberon0Parser parser = new oberon0Parser(tokenStream);
		
		//System.out.println(parser.module().toString());
		Module mod = parser.module();
		mod.evaluate(mod);
	}

}
