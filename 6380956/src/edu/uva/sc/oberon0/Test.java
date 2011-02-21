package edu.uva.sc.oberon0;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import edu.uva.sc.oberon0.Evaluators.Structural.Module;

public class Test {

	public static void main(String[] args) throws RecognitionException {
//		CharStream charStream = new ANTLRStringStream(
//				"MODULE QuickSort;"+
//					"\nCONST INPUTLENGTH = 5;"+
//					"\nVAR input: ARRAY INPUTLENGTH OF INTEGER;"+
//					"\ni: INTEGER;"+
//					"\nPROCEDURE QuickSort(VAR array: ARRAY INPUTLENGTH OF INTEGER; left, right: INTEGER);"+
//						"\nVAR\n pivot, leftIdx, rightIdx: INTEGER;"+
//						"\nPROCEDURE Swap(VAR x, y: INTEGER);"+
//							  "\nVAR"+
//							  "\ntemp: INTEGER;"+
//						"\nBEGIN"+
//								  "\ntemp := x;"+
//								  "\nx := y;"+
//								  "\ny := temp"+
//						"\nEND Swap;"+
//					"\nBEGIN"+
//						"\nleftIdx := left;"+
//					    "\nrightIdx := right;"+
//					    "\na := 1;"+
//					    "\nb := 2;"+
//					    "\nSwap(a, b);"+
//					"\nEND QuickSort;"+
//				"\nEND QuickSort."
//				);
		CharStream charStream = new ANTLRStringStream(
				"MODULE QuickSort;"+
					"\nCONST INPUTLENGTH = 5;"+
					"\nVAR input: ARRAY INPUTLENGTH OF INTEGER;"+
					"\na, b, i: INTEGER;"+
					"\nPROCEDURE QuickSort(VAR array: ARRAY INPUTLENGTH OF INTEGER; left, right: INTEGER);"+
						"\nVAR\n pivot, leftIdx, rightIdx: INTEGER;"+
						
					"\nBEGIN"+
						"\nleftIdx := left;"+
					    "\nrightIdx := right;"+
					"\nEND QuickSort;"+
					"\nPROCEDURE Swap(VAR x, y: INTEGER);"+
					  "\nVAR"+
					  "\ntemp: INTEGER;"+
					"\nBEGIN"+
						  "\ntemp := x;"+
						  "\nx := y;"+
						  "\ny := temp"+
					"\nEND Swap;"+
					"\nBEGIN"+
						"\na := 0+1;"+
					    "\nb := 1+1;"+
					    "\nSwap(a, b);"+
					    //"\nWrite(a);"+
					    //"\nWrite(b);"+
					    "\nWHILE (a <= 4) DO"+
					    	"\na := a + 1"+
					    "\nEND;"+
					    //"\nWrite(a);"+
					    "\nIF a-1 = 4 THEN"+
					    	"\nWrite(a);"+
					    "\nELSIF a=5 THEN"+
					    	"\nWrite(a+10);"+
					    "\nELSE"+
					    	"\nWrite(a+100);"+
					    "\nEND"+
				"\nEND QuickSort."
				);
		oberon0Lexer lexer = new oberon0Lexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		oberon0Parser parser = new oberon0Parser(tokenStream);
		
		//System.out.println(parser.module().toString());
		Module mod = parser.module();
		mod.evaluate(mod);
	}

}
