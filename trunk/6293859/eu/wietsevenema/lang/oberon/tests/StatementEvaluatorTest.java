package eu.wietsevenema.lang.oberon.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import xtc.tree.VisitingException;
import eu.wietsevenema.lang.oberon.ast.declarations.Module;
import eu.wietsevenema.lang.oberon.ast.expressions.AdditiveExpression;
import eu.wietsevenema.lang.oberon.ast.expressions.BooleanConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.Expression;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.IntegerConstant;
import eu.wietsevenema.lang.oberon.ast.expressions.LessExpression;
import eu.wietsevenema.lang.oberon.ast.statements.AssignmentStatement;
import eu.wietsevenema.lang.oberon.ast.statements.ProcedureCallStatement;
import eu.wietsevenema.lang.oberon.ast.statements.Statement;
import eu.wietsevenema.lang.oberon.ast.statements.WhileStatement;
import eu.wietsevenema.lang.oberon.ast.visitors.interpreter.ModuleEvaluator;
import eu.wietsevenema.lang.oberon.ast.visitors.interpreter.StatementEvaluator;
import eu.wietsevenema.lang.oberon.exceptions.InvalidInputException;
import eu.wietsevenema.lang.oberon.exceptions.ParseException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.interpreter.Environment;
import eu.wietsevenema.lang.oberon.interpreter.InterpreterScope;
import eu.wietsevenema.lang.oberon.interpreter.values.BooleanValue;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;

public class StatementEvaluatorTest {

	private InterpreterScope scope;

	@Before
	public void setUp() {
		this.scope = new InterpreterScope();
	}

	@Test
	public void testAssignment() throws SymbolAlreadyDeclaredException, ValueUndefinedException,
			SymbolNotDeclaredException {
		// Declare vars
		scope.declareValue("a", new IntegerValue(null));
		scope.declareValue("b", new BooleanValue(null));

		// Construct assignment statements
		AssignmentStatement as1 = new AssignmentStatement(new Identifier("a"), new IntegerConstant(2));

		AssignmentStatement as2 = new AssignmentStatement(new Identifier("b"), new BooleanConstant(true));

		StatementEvaluator se = new StatementEvaluator(scope);
		se.dispatch(as1);
		se.dispatch(as2);

		assertEquals(((IntegerValue) scope.lookupValue("a")).getValue(), new Integer(2));
		assertEquals(((BooleanValue) scope.lookupValue("b")).getValue(), new Boolean(true));
	}

	@Test
	public void testSecondAssignment() throws ValueUndefinedException, SymbolNotDeclaredException,
			SymbolAlreadyDeclaredException {
		scope.declareValue("a", new IntegerValue(null));
		AssignmentStatement first = new AssignmentStatement(new Identifier("a"), new IntegerConstant(2));

		AssignmentStatement second = new AssignmentStatement(new Identifier("a"), new IntegerConstant(3));

		StatementEvaluator se = new StatementEvaluator(scope);
		se.dispatch(first);
		assertEquals(((IntegerValue) scope.lookupValue("a")).getValue(), new Integer(2));
		se.dispatch(second);
		assertEquals(((IntegerValue) scope.lookupValue("a")).getValue(), new Integer(3));
	}

	@Test(expected = SymbolNotDeclaredException.class)
	public void testCallNotExistingProcedureFails() throws Throwable {
		Statement call = new ProcedureCallStatement(new Identifier("idonotexist"), new ArrayList<Expression>());
		StatementEvaluator statEval = new StatementEvaluator(scope);
		try {
			statEval.dispatch(call);
		} catch (VisitingException e) {
			throw e.getCause();
		}
	}

	@Test
	public void testWhileStatement() throws SymbolAlreadyDeclaredException, ValueUndefinedException,
			SymbolNotDeclaredException {

		Expression condition = new LessExpression(new Identifier("count"), new IntegerConstant(5));

		Statement stat1 = new AssignmentStatement(new Identifier("count"), new AdditiveExpression(new Identifier(
				"count"), new IntegerConstant(1)));

		Statement stat2 = new AssignmentStatement(new Identifier("touch"), new BooleanConstant(true));

		ArrayList<Statement> statements = new ArrayList<Statement>();
		statements.add(stat1);
		statements.add(stat2);

		WhileStatement whilestat = new WhileStatement(condition, statements);

		scope.declareValue("count", new IntegerValue(0));
		scope.declareValue("touch", new BooleanValue(false));

		StatementEvaluator eval = new StatementEvaluator(scope);

		eval.dispatch(whilestat);

		assertEquals(new Integer(5), ((IntegerValue) scope.lookupValue("count")).getValue());
		assertEquals(new Boolean(true), ((BooleanValue) scope.lookupValue("touch")).getValue());

	}

	@Test
	public void testWhileStatement2() throws InvalidInputException, ParseException, IOException,
			ValueUndefinedException, SymbolNotDeclaredException {
		String whileprog = "MODULE While;	" + "	VAR t1: INTEGER; t2 : BOOLEAN;" + "BEGIN" + " t1 := 0;"
				+ " WHILE t1 <= 5" + " DO" + "	t1  := t1 + 1;" + "	t2 := TRUE" + " END " + "END While.";

		ModuleEvaluator me = new ModuleEvaluator(scope);
		me.dispatch(Util.parseModuleString(whileprog));

		assertEquals(new Boolean(true), ((BooleanValue) scope.lookupValue("t2")).getValue());
		assertEquals(new Integer(6), ((IntegerValue) scope.lookupValue("t1")).getValue());
	}

	@Test
	public void testIfStatement() throws IOException, InvalidInputException, ParseException, SymbolAlreadyDeclaredException {
		Module result = (Module) Util.parseModuleFile(Util.getAbsFilename("oberon/ifstatement.o0"));
		Environment env = new Environment(System.in, System.out);
		env.runModule(result);
	}

	@Test
	public void testWithStatement() throws IOException, InvalidInputException, ParseException, SymbolAlreadyDeclaredException {
		Module result = (Module) Util.parseModuleFile(Util.getAbsFilename("oberon/statements/with.o0"));
		Environment env = new Environment(System.in, System.out);
		env.runModule(result);
	}
	
	@Test
	public void testAssignStatement() throws IOException, InvalidInputException, ParseException, SymbolAlreadyDeclaredException {
		Module result = (Module) Util.parseModuleFile(Util.getAbsFilename("oberon/statements/assignment.o0"));
		Environment env = new Environment(System.in, System.out);
		env.runModule(result);
	}

}
