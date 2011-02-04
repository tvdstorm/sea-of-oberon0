package eu.wietsevenema.lang.oberon.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import xtc.tree.Node;
import xtc.tree.VisitingException;
import eu.wietsevenema.lang.oberon.ast.declarations.Module;
import eu.wietsevenema.lang.oberon.ast.expressions.AdditiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.BooleanConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.EqualityExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.IntegerConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.ProcedureUndefinedException;
import eu.wietsevenema.lang.oberon.ast.statements.AssignmentStatement;
import eu.wietsevenema.lang.oberon.ast.statements.ProcedureCallStatement;
import eu.wietsevenema.lang.oberon.ast.statements.Statement;
import eu.wietsevenema.lang.oberon.ast.statements.WhileStatement;
import eu.wietsevenema.lang.oberon.ast.visitors.ModuleEvaluator;
import eu.wietsevenema.lang.oberon.ast.visitors.StatementEvaluator;
import eu.wietsevenema.lang.oberon.exceptions.InvalidInputException;
import eu.wietsevenema.lang.oberon.exceptions.ParseException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.VariableAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.VariableNotDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.BuiltIns;
import eu.wietsevenema.lang.oberon.interpreter.Environment;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;
import eu.wietsevenema.lang.oberon.interpreter.values.BooleanValue;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;

public class StatementEvaluatorTest  {

	private SymbolTable symbolTable;

	@Before
	public void setUp() {
		this.symbolTable = new SymbolTable();
	}

	
	@Test
	public void testAssignment() throws VariableAlreadyDeclaredException, ValueUndefinedException, VariableNotDeclaredException  {
		//Declare vars
		symbolTable.declareValue("a", new IntegerValue(null));
		symbolTable.declareValue("b", new BooleanValue(null));
		
		//Construct assignment statements
		AssignmentStatement as1 = new AssignmentStatement(
				new Identifier("a"),
				new IntegerConstant(2));
		
		AssignmentStatement as2 = new AssignmentStatement(
				new Identifier("b"),
				new BooleanConstant(true));

		StatementEvaluator se = new StatementEvaluator(symbolTable);
		se.dispatch(as1);
		se.dispatch(as2);
		
		assertEquals(((IntegerValue)symbolTable.lookupValue("a")).getValue(), new Integer(2));
		assertEquals(((BooleanValue)symbolTable.lookupValue("b")).getValue(), new Boolean(true));
	}
	
	
	@Test
	public void testSecondAssignment() throws ValueUndefinedException, VariableNotDeclaredException, VariableAlreadyDeclaredException {
		symbolTable.declareValue("a",new IntegerValue(null));
		AssignmentStatement first = new AssignmentStatement(
				new Identifier("a"),
				new IntegerConstant(2));

		AssignmentStatement second = new AssignmentStatement(
				new Identifier("a"),
				new IntegerConstant(3));

		StatementEvaluator se = new StatementEvaluator(symbolTable);
		se.dispatch(first);
		assertEquals(((IntegerValue)symbolTable.lookupValue("a")).getValue(), new Integer(2));
		se.dispatch(second);
		assertEquals(((IntegerValue)symbolTable.lookupValue("a")).getValue(), new Integer(3));
	}
	
	@Test(expected=ProcedureUndefinedException.class) 
	public void testCallNotExistingProcedureFails() throws Throwable{
		Statement call = new ProcedureCallStatement( new Identifier("idonotexist"), new ArrayList<Node>() );
		StatementEvaluator statEval = new StatementEvaluator(symbolTable);
		try {
			statEval.dispatch(call);
		} catch(VisitingException e){
			throw e.getCause();
		}
	}
	
	@Test
	public void testWhileStatement() throws VariableAlreadyDeclaredException, ValueUndefinedException, VariableNotDeclaredException{
		
		Expression condition = new EqualityExpression(
						new Identifier("count"),
						new IntegerConstant(5),
						"<"
					);
		
		Statement stat1 = new AssignmentStatement(
							new Identifier("count"), 
							new AdditiveExpression(
									new Identifier("count"),
									new IntegerConstant(1),
									"+"
							)
							);
		
		Statement stat2 = new AssignmentStatement(
							new Identifier("touch"),
							new BooleanConstant(true)
						);
		
		ArrayList<Statement> statements = new ArrayList<Statement>();
		statements.add(stat1);
		statements.add(stat2);
		
		WhileStatement whilestat = new WhileStatement(condition, statements);
		
		symbolTable.declareValue("count", new IntegerValue(0));
		symbolTable.declareValue("touch", new BooleanValue(false));
		
		StatementEvaluator eval = new StatementEvaluator(symbolTable);
		
		eval.dispatch(whilestat);		
		
		assertEquals(new Integer(5), 		((IntegerValue)symbolTable.lookupValue("count")).getValue());
		assertEquals(new Boolean(true), 	((BooleanValue)symbolTable.lookupValue("touch")).getValue());
		
	}
	
	@Test
	public void testWhileStatement2() throws InvalidInputException, ParseException, IOException, ValueUndefinedException, VariableNotDeclaredException{
		String whileprog = 
		"MODULE While;	" +
		"	VAR t1: INTEGER; t2 : BOOLEAN;" +
		"BEGIN" +
		" t1 := 0;" +
		" WHILE t1 <= 5" +
		" DO" +
		"	t1  := t1 + 1;" +
		"	t2 := TRUE" +
		" END " +
		"END While.";
		
		ModuleEvaluator me = new ModuleEvaluator(symbolTable);
		me.dispatch(Util.parseModuleString(whileprog));
		
		assertEquals( new Boolean(true), ((BooleanValue)symbolTable.lookupValue("t2")).getValue());
		assertEquals( new Integer(6), 	 ((IntegerValue)symbolTable.lookupValue("t1")).getValue());
	}
	
	
	@Test
	public void testIfStatement() throws IOException, InvalidInputException, ParseException {
		Module result = (Module)Util.parseModuleFile(Util.getAbsFilename("oberon/ifstatement.o0"));
		Environment env = new Environment(System.in, System.out);
		BuiltIns.inject(env);
		env.runModule(result);
	}
	
	@Test
	public void testAssignStatement() throws IOException, InvalidInputException, ParseException {
		Module result = (Module)Util.parseModuleFile(Util.getAbsFilename("oberon/statements/assignment.o0"));
		Environment env = new Environment(System.in, System.out);
		BuiltIns.inject(env);
		env.runModule(result);
	}
	
	
}
