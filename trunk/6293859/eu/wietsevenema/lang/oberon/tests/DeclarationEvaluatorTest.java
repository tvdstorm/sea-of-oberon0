package eu.wietsevenema.lang.oberon.tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import xtc.tree.Node;
import xtc.tree.VisitingException;
import eu.wietsevenema.lang.oberon.ast.declarations.ConstantDecl;
import eu.wietsevenema.lang.oberon.ast.declarations.VarDecl;
import eu.wietsevenema.lang.oberon.ast.expressions.Identifier;
import eu.wietsevenema.lang.oberon.ast.expressions.IntegerConstant;
import eu.wietsevenema.lang.oberon.ast.statements.AssignmentStatement;
import eu.wietsevenema.lang.oberon.ast.types.IntegerType;
import eu.wietsevenema.lang.oberon.ast.visitors.DeclarationEvaluator;
import eu.wietsevenema.lang.oberon.ast.visitors.StatementEvaluator;
import eu.wietsevenema.lang.oberon.exceptions.ImmutableException;
import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.VariableNotDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;

public class DeclarationEvaluatorTest  {

	SymbolTable symbolTable;
	
	@Before
	public void setUp() throws Exception {
		symbolTable = new SymbolTable();
	}
	
	@Test
	public void testVarDeclaration() throws VariableNotDeclaredException{
		List<Node> identifiers = new ArrayList<Node>();
		identifiers.add(new Identifier("a"));
		identifiers.add(new Identifier("b"));
		identifiers.add(new Identifier("c"));
		VarDecl varDecl = new VarDecl(identifiers, new IntegerType());
		
		DeclarationEvaluator eval = new DeclarationEvaluator(symbolTable);
		eval.dispatch(varDecl);
		
		assertNotNull(symbolTable.lookupValue("a"));
		assertNotNull(symbolTable.lookupValue("b"));
		assertNotNull(symbolTable.lookupValue("c"));
		
	}
	

	public void testConstDeclaration() throws VariableNotDeclaredException, ValueUndefinedException{
		Identifier identifier = new Identifier("a");
		ConstantDecl constDecl = new ConstantDecl(identifier, new IntegerConstant(1));
				
		DeclarationEvaluator eval = new DeclarationEvaluator(symbolTable);
		eval.dispatch(constDecl);
		
		assertEquals(((IntegerValue)symbolTable.lookupValue("a")).getValue(), new Integer(1) );
		
	}
	
	@Test(expected=ImmutableException.class)
	public void testAssignConstFails() throws Throwable{
		Identifier identifier = new Identifier("a");
		ConstantDecl constDecl = new ConstantDecl(identifier, new IntegerConstant(1));
				
		DeclarationEvaluator eval = new DeclarationEvaluator(symbolTable);
		eval.dispatch(constDecl);
		
		AssignmentStatement assign = new AssignmentStatement(identifier, new IntegerConstant(2));
		
		try{
		StatementEvaluator statEval = new StatementEvaluator(symbolTable);
		statEval.dispatch(assign);
		} catch( VisitingException e){
			throw e.getCause();
		}
		
	}
	

	
	
}
