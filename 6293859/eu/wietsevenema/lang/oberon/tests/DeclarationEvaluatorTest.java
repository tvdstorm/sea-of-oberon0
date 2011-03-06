package eu.wietsevenema.lang.oberon.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import xtc.tree.VisitingException;
import eu.wietsevenema.lang.oberon.ast.declarations.ConstantDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.Declarations;
import eu.wietsevenema.lang.oberon.ast.declarations.ProcedureDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.TypeDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.VarDecl;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.IntegerConstant;
import eu.wietsevenema.lang.oberon.ast.statements.AssignmentStatement;
import eu.wietsevenema.lang.oberon.ast.types.IntegerType;
import eu.wietsevenema.lang.oberon.ast.types.TypeAlias;
import eu.wietsevenema.lang.oberon.ast.visitors.interpreter.DeclarationEvaluator;
import eu.wietsevenema.lang.oberon.ast.visitors.interpreter.StatementEvaluator;
import eu.wietsevenema.lang.oberon.exceptions.ImmutableException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.InterpreterScope;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;

public class DeclarationEvaluatorTest {

	InterpreterScope scope;

	@Before
	public void setUp() throws Exception {
		scope = new InterpreterScope();
	}

	@Test
	public void testVarDeclaration() throws SymbolNotDeclaredException {
		List<Identifier> identifiers = new ArrayList<Identifier>();
		identifiers.add(new Identifier("a"));
		identifiers.add(new Identifier("b"));
		identifiers.add(new Identifier("c"));
		VarDecl varDecl = new VarDecl(identifiers, new IntegerType());

		DeclarationEvaluator eval = new DeclarationEvaluator(scope);
		eval.dispatch(varDecl);

		assertNotNull(scope.lookupValue("a"));
		assertNotNull(scope.lookupValue("b"));
		assertNotNull(scope.lookupValue("c"));

	}

	public void testConstDeclaration() throws SymbolNotDeclaredException, ValueUndefinedException {
		Identifier identifier = new Identifier("a");
		ConstantDecl constDecl = new ConstantDecl(identifier, new IntegerConstant(1));

		DeclarationEvaluator eval = new DeclarationEvaluator(scope);
		eval.dispatch(constDecl);

		assertEquals(((IntegerValue) scope.lookupValue("a")).getValue(), new Integer(1));
	}

	@Test
	public void testTypeDeclaration() throws SymbolNotDeclaredException, ValueUndefinedException {

		/*
		 * Declare myType as an alias of Integer.
		 */

		List<ConstantDecl> cds = new ArrayList<ConstantDecl>();
		List<TypeDecl> tds = new ArrayList<TypeDecl>();
		List<VarDecl> vds = new ArrayList<VarDecl>();
		List<ProcedureDecl> pds = new ArrayList<ProcedureDecl>();

		TypeDecl typeDecl = new TypeDecl(new Identifier("myType"), new IntegerType());
		tds.add(typeDecl);

		List<Identifier> ids = new ArrayList<Identifier>();
		ids.add(new Identifier("a"));

		VarDecl varDecl = new VarDecl(ids, new TypeAlias(new Identifier("myType")));
		vds.add(varDecl);

		Declarations decls = new Declarations(cds, tds, vds, pds);

		DeclarationEvaluator eval = new DeclarationEvaluator(scope);
		eval.dispatch(decls);

		/*
		 * Assign 'a' with an integer value. All should be well.
		 */

		AssignmentStatement assign = new AssignmentStatement(new Identifier("a"), new IntegerConstant(999));
		StatementEvaluator se = new StatementEvaluator(scope);
		se.dispatch(assign);

		/*
		 * After the assign, the value should be assigned.
		 */
		assertEquals(((IntegerValue) scope.lookupValue("a")).getValue(), new Integer(999));
	}

	@Test(expected = ImmutableException.class)
	public void testAssignConstFails() throws Throwable {
		Identifier identifier = new Identifier("a");
		ConstantDecl constDecl = new ConstantDecl(identifier, new IntegerConstant(1));

		DeclarationEvaluator eval = new DeclarationEvaluator(scope);
		eval.dispatch(constDecl);

		AssignmentStatement assign = new AssignmentStatement(identifier, new IntegerConstant(2));

		try {
			StatementEvaluator statEval = new StatementEvaluator(scope);
			statEval.dispatch(assign);
		} catch (VisitingException e) {
			throw e.getCause();
		}

	}

}
