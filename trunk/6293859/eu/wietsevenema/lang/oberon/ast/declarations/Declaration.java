package eu.wietsevenema.lang.oberon.ast.declarations;

import java.util.ArrayList;
import java.util.List;

import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;

public abstract class Declaration extends Node {
	
	protected List<Identifier> castIds( List<Node> nodes){
		ArrayList<Identifier> result = new ArrayList<Identifier>();
		for( Node n: nodes){
			result.add((Identifier) n);
		}
		return result;
	}
}
