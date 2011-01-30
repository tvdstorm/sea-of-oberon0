package oberon0.ast;

import generated.Oberon0Parser;

import java.util.ArrayList;

import oberon0.exceptions.UnexpectedNodeException;

public class IdentList {
	public static ArrayList<String> getNamesFromIDENTLISTNode(OberonAST identListTree) throws UnexpectedNodeException{
		NodeChecker.checkExpectedNodeType(Oberon0Parser.IDENTLIST, identListTree.getType());
		
		ArrayList<String> names = new ArrayList<String>();
				
		for (OberonAST currentNameBranch: identListTree.getChildren()){
			names.add(currentNameBranch.getText());
		}
		return names;
	}
}
