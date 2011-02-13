package com.douwekasemier.oberon0.test;

import java.io.File;

public class AST {

    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Laad een bestand oberon0 bestand     
        ASTTestInterpreter interpreter = new ASTTestInterpreter();
        File file = new File("quicksort.oberon0");
        String input = "1\n5\n3\n13\n8";
        interpreter.interpret(file, input);
        
    }

}
