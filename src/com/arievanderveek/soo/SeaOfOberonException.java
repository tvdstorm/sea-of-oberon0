package com.arievanderveek.soo;

/**
 * Exception used within the Oberon-0 interpreter
 * 
 * @author arieveek
 * 
 */
public class SeaOfOberonException extends Exception {

	private static final long serialVersionUID = 4778551996576534430L;

	/*
	 * Class only supports the methods where a message must be supplied to force
	 * that proper messages are used when an exception occurs.
	 */

	/**
	 * Constructs a new SeaOfOberonException with a message and the cause
	 * 
	 * @param message
	 *            Detail message
	 * @param cause
	 *            Cause
	 */
	public SeaOfOberonException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs a new SeaOfOberonException with a message and the cause
	 * 
	 * @param message
	 *            Detail message
	 */
	public SeaOfOberonException(String message) {
		super(message);
	}

}
