package eu.wietsevenema.lang.oberon.tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import eu.wietsevenema.lang.oberon.ast.declarations.Module;
import eu.wietsevenema.lang.oberon.ast.expressions.AdditiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.IntegerConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.MultiplicativeExpression;
import eu.wietsevenema.lang.oberon.ast.visitors.ExpressionEvaluator;
import eu.wietsevenema.lang.oberon.exceptions.InvalidInputException;
import eu.wietsevenema.lang.oberon.exceptions.ParseException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.VariableAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.BuiltIns;
import eu.wietsevenema.lang.oberon.interpreter.Environment;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;


public class ExpressionEvaluatorTest  {

	
	@Test
	public void testSimpleAddition() throws ValueUndefinedException{
		Expression exp = new AdditiveExpression(new IntegerConstant(1), new IntegerConstant(3), "+");
		ExpressionEvaluator evaluator = new ExpressionEvaluator(new SymbolTable());
		IntegerValue result = (IntegerValue) evaluator.dispatch(exp);
		assertEquals(new Integer(4), result.getValue());
	}
	
	@Test
	public void testNestedAddition() throws ValueUndefinedException{
		Expression exp = 
			new AdditiveExpression(
				new IntegerConstant(1), 
				new AdditiveExpression(
					new IntegerConstant(10),
					new IntegerConstant(12),
					"-"
				),
				"+");
		ExpressionEvaluator evaluator = new ExpressionEvaluator(new SymbolTable());
		IntegerValue result = (IntegerValue) evaluator.dispatch(exp);
		assertEquals(new Integer(1+(10-12)), result.getValue());
	}
	
	@Test
	public void logicalConnectivesEvaluateLazy(){
		fail("Not implemented");
	}
	
	@Test
	public void testDivisionModulus() throws ValueUndefinedException{
		Expression div = 
			new MultiplicativeExpression(
				new IntegerConstant(6),
				new IntegerConstant(4),
				"DIV"
				);
		
		Expression mod = 
			new MultiplicativeExpression(
				new IntegerConstant(6),
				new IntegerConstant(4),
				"MOD"
				);
		
		
		ExpressionEvaluator evaluator = new ExpressionEvaluator(new SymbolTable());
		IntegerValue divResult = (IntegerValue) evaluator.dispatch(div);
		IntegerValue modResult = (IntegerValue) evaluator.dispatch(mod);
		
		/*
		 * 6 DIV 4 == 1
		 * 6 MOD 4 == 2
		 */
		assertEquals(new Integer(1), divResult.getValue());
		assertEquals(new Integer(2), modResult.getValue());
	}

	@Test
	public void testSimpleIdentifier() throws ValueUndefinedException, VariableAlreadyDeclaredException{
		SymbolTable st = new SymbolTable();
		st.getCurrent().declareValue("a", new IntegerValue(40));
		
		Expression exp = new AdditiveExpression(new IntegerConstant(2), new Identifier("a"), "+");
		
		ExpressionEvaluator evaluator = new ExpressionEvaluator(st);
		IntegerValue result = (IntegerValue) evaluator.dispatch(exp);
		assertEquals(new Integer(42), result.getValue());
	}
	
	
	@Test
	public void testArrays() throws IOException, InvalidInputException, ParseException{
		Module result = (Module)Util.parseModuleFile(Util.getAbsFilename("oberon/expr/arrays.o0"));
		Environment env = new Environment(System.in, System.out);
		BuiltIns.inject(env);
		env.runModule(result);
	}
	
		
}
