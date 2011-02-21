/**
 * 
 */
package com.arievanderveek.soo.runtime;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.util.Constants;

/**
 * This class manages a map of objects representing the memory used in the scope
 * 
 * @author arieveek
 * 
 */
public class MemoryManager {

	private static final int MEMORY_ADRESS_RETRIES = 5;

	private Map<MemoryAddress, Integer> memoryMap = new HashMap<MemoryAddress, Integer>();

	public Integer getValue(MemoryAddress address) {
		assert address != null;
		return memoryMap.get(address);
	}

	public boolean hasAdress(MemoryAddress address) {
		assert address != null;
		return memoryMap.containsKey(address);
	}

	public Integer deleteValue(MemoryAddress address) {
		assert address != null;
		return memoryMap.put(address, null);
	}

	public Integer deleteMemoryAddress(MemoryAddress address) {
		assert address != null;
		return memoryMap.remove(address);
	}

	public void deleteMemoryAddressList(List<MemoryAddress> addressList) {
		assert addressList != null;
		for (MemoryAddress address : addressList) {
			deleteMemoryAddress(address);
		}
	}

	public void updateValue(MemoryAddress address, Integer value) {
		assert address != null;
		memoryMap.put(address, value);
	}

	public MemoryAddress addValue(Integer value) throws SeaOfOberonException {
		assert value != null;
		MemoryAddress address = generateMemoryAdress();
		memoryMap.put(address, value);
		return address;
	}

	public MemoryAddress copyValueToNewAdress(MemoryAddress oldAddress) throws SeaOfOberonException {
		assert oldAddress != null;
		Integer value = getValue(oldAddress);
		MemoryAddress newAdress = addValue(value);
		return newAdress;
	}

	private MemoryAddress generateMemoryAdress() throws SeaOfOberonException {
		// Generate a random generater with current time in millies as seed to
		// ensure unique generation of numbers. Should be secure enough for single
		// threaded app.
		Random generator = new Random(System.currentTimeMillis());
		MemoryAddress address = new MemoryAddress(generator.nextInt());
		// Now validate if the address is already used, retry generations if it
		// already exists
		int retryCounter = 0;
		while (memoryMap.containsKey(address)) {
			address = new MemoryAddress(generator.nextInt());
			retryCounter++;
			if (retryCounter > 5) {
				throw new SeaOfOberonException("Could not generate memory address after "
						+ +MEMORY_ADRESS_RETRIES + "retries.");
			}
		}
		return address;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Memory Map contents:");
		sb.append(Constants.LINE_SEPARATOR);
		for (MemoryAddress address : memoryMap.keySet()) {
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
