package com.douwekasemier.oberon0.interpreter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;

import com.douwekasemier.oberon0.ast.declaration.Module;
import com.douwekasemier.oberon0.core.Oberon0Lexer;
import com.douwekasemier.oberon0.core.Oberon0Parser;
import com.douwekasemier.oberon0.core.Oberon0Parser.module_return;
import com.douwekasemier.oberon0.exceptions.ASTException;
import com.douwekasemier.oberon0.exceptions.Oberon0Exception;
import com.douwekasemier.oberon0.interpreter.environment.Environment;

public class Interpreter {

    public void interpret(File file, String input) {
        StringWriter writer = new StringWriter();
        interpret(file, new BufferedReader(new StringReader(input)), writer);
    }

    /**
     *
     * Interpret the input file
     *
     * @param file
     */
    public void interpret(File file, BufferedReader input, StringWriter output) {
        // Create and run the antlr lexer
        Oberon0Lexer lexer = null;
        try {
            lexer = lexer(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create and run the antlr parser
        Oberon0Parser parser = parser(lexer);
        module_return parserOutput = null;
        // Generate our AST from the antlr generated AST
        try {
            parserOutput = parser.module();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

        Module module = null;
        try {
            module = ast(parserOutput);
        } catch (ASTException e) {
            e.printStackTrace();
        }

        // Runtime environment
        Environment environment = new Environment(input, new PrintWriter(output), null, "System");

        // Built-in functions
        environment.loadCoreFunctions();
        
        Environment moduleEnvironment = environment.newEnvironment("Module");

        try {
            module.run(moduleEnvironment);
            System.out.println();
            System.out.println("---- OUTPUT ----");
            System.out.print(output.toString());
        } catch (Oberon0Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create and run the antlr lexer
     *
     * @return
     * @throws IOException
     */
    private Oberon0Lexer lexer(File file) throws IOException {
        // Lexer
        CharStream charStream = new ANTLRReaderStream(new FileReader(file));// ANTLRFileStream(file);
        Oberon0Lexer lexer = new Oberon0Lexer(charStream);
        return lexer;
    }

    /**
     * Create and run the antlr parser
     *
     * @param lexer
     * @return
     */
    private Oberon0Parser parser(Oberon0Lexer lexer) {
        TokenStream tokenStream = new CommonTokenStream(lexer);
        Oberon0Parser parser = new Oberon0Parser(tokenStream);
        return parser;
    }

    /**
     * Generate our own AST which implements the Interpreter pattern
     *
     * @param parserOutput
     * @throws ASTException
     */
    private Module ast(module_return parserOutput) throws ASTException {
        // Get the antlr generated AST
        Tree rootNode = (Tree) parserOutput.getTree();
        return new Module(rootNode);

    }
}
