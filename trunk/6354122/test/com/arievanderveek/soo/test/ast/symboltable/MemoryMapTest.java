/**
 * 
 */
package com.arievanderveek.soo.test.ast.symboltable;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.arievanderveek.soo.symboltable.MemoryAddress;
import com.arievanderveek.soo.symboltable.MemoryMap;

/**
 * @author arieveek
 *
 */
public class MemoryMapTest {

	MemoryMap memory = new MemoryMap();
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
	 * Test method for:
	 * 	- {@link com.arievanderveek.soo.symboltable.MemoryMap#getValue(com.arievanderveek.soo.symboltable.MemoryAddress)}.
	 *  - {@link com.arievanderveek.soo.symboltable.MemoryMap#removeValue(com.arievanderveek.soo.symboltable.MemoryAddress)}
	 *  - {@link com.arievanderveek.soo.symboltable.MemoryMap#updateValue(com.arievanderveek.soo.symboltable.MemoryAddress, java.lang.Integer)}.
	 *  - {@link com.arievanderveek.soo.symboltable.MemoryMap#addValue(java.lang.Integer)}
	 *  - {@link com.arievanderveek.soo.symboltable.MemoryMap#addValue(java.lang.Integer)}.
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
	

	public void testGetValue() {
		assertEquals("Testing get for value" + valueOne.intValue() ,memory.getValue(memoryOne).intValue(), valueOne.intValue());
		assertEquals("Testing get for value" + valueTwo.intValue() ,memory.getValue(memoryTwo).intValue(), valueTwo.intValue());
		assertEquals("Testing get for value" + valueThree.intValue() ,memory.getValue(memoryThree).intValue(), valueThree.intValue());
		assertEquals("Testing get for value" + valueFour.intValue() ,memory.getValue(memoryFour).intValue(), valueFour.intValue());
	}

	public void testRemoveValue() {
		memory.deleteValue(copyOfThree);
		memory.deleteValue(copyOfFour);
		assertNull(memory.getValue(copyOfThree));
		assertNull(memory.getValue(copyOfFour));
	}

	public void testUpdateValue() {
		memory.updateValue(copyOfThree, updateValueThree);
		memory.updateValue(copyOfFour, updateValueFour);
		assertEquals("Comparing copyOfThree and updateValueThree" ,updateValueThree.intValue(), memory.getValue(copyOfThree).intValue());
		assertEquals("Comparing copyOfFour and updateValueFour"  ,updateValueFour.intValue(), memory.getValue(copyOfFour).intValue());
	}

	public void testAddValue() {
		try {
		memoryOne = memory.addValue(valueOne);
		memoryTwo = memory.addValue(valueTwo);
		memoryThree = memory.addValue(valueThree);
		memoryFour = memory.addValue(valueFour);
		} catch(Exception e) {
			fail("Caught exceptions while adding values. " + e.getMessage());
		}
	}
	
	public void testCopyAddressAndValue() {
		try {
		copyOfThree  = memory.copyAddressAndValue(memoryThree);
		copyOfFour  = memory.copyAddressAndValue(memoryFour);
		assertEquals("Comparing three and its copy" ,memory.getValue(memoryThree).intValue(), memory.getValue(copyOfThree).intValue());
		assertEquals("Comparing four and its copy"  ,memory.getValue(memoryFour).intValue(), memory.getValue(copyOfFour).intValue());
		} catch(Exception e) {
			fail("Caught exceptions while copying values. " + e.getMessage());
		}
	}	

}
