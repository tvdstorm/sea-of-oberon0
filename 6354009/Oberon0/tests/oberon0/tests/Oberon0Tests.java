package oberon0.tests;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import oberon0.Oberon0Lexer;
import oberon0.Oberon0Parser;
import oberon0.Oberon0Parser.program_return;


public class Oberon0Tests {
	
	private ByteArrayOutputStream baos;
	
	private String pathToTestFile(String testName) {
		String fullPathString= "./tests/"; 
		return fullPathString.concat(testName).concat(".oberon0");
	}
	
	private void runProgram(String fileName, String[] args) throws RecognitionException {
		baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		
		//Get the generated expressions
		Oberon0Parser parser = createParserForFile(fileName);
		program_return r = parser.program();
		
		r.program.run(args, ps); 
	}
	
	private Oberon0Parser createParserForFile(String fileName)
	{ 
		ANTLRStringStream simpleExpr = null;
		try {
			simpleExpr = new ANTLRFileStream(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Oberon0Lexer lex = new Oberon0Lexer(simpleExpr);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		return new Oberon0Parser(tokens);
	}
	
	
	private void printOutput() {
		try {
			Integer[] outputVals = outputAsIntArray();
			for (Integer i : outputVals) {
				System.out.println(i);
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	private void testOutput(Integer [] checkVals) {
		try {
			Integer[] outputVals = outputAsIntArray();
			assertTrue(outputVals.length >= checkVals.length);
			
			for(int i = 0; i < checkVals.length; i++) {
				assertEquals("Output " + i + "is wrong:",checkVals[i], outputVals[i]);
			}
		}catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	private Integer [] outputAsIntArray() throws NumberFormatException, IOException {
		BufferedReader buffIn = getBufferedReaderForOutputStream();
		ArrayList<Integer>values = new ArrayList<Integer>();
		
		String line = null;
		while ((line = buffIn.readLine()) != null) {
			values.add(Integer.parseInt(line));
		}
		
		Integer ia[] = new Integer[values.size()];
		return values.toArray(ia);
	}
	
	private BufferedReader getBufferedReaderForOutputStream() {
		byte[] bytes = baos.toByteArray();
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		return new BufferedReader(new InputStreamReader(in));
	}
	
	///////////////////////////////////////////////////////////////////
	//TESTS
	///////////////////////////////////////////////////////////////////

	@Test
	public void test_Assigment1() throws RecognitionException
	{
		runProgram(pathToTestFile("test_assignment1"), null);
		Integer [] testVals = {10};
		testOutput(testVals);
	}
	
	@Test
	public void test_Assigment2() throws RecognitionException
	{
		runProgram(pathToTestFile("test_assignment2"), null);
		Integer [] testVals = {20};
		testOutput(testVals);
	}	 
	
	@Test
	public void test_Expression1() throws RecognitionException
	{
		runProgram(pathToTestFile("test_expression1"), null);
		Integer [] testVals = {1,0, 0,1, 1,0, 1,1,0, 1,0, 1,1,0, 1,0, 1,0};
		testOutput(testVals);
	}	 

	@Test
	public void test_Expression2() throws RecognitionException
	{
		runProgram(pathToTestFile("test_expression2"), null);
		Integer [] testVals = {-1,2,-3,4,0,1};
		testOutput(testVals);
	}	 
	
	@Test
	public void test_Expression3() throws RecognitionException
	{
		runProgram(pathToTestFile("test_expression3"), null);
		Integer [] testVals = {1,0,7, 6, 25, 54};
		testOutput(testVals);
	}
	
	@Test
	public void test_Primitives1() throws RecognitionException
	{
		runProgram(pathToTestFile("test_primitives1"), null);
		Integer [] testVals = {3};
		testOutput(testVals);
	}
	
	@Test
	public void test_Primitives2() throws RecognitionException
	{
		runProgram(pathToTestFile("test_primitives2"), null);
		Integer [] testVals = {1,2};
		testOutput(testVals);
	}
	
	@Test
	public void test_Primitives3() throws RecognitionException
	{
		runProgram(pathToTestFile("test_primitives3"), null);
		Integer [] testVals = {1,2,4};
		testOutput(testVals);
	}
	
	@Test
	public void test_Procedure1() throws RecognitionException
	{
		runProgram(pathToTestFile("test_procedure1"), null);
		Integer [] testVals = {10,0};
		testOutput(testVals);
	}
	
	@Test
	public void test_Procedure2() throws RecognitionException
	{
		runProgram(pathToTestFile("test_procedure2"), null);
		Integer [] testVals = {10,11};;
		testOutput(testVals);
	}
	
	@Test
	public void test_Procedure3() throws RecognitionException
	{
		runProgram(pathToTestFile("test_procedure3"), null);
		Integer [] testVals = {0,10,0};
		testOutput(testVals);
	}
	
	@Test
	public void test_Procedure4() throws RecognitionException
	{
		runProgram(pathToTestFile("test_procedure4"), null);
		Integer [] testVals = {0,10};
		testOutput(testVals);
	}

	@Test
	public void test_Procedure5() throws RecognitionException
	{
		runProgram(pathToTestFile("test_procedure5"), null);
		Integer [] testVals = {0,10};
		testOutput(testVals);
	}

	@Test
	public void test_Procedure6() throws RecognitionException
	{
		runProgram(pathToTestFile("test_procedure6"), null);
		Integer [] testVals = {10,0};
		testOutput(testVals);
	}
	
	
	
	@Test
	public void test_ProgramProcedure1() throws RecognitionException
	{
		String[] args = {"2","3"};
		runProgram(pathToTestFile("test_program_procedure1"), args);
		Integer [] testVals = {2,3};
		testOutput(testVals);
	}
	
	@Test
	public void test_Statement1() throws RecognitionException
	{
		runProgram(pathToTestFile("test_statement1"), null);
		Integer [] testVals = {10};
		testOutput(testVals);
	}
	
	@Test
	public void test_Statement2() throws RecognitionException
	{
		runProgram(pathToTestFile("test_statement2"), null);
		Integer [] testVals = {11};
		testOutput(testVals);
	}
	
	@Test
	public void test_Statement3() throws RecognitionException
	{
		runProgram(pathToTestFile("test_statement3"), null);
		Integer [] testVals = {12};
		testOutput(testVals);
	}
	
	@Test
	public void test_Statement4() throws RecognitionException
	{
		runProgram(pathToTestFile("test_statement4"), null);
		Integer [] testVals = {13};
		testOutput(testVals);
	}
	
	@Test
	public void test_Statement5() throws RecognitionException
	{
		runProgram(pathToTestFile("test_statement5"), null);
		Integer [] testVals = {10,11,12};
		testOutput(testVals);
	}

	@Test
	public void test_smoke() throws RecognitionException
	{
		String[] args = {"9","4","8","2","3"};
		runProgram(pathToTestFile("test_smoke"), args);
		Integer [] testVals = {2,3,4,8,9};
		printOutput();
		testOutput(testVals);
	}
}
