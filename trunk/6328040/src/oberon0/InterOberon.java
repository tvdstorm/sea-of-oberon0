package oberon0;

import oberon0.interpreter.OberonInterpreter;

import org.antlr.runtime.ANTLRFileStream;

public class InterOberon {
    
    public static void main(String[] args) throws Exception {
    	ANTLRFileStream input = new ANTLRFileStream("oberonfiles/returnvalue.oberon0");
        OberonInterpreter interp = new OberonInterpreter();
        interp.interp(input);
    }
}
