package com.douwekasemier.oberon0.test;

import java.io.File;

import com.douwekasemier.oberon0.interpreter.Interpreter;

public class Quicksort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Laad een bestand oberon0 bestand     
        Interpreter interpreter = new Interpreter();
        File file = new File("quicksort.oberon0");
        String input = "";
        String output = interpreter.interpret(file, input);
        
        System.out.println(output);
    }

}
