package nl.bve.uva.oberon.treeadaptor;

import nl.bve.uva.oberon.ast.OberonRootNode;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;


public class OberonNodeAdaptor extends CommonTreeAdaptor {
	public OberonNodeAdaptor() {
		super();
	}
	
	
    public Object create(Token t) {
    	if (t != null) {
    		return new OberonRootNode(t);
    	}

    	return new OberonRootNode();
    } 
}