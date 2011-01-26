package oberon0;

import org.antlr.runtime.ANTLRFileStream;

public class InterOberon0 {
    
    public static void main(String[] args) throws Exception {
    	ANTLRFileStream input = new ANTLRFileStream("oberonfiles/array.oberon0");
        Oberon0Interpreter interp = new Oberon0Interpreter();
        interp.interp(input);
    }
}
