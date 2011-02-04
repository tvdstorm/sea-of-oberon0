package eu.wietsevenema.lang.oberon.tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import xtc.tree.Node;
import eu.wietsevenema.lang.oberon.ast.visitors.ModuleEvaluator;
import eu.wietsevenema.lang.oberon.ast.visitors.ModulePrinter;
import eu.wietsevenema.lang.oberon.exceptions.InvalidInputException;
import eu.wietsevenema.lang.oberon.exceptions.ParseException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.VariableNotDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;

public class ParserTest {

	@Test
	public void testProcedureCall() throws IOException, InvalidInputException, ParseException{
		Node result = Util.parseModuleFile(Util.getAbsFilename("oberon/parser/procedurecall.o0"));
		ModulePrinter printer = new ModulePrinter();
		String actual = (String)printer.dispatch(result);
		assertEquals("MODULE Procedure;BEGINProcedure1();Procedure2();Procedure3(a,1,(a+2))END Procedure.", actual);
	}
	
	@Test
	public void testProcedureDecl() throws IOException, InvalidInputException, ParseException{
		Node result = Util.parseModuleFile(Util.getAbsFilename("oberon/parser/proceduredef.o0"));
		ModulePrinter printer = new ModulePrinter();
		String actual = (String)printer.dispatch(result);
		//FIXME nicer print. 
		assertEquals("MODULE Procedure;PROCEDURE test" +
					"(VAR i : INTEGER;VAR k : INTEGER; x : BOOLEAN; y : BOOLEAN);VAR t: INTEGER;VAR q,r: BOOLEANi:=0"+
					"PROCEDURE test2();VAR x: INTEGERBEGINEND Procedure."
					, actual);
	}
	
	
	@Test
	public void testWhileStatement() throws IOException, InvalidInputException, ParseException{
		Node result = Util.parseModuleFile(Util.getAbsFilename("oberon/parser/whilestatement.o0"));
		ModulePrinter printer = new ModulePrinter();
		String actual = (String)printer.dispatch(result);
		
		assertEquals("MODULE While;VAR t1: INTEGER;" +
				     "VAR t2: BOOLEAN" +
				     "BEGIN" +
				     "WHILE(t1<=5)" +
				     "DO" +
				     "t:=(t+1);" +
				     "t2:=true" +
				     "END" +
				     "END While."
				, actual);		
	}
	
	@Test
	public void testSwapProcedure() throws IOException, InvalidInputException, ParseException, ValueUndefinedException, VariableNotDeclaredException{
		Node result = Util.parseModuleFile(Util.getAbsFilename("oberon/swap.o0"));
		SymbolTable st = new SymbolTable();
		ModuleEvaluator me = new ModuleEvaluator(st);
		me.dispatch(result);
		
		/*
		 * 	x := 1;
		 * 	y := 2;
		 * 	Swap(x, y)
		 */
		
		assertEquals( new Integer(2), ((IntegerValue)st.lookupValue("x")).getValue() );
		assertEquals( new Integer(1), ((IntegerValue)st.lookupValue("y")).getValue() );
		
	}
	
	
	@Test
	public void testAllOperatorsGetParsed() throws IOException, InvalidInputException, ParseException{
		Util.parseExpressionFile(Util.getAbsFilename("oberon/expr/allops.expr"));
	}

	@Test
	public void testAdditionOpsLeftAssoc() throws IOException, InvalidInputException, ParseException{
		Node result = Util.parseExpressionFile(Util.getAbsFilename("oberon/expr/additionopsleftassoc.expr"));
		ModulePrinter printer = new ModulePrinter();
		String actual = (String)printer.dispatch(result);
		assertEquals("(((2+3)-1)+41)", actual);
	}
	
	@Test
	public void testEqualityOpsLeftAssoc() throws IOException, InvalidInputException, ParseException{
		Node result = Util.parseExpressionFile(Util.getAbsFilename("oberon/expr/equalityopsleftassoc.expr"));
		ModulePrinter printer = new ModulePrinter();
		String actual = (String)printer.dispatch(result);
		assertEquals("((((((true=false)#true)<2)<=3)>23)>=12)", actual);
	}
	
	@Test
	public void testMultiplicationOpsLeftAssoc() throws IOException, InvalidInputException, ParseException{
		Node result = Util.parseExpressionFile(Util.getAbsFilename("oberon/expr/multiplicationopsleftassoc.expr"));
		ModulePrinter printer = new ModulePrinter();
		String actual = (String)printer.dispatch(result);
		assertEquals("(((2*3)DIV666)MOD12)", actual);
	}
	
	@Test
	public void testParenthesisedOpsBind() throws IOException, InvalidInputException, ParseException{
		Node result = Util.parseExpressionFile(Util.getAbsFilename("oberon/expr/parenthesisedopsbind.expr"));
		ModulePrinter printer = new ModulePrinter();
		String actual = (String)printer.dispatch(result);
		assertEquals("((((2+1)-4)<false)>=3)", actual);
	}
	
	@Test
	public void testPrecedenceOrder() throws IOException, InvalidInputException, ParseException{
		//1 # 1 + 1 DIV 1 & 1 OR 1 ~ 1
		Node result = Util.parseExpressionFile(Util.getAbsFilename("oberon/expr/precedence.expr"));
		ModulePrinter printer = new ModulePrinter();
		String actual = (String)printer.dispatch(result);
		assertEquals("(1#(1+(1DIV(1&(1OR(~1))))))", actual);
	}
	
	@Test
	public void testUnaryMin() throws IOException, InvalidInputException, ParseException{
		// -3 * 2 bind als -(3*2)!! 
		Node unaryMinLhs = Util.parseExpressionFile(Util.getAbsFilename("oberon/expr/unarymin.expr"));
		ModulePrinter printer = new ModulePrinter();
		String actual = (String)printer.dispatch(unaryMinLhs);
		assertEquals("-(3*2)", actual);
	}
	

	
	@Test
	public void arraySelectorTest() throws InvalidInputException, ParseException, IOException{
		
		ModulePrinter printer = new ModulePrinter();
		
		Node result = Util.parseExpressionString("a[1][2+3]");
		String actual = (String)printer.dispatch(result);
		assertEquals("a[1][(2+3)]", actual);
		
		result = Util.parseExpressionString("a[b]");
		actual = (String)printer.dispatch(result);
		assertEquals("a[b]", actual);
		
	}
	
	@Test(expected=ParseException.class)
	public void emptyArraySelectorTest() throws InvalidInputException, ParseException, IOException{
		Util.parseExpressionString("a[]");
	}


}
