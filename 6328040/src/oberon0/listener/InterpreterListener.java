package oberon0.listener;

import org.antlr.runtime.Token;

public class InterpreterListener {

	public void info(String msg) { 
		System.out.println(msg); 
	}
	
    public void error(String msg) { 
    	System.err.println(msg); 
    }
    
    public void error(String msg, Exception e) {
        error(msg); e.printStackTrace(System.err);
    }
    public void error(String msg, Token t) { 
        error("line "+t.getLine()+": "+msg);
    }

}
