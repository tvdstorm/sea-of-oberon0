package org.elcid.oberon0.exceptions;

/**
 *
 * @author Pieter Brandwijk
 */
public class UnexpectedNodeException extends RuntimeException {

    /**
     * Creates a new instance of <code>UnexpectedNodeException</code> without detail message.
     */
    public UnexpectedNodeException() {
    }


    /**
     * Constructs an instance of <code>UnexpectedNodeException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public UnexpectedNodeException(String msg) {
        super(msg);
    }
}
