package eu.wietsevenema.lang.oberon.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import eu.wietsevenema.lang.oberon.exceptions.ValueUndefinedException;
import eu.wietsevenema.lang.oberon.exceptions.VariableAlreadyDeclaredException;
import eu.wietsevenema.lang.oberon.exceptions.VariableNotDeclaredException;
import eu.wietsevenema.lang.oberon.interpreter.SymbolTable;
import eu.wietsevenema.lang.oberon.interpreter.ValueReference;
import eu.wietsevenema.lang.oberon.interpreter.values.BooleanValue;
import eu.wietsevenema.lang.oberon.interpreter.values.IntegerValue;

public class SymbolTableTest  {
	
	SymbolTable symbolTable;
	
	@Before
	public void setUp() throws Exception {
		symbolTable = new SymbolTable();
		symbolTable.declareValue("bool2", new BooleanValue(true));
		symbolTable.enter();
		symbolTable.declareValue("int2", new IntegerValue(-1));
		
	}

	@Test
	public void testLookup() throws VariableNotDeclaredException{
		assertNotNull(symbolTable.lookupValue("int2"));
		assertNotNull(symbolTable.lookupValue("bool2"));
	}
	
	@Test
	public void testLookupLocal() throws VariableNotDeclaredException{
		assertNotNull(symbolTable.lookupValue("bool2"));
		assertNull(symbolTable.lookupValueLocal("bool2"));
	}
	
	@Test
	public void testValueReference() throws VariableNotDeclaredException{
		ValueReference referenceBool2 = symbolTable.lookupValueReference("bool2");
		assertNotNull(referenceBool2);
		symbolTable.declareValueReference(
				"reference-bool2", 
				referenceBool2
				);
		assertEquals(symbolTable.lookupValueReference("reference-bool2"), referenceBool2);
		assertEquals(symbolTable.lookupValue("bool2"), symbolTable.lookupValue("reference-bool2") );
	}
	
	
	@Test(expected=VariableAlreadyDeclaredException.class)
	public void testDoubleDeclareFails() throws VariableAlreadyDeclaredException  {
		symbolTable.declareValue("c", new BooleanValue(null));
		symbolTable.declareValue("c", new BooleanValue(null));
	}

	@Test
	public void testDoubleDeclareScoped() throws VariableAlreadyDeclaredException, VariableNotDeclaredException {
		symbolTable.declareValue("c", new BooleanValue(true));
		symbolTable.enter();
		symbolTable.declareValue("c", new BooleanValue(false));
	}
	
	@Test(expected=ValueUndefinedException.class)
	public void testValueUndefined() throws VariableAlreadyDeclaredException, VariableNotDeclaredException, ValueUndefinedException{
		symbolTable.declareValue("tve.a", new IntegerValue(null));
		((IntegerValue)symbolTable.lookupValue("tve.a")).getValue();
	}
	
	
	

}
