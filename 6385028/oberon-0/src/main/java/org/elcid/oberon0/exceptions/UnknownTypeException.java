package org.elcid.oberon0.exceptions;

/**
 *
 * @author Pieter Brandwijk
 */
public class UnknownTypeException extends RuntimeException {

    /**
     * Creates a new instance of <code>UnknownTypeException</code> without detail message.
     */
    public UnknownTypeException() {
    }


    /**
     * Constructs an instance of <code>UnknownTypeException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public UnknownTypeException(String msg) {
        super(msg);
    }
}
