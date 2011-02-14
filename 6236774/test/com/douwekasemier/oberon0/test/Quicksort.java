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
        File file = new File("testscripts/quicksort.oberon0");
        String input = "5\n1\n4\n2\n3\n";
        for( int i = 0; i < 5; i++ ) {
            //input += ((int)(Math.random() * 98) + 1) + "\n";
        }
        interpreter.interpret(file, input);
    }
}
