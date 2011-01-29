package jdm.oberon0.exceptions;

import java.io.IOException;

/**
 * Error reading data from stdin.
 */
public class InputException extends RuntimeException {
	
	private static final long serialVersionUID = -4390841828224140013L;

	public InputException(IOException e) {
		super(e.getMessage());
	}
}
