package com.douwekasemier.oberon0.test;

import java.io.File;

import com.douwekasemier.oberon0.interpreter.Interpreter;

public class With {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Laad een bestand oberon0 bestand     
        Interpreter interpreter = new Interpreter();
        File file = new File("testscripts/with.oberon0");
        String input = "";
        interpreter.interpret(file, input);
    }
}
