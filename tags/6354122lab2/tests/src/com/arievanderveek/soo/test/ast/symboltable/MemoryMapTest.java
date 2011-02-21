/**
 * 
 */
package com.arievanderveek.soo.test.ast.symboltable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.arievanderveek.soo.runtime.MemoryAddress;
import com.arievanderveek.soo.runtime.MemoryManager;

/**
 * @author arieveek
 *
 */
public class MemoryMapTest {

	MemoryManager memory = new MemoryManager();
	Integer valueOne = new Integer("10");
	Integer valueTwo = new Integer("20");
	Integer valueThree = new Integer("30");
	Integer valueFour = new Integer("40");
	Integer updateValueThree = new Integer("50");
	Integer updateValueFour = new Integer("60");
	
	MemoryAddress memoryOne, memoryTwo, memoryThree, memoryFour, copyOfThree, copyOfFour;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	/**
	 * This method calls a series of private methods that perform all operations mentioned below.
	 * The private methods must be executed in a predefined order, therefore they are not exposed.
	 * 
	 * Test method for:
	 * 	- {@link com.arievanderveek.soo.runtime.MemoryManager#getValue(com.arievanderveek.soo.runtime.MemoryAddress)}.
	 *  - {@link com.arievanderveek.soo.runtime.MemoryManager#removeValue(com.arievanderveek.soo.runtime.MemoryAddress)}
	 *  - {@link com.arievanderveek.soo.runtime.MemoryManager#updateValue(com.arievanderveek.soo.runtime.MemoryAddress, java.lang.Integer)}.
	 *  - {@link com.arievanderveek.soo.runtime.MemoryManager#addValue(java.lang.Integer)}
	 *  - {@link com.arievanderveek.soo.runtime.MemoryManager#copyValueToNewAdress(MemoryAddress)}
	 *  
	 */
	@Test
	public void testMemoryMap() {
		
		testAddValue();
		testGetValue();
		testCopyAddressAndValue();
		testUpdateValue();
		testRemoveValue();
		
	}
	

	private void testGetValue() {
		assertEquals("Testing get for value" + valueOne.intValue() ,memory.getValue(memoryOne).intValue(), valueOne.intValue());
		assertEquals("Testing get for value" + valueTwo.intValue() ,memory.getValue(memoryTwo).intValue(), valueTwo.intValue());
		assertEquals("Testing get for value" + valueThree.intValue() ,memory.getValue(memoryThree).intValue(), valueThree.intValue());
		assertEquals("Testing get for value" + valueFour.intValue() ,memory.getValue(memoryFour).intValue(), valueFour.intValue());
	}

	private void testRemoveValue() {
		memory.deleteValue(copyOfThree);
		memory.deleteValue(copyOfFour);
		assertNull(memory.getValue(copyOfThree));
		assertNull(memory.getValue(copyOfFour));
	}

	private void testUpdateValue() {
		memory.updateValue(copyOfThree, updateValueThree);
		memory.updateValue(copyOfFour, updateValueFour);
		assertEquals("Comparing copyOfThree and updateValueThree" ,updateValueThree.intValue(), memory.getValue(copyOfThree).intValue());
		assertEquals("Comparing copyOfFour and updateValueFour"  ,updateValueFour.intValue(), memory.getValue(copyOfFour).intValue());
	}

	private void testAddValue() {
		try {
		memoryOne = memory.addValue(valueOne);
		memoryTwo = memory.addValue(valueTwo);
		memoryThree = memory.addValue(valueThree);
		memoryFour = memory.addValue(valueFour);
		} catch(Exception e) {
			fail("Caught exceptions while adding values. " + e.getMessage());
		}
	}
	
	private void testCopyAddressAndValue() {
		try {
		copyOfThree  = memory.copyValueToNewAdress(memoryThree);
		copyOfFour  = memory.copyValueToNewAdress(memoryFour);
		assertEquals("Comparing three and its copy" ,memory.getValue(memoryThree).intValue(), memory.getValue(copyOfThree).intValue());
		assertEquals("Comparing four and its copy"  ,memory.getValue(memoryFour).intValue(), memory.getValue(copyOfFour).intValue());
		} catch(Exception e) {
			fail("Caught exceptions while copying values. " + e.getMessage());
		}
	}	

}
