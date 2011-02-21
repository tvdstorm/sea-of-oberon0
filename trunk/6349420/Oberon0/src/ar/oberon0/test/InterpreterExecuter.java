package ar.oberon0.test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

import ar.oberon0.parser.Oberon0Lexer;
import ar.oberon0.parser.Oberon0Parser;
import ar.oberon0.shared.CheckViolation;
import ar.oberon0.shared.Interpretable;

class InterpreterExecuter {
	protected static void interpret(String pathOfSource, String ruleName, String returnFieldName) {
		Interpretable interpreter = getInterpretable(pathOfSource, ruleName, returnFieldName);
		interpreter.interpret(null);
	}

	protected static List<CheckViolation> check(String pathOfSource, String ruleName, String returnFieldName) {
		Interpretable interpreter = getInterpretable(pathOfSource, ruleName, returnFieldName);
		return interpreter.check(null);
	}

	private static Interpretable getInterpretable(String pathOfSource, String ruleName, String returnFieldName) {
		try {
			CharStream stream = new ANTLRFileStream(pathOfSource);
			Oberon0Lexer lexer = new Oberon0Lexer(stream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			Oberon0Parser parser = new Oberon0Parser(tokenStream);

			Method function = parser.getClass().getMethod(ruleName, null);
			Object functionResult = function.invoke(parser, null);
			Field field = functionResult.getClass().getField(returnFieldName);
			Interpretable interpreter = (Interpretable) field.get(functionResult);
			return interpreter;
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
