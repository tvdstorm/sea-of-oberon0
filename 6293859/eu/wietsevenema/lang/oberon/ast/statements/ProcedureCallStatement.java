package eu.wietsevenema.lang.oberon.ast.statements;

import java.util.ArrayList;
import java.util.List;

import xtc.tree.GNode;
import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.visitors.TransformGenerics;

public class ProcedureCallStatement extends Statement {

	Identifier identifier;
	List<Expression> parameters;
	
	public ProcedureCallStatement(Node id, List<Node> nodes) {
		List<Expression> parameters = new ArrayList<Expression>();
		TransformGenerics tg = new TransformGenerics();
		if(nodes!=null){
			for( Node n: nodes){
				//Je mag geen constructor met een anders 
				//geparameteriseerde List hebben, vandaar deze hack.
				if( n instanceof GNode){ 
					parameters.add((Expression)tg.dispatch(n));
				} else {
					//In dit geval is het een Expression die uit een testmethode
					//komt, niet uit de parser.
					parameters.add((Expression)n);
				}
			}
		}
		
		this.identifier = (Identifier)id;
		this.parameters = parameters;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public List<Expression> getParameters() {
		return parameters;
	}

}
