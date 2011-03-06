package eu.wietsevenema.lang.oberon.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.SymbolNotDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.InterpreterScope;
import eu.wietsevenema.lang.oberon.interpreter.ValueReference;
import eu.wietsevenema.lang.oberon.interpreter.values.BooleanValue;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;

public class ScopeTest {

	InterpreterScope scope;

	@Before
	public void setUp() throws Exception {
		scope = new InterpreterScope();
		scope.declareValue("bool2", new BooleanValue(true));
		scope = new InterpreterScope(scope);
		scope.declareValue("int2", new IntegerValue(-1));

	}

	@Test
	public void testLookup() throws SymbolNotDeclaredException {
		assertNotNull(scope.lookupValue("int2"));
		assertNotNull(scope.lookupValue("bool2"));
	}

	@Test
	public void testValueReference() throws SymbolNotDeclaredException, SymbolAlreadyDeclaredException {
		ValueReference referenceBool2 = scope.lookupValueReference("bool2");
		assertNotNull(referenceBool2);
		scope.declareValueReference("reference-bool2", referenceBool2);
		assertEquals(scope.lookupValueReference("reference-bool2"), referenceBool2);
		assertEquals(scope.lookupValue("bool2"), scope.lookupValue("reference-bool2"));
	}

	@Test(expected = SymbolAlreadyDeclaredException.class)
	public void testDoubleDeclareFails() throws SymbolAlreadyDeclaredException {
		scope.declareValue("c", new BooleanValue(null));
		scope.declareValue("c", new BooleanValue(null));
	}

	@Test
	public void testDoubleDeclareScoped() throws SymbolAlreadyDeclaredException, SymbolNotDeclaredException {
		scope.declareValue("c", new BooleanValue(true));
		scope = new InterpreterScope(scope);
		scope.declareValue("c", new BooleanValue(false));
	}

	
	@Test(expected = ValueUndefinedException.class)
	public void testValueUndefined() throws SymbolAlreadyDeclaredException, SymbolNotDeclaredException,
			ValueUndefinedException {
		scope.declareValue("tve.a", new IntegerValue(null));
		((IntegerValue) scope.lookupValue("tve.a")).getValue();
	}

}
