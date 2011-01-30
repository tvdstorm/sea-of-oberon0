package oberon0.ast;

import generated.Oberon0Parser;
import oberon0.exceptions.UnexpectedNodeException;

public class NodeChecker {

	public static String getTokenNames(int[] NodeTypes){
		String output = "";
		output += "[ ";
		for (int currentType: NodeTypes){
			output += (Oberon0Parser.tokenNames[currentType]);
			output += (" ");
		}
		output += ("]");
		return output;
	}
	
	public static void checkExpectedNodeType(int[] expectedNodeTypes, int gottenNodeType) throws UnexpectedNodeException{
		Boolean found = false;
		for (int currentType : expectedNodeTypes){
			if (currentType == gottenNodeType){
				found = true;
			}
		}
		if (!found){
			throw new UnexpectedNodeException(getTokenNames(expectedNodeTypes), 
					  Oberon0Parser.tokenNames[gottenNodeType]);
		}
	}
	public static void checkExpectedNodeType(int expectedNodeType, int gottenNodeType) throws UnexpectedNodeException{
		if (expectedNodeType != gottenNodeType){
			throw new UnexpectedNodeException(Oberon0Parser.tokenNames[expectedNodeType], 
					  Oberon0Parser.tokenNames[gottenNodeType]);
		}
	}
}
