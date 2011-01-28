package nl.bve.uva.oberon.treeadaptor;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;


public class OberonNodeAdaptor extends CommonTreeAdaptor {
	public OberonNodeAdaptor() {
		super();
		System.out.println("OberonNodeAdaptor()");
	}
	
	
    public Object create(Token t) {
    	System.out.println("creating: " +t);
    	return new OberonNode(t);
    } 
}
