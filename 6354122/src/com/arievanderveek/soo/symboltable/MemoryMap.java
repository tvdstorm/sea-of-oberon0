/**
 * 
 */
package com.arievanderveek.soo.symboltable;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.util.Constants;

/**
 * This class manages a stack of objects representing the 
 * 
 * @author arieveek
 *
 */
public class MemoryMap {
	
	private static final int RANDOM_MAX_INT = 100000000;
	private static final int MEMORY_ADRESS_RETRIES = 5;
	
	private Map<MemoryAddress, Integer> memoryMap = new HashMap<MemoryAddress, Integer>();
	
	public Integer getValue(MemoryAddress address){
		assert address != null;
		return memoryMap.get(address);
	}
	
	public Integer deleteValue(MemoryAddress address){
		assert address != null;
		return memoryMap.put(address, null);
	}
	
	public Integer deleteAddress(MemoryAddress address){
		assert address != null;
		return memoryMap.remove(address);
	}
	
	public void updateValue(MemoryAddress address, Integer value){
		assert address != null;
		memoryMap.put(address, value);
	}
	
	public MemoryAddress addValue(Integer value) throws SeaOfOberonException{
		assert value != null;
		MemoryAddress address = generateMemoryAdress();
		memoryMap.put(address, value);
		return address;
	}
	
	public MemoryAddress copyValueToNewAdress(MemoryAddress oldAddress) throws SeaOfOberonException{
		assert oldAddress != null;
		Integer value = getValue(oldAddress);
		MemoryAddress newAdress = addValue(value);
		return newAdress;
	}
	

	
	private MemoryAddress generateMemoryAdress() throws SeaOfOberonException{
		Random generator = new Random();
		MemoryAddress address = new MemoryAddress( generator.nextInt(RANDOM_MAX_INT));
		int retryCounter = 0; 
		while (memoryMap.containsKey(address)){
			address = new MemoryAddress( generator.nextInt(RANDOM_MAX_INT));
			retryCounter++;
			if (retryCounter>5){
				throw new SeaOfOberonException("Could not generate memory address after " +
						+ MEMORY_ADRESS_RETRIES + "retries.");
			}
		}
		return address;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Memory Map contents:");
		sb.append(Constants.LINE_SEPARATOR);
		for (MemoryAddress address : memoryMap.keySet() ){
			sb.append(Constants.LINE);
			sb.append(Constants.LINE_SEPARATOR);
			sb.append("Address: ");
			sb.append(address.toString());
			sb.append(Constants.LINE_SEPARATOR);
			sb.append("Value: ");
			sb.append(memoryMap.get(address));
			sb.append(Constants.LINE_SEPARATOR);
		}
		return sb.toString();
	}
}
