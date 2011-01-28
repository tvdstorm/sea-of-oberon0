package nl.bve.uva.oberon.treeadaptor;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;


public class OberonNodeAdaptor extends CommonTreeAdaptor {
	public OberonNodeAdaptor() {
		super();
	}
	
	
    public Object create(Token t) {
    	if (t != null) {
    		System.out.println("create(" +t.getType()+ ", " +t.getText()+ ", " +t.getTokenIndex()+ ")");
    		return new OberonRootNode(t);
    	}

    	return new OberonRootNode();
    } 
}
